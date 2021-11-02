// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReservedSeat")
    public ReserveMovieSeatResponseBodyReservedSeat reservedSeat;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ReserveMovieSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReserveMovieSeatResponseBody self = new ReserveMovieSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public ReserveMovieSeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReserveMovieSeatResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ReserveMovieSeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReserveMovieSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReserveMovieSeatResponseBody setReservedSeat(ReserveMovieSeatResponseBodyReservedSeat reservedSeat) {
        this.reservedSeat = reservedSeat;
        return this;
    }
    public ReserveMovieSeatResponseBodyReservedSeat getReservedSeat() {
        return this.reservedSeat;
    }

    public ReserveMovieSeatResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ReserveMovieSeatResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ReserveMovieSeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReserveMovieSeatResponseBodyReservedSeat extends TeaModel {
        @NameInMap("ApplyKey")
        public String applyKey;

        @NameInMap("DefaultLockSecond")
        public Long defaultLockSecond;

        @NameInMap("ReservedTime")
        public Long reservedTime;

        @NameInMap("Status")
        public String status;

        public static ReserveMovieSeatResponseBodyReservedSeat build(java.util.Map<String, ?> map) throws Exception {
            ReserveMovieSeatResponseBodyReservedSeat self = new ReserveMovieSeatResponseBodyReservedSeat();
            return TeaModel.build(map, self);
        }

        public ReserveMovieSeatResponseBodyReservedSeat setApplyKey(String applyKey) {
            this.applyKey = applyKey;
            return this;
        }
        public String getApplyKey() {
            return this.applyKey;
        }

        public ReserveMovieSeatResponseBodyReservedSeat setDefaultLockSecond(Long defaultLockSecond) {
            this.defaultLockSecond = defaultLockSecond;
            return this;
        }
        public Long getDefaultLockSecond() {
            return this.defaultLockSecond;
        }

        public ReserveMovieSeatResponseBodyReservedSeat setReservedTime(Long reservedTime) {
            this.reservedTime = reservedTime;
            return this;
        }
        public Long getReservedTime() {
            return this.reservedTime;
        }

        public ReserveMovieSeatResponseBodyReservedSeat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
