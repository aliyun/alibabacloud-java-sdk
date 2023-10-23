// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ConsumeFreeStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConsumeFreeStorageResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ConsumeFreeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConsumeFreeStorageResponseBody self = new ConsumeFreeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ConsumeFreeStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConsumeFreeStorageResponseBody setData(ConsumeFreeStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConsumeFreeStorageResponseBodyData getData() {
        return this.data;
    }

    public ConsumeFreeStorageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ConsumeFreeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsumeFreeStorageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConsumeFreeStorageResponseBodyData extends TeaModel {
        @NameInMap("Consumed")
        public Integer consumed;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimeUTC")
        public String endTimeUTC;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Lifecycle")
        public Integer lifecycle;

        @NameInMap("Months")
        public Integer months;

        @NameInMap("RemainQuota")
        public Integer remainQuota;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimeUTC")
        public String startTimeUTC;

        @NameInMap("Type")
        public Integer type;

        public static ConsumeFreeStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConsumeFreeStorageResponseBodyData self = new ConsumeFreeStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConsumeFreeStorageResponseBodyData setConsumed(Integer consumed) {
            this.consumed = consumed;
            return this;
        }
        public Integer getConsumed() {
            return this.consumed;
        }

        public ConsumeFreeStorageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ConsumeFreeStorageResponseBodyData setEndTimeUTC(String endTimeUTC) {
            this.endTimeUTC = endTimeUTC;
            return this;
        }
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        public ConsumeFreeStorageResponseBodyData setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public ConsumeFreeStorageResponseBodyData setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public ConsumeFreeStorageResponseBodyData setMonths(Integer months) {
            this.months = months;
            return this;
        }
        public Integer getMonths() {
            return this.months;
        }

        public ConsumeFreeStorageResponseBodyData setRemainQuota(Integer remainQuota) {
            this.remainQuota = remainQuota;
            return this;
        }
        public Integer getRemainQuota() {
            return this.remainQuota;
        }

        public ConsumeFreeStorageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ConsumeFreeStorageResponseBodyData setStartTimeUTC(String startTimeUTC) {
            this.startTimeUTC = startTimeUTC;
            return this;
        }
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        public ConsumeFreeStorageResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
