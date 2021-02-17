// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageCroppingSuggestionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("CroppingSuggestions")
    public java.util.List<GetImageCroppingSuggestionsResponseBodyCroppingSuggestions> croppingSuggestions;

    public static GetImageCroppingSuggestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageCroppingSuggestionsResponseBody self = new GetImageCroppingSuggestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageCroppingSuggestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageCroppingSuggestionsResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageCroppingSuggestionsResponseBody setCroppingSuggestions(java.util.List<GetImageCroppingSuggestionsResponseBodyCroppingSuggestions> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<GetImageCroppingSuggestionsResponseBodyCroppingSuggestions> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public static class GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary build(java.util.Map<String, ?> map) throws Exception {
            GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary self = new GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary();
            return TeaModel.build(map, self);
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class GetImageCroppingSuggestionsResponseBodyCroppingSuggestions extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("CroppingBoundary")
        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary croppingBoundary;

        @NameInMap("AspectRatio")
        public String aspectRatio;

        public static GetImageCroppingSuggestionsResponseBodyCroppingSuggestions build(java.util.Map<String, ?> map) throws Exception {
            GetImageCroppingSuggestionsResponseBodyCroppingSuggestions self = new GetImageCroppingSuggestionsResponseBodyCroppingSuggestions();
            return TeaModel.build(map, self);
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestions setCroppingBoundary(GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary croppingBoundary) {
            this.croppingBoundary = croppingBoundary;
            return this;
        }
        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestionsCroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

        public GetImageCroppingSuggestionsResponseBodyCroppingSuggestions setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

    }

}
