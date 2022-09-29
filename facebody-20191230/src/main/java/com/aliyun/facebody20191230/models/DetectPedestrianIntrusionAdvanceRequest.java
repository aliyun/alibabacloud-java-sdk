// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionAdvanceRequest extends TeaModel {
    @NameInMap("DetectRegion")
    public java.util.List<DetectPedestrianIntrusionAdvanceRequestDetectRegion> detectRegion;

    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("RegionType")
    public String regionType;

    public static DetectPedestrianIntrusionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionAdvanceRequest self = new DetectPedestrianIntrusionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionAdvanceRequest setDetectRegion(java.util.List<DetectPedestrianIntrusionAdvanceRequestDetectRegion> detectRegion) {
        this.detectRegion = detectRegion;
        return this;
    }
    public java.util.List<DetectPedestrianIntrusionAdvanceRequestDetectRegion> getDetectRegion() {
        return this.detectRegion;
    }

    public DetectPedestrianIntrusionAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectPedestrianIntrusionAdvanceRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public static class DetectPedestrianIntrusionAdvanceRequestDetectRegionLine extends TeaModel {
        @NameInMap("X1")
        public Long x1;

        @NameInMap("X2")
        public Long x2;

        @NameInMap("Y1")
        public Long y1;

        @NameInMap("Y2")
        public Long y2;

        public static DetectPedestrianIntrusionAdvanceRequestDetectRegionLine build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestDetectRegionLine self = new DetectPedestrianIntrusionAdvanceRequestDetectRegionLine();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine setX1(Long x1) {
            this.x1 = x1;
            return this;
        }
        public Long getX1() {
            return this.x1;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine setX2(Long x2) {
            this.x2 = x2;
            return this;
        }
        public Long getX2() {
            return this.x2;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine setY1(Long y1) {
            this.y1 = y1;
            return this;
        }
        public Long getY1() {
            return this.y1;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine setY2(Long y2) {
            this.y2 = y2;
            return this;
        }
        public Long getY2() {
            return this.y2;
        }

    }

    public static class DetectPedestrianIntrusionAdvanceRequestDetectRegionRect extends TeaModel {
        @NameInMap("Bottom")
        public Long bottom;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Top")
        public Long top;

        public static DetectPedestrianIntrusionAdvanceRequestDetectRegionRect build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestDetectRegionRect self = new DetectPedestrianIntrusionAdvanceRequestDetectRegionRect();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

    }

    public static class DetectPedestrianIntrusionAdvanceRequestDetectRegion extends TeaModel {
        @NameInMap("Line")
        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine line;

        @NameInMap("Rect")
        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect rect;

        public static DetectPedestrianIntrusionAdvanceRequestDetectRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestDetectRegion self = new DetectPedestrianIntrusionAdvanceRequestDetectRegion();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegion setLine(DetectPedestrianIntrusionAdvanceRequestDetectRegionLine line) {
            this.line = line;
            return this;
        }
        public DetectPedestrianIntrusionAdvanceRequestDetectRegionLine getLine() {
            return this.line;
        }

        public DetectPedestrianIntrusionAdvanceRequestDetectRegion setRect(DetectPedestrianIntrusionAdvanceRequestDetectRegionRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectPedestrianIntrusionAdvanceRequestDetectRegionRect getRect() {
            return this.rect;
        }

    }

}
