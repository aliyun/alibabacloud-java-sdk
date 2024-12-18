// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class ElectrobikeDirectionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ElectrobikeDirectionResponseBodyData> data;

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

    public static ElectrobikeDirectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElectrobikeDirectionResponseBody self = new ElectrobikeDirectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ElectrobikeDirectionResponseBody setData(java.util.List<ElectrobikeDirectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ElectrobikeDirectionResponseBodyData> getData() {
        return this.data;
    }

    public ElectrobikeDirectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ElectrobikeDirectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ElectrobikeDirectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElectrobikeDirectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ElectrobikeDirectionResponseBodyDataStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2002</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("taxiFee")
        public String taxiFee;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
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

        public static ElectrobikeDirectionResponseBodyDataStepsCost build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionResponseBodyDataStepsCost self = new ElectrobikeDirectionResponseBodyDataStepsCost();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public ElectrobikeDirectionResponseBodyDataStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class ElectrobikeDirectionResponseBodyDataSteps extends TeaModel {
        @NameInMap("cost")
        public ElectrobikeDirectionResponseBodyDataStepsCost cost;

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

        public static ElectrobikeDirectionResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionResponseBodyDataSteps self = new ElectrobikeDirectionResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionResponseBodyDataSteps setCost(ElectrobikeDirectionResponseBodyDataStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public ElectrobikeDirectionResponseBodyDataStepsCost getCost() {
            return this.cost;
        }

        public ElectrobikeDirectionResponseBodyDataSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ElectrobikeDirectionResponseBodyDataSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public ElectrobikeDirectionResponseBodyDataSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public ElectrobikeDirectionResponseBodyDataSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class ElectrobikeDirectionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        @NameInMap("steps")
        public java.util.List<ElectrobikeDirectionResponseBodyDataSteps> steps;

        public static ElectrobikeDirectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ElectrobikeDirectionResponseBodyData self = new ElectrobikeDirectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ElectrobikeDirectionResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public ElectrobikeDirectionResponseBodyData setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public ElectrobikeDirectionResponseBodyData setSteps(java.util.List<ElectrobikeDirectionResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<ElectrobikeDirectionResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

    }

}
