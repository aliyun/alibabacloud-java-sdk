// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceDistributeJobResponseData data;

    public static QueryDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeJobResponse self = new QueryDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDistributeJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceDistributeJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDistributeJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDistributeJobResponse setData(QueryDeviceDistributeJobResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDistributeJobResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        @NameInMap("TargetInstanceId")
        @Validation(required = true)
        public String targetInstanceId;

        public static QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

    }

    public static class QueryDeviceDistributeJobResponseDataTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        @Validation(required = true)
        public java.util.List<QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs;

        public static QueryDeviceDistributeJobResponseDataTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseDataTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseDataTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseDataTargetInstanceConfigs setTargetInstanceConfigs(java.util.List<QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public java.util.List<QueryDeviceDistributeJobResponseDataTargetInstanceConfigsTargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class QueryDeviceDistributeJobResponseData extends TeaModel {
        @NameInMap("SourceUid")
        @Validation(required = true)
        public String sourceUid;

        @NameInMap("TargetUid")
        @Validation(required = true)
        public String targetUid;

        @NameInMap("SourceInstanceId")
        @Validation(required = true)
        public String sourceInstanceId;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("Strategy")
        @Validation(required = true)
        public Integer strategy;

        @NameInMap("TargetInstanceConfigs")
        @Validation(required = true)
        public QueryDeviceDistributeJobResponseDataTargetInstanceConfigs targetInstanceConfigs;

        public static QueryDeviceDistributeJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseData self = new QueryDeviceDistributeJobResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseData setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public QueryDeviceDistributeJobResponseData setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public QueryDeviceDistributeJobResponseData setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public QueryDeviceDistributeJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryDeviceDistributeJobResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceDistributeJobResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDeviceDistributeJobResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDeviceDistributeJobResponseData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceDistributeJobResponseData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public QueryDeviceDistributeJobResponseData setTargetInstanceConfigs(QueryDeviceDistributeJobResponseDataTargetInstanceConfigs targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public QueryDeviceDistributeJobResponseDataTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

}
