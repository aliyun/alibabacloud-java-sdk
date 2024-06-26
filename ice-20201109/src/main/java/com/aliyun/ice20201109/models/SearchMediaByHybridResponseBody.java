// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByHybridResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaList")
    public java.util.List<SearchMediaByHybridResponseBodyMediaList> mediaList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
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
     * <p>30</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaByHybridResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByHybridResponseBody self = new SearchMediaByHybridResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaByHybridResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaByHybridResponseBody setMediaList(java.util.List<SearchMediaByHybridResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<SearchMediaByHybridResponseBodyMediaList> getMediaList() {
        return this.mediaList;
    }

    public SearchMediaByHybridResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaByHybridResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaByHybridResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaByHybridResponseBodyMediaListClipInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaByHybridResponseBodyMediaListClipInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByHybridResponseBodyMediaListClipInfo self = new SearchMediaByHybridResponseBodyMediaListClipInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaByHybridResponseBodyMediaListClipInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaByHybridResponseBodyMediaListClipInfo setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMediaByHybridResponseBodyMediaListClipInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaByHybridResponseBodyMediaList extends TeaModel {
        @NameInMap("ClipInfo")
        public java.util.List<SearchMediaByHybridResponseBodyMediaListClipInfo> clipInfo;

        /**
         * <strong>example:</strong>
         * <p>a18936e0e28771edb59ae6f6f47a****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaByHybridResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByHybridResponseBodyMediaList self = new SearchMediaByHybridResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaByHybridResponseBodyMediaList setClipInfo(java.util.List<SearchMediaByHybridResponseBodyMediaListClipInfo> clipInfo) {
            this.clipInfo = clipInfo;
            return this;
        }
        public java.util.List<SearchMediaByHybridResponseBodyMediaListClipInfo> getClipInfo() {
            return this.clipInfo;
        }

        public SearchMediaByHybridResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
