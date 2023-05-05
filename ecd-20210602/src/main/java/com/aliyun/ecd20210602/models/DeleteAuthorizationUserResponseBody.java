// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteAuthorizationUserResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAuthorizationUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationUserResponseBody self = new DeleteAuthorizationUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAuthorizationUserResponseBody setData(DeleteAuthorizationUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAuthorizationUserResponseBodyData getData() {
        return this.data;
    }

    public DeleteAuthorizationUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAuthorizationUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAuthorizationUserResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static DeleteAuthorizationUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAuthorizationUserResponseBodyData self = new DeleteAuthorizationUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAuthorizationUserResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
