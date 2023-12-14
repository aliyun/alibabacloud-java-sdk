// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListBindAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListBindAccountResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindAccountResponseBody self = new ListBindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindAccountResponseBody setData(java.util.List<ListBindAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBindAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListBindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBindAccountResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("BindId")
        public Long bindId;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSourceCount")
        public Long dataSourceCount;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListBindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindAccountResponseBodyData self = new ListBindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindAccountResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public ListBindAccountResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListBindAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListBindAccountResponseBodyData setBindId(Long bindId) {
            this.bindId = bindId;
            return this;
        }
        public Long getBindId() {
            return this.bindId;
        }

        public ListBindAccountResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListBindAccountResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListBindAccountResponseBodyData setDataSourceCount(Long dataSourceCount) {
            this.dataSourceCount = dataSourceCount;
            return this;
        }
        public Long getDataSourceCount() {
            return this.dataSourceCount;
        }

        public ListBindAccountResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
