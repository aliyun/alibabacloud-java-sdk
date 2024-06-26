// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByFaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaInfoList")
    public java.util.List<SearchMediaByFaceResponseBodyMediaInfoList> mediaInfoList;

    /**
     * <strong>example:</strong>
     * <p>7CA7D615-CFB1-5437-9A12-2D185C3EE6CB</p>
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
     * <p>163</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaByFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByFaceResponseBody self = new SearchMediaByFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaByFaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaByFaceResponseBody setMediaInfoList(java.util.List<SearchMediaByFaceResponseBodyMediaInfoList> mediaInfoList) {
        this.mediaInfoList = mediaInfoList;
        return this;
    }
    public java.util.List<SearchMediaByFaceResponseBodyMediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
    }

    public SearchMediaByFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaByFaceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaByFaceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaByFaceResponseBodyMediaInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3b187b3620c8490886cfc2a9578c****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaByFaceResponseBodyMediaInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaByFaceResponseBodyMediaInfoList self = new SearchMediaByFaceResponseBodyMediaInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaByFaceResponseBodyMediaInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
