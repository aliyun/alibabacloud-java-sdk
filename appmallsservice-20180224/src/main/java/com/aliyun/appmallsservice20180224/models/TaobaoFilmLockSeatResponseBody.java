// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmLockSeatResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeatLocked")
    public TaobaoFilmLockSeatResponseBodySeatLocked seatLocked;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmLockSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmLockSeatResponseBody self = new TaobaoFilmLockSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmLockSeatResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmLockSeatResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmLockSeatResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmLockSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmLockSeatResponseBody setSeatLocked(TaobaoFilmLockSeatResponseBodySeatLocked seatLocked) {
        this.seatLocked = seatLocked;
        return this;
    }
    public TaobaoFilmLockSeatResponseBodySeatLocked getSeatLocked() {
        return this.seatLocked;
    }

    public TaobaoFilmLockSeatResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmLockSeatResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmLockSeatResponseBodySeatLocked extends TeaModel {
        @NameInMap("ApplyKey")
        public String applyKey;

        @NameInMap("DefaultLockSecond")
        public Long defaultLockSecond;

        @NameInMap("LockTime")
        public Long lockTime;

        @NameInMap("Status")
        public String status;

        public static TaobaoFilmLockSeatResponseBodySeatLocked build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmLockSeatResponseBodySeatLocked self = new TaobaoFilmLockSeatResponseBodySeatLocked();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmLockSeatResponseBodySeatLocked setApplyKey(String applyKey) {
            this.applyKey = applyKey;
            return this;
        }
        public String getApplyKey() {
            return this.applyKey;
        }

        public TaobaoFilmLockSeatResponseBodySeatLocked setDefaultLockSecond(Long defaultLockSecond) {
            this.defaultLockSecond = defaultLockSecond;
            return this;
        }
        public Long getDefaultLockSecond() {
            return this.defaultLockSecond;
        }

        public TaobaoFilmLockSeatResponseBodySeatLocked setLockTime(Long lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Long getLockTime() {
            return this.lockTime;
        }

        public TaobaoFilmLockSeatResponseBodySeatLocked setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
