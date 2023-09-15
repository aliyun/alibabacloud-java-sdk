// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifySecurityIPListResponseBodyData data;

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
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupTag")
        public String groupTag;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("SecurityIPType")
        public String securityIPType;

        @NameInMap("TaskId")
        public Integer taskId;

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
