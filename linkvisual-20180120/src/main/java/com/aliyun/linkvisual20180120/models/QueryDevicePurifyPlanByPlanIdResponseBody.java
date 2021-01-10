// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlanByPlanIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDevicePurifyPlanByPlanIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePurifyPlanByPlanIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlanByPlanIdResponseBody self = new QueryDevicePurifyPlanByPlanIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlanByPlanIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyPlanByPlanIdResponseBody setData(QueryDevicePurifyPlanByPlanIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyPlanByPlanIdResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePurifyPlanByPlanIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyPlanByPlanIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyPlanByPlanIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePurifyPlanByPlanIdResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDevicePurifyPlanByPlanIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlanByPlanIdResponseBodyData self = new QueryDevicePurifyPlanByPlanIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryDevicePurifyPlanByPlanIdResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
