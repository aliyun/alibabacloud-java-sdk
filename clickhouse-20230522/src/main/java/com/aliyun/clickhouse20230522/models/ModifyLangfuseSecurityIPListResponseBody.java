// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseSecurityIPListResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ModifyLangfuseSecurityIPListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLangfuseSecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseSecurityIPListResponseBody self = new ModifyLangfuseSecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseSecurityIPListResponseBody setData(ModifyLangfuseSecurityIPListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyLangfuseSecurityIPListResponseBodyData getData() {
        return this.data;
    }

    public ModifyLangfuseSecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLangfuseSecurityIPListResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The Langfuse instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-*****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24,172.16.0.0/24</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The IP address type. The value is fixed to IPv4. IPv6 is not supported.</p>
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
         * <p>100001080</p>
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

        public static ModifyLangfuseSecurityIPListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyLangfuseSecurityIPListResponseBodyData self = new ModifyLangfuseSecurityIPListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ModifyLangfuseSecurityIPListResponseBodyData setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

}
