// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of information of nodes in the zone.
    @NameInMap("ZoneInfos")
    public DescribeRoleZoneInfoResponseBodyZoneInfos zoneInfos;

    public static DescribeRoleZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleZoneInfoResponseBody self = new DescribeRoleZoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleZoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoleZoneInfoResponseBody setZoneInfos(DescribeRoleZoneInfoResponseBodyZoneInfos zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public DescribeRoleZoneInfoResponseBodyZoneInfos getZoneInfos() {
        return this.zoneInfos;
    }

    public static class DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo extends TeaModel {
        // The ID of the node.
        @NameInMap("InsName")
        public String insName;

        // The type of the node. Valid values:
        // 
        // *   **normal**
        // *   **configServer**
        // *   **shard**
        // *   **mongos**
        // 
        // >  Valid value for replica set instances: **normal**. Valid values for replica set instances: **configServer**, **shard**, and **mongos**.
        @NameInMap("NodeType")
        public String nodeType;

        // The ID of the role.
        @NameInMap("RoleId")
        public String roleId;

        // The role of the node. Valid values:
        // 
        // *   **Primary**
        // *   **Secondary**
        // *   **Hidden**
        @NameInMap("RoleType")
        public String roleType;

        // The zone ID.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo self = new DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRoleZoneInfoResponseBodyZoneInfos extends TeaModel {
        @NameInMap("ZoneInfo")
        public java.util.List<DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo> zoneInfo;

        public static DescribeRoleZoneInfoResponseBodyZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoleZoneInfoResponseBodyZoneInfos self = new DescribeRoleZoneInfoResponseBodyZoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRoleZoneInfoResponseBodyZoneInfos setZoneInfo(java.util.List<DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo> zoneInfo) {
            this.zoneInfo = zoneInfo;
            return this;
        }
        public java.util.List<DescribeRoleZoneInfoResponseBodyZoneInfosZoneInfo> getZoneInfo() {
            return this.zoneInfo;
        }

    }

}
