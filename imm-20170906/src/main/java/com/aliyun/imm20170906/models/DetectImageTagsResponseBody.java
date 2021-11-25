// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageTagsResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<DetectImageTagsResponseBodyTags> tags;

    public static DetectImageTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTagsResponseBody self = new DetectImageTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageTagsResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageTagsResponseBody setTags(java.util.List<DetectImageTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DetectImageTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DetectImageTagsResponseBodyTags extends TeaModel {
        @NameInMap("CentricScore")
        public Float centricScore;

        @NameInMap("ParentTagEnName")
        public String parentTagEnName;

        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagEnName")
        public String tagEnName;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("TagName")
        public String tagName;

        public static DetectImageTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DetectImageTagsResponseBodyTags self = new DetectImageTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DetectImageTagsResponseBodyTags setCentricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }
        public Float getCentricScore() {
            return this.centricScore;
        }

        public DetectImageTagsResponseBodyTags setParentTagEnName(String parentTagEnName) {
            this.parentTagEnName = parentTagEnName;
            return this;
        }
        public String getParentTagEnName() {
            return this.parentTagEnName;
        }

        public DetectImageTagsResponseBodyTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public DetectImageTagsResponseBodyTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public DetectImageTagsResponseBodyTags setTagEnName(String tagEnName) {
            this.tagEnName = tagEnName;
            return this;
        }
        public String getTagEnName() {
            return this.tagEnName;
        }

        public DetectImageTagsResponseBodyTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public DetectImageTagsResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
