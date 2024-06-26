// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByMultimodalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaList")
    public java.util.List<SearchMediaByMultimodalResponseBodyMediaList> mediaList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaByMultimodalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByMultimodalResponseBody self = new SearchMediaByMultimodalResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaByMultimodalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaByMultimodalResponseBody setMediaList(java.util.List<SearchMediaByMultimodalResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<SearchMediaByMultimodalResponseBodyMediaList> getMediaList() {
        return this.mediaList;
    }

    public SearchMediaByMultimodalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaByMultimodalResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaByMultimodalResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaByMultimodalResponseBodyMediaListClipInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaByMultimodalResponseBodyMediaListClipInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByMultimodalResponseBodyMediaListClipInfo self = new SearchMediaByMultimodalResponseBodyMediaListClipInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaByMultimodalResponseBodyMediaListClipInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaByMultimodalResponseBodyMediaListClipInfo setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMediaByMultimodalResponseBodyMediaListClipInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaByMultimodalResponseBodyMediaList extends TeaModel {
        @NameInMap("ClipInfo")
        public java.util.List<SearchMediaByMultimodalResponseBodyMediaListClipInfo> clipInfo;

        /**
         * <strong>example:</strong>
         * <p>a18936e0e28771edb59ae6f6f47a****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaByMultimodalResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByMultimodalResponseBodyMediaList self = new SearchMediaByMultimodalResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaByMultimodalResponseBodyMediaList setClipInfo(java.util.List<SearchMediaByMultimodalResponseBodyMediaListClipInfo> clipInfo) {
            this.clipInfo = clipInfo;
            return this;
        }
        public java.util.List<SearchMediaByMultimodalResponseBodyMediaListClipInfo> getClipInfo() {
            return this.clipInfo;
        }

        public SearchMediaByMultimodalResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
