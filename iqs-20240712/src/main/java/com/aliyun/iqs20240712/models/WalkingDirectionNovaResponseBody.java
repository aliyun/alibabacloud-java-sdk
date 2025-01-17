// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class WalkingDirectionNovaResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public WalkingDirectionNovaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Access was denied</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static WalkingDirectionNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WalkingDirectionNovaResponseBody self = new WalkingDirectionNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public WalkingDirectionNovaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WalkingDirectionNovaResponseBody setData(WalkingDirectionNovaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public WalkingDirectionNovaResponseBodyData getData() {
        return this.data;
    }

    public WalkingDirectionNovaResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public WalkingDirectionNovaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WalkingDirectionNovaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WalkingDirectionNovaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WalkingDirectionNovaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WalkingDirectionNovaResponseBodyDataPathsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1232</p>
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

        public static WalkingDirectionNovaResponseBodyDataPathsCost build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionNovaResponseBodyDataPathsCost self = new WalkingDirectionNovaResponseBodyDataPathsCost();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public WalkingDirectionNovaResponseBodyDataPathsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class WalkingDirectionNovaResponseBodyDataPathsStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13</p>
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

        public static WalkingDirectionNovaResponseBodyDataPathsStepsCost build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionNovaResponseBodyDataPathsStepsCost self = new WalkingDirectionNovaResponseBodyDataPathsStepsCost();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public WalkingDirectionNovaResponseBodyDataPathsStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class WalkingDirectionNovaResponseBodyDataPathsSteps extends TeaModel {
        @NameInMap("cost")
        public WalkingDirectionNovaResponseBodyDataPathsStepsCost cost;

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
         * <p>1665</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static WalkingDirectionNovaResponseBodyDataPathsSteps build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionNovaResponseBodyDataPathsSteps self = new WalkingDirectionNovaResponseBodyDataPathsSteps();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setCost(WalkingDirectionNovaResponseBodyDataPathsStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public WalkingDirectionNovaResponseBodyDataPathsStepsCost getCost() {
            return this.cost;
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public WalkingDirectionNovaResponseBodyDataPathsSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class WalkingDirectionNovaResponseBodyDataPaths extends TeaModel {
        @NameInMap("cost")
        public WalkingDirectionNovaResponseBodyDataPathsCost cost;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
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
        public java.util.List<WalkingDirectionNovaResponseBodyDataPathsSteps> steps;

        public static WalkingDirectionNovaResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionNovaResponseBodyDataPaths self = new WalkingDirectionNovaResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionNovaResponseBodyDataPaths setCost(WalkingDirectionNovaResponseBodyDataPathsCost cost) {
            this.cost = cost;
            return this;
        }
        public WalkingDirectionNovaResponseBodyDataPathsCost getCost() {
            return this.cost;
        }

        public WalkingDirectionNovaResponseBodyDataPaths setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public WalkingDirectionNovaResponseBodyDataPaths setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public WalkingDirectionNovaResponseBodyDataPaths setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public WalkingDirectionNovaResponseBodyDataPaths setSteps(java.util.List<WalkingDirectionNovaResponseBodyDataPathsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<WalkingDirectionNovaResponseBodyDataPathsSteps> getSteps() {
            return this.steps;
        }

    }

    public static class WalkingDirectionNovaResponseBodyData extends TeaModel {
        @NameInMap("count")
        public String count;

        /**
         * <strong>example:</strong>
         * <p>40.020642</p>
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
         * <p>116.466485</p>
         */
        @NameInMap("originLongitude")
        public String originLongitude;

        @NameInMap("paths")
        public java.util.List<WalkingDirectionNovaResponseBodyDataPaths> paths;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("taxiCost")
        public String taxiCost;

        public static WalkingDirectionNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionNovaResponseBodyData self = new WalkingDirectionNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionNovaResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public WalkingDirectionNovaResponseBodyData setDestinationLatitude(String destinationLatitude) {
            this.destinationLatitude = destinationLatitude;
            return this;
        }
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        public WalkingDirectionNovaResponseBodyData setDestinationLongitude(String destinationLongitude) {
            this.destinationLongitude = destinationLongitude;
            return this;
        }
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        public WalkingDirectionNovaResponseBodyData setOriginLatitude(String originLatitude) {
            this.originLatitude = originLatitude;
            return this;
        }
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        public WalkingDirectionNovaResponseBodyData setOriginLongitude(String originLongitude) {
            this.originLongitude = originLongitude;
            return this;
        }
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        public WalkingDirectionNovaResponseBodyData setPaths(java.util.List<WalkingDirectionNovaResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<WalkingDirectionNovaResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

        public WalkingDirectionNovaResponseBodyData setTaxiCost(String taxiCost) {
            this.taxiCost = taxiCost;
            return this;
        }
        public String getTaxiCost() {
            return this.taxiCost;
        }

    }

}
