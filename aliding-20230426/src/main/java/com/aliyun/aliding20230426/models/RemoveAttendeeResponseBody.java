// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveAttendeeResponseBody extends TeaModel {
    @NameInMap("Content")
    public RemoveAttendeeResponseBodyContent content;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorCtx")
    public java.util.Map<String, ?> errorCtx;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveAttendeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAttendeeResponseBody self = new RemoveAttendeeResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAttendeeResponseBody setContent(RemoveAttendeeResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public RemoveAttendeeResponseBodyContent getContent() {
        return this.content;
    }

    public RemoveAttendeeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RemoveAttendeeResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public RemoveAttendeeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RemoveAttendeeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemoveAttendeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveAttendeeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveAttendeeResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public Object data;

        public static RemoveAttendeeResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            RemoveAttendeeResponseBodyContent self = new RemoveAttendeeResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public RemoveAttendeeResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
