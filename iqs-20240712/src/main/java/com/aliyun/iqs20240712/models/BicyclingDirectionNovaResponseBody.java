// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class BicyclingDirectionNovaResponseBody extends TeaModel {
    @NameInMap("data")
    public BicyclingDirectionNovaResponseBodyData data;

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

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BicyclingDirectionNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BicyclingDirectionNovaResponseBody self = new BicyclingDirectionNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public BicyclingDirectionNovaResponseBody setData(BicyclingDirectionNovaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BicyclingDirectionNovaResponseBodyData getData() {
        return this.data;
    }

    public BicyclingDirectionNovaResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public BicyclingDirectionNovaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BicyclingDirectionNovaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BicyclingDirectionNovaResponseBodyDataPathsCost extends TeaModel {
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

        @NameInMap("trafficLights")
        public String trafficLights;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static BicyclingDirectionNovaResponseBodyDataPathsCost build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionNovaResponseBodyDataPathsCost self = new BicyclingDirectionNovaResponseBodyDataPathsCost();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class BicyclingDirectionNovaResponseBodyDataPathsStepsCost extends TeaModel {
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

        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static BicyclingDirectionNovaResponseBodyDataPathsStepsCost build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionNovaResponseBodyDataPathsStepsCost self = new BicyclingDirectionNovaResponseBodyDataPathsStepsCost();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class BicyclingDirectionNovaResponseBodyDataPathsSteps extends TeaModel {
        @NameInMap("cost")
        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost cost;

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

        public static BicyclingDirectionNovaResponseBodyDataPathsSteps build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionNovaResponseBodyDataPathsSteps self = new BicyclingDirectionNovaResponseBodyDataPathsSteps();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setCost(BicyclingDirectionNovaResponseBodyDataPathsStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public BicyclingDirectionNovaResponseBodyDataPathsStepsCost getCost() {
            return this.cost;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public BicyclingDirectionNovaResponseBodyDataPathsSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class BicyclingDirectionNovaResponseBodyDataPaths extends TeaModel {
        @NameInMap("cost")
        public BicyclingDirectionNovaResponseBodyDataPathsCost cost;

        /**
         * <strong>example:</strong>
         * <p>96375</p>
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
        public java.util.List<BicyclingDirectionNovaResponseBodyDataPathsSteps> steps;

        public static BicyclingDirectionNovaResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionNovaResponseBodyDataPaths self = new BicyclingDirectionNovaResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionNovaResponseBodyDataPaths setCost(BicyclingDirectionNovaResponseBodyDataPathsCost cost) {
            this.cost = cost;
            return this;
        }
        public BicyclingDirectionNovaResponseBodyDataPathsCost getCost() {
            return this.cost;
        }

        public BicyclingDirectionNovaResponseBodyDataPaths setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public BicyclingDirectionNovaResponseBodyDataPaths setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public BicyclingDirectionNovaResponseBodyDataPaths setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public BicyclingDirectionNovaResponseBodyDataPaths setSteps(java.util.List<BicyclingDirectionNovaResponseBodyDataPathsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<BicyclingDirectionNovaResponseBodyDataPathsSteps> getSteps() {
            return this.steps;
        }

    }

    public static class BicyclingDirectionNovaResponseBodyData extends TeaModel {
        @NameInMap("count")
        public String count;

        /**
         * <strong>example:</strong>
         * <p>39.995197</p>
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
        public java.util.List<BicyclingDirectionNovaResponseBodyDataPaths> paths;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("taxiCost")
        public String taxiCost;

        public static BicyclingDirectionNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionNovaResponseBodyData self = new BicyclingDirectionNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionNovaResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public BicyclingDirectionNovaResponseBodyData setDestinationLatitude(String destinationLatitude) {
            this.destinationLatitude = destinationLatitude;
            return this;
        }
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        public BicyclingDirectionNovaResponseBodyData setDestinationLongitude(String destinationLongitude) {
            this.destinationLongitude = destinationLongitude;
            return this;
        }
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        public BicyclingDirectionNovaResponseBodyData setOriginLatitude(String originLatitude) {
            this.originLatitude = originLatitude;
            return this;
        }
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        public BicyclingDirectionNovaResponseBodyData setOriginLongitude(String originLongitude) {
            this.originLongitude = originLongitude;
            return this;
        }
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        public BicyclingDirectionNovaResponseBodyData setPaths(java.util.List<BicyclingDirectionNovaResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<BicyclingDirectionNovaResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

        public BicyclingDirectionNovaResponseBodyData setTaxiCost(String taxiCost) {
            this.taxiCost = taxiCost;
            return this;
        }
        public String getTaxiCost() {
            return this.taxiCost;
        }

    }

}
