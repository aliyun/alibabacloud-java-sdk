// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribePushMeteringDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePushMeteringDataResponseBodyResult result;

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
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsPushBilling")
        public Boolean isPushBilling;

        @NameInMap("MeteringAssist")
        public String meteringAssist;

        @NameInMap("MeteringEntity")
        public String meteringEntity;

        @NameInMap("PushOrderBizId")
        public String pushOrderBizId;

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
