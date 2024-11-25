// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class ElectrobikeDirectionNovaResponseBody extends TeaModel {
    @NameInMap("data")
    public ElectrobikeDirectionNovaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <title>502 Bad Gateway</title>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ElectrobikeDirectionNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElectrobikeDirectionNovaResponseBody self = new ElectrobikeDirectionNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public ElectrobikeDirectionNovaResponseBody setData(ElectrobikeDirectionNovaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ElectrobikeDirectionNovaResponseBodyData getData() {
        return this.data;
    }

    public ElectrobikeDirectionNovaResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ElectrobikeDirectionNovaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ElectrobikeDirectionNovaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElectrobikeDirectionNovaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ElectrobikeDirectionNovaResponseBodyDataPathsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
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
         * <p>4</p>
         */
        @NameInMap("trafficLights")
        public String trafficLights;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static ElectrobikeDirectionNovaResponseBodyDataPathsCost build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionNovaResponseBodyDataPathsCost self = new ElectrobikeDirectionNovaResponseBodyDataPathsCost();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000</p>
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
         * <p>5</p>
         */
        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost self = new ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class ElectrobikeDirectionNovaResponseBodyDataPathsSteps extends TeaModel {
        @NameInMap("cost")
        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost cost;

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

        public static ElectrobikeDirectionNovaResponseBodyDataPathsSteps build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionNovaResponseBodyDataPathsSteps self = new ElectrobikeDirectionNovaResponseBodyDataPathsSteps();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setCost(ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public ElectrobikeDirectionNovaResponseBodyDataPathsStepsCost getCost() {
            return this.cost;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPathsSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class ElectrobikeDirectionNovaResponseBodyDataPaths extends TeaModel {
        @NameInMap("cost")
        public ElectrobikeDirectionNovaResponseBodyDataPathsCost cost;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("restriction")
        public String restriction;

        @NameInMap("steps")
        public java.util.List<ElectrobikeDirectionNovaResponseBodyDataPathsSteps> steps;

        public static ElectrobikeDirectionNovaResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionNovaResponseBodyDataPaths self = new ElectrobikeDirectionNovaResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionNovaResponseBodyDataPaths setCost(ElectrobikeDirectionNovaResponseBodyDataPathsCost cost) {
            this.cost = cost;
            return this;
        }
        public ElectrobikeDirectionNovaResponseBodyDataPathsCost getCost() {
            return this.cost;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPaths setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPaths setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPaths setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public ElectrobikeDirectionNovaResponseBodyDataPaths setSteps(java.util.List<ElectrobikeDirectionNovaResponseBodyDataPathsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<ElectrobikeDirectionNovaResponseBodyDataPathsSteps> getSteps() {
            return this.steps;
        }

    }

    public static class ElectrobikeDirectionNovaResponseBodyData extends TeaModel {
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
         * <p>116.345456</p>
         */
        @NameInMap("originLongitude")
        public String originLongitude;

        @NameInMap("paths")
        public java.util.List<ElectrobikeDirectionNovaResponseBodyDataPaths> paths;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("taxiCost")
        public String taxiCost;

        public static ElectrobikeDirectionNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionNovaResponseBodyData self = new ElectrobikeDirectionNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionNovaResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ElectrobikeDirectionNovaResponseBodyData setDestinationLatitude(String destinationLatitude) {
            this.destinationLatitude = destinationLatitude;
            return this;
        }
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        public ElectrobikeDirectionNovaResponseBodyData setDestinationLongitude(String destinationLongitude) {
            this.destinationLongitude = destinationLongitude;
            return this;
        }
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        public ElectrobikeDirectionNovaResponseBodyData setOriginLatitude(String originLatitude) {
            this.originLatitude = originLatitude;
            return this;
        }
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        public ElectrobikeDirectionNovaResponseBodyData setOriginLongitude(String originLongitude) {
            this.originLongitude = originLongitude;
            return this;
        }
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        public ElectrobikeDirectionNovaResponseBodyData setPaths(java.util.List<ElectrobikeDirectionNovaResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<ElectrobikeDirectionNovaResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

        public ElectrobikeDirectionNovaResponseBodyData setTaxiCost(String taxiCost) {
            this.taxiCost = taxiCost;
            return this;
        }
        public String getTaxiCost() {
            return this.taxiCost;
        }

    }

}
