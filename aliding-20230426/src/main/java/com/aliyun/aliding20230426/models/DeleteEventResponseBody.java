// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteEventResponseBody extends TeaModel {
    @NameInMap("content")
    public DeleteEventResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorCtx")
    public java.util.Map<String, ?> errorCtx;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>4248DCC9-785F-5A14-8BE0-830FD52E1261</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventResponseBody self = new DeleteEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventResponseBody setContent(DeleteEventResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DeleteEventResponseBodyContent getContent() {
        return this.content;
    }

    public DeleteEventResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteEventResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public DeleteEventResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteEventResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteEventResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("data")
        public Object data;

        public static DeleteEventResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventResponseBodyContent self = new DeleteEventResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DeleteEventResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
