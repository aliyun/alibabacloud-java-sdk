// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CancelPickUpWaybillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelPickUpWaybillResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CancelPickUpWaybillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPickUpWaybillResponseBody self = new CancelPickUpWaybillResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPickUpWaybillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelPickUpWaybillResponseBody setData(CancelPickUpWaybillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelPickUpWaybillResponseBodyData getData() {
        return this.data;
    }

    public CancelPickUpWaybillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelPickUpWaybillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CancelPickUpWaybillResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CancelPickUpWaybillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelPickUpWaybillResponseBodyData self = new CancelPickUpWaybillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelPickUpWaybillResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CancelPickUpWaybillResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CancelPickUpWaybillResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CancelPickUpWaybillResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
