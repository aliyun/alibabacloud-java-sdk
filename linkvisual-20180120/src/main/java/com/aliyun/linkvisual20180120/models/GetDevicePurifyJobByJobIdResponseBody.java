// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetDevicePurifyJobByJobIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDevicePurifyJobByJobIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetDevicePurifyJobByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePurifyJobByJobIdResponseBody self = new GetDevicePurifyJobByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevicePurifyJobByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevicePurifyJobByJobIdResponseBody setData(GetDevicePurifyJobByJobIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDevicePurifyJobByJobIdResponseBodyData getData() {
        return this.data;
    }

    public GetDevicePurifyJobByJobIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDevicePurifyJobByJobIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDevicePurifyJobByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDevicePurifyJobByJobIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("PurifyRecordIndexUrl")
        public String purifyRecordIndexUrl;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("PurifyRecordNameUrl")
        public String purifyRecordNameUrl;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetDevicePurifyJobByJobIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDevicePurifyJobByJobIdResponseBodyData self = new GetDevicePurifyJobByJobIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setPurifyRecordIndexUrl(String purifyRecordIndexUrl) {
            this.purifyRecordIndexUrl = purifyRecordIndexUrl;
            return this;
        }
        public String getPurifyRecordIndexUrl() {
            return this.purifyRecordIndexUrl;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setPurifyRecordNameUrl(String purifyRecordNameUrl) {
            this.purifyRecordNameUrl = purifyRecordNameUrl;
            return this;
        }
        public String getPurifyRecordNameUrl() {
            return this.purifyRecordNameUrl;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetDevicePurifyJobByJobIdResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
