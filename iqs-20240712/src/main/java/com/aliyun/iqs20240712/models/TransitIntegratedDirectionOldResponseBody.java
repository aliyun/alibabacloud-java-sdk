// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionOldResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<TransitIntegratedDirectionOldResponseBodyData> data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TransitIntegratedDirectionOldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionOldResponseBody self = new TransitIntegratedDirectionOldResponseBody();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionOldResponseBody setData(java.util.List<TransitIntegratedDirectionOldResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TransitIntegratedDirectionOldResponseBodyData> getData() {
        return this.data;
    }

    public TransitIntegratedDirectionOldResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public TransitIntegratedDirectionOldResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TransitIntegratedDirectionOldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransitIntegratedDirectionOldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransitIntegratedDirectionOldResponseBodyDataCost extends TeaModel {
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

        public static TransitIntegratedDirectionOldResponseBodyDataCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataCost self = new TransitIntegratedDirectionOldResponseBodyDataCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionOldResponseBodyDataCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99900009</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop extends TeaModel {
        @NameInMap("exit")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit exit;

        /**
         * <strong>example:</strong>
         * <p>rpe-fu181hrp24i8fc6r38fbsnn</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>znzmo_cqz</p>
         */
        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop setExit(TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit exit) {
            this.exit = exit;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStopExit getExit() {
            return this.exit;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>348394</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        /**
         * <strong>example:</strong>
         * <p>444</p>
         */
        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("tollRoads")
        public String tollRoads;

        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
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
         * <p>3</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>124100037</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>tyc_cust</p>
         */
        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop extends TeaModel {
        @NameInMap("entrance")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance entrance;

        /**
         * <strong>example:</strong>
         * <p>st-628f075f-11638689</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>1597871211794192-1700571612867-LcFKnaDJRsoAsYpltZzfrc7Ts0TY1DYOrID+QVy0WxxxPOY8+bod62GWhHB1NK1lITs5tu2zIwknT3R9S8XCAA</p>
         */
        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop setEntrance(TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance entrance) {
            this.entrance = entrance;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStopEntrance getEntrance() {
            return this.entrance;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>136200191</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>114.23980387369792,30.60205837673611</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>WordsWeightTest</p>
         */
        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines extends TeaModel {
        @NameInMap("arrivalStop")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop arrivalStop;

        @NameInMap("busTimeTips")
        public String busTimeTips;

        /**
         * <strong>example:</strong>
         * <p>09:00---21:00</p>
         */
        @NameInMap("bustimetag")
        public String bustimetag;

        @NameInMap("cost")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost cost;

        @NameInMap("departureStop")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop departureStop;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1841625</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Sheet1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1730448000000</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("viaNum")
        public String viaNum;

        @NameInMap("viaStops")
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops> viaStops;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setArrivalStop(TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop arrivalStop) {
            this.arrivalStop = arrivalStop;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setBusTimeTips(String busTimeTips) {
            this.busTimeTips = busTimeTips;
            return this;
        }
        public String getBusTimeTips() {
            return this.busTimeTips;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setBustimetag(String bustimetag) {
            this.bustimetag = bustimetag;
            return this;
        }
        public String getBustimetag() {
            return this.bustimetag;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setCost(TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setDepartureStop(TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop departureStop) {
            this.departureStop = departureStop;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesDepartureStop getDepartureStop() {
            return this.departureStop;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setViaNum(String viaNum) {
            this.viaNum = viaNum;
            return this;
        }
        public String getViaNum() {
            return this.viaNum;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines setViaStops(java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops> viaStops) {
            this.viaStops = viaStops;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslinesViaStops> getViaStops() {
            return this.viaStops;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsBus extends TeaModel {
        @NameInMap("buslines")
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines> buslines;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsBus build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsBus self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsBus();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBus setBuslines(java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines> buslines) {
            this.buslines = buslines;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsBusBuslines> getBuslines() {
            return this.buslines;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100200</p>
         */
        @NameInMap("adcode")
        public String adcode;

        /**
         * <p>end</p>
         * 
         * <strong>example:</strong>
         * <p>1728553266042</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <strong>example:</strong>
         * <p>138700037</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>1634343014745990-1699252808337-stack_10340126_20231106144004.log</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024-11-09 10:00:46</p>
         */
        @NameInMap("time")
        public String time;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1002200</p>
         */
        @NameInMap("adcode")
        public String adcode;

        /**
         * <strong>example:</strong>
         * <p>148100008</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.467430,39.997627</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>stop_words</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1727141356337</p>
         */
        @NameInMap("start")
        public String start;

        /**
         * <strong>example:</strong>
         * <p>2024-11-04 10:26:41</p>
         */
        @NameInMap("time")
        public String time;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("cost")
        public String cost;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway extends TeaModel {
        @NameInMap("arrivalStop")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop arrivalStop;

        @NameInMap("departureStop")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop departureStop;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>rpe-kw141hrpoh8vttte2lrvhdb</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>hbh_rectify</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("spaces")
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces> spaces;

        /**
         * <strong>example:</strong>
         * <p>2024-11-04 10:26:41</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>4002</p>
         */
        @NameInMap("trip")
        public String trip;

        /**
         * <strong>example:</strong>
         * <p>OFFLINE_DICT</p>
         */
        @NameInMap("type")
        public String type;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setArrivalStop(TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop arrivalStop) {
            this.arrivalStop = arrivalStop;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setDepartureStop(TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop departureStop) {
            this.departureStop = departureStop;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwayDepartureStop getDepartureStop() {
            return this.departureStop;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setSpaces(java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsRailwaySpaces> getSpaces() {
            return this.spaces;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setTrip(String trip) {
            this.trip = trip;
            return this;
        }
        public String getTrip() {
            return this.trip;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi extends TeaModel {
        @NameInMap("destinationName")
        public String destinationName;

        /**
         * <strong>example:</strong>
         * <p>116.461662,39.944807</p>
         */
        @NameInMap("destinationPoint")
        public String destinationPoint;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("driveTimeSecond")
        public String driveTimeSecond;

        @NameInMap("originName")
        public String originName;

        /**
         * <strong>example:</strong>
         * <p>116.461662,39.944807</p>
         */
        @NameInMap("originPoint")
        public String originPoint;

        /**
         * <strong>example:</strong>
         * <p>241000</p>
         */
        @NameInMap("price")
        public String price;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setDestinationPoint(String destinationPoint) {
            this.destinationPoint = destinationPoint;
            return this;
        }
        public String getDestinationPoint() {
            return this.destinationPoint;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setDriveTimeSecond(String driveTimeSecond) {
            this.driveTimeSecond = driveTimeSecond;
            return this;
        }
        public String getDriveTimeSecond() {
            return this.driveTimeSecond;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setOriginName(String originName) {
            this.originName = originName;
            return this;
        }
        public String getOriginName() {
            return this.originName;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setOriginPoint(String originPoint) {
            this.originPoint = originPoint;
            return this;
        }
        public String getOriginPoint() {
            return this.originPoint;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1293</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("tollRoads")
        public String tollRoads;

        /**
         * <strong>example:</strong>
         * <p>1203</p>
         */
        @NameInMap("tolls")
        public String tolls;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("trafficLights")
        public String trafficLights;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3435</p>
         */
        @NameInMap("durationSecond")
        public String durationSecond;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("taxiFee")
        public String taxiFee;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("tollDistanceMeter")
        public String tollDistanceMeter;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("tollRoads")
        public String tollRoads;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
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
         * <p>2</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost cost;

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
         * <p>3000</p>
         */
        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps setCost(TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingStepsCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost cost;

        /**
         * <strong>example:</strong>
         * <p>116.468208,39.998875</p>
         */
        @NameInMap("destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>116.466568,39.995552</p>
         */
        @NameInMap("origin")
        public String origin;

        @NameInMap("steps")
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps> steps;

        public static TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking self = new TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking setCost(TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking setSteps(java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegmentsWalkingSteps> getSteps() {
            return this.steps;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyDataSegments extends TeaModel {
        @NameInMap("bus")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBus bus;

        @NameInMap("railway")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway railway;

        @NameInMap("taxi")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi taxi;

        @NameInMap("walking")
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking walking;

        public static TransitIntegratedDirectionOldResponseBodyDataSegments build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyDataSegments self = new TransitIntegratedDirectionOldResponseBodyDataSegments();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegments setBus(TransitIntegratedDirectionOldResponseBodyDataSegmentsBus bus) {
            this.bus = bus;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsBus getBus() {
            return this.bus;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegments setRailway(TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway railway) {
            this.railway = railway;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsRailway getRailway() {
            return this.railway;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegments setTaxi(TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi taxi) {
            this.taxi = taxi;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsTaxi getTaxi() {
            return this.taxi;
        }

        public TransitIntegratedDirectionOldResponseBodyDataSegments setWalking(TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking walking) {
            this.walking = walking;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataSegmentsWalking getWalking() {
            return this.walking;
        }

    }

    public static class TransitIntegratedDirectionOldResponseBodyData extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionOldResponseBodyDataCost cost;

        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("nightflag")
        public String nightflag;

        @NameInMap("segments")
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegments> segments;

        /**
         * <strong>example:</strong>
         * <p>11000</p>
         */
        @NameInMap("walkingDistanceMeter")
        public String walkingDistanceMeter;

        public static TransitIntegratedDirectionOldResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionOldResponseBodyData self = new TransitIntegratedDirectionOldResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionOldResponseBodyData setCost(TransitIntegratedDirectionOldResponseBodyDataCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionOldResponseBodyDataCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionOldResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionOldResponseBodyData setNightflag(String nightflag) {
            this.nightflag = nightflag;
            return this;
        }
        public String getNightflag() {
            return this.nightflag;
        }

        public TransitIntegratedDirectionOldResponseBodyData setSegments(java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegments> segments) {
            this.segments = segments;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionOldResponseBodyDataSegments> getSegments() {
            return this.segments;
        }

        public TransitIntegratedDirectionOldResponseBodyData setWalkingDistanceMeter(String walkingDistanceMeter) {
            this.walkingDistanceMeter = walkingDistanceMeter;
            return this;
        }
        public String getWalkingDistanceMeter() {
            return this.walkingDistanceMeter;
        }

    }

}
