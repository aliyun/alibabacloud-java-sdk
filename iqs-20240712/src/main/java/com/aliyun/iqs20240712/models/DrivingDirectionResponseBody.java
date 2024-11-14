// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class DrivingDirectionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<DrivingDirectionResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <title>502 Bad Gateway</title>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DrivingDirectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DrivingDirectionResponseBody self = new DrivingDirectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DrivingDirectionResponseBody setData(java.util.List<DrivingDirectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DrivingDirectionResponseBodyData> getData() {
        return this.data;
    }

    public DrivingDirectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DrivingDirectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DrivingDirectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DrivingDirectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DrivingDirectionResponseBodyDataCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        @NameInMap("tollRoads")
        public String tollRoads;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("tolls")
        public String tolls;

        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static DrivingDirectionResponseBodyDataCost build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionResponseBodyDataCost self = new DrivingDirectionResponseBodyDataCost();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionResponseBodyDataCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public DrivingDirectionResponseBodyDataCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public DrivingDirectionResponseBodyDataCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public DrivingDirectionResponseBodyDataCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public DrivingDirectionResponseBodyDataCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public DrivingDirectionResponseBodyDataCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public DrivingDirectionResponseBodyDataCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class DrivingDirectionResponseBodyDataStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>27647</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("taxiFee")
        public String taxiFee;

        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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

        public static DrivingDirectionResponseBodyDataStepsCost build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionResponseBodyDataStepsCost self = new DrivingDirectionResponseBodyDataStepsCost();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionResponseBodyDataStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public DrivingDirectionResponseBodyDataStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class DrivingDirectionResponseBodyDataSteps extends TeaModel {
        @NameInMap("cost")
        public DrivingDirectionResponseBodyDataStepsCost cost;

        @NameInMap("instruction")
        public String instruction;

        @NameInMap("orientation")
        public String orientation;

        @NameInMap("roadName")
        public String roadName;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static DrivingDirectionResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionResponseBodyDataSteps self = new DrivingDirectionResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionResponseBodyDataSteps setCost(DrivingDirectionResponseBodyDataStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public DrivingDirectionResponseBodyDataStepsCost getCost() {
            return this.cost;
        }

        public DrivingDirectionResponseBodyDataSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public DrivingDirectionResponseBodyDataSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public DrivingDirectionResponseBodyDataSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public DrivingDirectionResponseBodyDataSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class DrivingDirectionResponseBodyData extends TeaModel {
        @NameInMap("cost")
        public DrivingDirectionResponseBodyDataCost cost;

        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("restriction")
        public String restriction;

        @NameInMap("steps")
        public java.util.List<DrivingDirectionResponseBodyDataSteps> steps;

        public static DrivingDirectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DrivingDirectionResponseBodyData self = new DrivingDirectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DrivingDirectionResponseBodyData setCost(DrivingDirectionResponseBodyDataCost cost) {
            this.cost = cost;
            return this;
        }
        public DrivingDirectionResponseBodyDataCost getCost() {
            return this.cost;
        }

        public DrivingDirectionResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public DrivingDirectionResponseBodyData setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public DrivingDirectionResponseBodyData setSteps(java.util.List<DrivingDirectionResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DrivingDirectionResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

    }

}
