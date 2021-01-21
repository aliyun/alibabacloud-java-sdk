// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public AddFaceUserResponseData data;

    public static AddFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserResponse self = new AddFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddFaceUserResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserResponse setData(AddFaceUserResponseData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserResponseData getData() {
        return this.data;
    }

    public static class AddFaceUserResponseData extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("CustomUserId")
        @Validation(required = true)
        public String customUserId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Params")
        @Validation(required = true)
        public String params;

        public static AddFaceUserResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserResponseData self = new AddFaceUserResponseData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserResponseData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AddFaceUserResponseData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public AddFaceUserResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddFaceUserResponseData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
