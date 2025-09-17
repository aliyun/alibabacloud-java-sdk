// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribePushMeteringDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>parameter \&quot;service\&quot; can not be blank.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    /**
     * <strong>example:</strong>
     * <p>Instance 5723f7ee-952d-411f-94f4-b942a550d9b8 does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A6A33748-D573-593C-A3BC-593E33D68311</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePushMeteringDataResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribePushMeteringDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePushMeteringDataResponseBody self = new DescribePushMeteringDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePushMeteringDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePushMeteringDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribePushMeteringDataResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public DescribePushMeteringDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePushMeteringDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePushMeteringDataResponseBody setResult(DescribePushMeteringDataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePushMeteringDataResponseBodyResult getResult() {
        return this.result;
    }

    public DescribePushMeteringDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePushMeteringDataResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-09-18T03:15:00Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>5000002763123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsPushBilling")
        public Boolean isPushBilling;

        /**
         * <strong>example:</strong>
         * <p>sgcmgj0003XXXX-Period-1</p>
         */
        @NameInMap("MeteringAssist")
        public String meteringAssist;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Frequency&quot;:1}</p>
         */
        @NameInMap("MeteringEntity")
        public String meteringEntity;

        /**
         * <strong>example:</strong>
         * <p>pushData123456</p>
         */
        @NameInMap("PushOrderBizId")
        public String pushOrderBizId;

        /**
         * <strong>example:</strong>
         * <p>2025-01-09T02:04:58Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribePushMeteringDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePushMeteringDataResponseBodyResult self = new DescribePushMeteringDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePushMeteringDataResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePushMeteringDataResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePushMeteringDataResponseBodyResult setIsPushBilling(Boolean isPushBilling) {
            this.isPushBilling = isPushBilling;
            return this;
        }
        public Boolean getIsPushBilling() {
            return this.isPushBilling;
        }

        public DescribePushMeteringDataResponseBodyResult setMeteringAssist(String meteringAssist) {
            this.meteringAssist = meteringAssist;
            return this;
        }
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

        public DescribePushMeteringDataResponseBodyResult setMeteringEntity(String meteringEntity) {
            this.meteringEntity = meteringEntity;
            return this;
        }
        public String getMeteringEntity() {
            return this.meteringEntity;
        }

        public DescribePushMeteringDataResponseBodyResult setPushOrderBizId(String pushOrderBizId) {
            this.pushOrderBizId = pushOrderBizId;
            return this;
        }
        public String getPushOrderBizId() {
            return this.pushOrderBizId;
        }

        public DescribePushMeteringDataResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
