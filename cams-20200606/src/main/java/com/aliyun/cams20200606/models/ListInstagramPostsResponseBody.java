// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstagramPostsResponseBody extends TeaModel {
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
    public java.util.List<ListInstagramPostsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A***66411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstagramPostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstagramPostsResponseBody self = new ListInstagramPostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstagramPostsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstagramPostsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstagramPostsResponseBody setData(java.util.List<ListInstagramPostsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstagramPostsResponseBodyData> getData() {
        return this.data;
    }

    public ListInstagramPostsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstagramPostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstagramPostsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstagramPostsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-09-30T15:53:01+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxx">https://xxxxxxxx</a></p>
         */
        @NameInMap("FullPicture")
        public String fullPicture;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://qjck.oss-cn-shanghai.aliyuncs.com/xcx/2025-08-29/0bfa1c8d-d35f-2dd5-e082-7b00***ee9.jpg?x-oss-process=image/resize,m_lfit,w_1200">https://qjck.oss-cn-shanghai.aliyuncs.com/xcx/2025-08-29/0bfa1c8d-d35f-2dd5-e082-7b00***ee9.jpg?x-oss-process=image/resize,m_lfit,w_1200</a></p>
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
         * <p><a href="https://xxxxxxxx">https://xxxxxxxx</a></p>
         */
        @NameInMap("PermalinkUrl")
        public String permalinkUrl;

        public static ListInstagramPostsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstagramPostsResponseBodyData self = new ListInstagramPostsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstagramPostsResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListInstagramPostsResponseBodyData setFullPicture(String fullPicture) {
            this.fullPicture = fullPicture;
            return this;
        }
        public String getFullPicture() {
            return this.fullPicture;
        }

        public ListInstagramPostsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstagramPostsResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListInstagramPostsResponseBodyData setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public ListInstagramPostsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInstagramPostsResponseBodyData setPermalinkUrl(String permalinkUrl) {
            this.permalinkUrl = permalinkUrl;
            return this;
        }
        public String getPermalinkUrl() {
            return this.permalinkUrl;
        }

    }

}
