// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the information of IP whitelists.
    @NameInMap("SecurityIpGroups")
    public DescribeSecurityIpsResponseBodySecurityIpGroups securityIpGroups;

    // The IP addresses in the default whitelist.
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
        // The attribute of the IP whitelist. This parameter is empty by default.
        @NameInMap("SecurityIpGroupAttribute")
        public String securityIpGroupAttribute;

        // The name of the IP whitelist.
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        // The IP addresses in the whitelist.
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
