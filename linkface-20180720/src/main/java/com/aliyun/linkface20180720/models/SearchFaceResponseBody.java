// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class SearchFaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SearchFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>862B97AF-1115-410D-8D35-A3068CED58CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponseBody self = new SearchFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchFaceResponseBody setData(SearchFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseBodyData getData() {
        return this.data;
    }

    public SearchFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchFaceResponseBodyDataTopUserItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.78</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>iot</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SearchFaceResponseBodyDataTopUserItem build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataTopUserItem self = new SearchFaceResponseBodyDataTopUserItem();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataTopUserItem setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchFaceResponseBodyDataTopUserItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchFaceResponseBodyData extends TeaModel {
        @NameInMap("TopUserItem")
        public java.util.List<SearchFaceResponseBodyDataTopUserItem> topUserItem;

        public static SearchFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyData self = new SearchFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyData setTopUserItem(java.util.List<SearchFaceResponseBodyDataTopUserItem> topUserItem) {
            this.topUserItem = topUserItem;
            return this;
        }
        public java.util.List<SearchFaceResponseBodyDataTopUserItem> getTopUserItem() {
            return this.topUserItem;
        }

    }

}
