// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ModifySecurityIPListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPListResponseBody self = new ModifySecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPListResponseBody setData(ModifySecurityIPListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySecurityIPListResponseBodyData getData() {
        return this.data;
    }

    public ModifySecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifySecurityIPListResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxx</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The name of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The IP addresses and CIDR blocks in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24,172.16.0.0/24</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The IP address type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The network type of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static ModifySecurityIPListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIPListResponseBodyData self = new ModifySecurityIPListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIPListResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public ModifySecurityIPListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifySecurityIPListResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifySecurityIPListResponseBodyData setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public ModifySecurityIPListResponseBodyData setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ModifySecurityIPListResponseBodyData setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public ModifySecurityIPListResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ModifySecurityIPListResponseBodyData setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

}
