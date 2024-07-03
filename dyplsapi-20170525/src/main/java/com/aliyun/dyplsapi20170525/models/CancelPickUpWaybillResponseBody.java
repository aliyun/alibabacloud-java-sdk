// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CancelPickUpWaybillResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CancelPickUpWaybillResponseBodyData data;

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
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
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
         * <p>The cancellation result.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the cancellation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
