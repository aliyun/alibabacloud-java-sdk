// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListUserAuthorizedResourcesResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListUserAuthorizedResourcesResponseBodyContent content;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorCtx")
    public java.util.Map<String, ?> errorCtx;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUserAuthorizedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthorizedResourcesResponseBody self = new ListUserAuthorizedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAuthorizedResourcesResponseBody setContent(ListUserAuthorizedResourcesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListUserAuthorizedResourcesResponseBodyContent getContent() {
        return this.content;
    }

    public ListUserAuthorizedResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserAuthorizedResourcesResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public ListUserAuthorizedResourcesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListUserAuthorizedResourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserAuthorizedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAuthorizedResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserAuthorizedResourcesResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public Object data;

        @NameInMap("Metadata")
        public Object metadata;

        public static ListUserAuthorizedResourcesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListUserAuthorizedResourcesResponseBodyContent self = new ListUserAuthorizedResourcesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListUserAuthorizedResourcesResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public ListUserAuthorizedResourcesResponseBodyContent setMetadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Object getMetadata() {
            return this.metadata;
        }

    }

}
