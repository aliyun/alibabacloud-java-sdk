// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceDistributeJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceDistributeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeJobResponseBody self = new QueryDeviceDistributeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDistributeJobResponseBody setData(QueryDeviceDistributeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDistributeJobResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceDistributeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDistributeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDistributeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        public static QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

    }

    public static class QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        public java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs;

        public static QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs setTargetInstanceConfigs(java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class QueryDeviceDistributeJobResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceUid")
        public String sourceUid;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("TargetInstanceConfigs")
        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs targetInstanceConfigs;

        @NameInMap("TargetUid")
        public String targetUid;

        @NameInMap("Total")
        public Integer total;

        public static QueryDeviceDistributeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyData self = new QueryDeviceDistributeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceDistributeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryDeviceDistributeJobResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceDistributeJobResponseBodyData setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public QueryDeviceDistributeJobResponseBodyData setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public QueryDeviceDistributeJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDeviceDistributeJobResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public QueryDeviceDistributeJobResponseBodyData setTargetInstanceConfigs(QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        public QueryDeviceDistributeJobResponseBodyData setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public QueryDeviceDistributeJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
