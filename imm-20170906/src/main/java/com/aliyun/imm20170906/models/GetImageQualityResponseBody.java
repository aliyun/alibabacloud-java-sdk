// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageQualityResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageQuality")
    public GetImageQualityResponseBodyImageQuality imageQuality;

    public static GetImageQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageQualityResponseBody self = new GetImageQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageQualityResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageQualityResponseBody setImageQuality(GetImageQualityResponseBodyImageQuality imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public GetImageQualityResponseBodyImageQuality getImageQuality() {
        return this.imageQuality;
    }

    public static class GetImageQualityResponseBodyImageQuality extends TeaModel {
        @NameInMap("OverallScore")
        public Float overallScore;

        @NameInMap("Color")
        public Float color;

        @NameInMap("ColorScore")
        public Float colorScore;

        @NameInMap("ContrastScore")
        public Float contrastScore;

        @NameInMap("Contrast")
        public Float contrast;

        @NameInMap("ExposureScore")
        public Float exposureScore;

        @NameInMap("ClarityScore")
        public Float clarityScore;

        @NameInMap("Clarity")
        public Float clarity;

        @NameInMap("Exposure")
        public Float exposure;

        @NameInMap("CompositionScore")
        public Float compositionScore;

        public static GetImageQualityResponseBodyImageQuality build(java.util.Map<String, ?> map) throws Exception {
            GetImageQualityResponseBodyImageQuality self = new GetImageQualityResponseBodyImageQuality();
            return TeaModel.build(map, self);
        }

        public GetImageQualityResponseBodyImageQuality setOverallScore(Float overallScore) {
            this.overallScore = overallScore;
            return this;
        }
        public Float getOverallScore() {
            return this.overallScore;
        }

        public GetImageQualityResponseBodyImageQuality setColor(Float color) {
            this.color = color;
            return this;
        }
        public Float getColor() {
            return this.color;
        }

        public GetImageQualityResponseBodyImageQuality setColorScore(Float colorScore) {
            this.colorScore = colorScore;
            return this;
        }
        public Float getColorScore() {
            return this.colorScore;
        }

        public GetImageQualityResponseBodyImageQuality setContrastScore(Float contrastScore) {
            this.contrastScore = contrastScore;
            return this;
        }
        public Float getContrastScore() {
            return this.contrastScore;
        }

        public GetImageQualityResponseBodyImageQuality setContrast(Float contrast) {
            this.contrast = contrast;
            return this;
        }
        public Float getContrast() {
            return this.contrast;
        }

        public GetImageQualityResponseBodyImageQuality setExposureScore(Float exposureScore) {
            this.exposureScore = exposureScore;
            return this;
        }
        public Float getExposureScore() {
            return this.exposureScore;
        }

        public GetImageQualityResponseBodyImageQuality setClarityScore(Float clarityScore) {
            this.clarityScore = clarityScore;
            return this;
        }
        public Float getClarityScore() {
            return this.clarityScore;
        }

        public GetImageQualityResponseBodyImageQuality setClarity(Float clarity) {
            this.clarity = clarity;
            return this;
        }
        public Float getClarity() {
            return this.clarity;
        }

        public GetImageQualityResponseBodyImageQuality setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

        public GetImageQualityResponseBodyImageQuality setCompositionScore(Float compositionScore) {
            this.compositionScore = compositionScore;
            return this;
        }
        public Float getCompositionScore() {
            return this.compositionScore;
        }

    }

}
