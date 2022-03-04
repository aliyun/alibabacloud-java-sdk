// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterSecurityInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeClusterSecurityInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterSecurityInfoResponseBody self = new DescribeClusterSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterSecurityInfoResponseBody setData(DescribeClusterSecurityInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeClusterSecurityInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeClusterSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups extends TeaModel {
        // 安全组名称
        @NameInMap("GroupName")
        public String groupName;

        // IP列表 英文逗号分隔
        @NameInMap("SecurityIps")
        public String securityIps;

        public static DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups self = new DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

    public static class DescribeClusterSecurityInfoResponseBodyData extends TeaModel {
        // 安全组列表
        @NameInMap("SecurityIpGroups")
        public java.util.List<DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups> securityIpGroups;

        public static DescribeClusterSecurityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterSecurityInfoResponseBodyData self = new DescribeClusterSecurityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterSecurityInfoResponseBodyData setSecurityIpGroups(java.util.List<DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups> securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }
        public java.util.List<DescribeClusterSecurityInfoResponseBodyDataSecurityIpGroups> getSecurityIpGroups() {
            return this.securityIpGroups;
        }

    }

}
