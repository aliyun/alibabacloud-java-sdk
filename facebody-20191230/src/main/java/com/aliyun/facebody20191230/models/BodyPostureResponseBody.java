// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BodyPostureResponseBody extends TeaModel {
    @NameInMap("Data")
    public BodyPostureResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BodyPostureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BodyPostureResponseBody self = new BodyPostureResponseBody();
        return TeaModel.build(map, self);
    }

    public BodyPostureResponseBody setData(BodyPostureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BodyPostureResponseBodyData getData() {
        return this.data;
    }

    public BodyPostureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BodyPostureResponseBodyDataMetaObject extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static BodyPostureResponseBodyDataMetaObject build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyDataMetaObject self = new BodyPostureResponseBodyDataMetaObject();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyDataMetaObject setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public BodyPostureResponseBodyDataMetaObject setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class BodyPostureResponseBodyDataOutputsResultsBodiesPositions extends TeaModel {
        @NameInMap("Points")
        public java.util.List<Float> points;

        public static BodyPostureResponseBodyDataOutputsResultsBodiesPositions build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyDataOutputsResultsBodiesPositions self = new BodyPostureResponseBodyDataOutputsResultsBodiesPositions();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyDataOutputsResultsBodiesPositions setPoints(java.util.List<Float> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Float> getPoints() {
            return this.points;
        }

    }

    public static class BodyPostureResponseBodyDataOutputsResultsBodies extends TeaModel {
        @NameInMap("Confident")
        public Float confident;

        @NameInMap("Label")
        public String label;

        @NameInMap("Positions")
        public java.util.List<BodyPostureResponseBodyDataOutputsResultsBodiesPositions> positions;

        public static BodyPostureResponseBodyDataOutputsResultsBodies build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyDataOutputsResultsBodies self = new BodyPostureResponseBodyDataOutputsResultsBodies();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyDataOutputsResultsBodies setConfident(Float confident) {
            this.confident = confident;
            return this;
        }
        public Float getConfident() {
            return this.confident;
        }

        public BodyPostureResponseBodyDataOutputsResultsBodies setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public BodyPostureResponseBodyDataOutputsResultsBodies setPositions(java.util.List<BodyPostureResponseBodyDataOutputsResultsBodiesPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<BodyPostureResponseBodyDataOutputsResultsBodiesPositions> getPositions() {
            return this.positions;
        }

    }

    public static class BodyPostureResponseBodyDataOutputsResults extends TeaModel {
        @NameInMap("Bodies")
        public java.util.List<BodyPostureResponseBodyDataOutputsResultsBodies> bodies;

        public static BodyPostureResponseBodyDataOutputsResults build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyDataOutputsResults self = new BodyPostureResponseBodyDataOutputsResults();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyDataOutputsResults setBodies(java.util.List<BodyPostureResponseBodyDataOutputsResultsBodies> bodies) {
            this.bodies = bodies;
            return this;
        }
        public java.util.List<BodyPostureResponseBodyDataOutputsResultsBodies> getBodies() {
            return this.bodies;
        }

    }

    public static class BodyPostureResponseBodyDataOutputs extends TeaModel {
        @NameInMap("HumanCount")
        public Integer humanCount;

        @NameInMap("Results")
        public java.util.List<BodyPostureResponseBodyDataOutputsResults> results;

        public static BodyPostureResponseBodyDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyDataOutputs self = new BodyPostureResponseBodyDataOutputs();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyDataOutputs setHumanCount(Integer humanCount) {
            this.humanCount = humanCount;
            return this;
        }
        public Integer getHumanCount() {
            return this.humanCount;
        }

        public BodyPostureResponseBodyDataOutputs setResults(java.util.List<BodyPostureResponseBodyDataOutputsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<BodyPostureResponseBodyDataOutputsResults> getResults() {
            return this.results;
        }

    }

    public static class BodyPostureResponseBodyData extends TeaModel {
        @NameInMap("MetaObject")
        public BodyPostureResponseBodyDataMetaObject metaObject;

        @NameInMap("Outputs")
        public java.util.List<BodyPostureResponseBodyDataOutputs> outputs;

        public static BodyPostureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BodyPostureResponseBodyData self = new BodyPostureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BodyPostureResponseBodyData setMetaObject(BodyPostureResponseBodyDataMetaObject metaObject) {
            this.metaObject = metaObject;
            return this;
        }
        public BodyPostureResponseBodyDataMetaObject getMetaObject() {
            return this.metaObject;
        }

        public BodyPostureResponseBodyData setOutputs(java.util.List<BodyPostureResponseBodyDataOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<BodyPostureResponseBodyDataOutputs> getOutputs() {
            return this.outputs;
        }

    }

}
