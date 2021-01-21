// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlanByPlanIdResponse extends TeaModel {
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
    public QueryDevicePurifyPlanByPlanIdResponseData data;

    public static QueryDevicePurifyPlanByPlanIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlanByPlanIdResponse self = new QueryDevicePurifyPlanByPlanIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlanByPlanIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyPlanByPlanIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePurifyPlanByPlanIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyPlanByPlanIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyPlanByPlanIdResponse setData(QueryDevicePurifyPlanByPlanIdResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyPlanByPlanIdResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePurifyPlanByPlanIdResponseData extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

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
        public Integer startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Integer endTime;

        public static QueryDevicePurifyPlanByPlanIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlanByPlanIdResponseData self = new QueryDevicePurifyPlanByPlanIdResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyPlanByPlanIdResponseData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

    }

}
