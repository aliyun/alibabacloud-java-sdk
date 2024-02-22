// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceLogsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListDataSourceLogsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourceLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceLogsResponseBody self = new ListDataSourceLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceLogsResponseBody setData(ListDataSourceLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSourceLogsResponseBodyData getData() {
        return this.data;
    }

    public ListDataSourceLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams extends TeaModel {
        /**
         * <p>The parameter code of the log.</p>
         */
        @NameInMap("ParaCode")
        public String paraCode;

        /**
         * <p>The parameter value of the log.</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        public static ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams self = new ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams();
            return TeaModel.build(map, self);
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams setParaCode(String paraCode) {
            this.paraCode = paraCode;
            return this;
        }
        public String getParaCode() {
            return this.paraCode;
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

    }

    public static class ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs extends TeaModel {
        /**
         * <p>The code of the log.</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The ID of the log. The value is obtained after the threat analysis feature calculates the MD5 hash value of a parameter.</p>
         */
        @NameInMap("LogInstanceId")
        public String logInstanceId;

        /**
         * <p>The display code of the log.</p>
         */
        @NameInMap("LogMdsCode")
        public String logMdsCode;

        /**
         * <p>The parameters of the log.</p>
         */
        @NameInMap("LogParams")
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams> logParams;

        /**
         * <p>Indicates whether the task for which logs are collected is enabled. Valid values:</p>
         * <br>
         * <p>*   1: yes</p>
         * <p>*   0: no</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        public static ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs self = new ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs();
            return TeaModel.build(map, self);
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs setLogInstanceId(String logInstanceId) {
            this.logInstanceId = logInstanceId;
            return this;
        }
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs setLogMdsCode(String logMdsCode) {
            this.logMdsCode = logMdsCode;
            return this;
        }
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs setLogParams(java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams> logParams) {
            this.logParams = logParams;
            return this;
        }
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams> getLogParams() {
            return this.logParams;
        }

        public ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class ListDataSourceLogsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The code that is used for multi-cloud environments. Valid values:</p>
         * <br>
         * <p>*   qcloud: Tencent Cloud</p>
         * <p>*   aliyun: Alibaba Cloud</p>
         * <p>*   hcloud: Huawei Cloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The ID of the data source. The value is obtained after the threat analysis feature calculates the MD5 hash value of a parameter.</p>
         */
        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        /**
         * <p>The logs of the data source.</p>
         */
        @NameInMap("DataSourceInstanceLogs")
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs> dataSourceInstanceLogs;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("DataSourceInstanceName")
        public String dataSourceInstanceName;

        /**
         * <p>The remarks of the data source.</p>
         */
        @NameInMap("DataSourceInstanceRemark")
        public String dataSourceInstanceRemark;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        public static ListDataSourceLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceLogsResponseBodyData self = new ListDataSourceLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSourceLogsResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListDataSourceLogsResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListDataSourceLogsResponseBodyData setDataSourceInstanceId(String dataSourceInstanceId) {
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        public ListDataSourceLogsResponseBodyData setDataSourceInstanceLogs(java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs> dataSourceInstanceLogs) {
            this.dataSourceInstanceLogs = dataSourceInstanceLogs;
            return this;
        }
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs> getDataSourceInstanceLogs() {
            return this.dataSourceInstanceLogs;
        }

        public ListDataSourceLogsResponseBodyData setDataSourceInstanceName(String dataSourceInstanceName) {
            this.dataSourceInstanceName = dataSourceInstanceName;
            return this;
        }
        public String getDataSourceInstanceName() {
            return this.dataSourceInstanceName;
        }

        public ListDataSourceLogsResponseBodyData setDataSourceInstanceRemark(String dataSourceInstanceRemark) {
            this.dataSourceInstanceRemark = dataSourceInstanceRemark;
            return this;
        }
        public String getDataSourceInstanceRemark() {
            return this.dataSourceInstanceRemark;
        }

        public ListDataSourceLogsResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

}
