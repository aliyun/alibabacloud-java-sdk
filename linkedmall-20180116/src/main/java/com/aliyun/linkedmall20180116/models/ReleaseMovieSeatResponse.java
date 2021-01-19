// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReleaseMovieSeatResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ActionResult")
    @Validation(required = true)
    public ReleaseMovieSeatResponseActionResult actionResult;

    public static ReleaseMovieSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMovieSeatResponse self = new ReleaseMovieSeatResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseMovieSeatResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseMovieSeatResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseMovieSeatResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseMovieSeatResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ReleaseMovieSeatResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ReleaseMovieSeatResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ReleaseMovieSeatResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseMovieSeatResponse setActionResult(ReleaseMovieSeatResponseActionResult actionResult) {
        this.actionResult = actionResult;
        return this;
    }
    public ReleaseMovieSeatResponseActionResult getActionResult() {
        return this.actionResult;
    }

    public static class ReleaseMovieSeatResponseActionResult extends TeaModel {
        @NameInMap("ReturnCode")
        @Validation(required = true)
        public String returnCode;

        @NameInMap("ReturnValue")
        @Validation(required = true)
        public String returnValue;

        @NameInMap("ReturnMessage")
        @Validation(required = true)
        public String returnMessage;

        public static ReleaseMovieSeatResponseActionResult build(java.util.Map<String, ?> map) throws Exception {
            ReleaseMovieSeatResponseActionResult self = new ReleaseMovieSeatResponseActionResult();
            return TeaModel.build(map, self);
        }

        public ReleaseMovieSeatResponseActionResult setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public ReleaseMovieSeatResponseActionResult setReturnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }
        public String getReturnValue() {
            return this.returnValue;
        }

        public ReleaseMovieSeatResponseActionResult setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

    }

}
