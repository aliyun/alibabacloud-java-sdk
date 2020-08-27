// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BodyPostureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public BodyPostureResponseData data;

    public static BodyPostureResponse build(java.util.Map<String, ?> map) throws Exception {
        BodyPostureResponse self = new BodyPostureResponse();
        return TeaModel.build(map, self);
    }

    public BodyPostureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BodyPostureResponse setData(BodyPostureResponseData data) {
        this.data = data;
        return this;
    }
    public BodyPostureResponseData getData() {
        return this.data;
    }

    public static class BodyPostureResponseDataOutputsResultsBodiesPositions extends TeaModel {
        @NameInMap("Points")
        @Validation(required = true)
        public java.util.List<Float> points;

        public static BodyPostureResponseDataOutputsResultsBodiesPositions build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseDataOutputsResultsBodiesPositions self = new BodyPostureResponseDataOutputsResultsBodiesPositions();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseDataOutputsResultsBodiesPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class BodyPostureResponseDataOutputsResultsBodies extends TeaModel {
        @NameInMap("Confident")
        @Validation(required = true)
        public Float confident;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Positions")
        @Validation(required = true)
        public java.util.List<BodyPostureResponseDataOutputsResultsBodiesPositions> positions;

        public static BodyPostureResponseDataOutputsResultsBodies build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseDataOutputsResultsBodies self = new BodyPostureResponseDataOutputsResultsBodies();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseDataOutputsResultsBodies setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public BodyPostureResponseDataOutputsResultsBodies setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public BodyPostureResponseDataOutputsResultsBodies setPositions(java.util.List<BodyPostureResponseDataOutputsResultsBodiesPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<BodyPostureResponseDataOutputsResultsBodiesPositions> getPositions() {
            return this.positions;
        }

    }

    public static class BodyPostureResponseDataOutputsResults extends TeaModel {
        @NameInMap("Bodies")
        @Validation(required = true)
        public java.util.List<BodyPostureResponseDataOutputsResultsBodies> bodies;

        public static BodyPostureResponseDataOutputsResults build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseDataOutputsResults self = new BodyPostureResponseDataOutputsResults();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseDataOutputsResults setBodies(java.util.List<BodyPostureResponseDataOutputsResultsBodies> bodies) {
            this.bodies = bodies;
            return this;
        }
        public java.util.List<BodyPostureResponseDataOutputsResultsBodies> getBodies() {
            return this.bodies;
        }

    }

    public static class BodyPostureResponseDataOutputs extends TeaModel {
        @NameInMap("HumanCount")
        @Validation(required = true)
        public Integer humanCount;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<BodyPostureResponseDataOutputsResults> results;

        public static BodyPostureResponseDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseDataOutputs self = new BodyPostureResponseDataOutputs();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseDataOutputs setHumanCount(Integer humanCount) {
            this.humanCount = humanCount;
            return this;
        }
        public Integer getHumanCount() {
            return this.humanCount;
        }

        public BodyPostureResponseDataOutputs setResults(java.util.List<BodyPostureResponseDataOutputsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<BodyPostureResponseDataOutputsResults> getResults() {
            return this.results;
        }

    }

    public static class BodyPostureResponseDataMetaObject extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static BodyPostureResponseDataMetaObject build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseDataMetaObject self = new BodyPostureResponseDataMetaObject();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseDataMetaObject setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public BodyPostureResponseDataMetaObject setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class BodyPostureResponseData extends TeaModel {
        @NameInMap("Outputs")
        @Validation(required = true)
        public java.util.List<BodyPostureResponseDataOutputs> outputs;

        @NameInMap("MetaObject")
        @Validation(required = true)
        public BodyPostureResponseDataMetaObject metaObject;

        public static BodyPostureResponseData build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseData self = new BodyPostureResponseData();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseData setOutputs(java.util.List<BodyPostureResponseDataOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<BodyPostureResponseDataOutputs> getOutputs() {
            return this.outputs;
        }

        public BodyPostureResponseData setMetaObject(BodyPostureResponseDataMetaObject metaObject) {
            this.metaObject = metaObject;
            return this;
        }
        public BodyPostureResponseDataMetaObject getMetaObject() {
            return this.metaObject;
        }

    }

}
