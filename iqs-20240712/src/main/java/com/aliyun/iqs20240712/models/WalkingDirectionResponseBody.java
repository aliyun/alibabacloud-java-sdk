// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class WalkingDirectionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<WalkingDirectionResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Access was denied, message: Unauthorized.</p>
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

    public static WalkingDirectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WalkingDirectionResponseBody self = new WalkingDirectionResponseBody();
        return TeaModel.build(map, self);
    }

    public WalkingDirectionResponseBody setData(java.util.List<WalkingDirectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<WalkingDirectionResponseBodyData> getData() {
        return this.data;
    }

    public WalkingDirectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WalkingDirectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WalkingDirectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WalkingDirectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WalkingDirectionResponseBodyDataCost extends TeaModel {
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

        public static WalkingDirectionResponseBodyDataCost build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionResponseBodyDataCost self = new WalkingDirectionResponseBodyDataCost();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionResponseBodyDataCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public WalkingDirectionResponseBodyDataCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public WalkingDirectionResponseBodyDataCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public WalkingDirectionResponseBodyDataCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public WalkingDirectionResponseBodyDataCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public WalkingDirectionResponseBodyDataCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public WalkingDirectionResponseBodyDataCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class WalkingDirectionResponseBodyDataStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

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

        @NameInMap("transitFee")
        public String transitFee;

        public static WalkingDirectionResponseBodyDataStepsCost build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionResponseBodyDataStepsCost self = new WalkingDirectionResponseBodyDataStepsCost();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionResponseBodyDataStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public WalkingDirectionResponseBodyDataStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class WalkingDirectionResponseBodyDataSteps extends TeaModel {
        @NameInMap("cost")
        public WalkingDirectionResponseBodyDataStepsCost cost;

        @NameInMap("instruction")
        public String instruction;

        @NameInMap("orientation")
        public String orientation;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("roadName")
        public String roadName;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static WalkingDirectionResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionResponseBodyDataSteps self = new WalkingDirectionResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionResponseBodyDataSteps setCost(WalkingDirectionResponseBodyDataStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public WalkingDirectionResponseBodyDataStepsCost getCost() {
            return this.cost;
        }

        public WalkingDirectionResponseBodyDataSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public WalkingDirectionResponseBodyDataSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public WalkingDirectionResponseBodyDataSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public WalkingDirectionResponseBodyDataSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class WalkingDirectionResponseBodyData extends TeaModel {
        @NameInMap("cost")
        public WalkingDirectionResponseBodyDataCost cost;

        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("steps")
        public java.util.List<WalkingDirectionResponseBodyDataSteps> steps;

        public static WalkingDirectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            WalkingDirectionResponseBodyData self = new WalkingDirectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public WalkingDirectionResponseBodyData setCost(WalkingDirectionResponseBodyDataCost cost) {
            this.cost = cost;
            return this;
        }
        public WalkingDirectionResponseBodyDataCost getCost() {
            return this.cost;
        }

        public WalkingDirectionResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public WalkingDirectionResponseBodyData setSteps(java.util.List<WalkingDirectionResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<WalkingDirectionResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

    }

}
