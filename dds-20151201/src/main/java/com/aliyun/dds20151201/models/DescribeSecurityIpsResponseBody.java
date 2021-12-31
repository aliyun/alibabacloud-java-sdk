// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIpGroups")
    public DescribeSecurityIpsResponseBodySecurityIpGroups securityIpGroups;

    @NameInMap("SecurityIps")
    public String securityIps;

    public static DescribeSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpsResponseBody self = new DescribeSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityIpsResponseBody setSecurityIpGroups(DescribeSecurityIpsResponseBodySecurityIpGroups securityIpGroups) {
        this.securityIpGroups = securityIpGroups;
        return this;
    }
    public DescribeSecurityIpsResponseBodySecurityIpGroups getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    public DescribeSecurityIpsResponseBody setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static class DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup extends TeaModel {
        @NameInMap("SecurityIpGroupAttribute")
        public String securityIpGroupAttribute;

        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        @NameInMap("SecurityIpList")
        public String securityIpList;

        public static DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup self = new DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup setSecurityIpGroupAttribute(String securityIpGroupAttribute) {
            this.securityIpGroupAttribute = securityIpGroupAttribute;
            return this;
        }
        public String getSecurityIpGroupAttribute() {
            return this.securityIpGroupAttribute;
        }

        public DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup setSecurityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }
        public String getSecurityIpList() {
            return this.securityIpList;
        }

    }

    public static class DescribeSecurityIpsResponseBodySecurityIpGroups extends TeaModel {
        @NameInMap("SecurityIpGroup")
        public java.util.List<DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup> securityIpGroup;

        public static DescribeSecurityIpsResponseBodySecurityIpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIpsResponseBodySecurityIpGroups self = new DescribeSecurityIpsResponseBodySecurityIpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIpsResponseBodySecurityIpGroups setSecurityIpGroup(java.util.List<DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup> securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }
        public java.util.List<DescribeSecurityIpsResponseBodySecurityIpGroupsSecurityIpGroup> getSecurityIpGroup() {
            return this.securityIpGroup;
        }

    }

}
