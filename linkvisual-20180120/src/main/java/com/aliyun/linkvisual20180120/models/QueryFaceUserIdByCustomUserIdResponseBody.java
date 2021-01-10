// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserIdByCustomUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceUserIdByCustomUserIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserIdByCustomUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserIdByCustomUserIdResponseBody self = new QueryFaceUserIdByCustomUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setData(QueryFaceUserIdByCustomUserIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserIdByCustomUserIdResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserIdByCustomUserIdResponseBodyData extends TeaModel {
        @NameInMap("Params")
        public String params;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Name")
        public String name;

        public static QueryFaceUserIdByCustomUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserIdByCustomUserIdResponseBodyData self = new QueryFaceUserIdByCustomUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
