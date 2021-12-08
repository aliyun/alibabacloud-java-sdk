// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreatePickUpWaybillResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePickUpWaybillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillResponseBody self = new CreatePickUpWaybillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillResponseBody setData(CreatePickUpWaybillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePickUpWaybillResponseBodyData getData() {
        return this.data;
    }

    public CreatePickUpWaybillResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePickUpWaybillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePickUpWaybillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePickUpWaybillResponseBodyData extends TeaModel {
        @NameInMap("CpCode")
        public String cpCode;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("MailNo")
        public String mailNo;

        @NameInMap("Success")
        public String success;

        public static CreatePickUpWaybillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillResponseBodyData self = new CreatePickUpWaybillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillResponseBodyData setCpCode(String cpCode) {
            this.cpCode = cpCode;
            return this;
        }
        public String getCpCode() {
            return this.cpCode;
        }

        public CreatePickUpWaybillResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreatePickUpWaybillResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreatePickUpWaybillResponseBodyData setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

        public CreatePickUpWaybillResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
