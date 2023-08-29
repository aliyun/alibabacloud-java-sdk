// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddAttendeeResponseBody extends TeaModel {
    @NameInMap("Content")
    public AddAttendeeResponseBodyContent content;

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

    public static AddAttendeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAttendeeResponseBody self = new AddAttendeeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAttendeeResponseBody setContent(AddAttendeeResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AddAttendeeResponseBodyContent getContent() {
        return this.content;
    }

    public AddAttendeeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddAttendeeResponseBody setErrorCtx(java.util.Map<String, ?> errorCtx) {
        this.errorCtx = errorCtx;
        return this;
    }
    public java.util.Map<String, ?> getErrorCtx() {
        return this.errorCtx;
    }

    public AddAttendeeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AddAttendeeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddAttendeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAttendeeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddAttendeeResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public Object data;

        public static AddAttendeeResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AddAttendeeResponseBodyContent self = new AddAttendeeResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AddAttendeeResponseBodyContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

}
