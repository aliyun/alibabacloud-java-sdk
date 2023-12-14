// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListBindDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListBindDataSourcesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBindDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindDataSourcesResponseBody self = new ListBindDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindDataSourcesResponseBody setData(java.util.List<ListBindDataSourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBindDataSourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListBindDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBindDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceRemark")
        public String dataSourceRemark;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("LogCount")
        public Integer logCount;

        @NameInMap("TaskCount")
        public Integer taskCount;

        public static ListBindDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindDataSourcesResponseBodyData self = new ListBindDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindDataSourcesResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListBindDataSourcesResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListBindDataSourcesResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListBindDataSourcesResponseBodyData setDataSourceInstanceId(String dataSourceInstanceId) {
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        public ListBindDataSourcesResponseBodyData setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListBindDataSourcesResponseBodyData setDataSourceRemark(String dataSourceRemark) {
            this.dataSourceRemark = dataSourceRemark;
            return this;
        }
        public String getDataSourceRemark() {
            return this.dataSourceRemark;
        }

        public ListBindDataSourcesResponseBodyData setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListBindDataSourcesResponseBodyData setLogCount(Integer logCount) {
            this.logCount = logCount;
            return this;
        }
        public Integer getLogCount() {
            return this.logCount;
        }

        public ListBindDataSourcesResponseBodyData setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

    }

}
