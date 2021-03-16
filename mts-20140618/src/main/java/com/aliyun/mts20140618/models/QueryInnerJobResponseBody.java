// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInnerJobResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Suggestion")
    public String suggestion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Video")
    public QueryInnerJobResponseBodyVideo video;

    @NameInMap("Image")
    public QueryInnerJobResponseBodyImage image;

    public static QueryInnerJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerJobResponseBody self = new QueryInnerJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInnerJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerJobResponseBody setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public QueryInnerJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInnerJobResponseBody setVideo(QueryInnerJobResponseBodyVideo video) {
        this.video = video;
        return this;
    }
    public QueryInnerJobResponseBodyVideo getVideo() {
        return this.video;
    }

    public QueryInnerJobResponseBody setImage(QueryInnerJobResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public QueryInnerJobResponseBodyImage getImage() {
        return this.image;
    }

    public static class QueryInnerJobResponseBodyVideo extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Code")
        public String code;

        public static QueryInnerJobResponseBodyVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerJobResponseBodyVideo self = new QueryInnerJobResponseBodyVideo();
            return TeaModel.build(map, self);
        }

        public QueryInnerJobResponseBodyVideo setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryInnerJobResponseBodyVideo setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public QueryInnerJobResponseBodyVideo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class QueryInnerJobResponseBodyImageResult extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Code")
        public String code;

        public static QueryInnerJobResponseBodyImageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerJobResponseBodyImageResult self = new QueryInnerJobResponseBodyImageResult();
            return TeaModel.build(map, self);
        }

        public QueryInnerJobResponseBodyImageResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryInnerJobResponseBodyImageResult setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public QueryInnerJobResponseBodyImageResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class QueryInnerJobResponseBodyImage extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QueryInnerJobResponseBodyImageResult> result;

        public static QueryInnerJobResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerJobResponseBodyImage self = new QueryInnerJobResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public QueryInnerJobResponseBodyImage setResult(java.util.List<QueryInnerJobResponseBodyImageResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryInnerJobResponseBodyImageResult> getResult() {
            return this.result;
        }

    }

}
