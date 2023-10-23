// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class EnableFreeStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnableFreeStorageResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableFreeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFreeStorageResponseBody self = new EnableFreeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFreeStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableFreeStorageResponseBody setData(EnableFreeStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableFreeStorageResponseBodyData getData() {
        return this.data;
    }

    public EnableFreeStorageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EnableFreeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableFreeStorageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableFreeStorageResponseBodyData extends TeaModel {
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

        public static EnableFreeStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableFreeStorageResponseBodyData self = new EnableFreeStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableFreeStorageResponseBodyData setConsumed(Integer consumed) {
            this.consumed = consumed;
            return this;
        }
        public Integer getConsumed() {
            return this.consumed;
        }

        public EnableFreeStorageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public EnableFreeStorageResponseBodyData setEndTimeUTC(String endTimeUTC) {
            this.endTimeUTC = endTimeUTC;
            return this;
        }
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        public EnableFreeStorageResponseBodyData setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public EnableFreeStorageResponseBodyData setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public EnableFreeStorageResponseBodyData setMonths(Integer months) {
            this.months = months;
            return this;
        }
        public Integer getMonths() {
            return this.months;
        }

        public EnableFreeStorageResponseBodyData setRemainQuota(Integer remainQuota) {
            this.remainQuota = remainQuota;
            return this;
        }
        public Integer getRemainQuota() {
            return this.remainQuota;
        }

        public EnableFreeStorageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public EnableFreeStorageResponseBodyData setStartTimeUTC(String startTimeUTC) {
            this.startTimeUTC = startTimeUTC;
            return this;
        }
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        public EnableFreeStorageResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
