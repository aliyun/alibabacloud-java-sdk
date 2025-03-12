// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class DrivingDirectionNovaResponseBody extends TeaModel {
    @NameInMap("data")
    public DrivingDirectionNovaResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static DrivingDirectionNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DrivingDirectionNovaResponseBody self = new DrivingDirectionNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public DrivingDirectionNovaResponseBody setData(DrivingDirectionNovaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DrivingDirectionNovaResponseBodyData getData() {
        return this.data;
    }

    public DrivingDirectionNovaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DrivingDirectionNovaResponseBodyDataPathsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>39233</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        @NameInMap("tollRoads")
        public String tollRoads;

        @NameInMap("tolls")
        public String tolls;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("trafficLights")
        public String trafficLights;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static DrivingDirectionNovaResponseBodyDataPathsCost build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionNovaResponseBodyDataPathsCost self = new DrivingDirectionNovaResponseBodyDataPathsCost();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public DrivingDirectionNovaResponseBodyDataPathsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class DrivingDirectionNovaResponseBodyDataPathsStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        @NameInMap("tollRoads")
        public String tollRoads;

        @NameInMap("tolls")
        public String tolls;

        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static DrivingDirectionNovaResponseBodyDataPathsStepsCost build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionNovaResponseBodyDataPathsStepsCost self = new DrivingDirectionNovaResponseBodyDataPathsStepsCost();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public DrivingDirectionNovaResponseBodyDataPathsStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class DrivingDirectionNovaResponseBodyDataPathsSteps extends TeaModel {
        @NameInMap("cost")
        public DrivingDirectionNovaResponseBodyDataPathsStepsCost cost;

        @NameInMap("instruction")
        public String instruction;

        @NameInMap("orientation")
        public String orientation;

        @NameInMap("polyline")
        public String polyline;

        @NameInMap("roadName")
        public String roadName;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static DrivingDirectionNovaResponseBodyDataPathsSteps build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionNovaResponseBodyDataPathsSteps self = new DrivingDirectionNovaResponseBodyDataPathsSteps();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setCost(DrivingDirectionNovaResponseBodyDataPathsStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public DrivingDirectionNovaResponseBodyDataPathsStepsCost getCost() {
            return this.cost;
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public DrivingDirectionNovaResponseBodyDataPathsSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class DrivingDirectionNovaResponseBodyDataPaths extends TeaModel {
        @NameInMap("cost")
        public DrivingDirectionNovaResponseBodyDataPathsCost cost;

        /**
         * <strong>example:</strong>
         * <p>96375</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>39223</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("restriction")
        public String restriction;

        @NameInMap("steps")
        public java.util.List<DrivingDirectionNovaResponseBodyDataPathsSteps> steps;

        public static DrivingDirectionNovaResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionNovaResponseBodyDataPaths self = new DrivingDirectionNovaResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionNovaResponseBodyDataPaths setCost(DrivingDirectionNovaResponseBodyDataPathsCost cost) {
            this.cost = cost;
            return this;
        }
        public DrivingDirectionNovaResponseBodyDataPathsCost getCost() {
            return this.cost;
        }

        public DrivingDirectionNovaResponseBodyDataPaths setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public DrivingDirectionNovaResponseBodyDataPaths setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public DrivingDirectionNovaResponseBodyDataPaths setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public DrivingDirectionNovaResponseBodyDataPaths setSteps(java.util.List<DrivingDirectionNovaResponseBodyDataPathsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DrivingDirectionNovaResponseBodyDataPathsSteps> getSteps() {
            return this.steps;
        }

    }

    public static class DrivingDirectionNovaResponseBodyData extends TeaModel {
        @NameInMap("count")
        public String count;

        /**
         * <strong>example:</strong>
         * <p>40.345456</p>
         */
        @NameInMap("destinationLatitude")
        public String destinationLatitude;

        /**
         * <strong>example:</strong>
         * <p>116.46424</p>
         */
        @NameInMap("destinationLongitude")
        public String destinationLongitude;

        /**
         * <strong>example:</strong>
         * <p>39.995197</p>
         */
        @NameInMap("originLatitude")
        public String originLatitude;

        /**
         * <strong>example:</strong>
         * <p>117.466485</p>
         */
        @NameInMap("originLongitude")
        public String originLongitude;

        @NameInMap("paths")
        public java.util.List<DrivingDirectionNovaResponseBodyDataPaths> paths;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("taxiCost")
        public String taxiCost;

        public static DrivingDirectionNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionNovaResponseBodyData self = new DrivingDirectionNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionNovaResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DrivingDirectionNovaResponseBodyData setDestinationLatitude(String destinationLatitude) {
            this.destinationLatitude = destinationLatitude;
            return this;
        }
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        public DrivingDirectionNovaResponseBodyData setDestinationLongitude(String destinationLongitude) {
            this.destinationLongitude = destinationLongitude;
            return this;
        }
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        public DrivingDirectionNovaResponseBodyData setOriginLatitude(String originLatitude) {
            this.originLatitude = originLatitude;
            return this;
        }
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        public DrivingDirectionNovaResponseBodyData setOriginLongitude(String originLongitude) {
            this.originLongitude = originLongitude;
            return this;
        }
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        public DrivingDirectionNovaResponseBodyData setPaths(java.util.List<DrivingDirectionNovaResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<DrivingDirectionNovaResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

        public DrivingDirectionNovaResponseBodyData setTaxiCost(String taxiCost) {
            this.taxiCost = taxiCost;
            return this;
        }
        public String getTaxiCost() {
            return this.taxiCost;
        }

    }

}
