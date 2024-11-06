// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionResponseBody extends TeaModel {
    @NameInMap("data")
    public TransitIntegratedDirectionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
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
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TransitIntegratedDirectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionResponseBody self = new TransitIntegratedDirectionResponseBody();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionResponseBody setData(TransitIntegratedDirectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TransitIntegratedDirectionResponseBodyData getData() {
        return this.data;
    }

    public TransitIntegratedDirectionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public TransitIntegratedDirectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TransitIntegratedDirectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransitIntegratedDirectionResponseBodyDataCost extends TeaModel {
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

        public static TransitIntegratedDirectionResponseBodyDataCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataCost self = new TransitIntegratedDirectionResponseBodyDataCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionResponseBodyDataCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsCost extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
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

        public static TransitIntegratedDirectionResponseBodyDataPathsCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsCost self = new TransitIntegratedDirectionResponseBodyDataPathsCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>900000028907015</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.468213,39.998876</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop extends TeaModel {
        @NameInMap("exit")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit exit;

        /**
         * <strong>example:</strong>
         * <p>100935</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>119.82416178385417,30.27139702690972</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop setExit(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit exit) {
            this.exit = exit;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStopExit getExit() {
            return this.exit;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1521</p>
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

        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99088345834</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.468213,39.998876</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop extends TeaModel {
        @NameInMap("entrance")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance entrance;

        /**
         * <strong>example:</strong>
         * <p>60852</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>116.468213,39.998876</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop setEntrance(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance entrance) {
            this.entrance = entrance;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStopEntrance getEntrance() {
            return this.entrance;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>116.471544,39.991835</p>
         */
        @NameInMap("polyline")
        public String polyline;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines extends TeaModel {
        @NameInMap("arrivalStop")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop arrivalStop;

        @NameInMap("busTimeTips")
        public String busTimeTips;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("bustimetag")
        public String bustimetag;

        @NameInMap("cost")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost cost;

        @NameInMap("departureStop")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop departureStop;

        /**
         * <strong>example:</strong>
         * <p>13322</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>2259</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>900000028907</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("polyline")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline polyline;

        /**
         * <strong>example:</strong>
         * <p>0509</p>
         */
        @NameInMap("startTime")
        public String startTime;

        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("viaNum")
        public String viaNum;

        @NameInMap("viaStops")
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops> viaStops;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setArrivalStop(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop arrivalStop) {
            this.arrivalStop = arrivalStop;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setBusTimeTips(String busTimeTips) {
            this.busTimeTips = busTimeTips;
            return this;
        }
        public String getBusTimeTips() {
            return this.busTimeTips;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setBustimetag(String bustimetag) {
            this.bustimetag = bustimetag;
            return this;
        }
        public String getBustimetag() {
            return this.bustimetag;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setCost(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setDepartureStop(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop departureStop) {
            this.departureStop = departureStop;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesDepartureStop getDepartureStop() {
            return this.departureStop;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setPolyline(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline polyline) {
            this.polyline = polyline;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesPolyline getPolyline() {
            return this.polyline;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setViaNum(String viaNum) {
            this.viaNum = viaNum;
            return this;
        }
        public String getViaNum() {
            return this.viaNum;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines setViaStops(java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops> viaStops) {
            this.viaStops = viaStops;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslinesViaStops> getViaStops() {
            return this.viaStops;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus extends TeaModel {
        @NameInMap("buslines")
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines> buslines;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus setBuslines(java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines> buslines) {
            this.buslines = buslines;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsBusBuslines> getBuslines() {
            return this.buslines;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>023</p>
         */
        @NameInMap("adcode")
        public String adcode;

        /**
         * <p>end</p>
         * 
         * <strong>example:</strong>
         * <p>1699410466578</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <strong>example:</strong>
         * <p>8234837534</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>101.45625135633681,25.08939480251736</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28 10:10:32</p>
         */
        @NameInMap("time")
        public String time;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>029</p>
         */
        @NameInMap("adcode")
        public String adcode;

        /**
         * <strong>example:</strong>
         * <p>100937</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>101.45625135633681,25.08939480251736</p>
         */
        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1729440000000</p>
         */
        @NameInMap("start")
        public String start;

        /**
         * <strong>example:</strong>
         * <p>2024-09-30 10:04:13</p>
         */
        @NameInMap("time")
        public String time;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces extends TeaModel {
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("cost")
        public String cost;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway extends TeaModel {
        @NameInMap("arrivalStop")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop arrivalStop;

        @NameInMap("departureStop")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop departureStop;

        /**
         * <strong>example:</strong>
         * <p>398734</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>434508</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("spaces")
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces> spaces;

        /**
         * <strong>example:</strong>
         * <p>2024-09-28 10:07:22</p>
         */
        @NameInMap("time")
        public String time;

        @NameInMap("trip")
        public String trip;

        @NameInMap("type")
        public String type;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setArrivalStop(TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop arrivalStop) {
            this.arrivalStop = arrivalStop;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setDepartureStop(TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop departureStop) {
            this.departureStop = departureStop;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwayDepartureStop getDepartureStop() {
            return this.departureStop;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setSpaces(java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces> spaces) {
            this.spaces = spaces;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailwaySpaces> getSpaces() {
            return this.spaces;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setTrip(String trip) {
            this.trip = trip;
            return this;
        }
        public String getTrip() {
            return this.trip;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("destinationName")
        public String destinationName;

        /**
         * <strong>example:</strong>
         * <p>116.464297,39.896458</p>
         */
        @NameInMap("destinationPoint")
        public String destinationPoint;

        /**
         * <strong>example:</strong>
         * <p>1772</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("driveTimeSecond")
        public String driveTimeSecond;

        @NameInMap("originName")
        public String originName;

        /**
         * <strong>example:</strong>
         * <p>116.476597,39.893420</p>
         */
        @NameInMap("originPoint")
        public String originPoint;

        /**
         * <strong>example:</strong>
         * <p>13.5</p>
         */
        @NameInMap("price")
        public String price;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setDestinationPoint(String destinationPoint) {
            this.destinationPoint = destinationPoint;
            return this;
        }
        public String getDestinationPoint() {
            return this.destinationPoint;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setDriveTimeSecond(String driveTimeSecond) {
            this.driveTimeSecond = driveTimeSecond;
            return this;
        }
        public String getDriveTimeSecond() {
            return this.driveTimeSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setOriginName(String originName) {
            this.originName = originName;
            return this;
        }
        public String getOriginName() {
            return this.originName;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setOriginPoint(String originPoint) {
            this.originPoint = originPoint;
            return this;
        }
        public String getOriginPoint() {
            return this.originPoint;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>468</p>
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

        @NameInMap("trafficLights")
        public String trafficLights;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>435</p>
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

        @NameInMap("trafficLights")
        public String trafficLights;

        @NameInMap("transitFee")
        public String transitFee;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setDurationSecond(String durationSecond) {
            this.durationSecond = durationSecond;
            return this;
        }
        public String getDurationSecond() {
            return this.durationSecond;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTaxiFee(String taxiFee) {
            this.taxiFee = taxiFee;
            return this;
        }
        public String getTaxiFee() {
            return this.taxiFee;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTollDistanceMeter(String tollDistanceMeter) {
            this.tollDistanceMeter = tollDistanceMeter;
            return this;
        }
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTollRoads(String tollRoads) {
            this.tollRoads = tollRoads;
            return this;
        }
        public String getTollRoads() {
            return this.tollRoads;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTolls(String tolls) {
            this.tolls = tolls;
            return this;
        }
        public String getTolls() {
            return this.tolls;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTrafficLights(String trafficLights) {
            this.trafficLights = trafficLights;
            return this;
        }
        public String getTrafficLights() {
            return this.trafficLights;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost setTransitFee(String transitFee) {
            this.transitFee = transitFee;
            return this;
        }
        public String getTransitFee() {
            return this.transitFee;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>116.467751,39.997631;116.467430,39.997631</p>
         */
        @NameInMap("polyline")
        public String polyline;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline setPolyline(String polyline) {
            this.polyline = polyline;
            return this;
        }
        public String getPolyline() {
            return this.polyline;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost cost;

        @NameInMap("instruction")
        public String instruction;

        @NameInMap("orientation")
        public String orientation;

        @NameInMap("polyline")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline polyline;

        @NameInMap("roadName")
        public String roadName;

        @NameInMap("stepDistanceMeter")
        public String stepDistanceMeter;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setCost(TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setPolyline(TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline polyline) {
            this.polyline = polyline;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingStepsPolyline getPolyline() {
            return this.polyline;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setRoadName(String roadName) {
            this.roadName = roadName;
            return this;
        }
        public String getRoadName() {
            return this.roadName;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps setStepDistanceMeter(String stepDistanceMeter) {
            this.stepDistanceMeter = stepDistanceMeter;
            return this;
        }
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost cost;

        /**
         * <strong>example:</strong>
         * <p>116.468208,39.998875</p>
         */
        @NameInMap("destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>546</p>
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
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps> steps;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking self = new TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking setCost(TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking setSteps(java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalkingSteps> getSteps() {
            return this.steps;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPathsSegments extends TeaModel {
        @NameInMap("bus")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus bus;

        @NameInMap("railway")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway railway;

        @NameInMap("taxi")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi taxi;

        @NameInMap("walking")
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking walking;

        public static TransitIntegratedDirectionResponseBodyDataPathsSegments build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPathsSegments self = new TransitIntegratedDirectionResponseBodyDataPathsSegments();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegments setBus(TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus bus) {
            this.bus = bus;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsBus getBus() {
            return this.bus;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegments setRailway(TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway railway) {
            this.railway = railway;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsRailway getRailway() {
            return this.railway;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegments setTaxi(TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi taxi) {
            this.taxi = taxi;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsTaxi getTaxi() {
            return this.taxi;
        }

        public TransitIntegratedDirectionResponseBodyDataPathsSegments setWalking(TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking walking) {
            this.walking = walking;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsSegmentsWalking getWalking() {
            return this.walking;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyDataPaths extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionResponseBodyDataPathsCost cost;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("nightflag")
        public String nightflag;

        @NameInMap("segments")
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegments> segments;

        /**
         * <strong>example:</strong>
         * <p>23435</p>
         */
        @NameInMap("walkingDistanceMeter")
        public String walkingDistanceMeter;

        public static TransitIntegratedDirectionResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyDataPaths self = new TransitIntegratedDirectionResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyDataPaths setCost(TransitIntegratedDirectionResponseBodyDataPathsCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataPathsCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionResponseBodyDataPaths setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyDataPaths setNightflag(String nightflag) {
            this.nightflag = nightflag;
            return this;
        }
        public String getNightflag() {
            return this.nightflag;
        }

        public TransitIntegratedDirectionResponseBodyDataPaths setSegments(java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegments> segments) {
            this.segments = segments;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPathsSegments> getSegments() {
            return this.segments;
        }

        public TransitIntegratedDirectionResponseBodyDataPaths setWalkingDistanceMeter(String walkingDistanceMeter) {
            this.walkingDistanceMeter = walkingDistanceMeter;
            return this;
        }
        public String getWalkingDistanceMeter() {
            return this.walkingDistanceMeter;
        }

    }

    public static class TransitIntegratedDirectionResponseBodyData extends TeaModel {
        @NameInMap("cost")
        public TransitIntegratedDirectionResponseBodyDataCost cost;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
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
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

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
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPaths> paths;

        public static TransitIntegratedDirectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransitIntegratedDirectionResponseBodyData self = new TransitIntegratedDirectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransitIntegratedDirectionResponseBodyData setCost(TransitIntegratedDirectionResponseBodyDataCost cost) {
            this.cost = cost;
            return this;
        }
        public TransitIntegratedDirectionResponseBodyDataCost getCost() {
            return this.cost;
        }

        public TransitIntegratedDirectionResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public TransitIntegratedDirectionResponseBodyData setDestinationLatitude(String destinationLatitude) {
            this.destinationLatitude = destinationLatitude;
            return this;
        }
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        public TransitIntegratedDirectionResponseBodyData setDestinationLongitude(String destinationLongitude) {
            this.destinationLongitude = destinationLongitude;
            return this;
        }
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        public TransitIntegratedDirectionResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public TransitIntegratedDirectionResponseBodyData setOriginLatitude(String originLatitude) {
            this.originLatitude = originLatitude;
            return this;
        }
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        public TransitIntegratedDirectionResponseBodyData setOriginLongitude(String originLongitude) {
            this.originLongitude = originLongitude;
            return this;
        }
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        public TransitIntegratedDirectionResponseBodyData setPaths(java.util.List<TransitIntegratedDirectionResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<TransitIntegratedDirectionResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

    }

}
