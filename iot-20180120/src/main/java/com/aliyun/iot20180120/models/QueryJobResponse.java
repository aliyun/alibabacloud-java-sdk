// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobResponse extends TeaModel {
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
    public QueryJobResponseData data;

    public static QueryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobResponse self = new QueryJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryJobResponse setData(QueryJobResponseData data) {
        this.data = data;
        return this;
    }
    public QueryJobResponseData getData() {
        return this.data;
    }

    public static class QueryJobResponseDataRolloutConfig extends TeaModel {
        @NameInMap("MaximumPerMinute")
        @Validation(required = true)
        public Integer maximumPerMinute;

        public static QueryJobResponseDataRolloutConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataRolloutConfig self = new QueryJobResponseDataRolloutConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataRolloutConfig setMaximumPerMinute(Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

    }

    public static class QueryJobResponseDataTimeoutConfig extends TeaModel {
        @NameInMap("InProgressTimeoutInMinutes")
        @Validation(required = true)
        public Integer inProgressTimeoutInMinutes;

        public static QueryJobResponseDataTimeoutConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataTimeoutConfig self = new QueryJobResponseDataTimeoutConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataTimeoutConfig setInProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
            return this;
        }
        public Integer getInProgressTimeoutInMinutes() {
            return this.inProgressTimeoutInMinutes;
        }

    }

    public static class QueryJobResponseDataJobFile extends TeaModel {
        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("SignMethod")
        @Validation(required = true)
        public String signMethod;

        @NameInMap("Sign")
        @Validation(required = true)
        public String sign;

        public static QueryJobResponseDataJobFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataJobFile self = new QueryJobResponseDataJobFile();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataJobFile setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public QueryJobResponseDataJobFile setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryJobResponseDataJobFile setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

    public static class QueryJobResponseDataTargetConfigTargetDevicesTargetDevices extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        public static QueryJobResponseDataTargetConfigTargetDevicesTargetDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataTargetConfigTargetDevicesTargetDevices self = new QueryJobResponseDataTargetConfigTargetDevicesTargetDevices();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataTargetConfigTargetDevicesTargetDevices setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryJobResponseDataTargetConfigTargetDevicesTargetDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

    public static class QueryJobResponseDataTargetConfigTargetDevices extends TeaModel {
        @NameInMap("targetDevices")
        @Validation(required = true)
        public java.util.List<QueryJobResponseDataTargetConfigTargetDevicesTargetDevices> targetDevices;

        public static QueryJobResponseDataTargetConfigTargetDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataTargetConfigTargetDevices self = new QueryJobResponseDataTargetConfigTargetDevices();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataTargetConfigTargetDevices setTargetDevices(java.util.List<QueryJobResponseDataTargetConfigTargetDevicesTargetDevices> targetDevices) {
            this.targetDevices = targetDevices;
            return this;
        }
        public java.util.List<QueryJobResponseDataTargetConfigTargetDevicesTargetDevices> getTargetDevices() {
            return this.targetDevices;
        }

    }

    public static class QueryJobResponseDataTargetConfig extends TeaModel {
        @NameInMap("TargetGroup")
        @Validation(required = true)
        public String targetGroup;

        @NameInMap("TargetProduct")
        @Validation(required = true)
        public String targetProduct;

        @NameInMap("TargetType")
        @Validation(required = true)
        public String targetType;

        @NameInMap("TargetDevices")
        @Validation(required = true)
        public QueryJobResponseDataTargetConfigTargetDevices targetDevices;

        public static QueryJobResponseDataTargetConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseDataTargetConfig self = new QueryJobResponseDataTargetConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseDataTargetConfig setTargetGroup(String targetGroup) {
            this.targetGroup = targetGroup;
            return this;
        }
        public String getTargetGroup() {
            return this.targetGroup;
        }

        public QueryJobResponseDataTargetConfig setTargetProduct(String targetProduct) {
            this.targetProduct = targetProduct;
            return this;
        }
        public String getTargetProduct() {
            return this.targetProduct;
        }

        public QueryJobResponseDataTargetConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryJobResponseDataTargetConfig setTargetDevices(QueryJobResponseDataTargetConfigTargetDevices targetDevices) {
            this.targetDevices = targetDevices;
            return this;
        }
        public QueryJobResponseDataTargetConfigTargetDevices getTargetDevices() {
            return this.targetDevices;
        }

    }

    public static class QueryJobResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("JobDocument")
        @Validation(required = true)
        public String jobDocument;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("ScheduledTime")
        @Validation(required = true)
        public Long scheduledTime;

        @NameInMap("RolloutConfig")
        @Validation(required = true)
        public QueryJobResponseDataRolloutConfig rolloutConfig;

        @NameInMap("TimeoutConfig")
        @Validation(required = true)
        public QueryJobResponseDataTimeoutConfig timeoutConfig;

        @NameInMap("JobFile")
        @Validation(required = true)
        public QueryJobResponseDataJobFile jobFile;

        @NameInMap("TargetConfig")
        @Validation(required = true)
        public QueryJobResponseDataTargetConfig targetConfig;

        public static QueryJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseData self = new QueryJobResponseData();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobResponseData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryJobResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryJobResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryJobResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryJobResponseData setJobDocument(String jobDocument) {
            this.jobDocument = jobDocument;
            return this;
        }
        public String getJobDocument() {
            return this.jobDocument;
        }

        public QueryJobResponseData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryJobResponseData setScheduledTime(Long scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }
        public Long getScheduledTime() {
            return this.scheduledTime;
        }

        public QueryJobResponseData setRolloutConfig(QueryJobResponseDataRolloutConfig rolloutConfig) {
            this.rolloutConfig = rolloutConfig;
            return this;
        }
        public QueryJobResponseDataRolloutConfig getRolloutConfig() {
            return this.rolloutConfig;
        }

        public QueryJobResponseData setTimeoutConfig(QueryJobResponseDataTimeoutConfig timeoutConfig) {
            this.timeoutConfig = timeoutConfig;
            return this;
        }
        public QueryJobResponseDataTimeoutConfig getTimeoutConfig() {
            return this.timeoutConfig;
        }

        public QueryJobResponseData setJobFile(QueryJobResponseDataJobFile jobFile) {
            this.jobFile = jobFile;
            return this;
        }
        public QueryJobResponseDataJobFile getJobFile() {
            return this.jobFile;
        }

        public QueryJobResponseData setTargetConfig(QueryJobResponseDataTargetConfig targetConfig) {
            this.targetConfig = targetConfig;
            return this;
        }
        public QueryJobResponseDataTargetConfig getTargetConfig() {
            return this.targetConfig;
        }

    }

}
