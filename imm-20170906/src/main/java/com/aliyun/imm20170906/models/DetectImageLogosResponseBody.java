// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageLogosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Logos")
    public java.util.List<DetectImageLogosResponseBodyLogos> logos;

    @NameInMap("ImageUri")
    public String imageUri;

    public static DetectImageLogosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLogosResponseBody self = new DetectImageLogosResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageLogosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageLogosResponseBody setLogos(java.util.List<DetectImageLogosResponseBodyLogos> logos) {
        this.logos = logos;
        return this;
    }
    public java.util.List<DetectImageLogosResponseBodyLogos> getLogos() {
        return this.logos;
    }

    public DetectImageLogosResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public static class DetectImageLogosResponseBodyLogosLogoBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static DetectImageLogosResponseBodyLogosLogoBoundary build(java.util.Map<String, ?> map) throws Exception {
            DetectImageLogosResponseBodyLogosLogoBoundary self = new DetectImageLogosResponseBodyLogosLogoBoundary();
            return TeaModel.build(map, self);
        }

        public DetectImageLogosResponseBodyLogosLogoBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectImageLogosResponseBodyLogosLogoBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectImageLogosResponseBodyLogosLogoBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectImageLogosResponseBodyLogosLogoBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class DetectImageLogosResponseBodyLogos extends TeaModel {
        @NameInMap("LogoConfidence")
        public Float logoConfidence;

        @NameInMap("LogoBoundary")
        public DetectImageLogosResponseBodyLogosLogoBoundary logoBoundary;

        @NameInMap("LogoName")
        public String logoName;

        public static DetectImageLogosResponseBodyLogos build(java.util.Map<String, ?> map) throws Exception {
            DetectImageLogosResponseBodyLogos self = new DetectImageLogosResponseBodyLogos();
            return TeaModel.build(map, self);
        }

        public DetectImageLogosResponseBodyLogos setLogoConfidence(Float logoConfidence) {
            this.logoConfidence = logoConfidence;
            return this;
        }
        public Float getLogoConfidence() {
            return this.logoConfidence;
        }

        public DetectImageLogosResponseBodyLogos setLogoBoundary(DetectImageLogosResponseBodyLogosLogoBoundary logoBoundary) {
            this.logoBoundary = logoBoundary;
            return this;
        }
        public DetectImageLogosResponseBodyLogosLogoBoundary getLogoBoundary() {
            return this.logoBoundary;
        }

        public DetectImageLogosResponseBodyLogos setLogoName(String logoName) {
            this.logoName = logoName;
            return this;
        }
        public String getLogoName() {
            return this.logoName;
        }

    }

}
