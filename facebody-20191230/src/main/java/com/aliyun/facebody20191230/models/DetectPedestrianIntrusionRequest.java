// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionRequest extends TeaModel {
    @NameInMap("DetectRegion")
    public java.util.List<DetectPedestrianIntrusionRequestDetectRegion> detectRegion;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RegionType")
    public String regionType;

    public static DetectPedestrianIntrusionRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionRequest self = new DetectPedestrianIntrusionRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionRequest setDetectRegion(java.util.List<DetectPedestrianIntrusionRequestDetectRegion> detectRegion) {
        this.detectRegion = detectRegion;
        return this;
    }
    public java.util.List<DetectPedestrianIntrusionRequestDetectRegion> getDetectRegion() {
        return this.detectRegion;
    }

    public DetectPedestrianIntrusionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectPedestrianIntrusionRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public static class DetectPedestrianIntrusionRequestDetectRegionLine extends TeaModel {
        @NameInMap("X1")
        public Long x1;

        @NameInMap("X2")
        public Long x2;

        @NameInMap("Y1")
        public Long y1;

        @NameInMap("Y2")
        public Long y2;

        public static DetectPedestrianIntrusionRequestDetectRegionLine build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestDetectRegionLine self = new DetectPedestrianIntrusionRequestDetectRegionLine();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestDetectRegionLine setX1(Long x1) {
            this.x1 = x1;
            return this;
        }
        public Long getX1() {
            return this.x1;
        }

        public DetectPedestrianIntrusionRequestDetectRegionLine setX2(Long x2) {
            this.x2 = x2;
            return this;
        }
        public Long getX2() {
            return this.x2;
        }

        public DetectPedestrianIntrusionRequestDetectRegionLine setY1(Long y1) {
            this.y1 = y1;
            return this;
        }
        public Long getY1() {
            return this.y1;
        }

        public DetectPedestrianIntrusionRequestDetectRegionLine setY2(Long y2) {
            this.y2 = y2;
            return this;
        }
        public Long getY2() {
            return this.y2;
        }

    }

    public static class DetectPedestrianIntrusionRequestDetectRegionRect extends TeaModel {
        @NameInMap("Bottom")
        public Long bottom;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Top")
        public Long top;

        public static DetectPedestrianIntrusionRequestDetectRegionRect build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestDetectRegionRect self = new DetectPedestrianIntrusionRequestDetectRegionRect();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestDetectRegionRect setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

        public DetectPedestrianIntrusionRequestDetectRegionRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectPedestrianIntrusionRequestDetectRegionRect setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectPedestrianIntrusionRequestDetectRegionRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

    }

    public static class DetectPedestrianIntrusionRequestDetectRegion extends TeaModel {
        @NameInMap("Line")
        public DetectPedestrianIntrusionRequestDetectRegionLine line;

        @NameInMap("Rect")
        public DetectPedestrianIntrusionRequestDetectRegionRect rect;

        public static DetectPedestrianIntrusionRequestDetectRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestDetectRegion self = new DetectPedestrianIntrusionRequestDetectRegion();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestDetectRegion setLine(DetectPedestrianIntrusionRequestDetectRegionLine line) {
            this.line = line;
            return this;
        }
        public DetectPedestrianIntrusionRequestDetectRegionLine getLine() {
            return this.line;
        }

        public DetectPedestrianIntrusionRequestDetectRegion setRect(DetectPedestrianIntrusionRequestDetectRegionRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectPedestrianIntrusionRequestDetectRegionRect getRect() {
            return this.rect;
        }

    }

}
