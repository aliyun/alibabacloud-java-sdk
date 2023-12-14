// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDataSourceLogsResponseBodyData data;

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
        @NameInMap("ParaCode")
        public String paraCode;

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
        @NameInMap("LogCode")
        public String logCode;

        @NameInMap("LogInstanceId")
        public String logInstanceId;

        @NameInMap("LogMdsCode")
        public String logMdsCode;

        @NameInMap("LogParams")
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogsLogParams> logParams;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        @NameInMap("DataSourceInstanceLogs")
        public java.util.List<ListDataSourceLogsResponseBodyDataDataSourceInstanceLogs> dataSourceInstanceLogs;

        @NameInMap("DataSourceInstanceName")
        public String dataSourceInstanceName;

        @NameInMap("DataSourceInstanceRemark")
        public String dataSourceInstanceRemark;

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
