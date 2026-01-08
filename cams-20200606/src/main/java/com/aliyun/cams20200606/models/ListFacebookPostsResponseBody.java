// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFacebookPostsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListFacebookPostsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFacebookPostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFacebookPostsResponseBody self = new ListFacebookPostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFacebookPostsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListFacebookPostsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFacebookPostsResponseBody setData(java.util.List<ListFacebookPostsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFacebookPostsResponseBodyData> getData() {
        return this.data;
    }

    public ListFacebookPostsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFacebookPostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFacebookPostsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFacebookPostsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-04-08T10:44:48</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("FullPicture")
        public String fullPicture;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx07">https://xxxxxx07</a></p>
         */
        @NameInMap("MediaUrl")
        public String mediaUrl;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxx">https://xxxxxxx</a></p>
         */
        @NameInMap("PermalinkUrl")
        public String permalinkUrl;

        /**
         * <strong>example:</strong>
         * <p>453645465***</p>
         */
        @NameInMap("RequestNo")
        public String requestNo;

        public static ListFacebookPostsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFacebookPostsResponseBodyData self = new ListFacebookPostsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFacebookPostsResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFacebookPostsResponseBodyData setFullPicture(String fullPicture) {
            this.fullPicture = fullPicture;
            return this;
        }
        public String getFullPicture() {
            return this.fullPicture;
        }

        public ListFacebookPostsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFacebookPostsResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListFacebookPostsResponseBodyData setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public ListFacebookPostsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListFacebookPostsResponseBodyData setPermalinkUrl(String permalinkUrl) {
            this.permalinkUrl = permalinkUrl;
            return this;
        }
        public String getPermalinkUrl() {
            return this.permalinkUrl;
        }

        public ListFacebookPostsResponseBodyData setRequestNo(String requestNo) {
            this.requestNo = requestNo;
            return this;
        }
        public String getRequestNo() {
            return this.requestNo;
        }

    }

}
