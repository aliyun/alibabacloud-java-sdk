// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class MobileRecommendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<MobileRecommendResponseBodyResult> result;

    public static MobileRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileRecommendResponseBody self = new MobileRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileRecommendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MobileRecommendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MobileRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileRecommendResponseBody setResult(java.util.List<MobileRecommendResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<MobileRecommendResponseBodyResult> getResult() {
        return this.result;
    }

    public static class MobileRecommendResponseBodyResult extends TeaModel {
        @NameInMap("Authors")
        public java.util.List<String> authors;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        public static MobileRecommendResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MobileRecommendResponseBodyResult self = new MobileRecommendResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MobileRecommendResponseBodyResult setAuthors(java.util.List<String> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<String> getAuthors() {
            return this.authors;
        }

        public MobileRecommendResponseBodyResult setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public MobileRecommendResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public MobileRecommendResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public MobileRecommendResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
