// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddFaceUserResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static AddFaceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserResponseBody self = new AddFaceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserResponseBody setData(AddFaceUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserResponseBodyData getData() {
        return this.data;
    }

    public AddFaceUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFaceUserResponseBodyData extends TeaModel {
        @NameInMap("Params")
        public String params;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Name")
        public String name;

        public static AddFaceUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserResponseBodyData self = new AddFaceUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public AddFaceUserResponseBodyData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public AddFaceUserResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AddFaceUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
