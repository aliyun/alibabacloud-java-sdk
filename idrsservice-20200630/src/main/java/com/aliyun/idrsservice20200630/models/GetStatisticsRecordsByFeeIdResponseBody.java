// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsRecordsByFeeIdResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetStatisticsRecordsByFeeIdResponseBodyData> data;

    @NameInMap("Errors")
    public java.util.List<GetStatisticsRecordsByFeeIdResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetStatisticsRecordsByFeeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsRecordsByFeeIdResponseBody self = new GetStatisticsRecordsByFeeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatisticsRecordsByFeeIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setData(java.util.List<GetStatisticsRecordsByFeeIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStatisticsRecordsByFeeIdResponseBodyData> getData() {
        return this.data;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setErrors(java.util.List<GetStatisticsRecordsByFeeIdResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetStatisticsRecordsByFeeIdResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStatisticsRecordsByFeeIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStatisticsRecordsByFeeIdResponseBodyData extends TeaModel {
        /**
         * <p>appid</p>
         */
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("BeginAt")
        public String beginAt;

        @NameInMap("ChargeDuration")
        public Integer chargeDuration;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("DetectionDuration")
        public Integer detectionDuration;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public Integer deviceType;

        @NameInMap("EndAt")
        public String endAt;

        @NameInMap("FeeId")
        public String feeId;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetStatisticsRecordsByFeeIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsRecordsByFeeIdResponseBodyData self = new GetStatisticsRecordsByFeeIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setBeginAt(String beginAt) {
            this.beginAt = beginAt;
            return this;
        }
        public String getBeginAt() {
            return this.beginAt;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setChargeDuration(Integer chargeDuration) {
            this.chargeDuration = chargeDuration;
            return this;
        }
        public Integer getChargeDuration() {
            return this.chargeDuration;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setDetectionDuration(Integer detectionDuration) {
            this.detectionDuration = detectionDuration;
            return this;
        }
        public Integer getDetectionDuration() {
            return this.detectionDuration;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setEndAt(String endAt) {
            this.endAt = endAt;
            return this;
        }
        public String getEndAt() {
            return this.endAt;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setFeeId(String feeId) {
            this.feeId = feeId;
            return this;
        }
        public String getFeeId() {
            return this.feeId;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetStatisticsRecordsByFeeIdResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetStatisticsRecordsByFeeIdResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsRecordsByFeeIdResponseBodyErrors self = new GetStatisticsRecordsByFeeIdResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetStatisticsRecordsByFeeIdResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetStatisticsRecordsByFeeIdResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
