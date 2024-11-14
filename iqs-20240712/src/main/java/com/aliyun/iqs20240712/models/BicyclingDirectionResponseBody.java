// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class BicyclingDirectionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<BicyclingDirectionResponseBodyData> data;

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

    public static BicyclingDirectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BicyclingDirectionResponseBody self = new BicyclingDirectionResponseBody();
        return TeaModel.build(map, self);
    }

    public BicyclingDirectionResponseBody setData(java.util.List<BicyclingDirectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BicyclingDirectionResponseBodyData> getData() {
        return this.data;
    }

    public BicyclingDirectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BicyclingDirectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BicyclingDirectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BicyclingDirectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BicyclingDirectionResponseBodyDataStepsCost extends TeaModel {
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
         * <p>4</p>
         */
        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static BicyclingDirectionResponseBodyDataStepsCost build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionResponseBodyDataStepsCost self = new BicyclingDirectionResponseBodyDataStepsCost();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionResponseBodyDataStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public BicyclingDirectionResponseBodyDataStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class BicyclingDirectionResponseBodyDataSteps extends TeaModel {
        @NameInMap("cost")
        public BicyclingDirectionResponseBodyDataStepsCost cost;

        @NameInMap("instruction")
        public String instruction;

        @NameInMap("orientation")
        public String orientation;

        @NameInMap("roadName")
        public String roadName;

        /**
         * <strong>example:</strong>
         * <p>12939</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static BicyclingDirectionResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionResponseBodyDataSteps self = new BicyclingDirectionResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionResponseBodyDataSteps setCost(BicyclingDirectionResponseBodyDataStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public BicyclingDirectionResponseBodyDataStepsCost getCost() {
            return this.cost;
        }

        public BicyclingDirectionResponseBodyDataSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public BicyclingDirectionResponseBodyDataSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public BicyclingDirectionResponseBodyDataSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public BicyclingDirectionResponseBodyDataSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class BicyclingDirectionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>38434</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("steps")
        public java.util.List<BicyclingDirectionResponseBodyDataSteps> steps;

        public static BicyclingDirectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BicyclingDirectionResponseBodyData self = new BicyclingDirectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BicyclingDirectionResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public BicyclingDirectionResponseBodyData setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public BicyclingDirectionResponseBodyData setSteps(java.util.List<BicyclingDirectionResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<BicyclingDirectionResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

    }

}
