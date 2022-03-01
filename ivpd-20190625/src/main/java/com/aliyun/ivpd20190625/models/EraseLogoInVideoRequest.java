// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class EraseLogoInVideoRequest extends TeaModel {
    @NameInMap("Boxes")
    public java.util.List<EraseLogoInVideoRequestBoxes> boxes;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static EraseLogoInVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseLogoInVideoRequest self = new EraseLogoInVideoRequest();
        return TeaModel.build(map, self);
    }

    public EraseLogoInVideoRequest setBoxes(java.util.List<EraseLogoInVideoRequestBoxes> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<EraseLogoInVideoRequestBoxes> getBoxes() {
        return this.boxes;
    }

    public EraseLogoInVideoRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public EraseLogoInVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class EraseLogoInVideoRequestBoxes extends TeaModel {
        @NameInMap("H")
        public Float h;

        @NameInMap("W")
        public Float w;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static EraseLogoInVideoRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseLogoInVideoRequestBoxes self = new EraseLogoInVideoRequestBoxes();
            return TeaModel.build(map, self);
        }

        public EraseLogoInVideoRequestBoxes setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public EraseLogoInVideoRequestBoxes setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public EraseLogoInVideoRequestBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public EraseLogoInVideoRequestBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

}
