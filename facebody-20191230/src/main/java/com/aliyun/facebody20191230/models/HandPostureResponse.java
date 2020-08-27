// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class HandPostureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public HandPostureResponseData data;

    public static HandPostureResponse build(java.util.Map<String, ?> map) throws Exception {
        HandPostureResponse self = new HandPostureResponse();
        return TeaModel.build(map, self);
    }

    public HandPostureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HandPostureResponse setData(HandPostureResponseData data) {
        this.data = data;
        return this;
    }
    public HandPostureResponseData getData() {
        return this.data;
    }

    public static class HandPostureResponseDataOutputsResultsBoxPositions extends TeaModel {
        @NameInMap("Points")
        @Validation(required = true)
        public java.util.List<Float> points;

        public static HandPostureResponseDataOutputsResultsBoxPositions build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResultsBoxPositions self = new HandPostureResponseDataOutputsResultsBoxPositions();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResultsBoxPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class HandPostureResponseDataOutputsResultsBox extends TeaModel {
        @NameInMap("Confident")
        @Validation(required = true)
        public Float confident;

        @NameInMap("Positions")
        @Validation(required = true)
        public java.util.List<HandPostureResponseDataOutputsResultsBoxPositions> positions;

        public static HandPostureResponseDataOutputsResultsBox build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResultsBox self = new HandPostureResponseDataOutputsResultsBox();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResultsBox setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public HandPostureResponseDataOutputsResultsBox setPositions(java.util.List<HandPostureResponseDataOutputsResultsBoxPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<HandPostureResponseDataOutputsResultsBoxPositions> getPositions() {
            return this.positions;
        }

    }

    public static class HandPostureResponseDataOutputsResultsHandsKeyPointsPositions extends TeaModel {
        @NameInMap("Points")
        @Validation(required = true)
        public java.util.List<Float> points;

        public static HandPostureResponseDataOutputsResultsHandsKeyPointsPositions build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResultsHandsKeyPointsPositions self = new HandPostureResponseDataOutputsResultsHandsKeyPointsPositions();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResultsHandsKeyPointsPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class HandPostureResponseDataOutputsResultsHandsKeyPoints extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Positions")
        @Validation(required = true)
        public java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPointsPositions> positions;

        public static HandPostureResponseDataOutputsResultsHandsKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResultsHandsKeyPoints self = new HandPostureResponseDataOutputsResultsHandsKeyPoints();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResultsHandsKeyPoints setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public HandPostureResponseDataOutputsResultsHandsKeyPoints setPositions(java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPointsPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPointsPositions> getPositions() {
            return this.positions;
        }

    }

    public static class HandPostureResponseDataOutputsResultsHands extends TeaModel {
        @NameInMap("Confident")
        @Validation(required = true)
        public Float confident;

        @NameInMap("KeyPoints")
        @Validation(required = true)
        public java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPoints> keyPoints;

        public static HandPostureResponseDataOutputsResultsHands build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResultsHands self = new HandPostureResponseDataOutputsResultsHands();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResultsHands setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public HandPostureResponseDataOutputsResultsHands setKeyPoints(java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<HandPostureResponseDataOutputsResultsHandsKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

    }

    public static class HandPostureResponseDataOutputsResults extends TeaModel {
        @NameInMap("Box")
        @Validation(required = true)
        public HandPostureResponseDataOutputsResultsBox box;

        @NameInMap("Hands")
        @Validation(required = true)
        public HandPostureResponseDataOutputsResultsHands hands;

        public static HandPostureResponseDataOutputsResults build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputsResults self = new HandPostureResponseDataOutputsResults();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputsResults setBox(HandPostureResponseDataOutputsResultsBox box) {
            this.box = box;
            return this;
        }
        public HandPostureResponseDataOutputsResultsBox getBox() {
            return this.box;
        }

        public HandPostureResponseDataOutputsResults setHands(HandPostureResponseDataOutputsResultsHands hands) {
            this.hands = hands;
            return this;
        }
        public HandPostureResponseDataOutputsResultsHands getHands() {
            return this.hands;
        }

    }

    public static class HandPostureResponseDataOutputs extends TeaModel {
        @NameInMap("HandCount")
        @Validation(required = true)
        public Integer handCount;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<HandPostureResponseDataOutputsResults> results;

        public static HandPostureResponseDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataOutputs self = new HandPostureResponseDataOutputs();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataOutputs setHandCount(Integer handCount) {
            this.handCount = handCount;
            return this;
        }
        public Integer getHandCount() {
            return this.handCount;
        }

        public HandPostureResponseDataOutputs setResults(java.util.List<HandPostureResponseDataOutputsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<HandPostureResponseDataOutputsResults> getResults() {
            return this.results;
        }

    }

    public static class HandPostureResponseDataMetaObject extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static HandPostureResponseDataMetaObject build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseDataMetaObject self = new HandPostureResponseDataMetaObject();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseDataMetaObject setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public HandPostureResponseDataMetaObject setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class HandPostureResponseData extends TeaModel {
        @NameInMap("Outputs")
        @Validation(required = true)
        public java.util.List<HandPostureResponseDataOutputs> outputs;

        @NameInMap("MetaObject")
        @Validation(required = true)
        public HandPostureResponseDataMetaObject metaObject;

        public static HandPostureResponseData build(java.util.Map<String, ?> map) throws Exception {
            HandPostureResponseData self = new HandPostureResponseData();
            return TeaModel.build(map, self);
        }

        public HandPostureResponseData setOutputs(java.util.List<HandPostureResponseDataOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<HandPostureResponseDataOutputs> getOutputs() {
            return this.outputs;
        }

        public HandPostureResponseData setMetaObject(HandPostureResponseDataMetaObject metaObject) {
            this.metaObject = metaObject;
            return this;
        }
        public HandPostureResponseDataMetaObject getMetaObject() {
            return this.metaObject;
        }

    }

}
