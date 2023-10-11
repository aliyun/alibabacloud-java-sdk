// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RecallHonorResponseBody extends TeaModel {
    @NameInMap("content")
    public RecallHonorResponseBodyContent content;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorCtx")
    public java.util.Map<String, ?> errorCtx;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static RecallHonorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecallHonorResponseBody self = new RecallHonorResponseBody();
        return TeaModel.build(map, self);
    }

    public RecallHonorResponseBody setContent(RecallHonorResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public RecallHonorResponseBodyContent getContent() {
        return this.content;
    }

    public RecallHonorResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RecallHonorResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public RecallHonorResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RecallHonorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RecallHonorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecallHonorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RecallHonorResponseBodyContent extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static RecallHonorResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            RecallHonorResponseBodyContent self = new RecallHonorResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public RecallHonorResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
