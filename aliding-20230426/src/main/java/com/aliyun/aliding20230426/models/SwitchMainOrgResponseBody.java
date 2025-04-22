// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SwitchMainOrgResponseBody extends TeaModel {
    @NameInMap("content")
    public SwitchMainOrgResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorCtx")
    public java.util.Map<String, ?> errorCtx;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SwitchMainOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchMainOrgResponseBody self = new SwitchMainOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchMainOrgResponseBody setContent(SwitchMainOrgResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public SwitchMainOrgResponseBodyContent getContent() {
        return this.content;
    }

    public SwitchMainOrgResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SwitchMainOrgResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public SwitchMainOrgResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SwitchMainOrgResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SwitchMainOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchMainOrgResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SwitchMainOrgResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("data")
        public Object data;

        public static SwitchMainOrgResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            SwitchMainOrgResponseBodyContent self = new SwitchMainOrgResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public SwitchMainOrgResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
