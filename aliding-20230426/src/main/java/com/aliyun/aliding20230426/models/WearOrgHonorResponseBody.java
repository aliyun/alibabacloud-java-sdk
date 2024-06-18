// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class WearOrgHonorResponseBody extends TeaModel {
    @NameInMap("content")
    public WearOrgHonorResponseBodyContent content;

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
     * <p>32FFC91D-0A9F-585A-B84F-8A54C5187035</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static WearOrgHonorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WearOrgHonorResponseBody self = new WearOrgHonorResponseBody();
        return TeaModel.build(map, self);
    }

    public WearOrgHonorResponseBody setContent(WearOrgHonorResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public WearOrgHonorResponseBodyContent getContent() {
        return this.content;
    }

    public WearOrgHonorResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WearOrgHonorResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public WearOrgHonorResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public WearOrgHonorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WearOrgHonorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WearOrgHonorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WearOrgHonorResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("data")
        public Object data;

        public static WearOrgHonorResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            WearOrgHonorResponseBodyContent self = new WearOrgHonorResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public WearOrgHonorResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
