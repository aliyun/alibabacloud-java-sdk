// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Region")
    public java.util.List<DetectPedestrianIntrusionAdvanceRequestRegion> region;

    @NameInMap("RegionType")
    public String regionType;

    public static DetectPedestrianIntrusionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionAdvanceRequest self = new DetectPedestrianIntrusionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectPedestrianIntrusionAdvanceRequest setRegion(java.util.List<DetectPedestrianIntrusionAdvanceRequestRegion> region) {
        this.region = region;
        return this;
    }
    public java.util.List<DetectPedestrianIntrusionAdvanceRequestRegion> getRegion() {
        return this.region;
    }

    public DetectPedestrianIntrusionAdvanceRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public static class DetectPedestrianIntrusionAdvanceRequestRegionRect extends TeaModel {
        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Bottom")
        public Long bottom;

        public static DetectPedestrianIntrusionAdvanceRequestRegionRect build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestRegionRect self = new DetectPedestrianIntrusionAdvanceRequestRegionRect();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionRect setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionRect setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

    }

    public static class DetectPedestrianIntrusionAdvanceRequestRegionLine extends TeaModel {
        @NameInMap("X1")
        public Long x1;

        @NameInMap("Y1")
        public Long y1;

        @NameInMap("X2")
        public Long x2;

        @NameInMap("Y2")
        public Long y2;

        public static DetectPedestrianIntrusionAdvanceRequestRegionLine build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestRegionLine self = new DetectPedestrianIntrusionAdvanceRequestRegionLine();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionLine setX1(Long x1) {
            this.x1 = x1;
            return this;
        }
        public Long getX1() {
            return this.x1;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionLine setY1(Long y1) {
            this.y1 = y1;
            return this;
        }
        public Long getY1() {
            return this.y1;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionLine setX2(Long x2) {
            this.x2 = x2;
            return this;
        }
        public Long getX2() {
            return this.x2;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegionLine setY2(Long y2) {
            this.y2 = y2;
            return this;
        }
        public Long getY2() {
            return this.y2;
        }

    }

    public static class DetectPedestrianIntrusionAdvanceRequestRegion extends TeaModel {
        @NameInMap("Rect")
        public DetectPedestrianIntrusionAdvanceRequestRegionRect rect;

        @NameInMap("Line")
        public DetectPedestrianIntrusionAdvanceRequestRegionLine line;

        public static DetectPedestrianIntrusionAdvanceRequestRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionAdvanceRequestRegion self = new DetectPedestrianIntrusionAdvanceRequestRegion();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionAdvanceRequestRegion setRect(DetectPedestrianIntrusionAdvanceRequestRegionRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectPedestrianIntrusionAdvanceRequestRegionRect getRect() {
            return this.rect;
        }

        public DetectPedestrianIntrusionAdvanceRequestRegion setLine(DetectPedestrianIntrusionAdvanceRequestRegionLine line) {
            this.line = line;
            return this;
        }
        public DetectPedestrianIntrusionAdvanceRequestRegionLine getLine() {
            return this.line;
        }

    }

}
