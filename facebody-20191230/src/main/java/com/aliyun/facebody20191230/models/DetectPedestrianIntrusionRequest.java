// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Region")
    public java.util.List<DetectPedestrianIntrusionRequestRegion> region;

    @NameInMap("RegionType")
    public String regionType;

    public static DetectPedestrianIntrusionRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionRequest self = new DetectPedestrianIntrusionRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectPedestrianIntrusionRequest setRegion(java.util.List<DetectPedestrianIntrusionRequestRegion> region) {
        this.region = region;
        return this;
    }
    public java.util.List<DetectPedestrianIntrusionRequestRegion> getRegion() {
        return this.region;
    }

    public DetectPedestrianIntrusionRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public static class DetectPedestrianIntrusionRequestRegionRect extends TeaModel {
        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Bottom")
        public Long bottom;

        public static DetectPedestrianIntrusionRequestRegionRect build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestRegionRect self = new DetectPedestrianIntrusionRequestRegionRect();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestRegionRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectPedestrianIntrusionRequestRegionRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectPedestrianIntrusionRequestRegionRect setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectPedestrianIntrusionRequestRegionRect setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

    }

    public static class DetectPedestrianIntrusionRequestRegionLine extends TeaModel {
        @NameInMap("X1")
        public Long x1;

        @NameInMap("Y1")
        public Long y1;

        @NameInMap("X2")
        public Long x2;

        @NameInMap("Y2")
        public Long y2;

        public static DetectPedestrianIntrusionRequestRegionLine build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestRegionLine self = new DetectPedestrianIntrusionRequestRegionLine();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestRegionLine setX1(Long x1) {
            this.x1 = x1;
            return this;
        }
        public Long getX1() {
            return this.x1;
        }

        public DetectPedestrianIntrusionRequestRegionLine setY1(Long y1) {
            this.y1 = y1;
            return this;
        }
        public Long getY1() {
            return this.y1;
        }

        public DetectPedestrianIntrusionRequestRegionLine setX2(Long x2) {
            this.x2 = x2;
            return this;
        }
        public Long getX2() {
            return this.x2;
        }

        public DetectPedestrianIntrusionRequestRegionLine setY2(Long y2) {
            this.y2 = y2;
            return this;
        }
        public Long getY2() {
            return this.y2;
        }

    }

    public static class DetectPedestrianIntrusionRequestRegion extends TeaModel {
        @NameInMap("Rect")
        public DetectPedestrianIntrusionRequestRegionRect rect;

        @NameInMap("Line")
        public DetectPedestrianIntrusionRequestRegionLine line;

        public static DetectPedestrianIntrusionRequestRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionRequestRegion self = new DetectPedestrianIntrusionRequestRegion();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionRequestRegion setRect(DetectPedestrianIntrusionRequestRegionRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectPedestrianIntrusionRequestRegionRect getRect() {
            return this.rect;
        }

        public DetectPedestrianIntrusionRequestRegion setLine(DetectPedestrianIntrusionRequestRegionLine line) {
            this.line = line;
            return this;
        }
        public DetectPedestrianIntrusionRequestRegionLine getLine() {
            return this.line;
        }

    }

}
