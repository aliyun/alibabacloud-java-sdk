// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAddUserInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAddUserInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7E375685-FFDF-4AE9-9D07-E2335094F635</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAddUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAddUserInfoResponseBody self = new QueryAddUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAddUserInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAddUserInfoResponseBody setData(QueryAddUserInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAddUserInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryAddUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAddUserInfoResponseBodyDataCurrentFaceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ClientTag")
        public String clientTag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>aliyun1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryAddUserInfoResponseBodyDataCurrentFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryAddUserInfoResponseBodyDataCurrentFaceInfos self = new QueryAddUserInfoResponseBodyDataCurrentFaceInfos();
            return TeaModel.build(map, self);
        }

        public QueryAddUserInfoResponseBodyDataCurrentFaceInfos setClientTag(String clientTag) {
            this.clientTag = clientTag;
            return this;
        }
        public String getClientTag() {
            return this.clientTag;
        }

        public QueryAddUserInfoResponseBodyDataCurrentFaceInfos setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryAddUserInfoResponseBodyDataCurrentFaceInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryAddUserInfoResponseBodyDataFailedFaceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ClientTag")
        public String clientTag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>aliyun2</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryAddUserInfoResponseBodyDataFailedFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryAddUserInfoResponseBodyDataFailedFaceInfos self = new QueryAddUserInfoResponseBodyDataFailedFaceInfos();
            return TeaModel.build(map, self);
        }

        public QueryAddUserInfoResponseBodyDataFailedFaceInfos setClientTag(String clientTag) {
            this.clientTag = clientTag;
            return this;
        }
        public String getClientTag() {
            return this.clientTag;
        }

        public QueryAddUserInfoResponseBodyDataFailedFaceInfos setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryAddUserInfoResponseBodyDataFailedFaceInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryAddUserInfoResponseBodyData extends TeaModel {
        @NameInMap("CurrentFaceInfos")
        public java.util.List<QueryAddUserInfoResponseBodyDataCurrentFaceInfos> currentFaceInfos;

        @NameInMap("FailedFaceInfos")
        public java.util.List<QueryAddUserInfoResponseBodyDataFailedFaceInfos> failedFaceInfos;

        public static QueryAddUserInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAddUserInfoResponseBodyData self = new QueryAddUserInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAddUserInfoResponseBodyData setCurrentFaceInfos(java.util.List<QueryAddUserInfoResponseBodyDataCurrentFaceInfos> currentFaceInfos) {
            this.currentFaceInfos = currentFaceInfos;
            return this;
        }
        public java.util.List<QueryAddUserInfoResponseBodyDataCurrentFaceInfos> getCurrentFaceInfos() {
            return this.currentFaceInfos;
        }

        public QueryAddUserInfoResponseBodyData setFailedFaceInfos(java.util.List<QueryAddUserInfoResponseBodyDataFailedFaceInfos> failedFaceInfos) {
            this.failedFaceInfos = failedFaceInfos;
            return this;
        }
        public java.util.List<QueryAddUserInfoResponseBodyDataFailedFaceInfos> getFailedFaceInfos() {
            return this.failedFaceInfos;
        }

    }

}
