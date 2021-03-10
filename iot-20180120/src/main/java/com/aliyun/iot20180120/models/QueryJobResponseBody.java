// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryJobResponseBodyData data;

    public static QueryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobResponseBody self = new QueryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryJobResponseBody setData(QueryJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryJobResponseBodyData getData() {
        return this.data;
    }

    public static class QueryJobResponseBodyDataRolloutConfig extends TeaModel {
        @NameInMap("MaximumPerMinute")
        public Integer maximumPerMinute;

        public static QueryJobResponseBodyDataRolloutConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataRolloutConfig self = new QueryJobResponseBodyDataRolloutConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataRolloutConfig setMaximumPerMinute(Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

    }

    public static class QueryJobResponseBodyDataTimeoutConfig extends TeaModel {
        @NameInMap("InProgressTimeoutInMinutes")
        public Integer inProgressTimeoutInMinutes;

        public static QueryJobResponseBodyDataTimeoutConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataTimeoutConfig self = new QueryJobResponseBodyDataTimeoutConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataTimeoutConfig setInProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
            return this;
        }
        public Integer getInProgressTimeoutInMinutes() {
            return this.inProgressTimeoutInMinutes;
        }

    }

    public static class QueryJobResponseBodyDataJobFile extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("Sign")
        public String sign;

        public static QueryJobResponseBodyDataJobFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataJobFile self = new QueryJobResponseBodyDataJobFile();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataJobFile setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public QueryJobResponseBodyDataJobFile setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryJobResponseBodyDataJobFile setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

    public static class QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        public static QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices self = new QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

    public static class QueryJobResponseBodyDataTargetConfigTargetDevices extends TeaModel {
        @NameInMap("targetDevices")
        public java.util.List<QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices> targetDevices;

        public static QueryJobResponseBodyDataTargetConfigTargetDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataTargetConfigTargetDevices self = new QueryJobResponseBodyDataTargetConfigTargetDevices();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataTargetConfigTargetDevices setTargetDevices(java.util.List<QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices> targetDevices) {
            this.targetDevices = targetDevices;
            return this;
        }
        public java.util.List<QueryJobResponseBodyDataTargetConfigTargetDevicesTargetDevices> getTargetDevices() {
            return this.targetDevices;
        }

    }

    public static class QueryJobResponseBodyDataTargetConfig extends TeaModel {
        @NameInMap("TargetGroup")
        public String targetGroup;

        @NameInMap("TargetProduct")
        public String targetProduct;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetDevices")
        public QueryJobResponseBodyDataTargetConfigTargetDevices targetDevices;

        public static QueryJobResponseBodyDataTargetConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyDataTargetConfig self = new QueryJobResponseBodyDataTargetConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyDataTargetConfig setTargetGroup(String targetGroup) {
            this.targetGroup = targetGroup;
            return this;
        }
        public String getTargetGroup() {
            return this.targetGroup;
        }

        public QueryJobResponseBodyDataTargetConfig setTargetProduct(String targetProduct) {
            this.targetProduct = targetProduct;
            return this;
        }
        public String getTargetProduct() {
            return this.targetProduct;
        }

        public QueryJobResponseBodyDataTargetConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryJobResponseBodyDataTargetConfig setTargetDevices(QueryJobResponseBodyDataTargetConfigTargetDevices targetDevices) {
            this.targetDevices = targetDevices;
            return this;
        }
        public QueryJobResponseBodyDataTargetConfigTargetDevices getTargetDevices() {
            return this.targetDevices;
        }

    }

    public static class QueryJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("Status")
        public String status;

        @NameInMap("Description")
        public String description;

        @NameInMap("Type")
        public String type;

        @NameInMap("JobDocument")
        public String jobDocument;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("RolloutConfig")
        public QueryJobResponseBodyDataRolloutConfig rolloutConfig;

        @NameInMap("TimeoutConfig")
        public QueryJobResponseBodyDataTimeoutConfig timeoutConfig;

        @NameInMap("JobFile")
        public QueryJobResponseBodyDataJobFile jobFile;

        @NameInMap("TargetConfig")
        public QueryJobResponseBodyDataTargetConfig targetConfig;

        public static QueryJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryJobResponseBodyData self = new QueryJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryJobResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryJobResponseBodyData setJobDocument(String jobDocument) {
            this.jobDocument = jobDocument;
            return this;
        }
        public String getJobDocument() {
            return this.jobDocument;
        }

        public QueryJobResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryJobResponseBodyData setRolloutConfig(QueryJobResponseBodyDataRolloutConfig rolloutConfig) {
            this.rolloutConfig = rolloutConfig;
            return this;
        }
        public QueryJobResponseBodyDataRolloutConfig getRolloutConfig() {
            return this.rolloutConfig;
        }

        public QueryJobResponseBodyData setTimeoutConfig(QueryJobResponseBodyDataTimeoutConfig timeoutConfig) {
            this.timeoutConfig = timeoutConfig;
            return this;
        }
        public QueryJobResponseBodyDataTimeoutConfig getTimeoutConfig() {
            return this.timeoutConfig;
        }

        public QueryJobResponseBodyData setJobFile(QueryJobResponseBodyDataJobFile jobFile) {
            this.jobFile = jobFile;
            return this;
        }
        public QueryJobResponseBodyDataJobFile getJobFile() {
            return this.jobFile;
        }

        public QueryJobResponseBodyData setTargetConfig(QueryJobResponseBodyDataTargetConfig targetConfig) {
            this.targetConfig = targetConfig;
            return this;
        }
        public QueryJobResponseBodyDataTargetConfig getTargetConfig() {
            return this.targetConfig;
        }

    }

}
