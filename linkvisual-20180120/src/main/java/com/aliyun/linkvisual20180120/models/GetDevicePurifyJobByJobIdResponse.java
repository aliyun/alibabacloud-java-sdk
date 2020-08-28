// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetDevicePurifyJobByJobIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDevicePurifyJobByJobIdResponseData data;

    public static GetDevicePurifyJobByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePurifyJobByJobIdResponse self = new GetDevicePurifyJobByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDevicePurifyJobByJobIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevicePurifyJobByJobIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDevicePurifyJobByJobIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDevicePurifyJobByJobIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDevicePurifyJobByJobIdResponse setData(GetDevicePurifyJobByJobIdResponseData data) {
        this.data = data;
        return this;
    }
    public GetDevicePurifyJobByJobIdResponseData getData() {
        return this.data;
    }

    public static class GetDevicePurifyJobByJobIdResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("PurifyRecordNameUrl")
        @Validation(required = true)
        public String purifyRecordNameUrl;

        @NameInMap("PurifyRecordIndexUrl")
        @Validation(required = true)
        public String purifyRecordIndexUrl;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static GetDevicePurifyJobByJobIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDevicePurifyJobByJobIdResponseData self = new GetDevicePurifyJobByJobIdResponseData();
            return TeaModel.build(map, self);
        }

        public GetDevicePurifyJobByJobIdResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDevicePurifyJobByJobIdResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDevicePurifyJobByJobIdResponseData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDevicePurifyJobByJobIdResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetDevicePurifyJobByJobIdResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDevicePurifyJobByJobIdResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetDevicePurifyJobByJobIdResponseData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDevicePurifyJobByJobIdResponseData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDevicePurifyJobByJobIdResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetDevicePurifyJobByJobIdResponseData setPurifyRecordNameUrl(String purifyRecordNameUrl) {
            this.purifyRecordNameUrl = purifyRecordNameUrl;
            return this;
        }
        public String getPurifyRecordNameUrl() {
            return this.purifyRecordNameUrl;
        }

        public GetDevicePurifyJobByJobIdResponseData setPurifyRecordIndexUrl(String purifyRecordIndexUrl) {
            this.purifyRecordIndexUrl = purifyRecordIndexUrl;
            return this;
        }
        public String getPurifyRecordIndexUrl() {
            return this.purifyRecordIndexUrl;
        }

        public GetDevicePurifyJobByJobIdResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
