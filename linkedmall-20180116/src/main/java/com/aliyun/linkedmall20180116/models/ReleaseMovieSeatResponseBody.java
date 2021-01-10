// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReleaseMovieSeatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ActionResult")
    public ReleaseMovieSeatResponseBodyActionResult actionResult;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ReleaseMovieSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMovieSeatResponseBody self = new ReleaseMovieSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseMovieSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseMovieSeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseMovieSeatResponseBody setActionResult(ReleaseMovieSeatResponseBodyActionResult actionResult) {
        this.actionResult = actionResult;
        return this;
    }
    public ReleaseMovieSeatResponseBodyActionResult getActionResult() {
        return this.actionResult;
    }

    public ReleaseMovieSeatResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ReleaseMovieSeatResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ReleaseMovieSeatResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ReleaseMovieSeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseMovieSeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReleaseMovieSeatResponseBodyActionResult extends TeaModel {
        @NameInMap("ReturnCode")
        public String returnCode;

        @NameInMap("ReturnValue")
        public String returnValue;

        @NameInMap("ReturnMessage")
        public String returnMessage;

        public static ReleaseMovieSeatResponseBodyActionResult build(java.util.Map<String, ?> map) throws Exception {
            ReleaseMovieSeatResponseBodyActionResult self = new ReleaseMovieSeatResponseBodyActionResult();
            return TeaModel.build(map, self);
        }

        public ReleaseMovieSeatResponseBodyActionResult setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public ReleaseMovieSeatResponseBodyActionResult setReturnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }
        public String getReturnValue() {
            return this.returnValue;
        }

        public ReleaseMovieSeatResponseBodyActionResult setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

    }

}
