// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728B9A96-E262-4AE5-915E-3A51CCE2FDA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of nodes in the zone.</p>
     */
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
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>configServer</strong></li>
         * <li><strong>shard</strong></li>
         * <li><strong>mongos</strong></li>
         * </ul>
         * <blockquote>
         * <p>Valid value for replica set instances: <strong>normal</strong>. Valid values for sharded cluster instances: <strong>configServer</strong>, <strong>shard</strong>, and <strong>mongos</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83xxxxx</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong></li>
         * <li><strong>Secondary</strong></li>
         * <li><strong>Hidden</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>The zone ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
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
