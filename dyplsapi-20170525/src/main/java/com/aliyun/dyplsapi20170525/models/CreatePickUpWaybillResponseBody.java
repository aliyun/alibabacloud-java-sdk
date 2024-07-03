// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreatePickUpWaybillResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FC30594-3841-43AD-9008-03393BCB5CD2</p>
     */
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
        /**
         * <p>The code of the courier company.</p>
         * 
         * <strong>example:</strong>
         * <p>YTO</p>
         */
        @NameInMap("CpCode")
        public String cpCode;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The pickup code.</p>
         * 
         * <strong>example:</strong>
         * <p>3524</p>
         */
        @NameInMap("GotCode")
        public String gotCode;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77312345629****</p>
         */
        @NameInMap("MailNo")
        public String mailNo;

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        public CreatePickUpWaybillResponseBodyData setGotCode(String gotCode) {
            this.gotCode = gotCode;
            return this;
        }
        public String getGotCode() {
            return this.gotCode;
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
