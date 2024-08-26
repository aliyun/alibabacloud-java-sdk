// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchIndexJobRerunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchIndexJobRerunResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static SearchIndexJobRerunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchIndexJobRerunResponseBody self = new SearchIndexJobRerunResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchIndexJobRerunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchIndexJobRerunResponseBody setData(SearchIndexJobRerunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchIndexJobRerunResponseBodyData getData() {
        return this.data;
    }

    public SearchIndexJobRerunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchIndexJobRerunResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SearchIndexJobRerunResponseBodyData extends TeaModel {
        @NameInMap("MediaIdsNoExist")
        public java.util.List<String> mediaIdsNoExist;

        public static SearchIndexJobRerunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchIndexJobRerunResponseBodyData self = new SearchIndexJobRerunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchIndexJobRerunResponseBodyData setMediaIdsNoExist(java.util.List<String> mediaIdsNoExist) {
            this.mediaIdsNoExist = mediaIdsNoExist;
            return this;
        }
        public java.util.List<String> getMediaIdsNoExist() {
            return this.mediaIdsNoExist;
        }

    }

}
