// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserIdByCustomUserIdResponse extends TeaModel {
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
    public QueryFaceUserIdByCustomUserIdResponseData data;

    public static QueryFaceUserIdByCustomUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserIdByCustomUserIdResponse self = new QueryFaceUserIdByCustomUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserIdByCustomUserIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserIdByCustomUserIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceUserIdByCustomUserIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserIdByCustomUserIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserIdByCustomUserIdResponse setData(QueryFaceUserIdByCustomUserIdResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserIdByCustomUserIdResponseData getData() {
        return this.data;
    }

    public static class QueryFaceUserIdByCustomUserIdResponseData extends TeaModel {
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

        public static QueryFaceUserIdByCustomUserIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserIdByCustomUserIdResponseData self = new QueryFaceUserIdByCustomUserIdResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserIdByCustomUserIdResponseData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryFaceUserIdByCustomUserIdResponseData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserIdByCustomUserIdResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserIdByCustomUserIdResponseData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
