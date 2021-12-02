// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class HandPostureResponseBody extends TeaModel {
    @NameInMap("Data")
    public HandPostureResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static HandPostureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandPostureResponseBody self = new HandPostureResponseBody();
        return TeaModel.build(map, self);
    }

    public HandPostureResponseBody setData(HandPostureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HandPostureResponseBodyData getData() {
        return this.data;
    }

    public HandPostureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HandPostureResponseBodyDataMetaObject extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static HandPostureResponseBodyDataMetaObject build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataMetaObject self = new HandPostureResponseBodyDataMetaObject();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataMetaObject setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public HandPostureResponseBodyDataMetaObject setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResultsBoxPositions extends TeaModel {
        @NameInMap("Points")
        public java.util.List<Float> points;

        public static HandPostureResponseBodyDataOutputsResultsBoxPositions build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResultsBoxPositions self = new HandPostureResponseBodyDataOutputsResultsBoxPositions();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResultsBoxPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResultsBox extends TeaModel {
        @NameInMap("Confident")
        public Float confident;

        @NameInMap("Positions")
        public java.util.List<HandPostureResponseBodyDataOutputsResultsBoxPositions> positions;

        public static HandPostureResponseBodyDataOutputsResultsBox build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResultsBox self = new HandPostureResponseBodyDataOutputsResultsBox();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResultsBox setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public HandPostureResponseBodyDataOutputsResultsBox setPositions(java.util.List<HandPostureResponseBodyDataOutputsResultsBoxPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<HandPostureResponseBodyDataOutputsResultsBoxPositions> getPositions() {
            return this.positions;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions extends TeaModel {
        @NameInMap("Points")
        public java.util.List<Float> points;

        public static HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions self = new HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResultsHandsKeyPoints extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Positions")
        public java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions> positions;

        public static HandPostureResponseBodyDataOutputsResultsHandsKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResultsHandsKeyPoints self = new HandPostureResponseBodyDataOutputsResultsHandsKeyPoints();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResultsHandsKeyPoints setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public HandPostureResponseBodyDataOutputsResultsHandsKeyPoints setPositions(java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPointsPositions> getPositions() {
            return this.positions;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResultsHands extends TeaModel {
        @NameInMap("Confident")
        public Float confident;

        @NameInMap("KeyPoints")
        public java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPoints> keyPoints;

        public static HandPostureResponseBodyDataOutputsResultsHands build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResultsHands self = new HandPostureResponseBodyDataOutputsResultsHands();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResultsHands setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public HandPostureResponseBodyDataOutputsResultsHands setKeyPoints(java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<HandPostureResponseBodyDataOutputsResultsHandsKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

    }

    public static class HandPostureResponseBodyDataOutputsResults extends TeaModel {
        @NameInMap("Box")
        public HandPostureResponseBodyDataOutputsResultsBox box;

        @NameInMap("Hands")
        public HandPostureResponseBodyDataOutputsResultsHands hands;

        public static HandPostureResponseBodyDataOutputsResults build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputsResults self = new HandPostureResponseBodyDataOutputsResults();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputsResults setBox(HandPostureResponseBodyDataOutputsResultsBox box) {
            this.box = box;
            return this;
        }
        public HandPostureResponseBodyDataOutputsResultsBox getBox() {
            return this.box;
        }

        public HandPostureResponseBodyDataOutputsResults setHands(HandPostureResponseBodyDataOutputsResultsHands hands) {
            this.hands = hands;
            return this;
        }
        public HandPostureResponseBodyDataOutputsResultsHands getHands() {
            return this.hands;
        }

    }

    public static class HandPostureResponseBodyDataOutputs extends TeaModel {
        @NameInMap("HandCount")
        public Integer handCount;

        @NameInMap("Results")
        public java.util.List<HandPostureResponseBodyDataOutputsResults> results;

        public static HandPostureResponseBodyDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyDataOutputs self = new HandPostureResponseBodyDataOutputs();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyDataOutputs setHandCount(Integer handCount) {
            this.handCount = handCount;
            return this;
        }
        public Integer getHandCount() {
            return this.handCount;
        }

        public HandPostureResponseBodyDataOutputs setResults(java.util.List<HandPostureResponseBodyDataOutputsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<HandPostureResponseBodyDataOutputsResults> getResults() {
            return this.results;
        }

    }

    public static class HandPostureResponseBodyData extends TeaModel {
        @NameInMap("MetaObject")
        public HandPostureResponseBodyDataMetaObject metaObject;

        @NameInMap("Outputs")
        public java.util.List<HandPostureResponseBodyDataOutputs> outputs;

        public static HandPostureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseBodyData self = new HandPostureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseBodyData setMetaObject(HandPostureResponseBodyDataMetaObject metaObject) {
            this.metaObject = metaObject;
            return this;
        }
        public HandPostureResponseBodyDataMetaObject getMetaObject() {
            return this.metaObject;
        }

        public HandPostureResponseBodyData setOutputs(java.util.List<HandPostureResponseBodyDataOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<HandPostureResponseBodyDataOutputs> getOutputs() {
            return this.outputs;
        }

    }

}
