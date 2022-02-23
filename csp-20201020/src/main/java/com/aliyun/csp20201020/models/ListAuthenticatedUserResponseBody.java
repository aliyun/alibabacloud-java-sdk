// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAuthenticatedUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAuthenticatedUserResponseBodyData> data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAuthenticatedUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatedUserResponseBody self = new ListAuthenticatedUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatedUserResponseBody setData(java.util.List<ListAuthenticatedUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuthenticatedUserResponseBodyData> getData() {
        return this.data;
    }

    public ListAuthenticatedUserResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListAuthenticatedUserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAuthenticatedUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAuthenticatedUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthenticatedUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAuthenticatedUserResponseBodyData extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("UserName")
        public String userName;

        public static ListAuthenticatedUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthenticatedUserResponseBodyData self = new ListAuthenticatedUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthenticatedUserResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAuthenticatedUserResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
