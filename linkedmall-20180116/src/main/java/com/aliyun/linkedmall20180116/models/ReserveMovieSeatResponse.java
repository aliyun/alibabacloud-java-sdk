// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ReservedSeat")
    @Validation(required = true)
    public ReserveMovieSeatResponseReservedSeat reservedSeat;

    public static ReserveMovieSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        ReserveMovieSeatResponse self = new ReserveMovieSeatResponse();
        return TeaModel.build(map, self);
    }

    public ReserveMovieSeatResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReserveMovieSeatResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ReserveMovieSeatResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReserveMovieSeatResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReserveMovieSeatResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ReserveMovieSeatResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ReserveMovieSeatResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReserveMovieSeatResponse setReservedSeat(ReserveMovieSeatResponseReservedSeat reservedSeat) {
        this.reservedSeat = reservedSeat;
        return this;
    }
    public ReserveMovieSeatResponseReservedSeat getReservedSeat() {
        return this.reservedSeat;
    }

    public static class ReserveMovieSeatResponseReservedSeat extends TeaModel {
        @NameInMap("ApplyKey")
        @Validation(required = true)
        public String applyKey;

        @NameInMap("DefaultLockSecond")
        @Validation(required = true)
        public Long defaultLockSecond;

        @NameInMap("ReservedTime")
        @Validation(required = true)
        public Long reservedTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ReserveMovieSeatResponseReservedSeat build(java.util.Map<String, ?> map) throws Exception {
            ReserveMovieSeatResponseReservedSeat self = new ReserveMovieSeatResponseReservedSeat();
            return TeaModel.build(map, self);
        }

        public ReserveMovieSeatResponseReservedSeat setApplyKey(String applyKey) {
            this.applyKey = applyKey;
            return this;
        }
        public String getApplyKey() {
            return this.applyKey;
        }

        public ReserveMovieSeatResponseReservedSeat setDefaultLockSecond(Long defaultLockSecond) {
            this.defaultLockSecond = defaultLockSecond;
            return this;
        }
        public Long getDefaultLockSecond() {
            return this.defaultLockSecond;
        }

        public ReserveMovieSeatResponseReservedSeat setReservedTime(Long reservedTime) {
            this.reservedTime = reservedTime;
            return this;
        }
        public Long getReservedTime() {
            return this.reservedTime;
        }

        public ReserveMovieSeatResponseReservedSeat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
