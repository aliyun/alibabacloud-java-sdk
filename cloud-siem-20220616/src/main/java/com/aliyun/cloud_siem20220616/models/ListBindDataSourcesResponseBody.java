// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListBindDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListBindDataSourcesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The username of the cloud account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <br>
         * <p>*   qcloud: Tencent Cloud</p>
         * <p>*   aliyun: Alibaba Cloud</p>
         * <p>*   hcloud: Huawei Cloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         */
        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The remarks on the data source.</p>
         */
        @NameInMap("DataSourceRemark")
        public String dataSourceRemark;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   obs: Huawei Cloud Object Storage Service (OBS)</p>
         * <p>*   wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</p>
         * <p>*   ckafka: Tencent Cloud Kafka (CKafka)</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The number of logs that are added within the data source.</p>
         */
        @NameInMap("LogCount")
        public Integer logCount;

        /**
         * <p>The number of existing tasks that are created to add logs within the data source.</p>
         */
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
