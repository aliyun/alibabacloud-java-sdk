// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public EstimatedPriceQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static EstimatedPriceQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryResponseBody self = new EstimatedPriceQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EstimatedPriceQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EstimatedPriceQueryResponseBody setModule(EstimatedPriceQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public EstimatedPriceQueryResponseBodyModule getModule() {
        return this.module;
    }

    public EstimatedPriceQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimatedPriceQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EstimatedPriceQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class EstimatedPriceQueryResponseBodyModuleHotelFeeDetail extends TeaModel {
        @NameInMap("city")
        public String city;

        @NameInMap("criterion")
        public Long criterion;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("total")
        public Long total;

        @NameInMap("trip_days")
        public Integer tripDays;

        public static EstimatedPriceQueryResponseBodyModuleHotelFeeDetail build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleHotelFeeDetail self = new EstimatedPriceQueryResponseBodyModuleHotelFeeDetail();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleHotelFeeDetail setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public EstimatedPriceQueryResponseBodyModuleHotelFeeDetail setCriterion(Long criterion) {
            this.criterion = criterion;
            return this;
        }
        public Long getCriterion() {
            return this.criterion;
        }

        public EstimatedPriceQueryResponseBodyModuleHotelFeeDetail setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public EstimatedPriceQueryResponseBodyModuleHotelFeeDetail setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public EstimatedPriceQueryResponseBodyModuleHotelFeeDetail setTripDays(Integer tripDays) {
            this.tripDays = tripDays;
            return this;
        }
        public Integer getTripDays() {
            return this.tripDays;
        }

    }

    public static class EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest extends TeaModel {
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("fee")
        public Long fee;

        @NameInMap("seat_grade")
        public String seatGrade;

        @NameInMap("vehicle_no")
        public String vehicleNo;

        public static EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest self = new EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest setSeatGrade(String seatGrade) {
            this.seatGrade = seatGrade;
            return this;
        }
        public String getSeatGrade() {
            return this.seatGrade;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest setVehicleNo(String vehicleNo) {
            this.vehicleNo = vehicleNo;
            return this;
        }
        public String getVehicleNo() {
            return this.vehicleNo;
        }

    }

    public static class EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive extends TeaModel {
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("fee")
        public Long fee;

        @NameInMap("seat_grade")
        public String seatGrade;

        @NameInMap("vehicle_no")
        public String vehicleNo;

        public static EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive self = new EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive setSeatGrade(String seatGrade) {
            this.seatGrade = seatGrade;
            return this;
        }
        public String getSeatGrade() {
            return this.seatGrade;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive setVehicleNo(String vehicleNo) {
            this.vehicleNo = vehicleNo;
            return this;
        }
        public String getVehicleNo() {
            return this.vehicleNo;
        }

    }

    public static class EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_date")
        public Long arrDate;

        @NameInMap("cheapest")
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest cheapest;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_date")
        public Long depDate;

        @NameInMap("err_msg")
        public String errMsg;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("most_expensive")
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive mostExpensive;

        @NameInMap("success")
        public Boolean success;

        public static EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes self = new EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setArrDate(Long arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public Long getArrDate() {
            return this.arrDate;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setCheapest(EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest cheapest) {
            this.cheapest = cheapest;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest getCheapest() {
            return this.cheapest;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setDepDate(Long depDate) {
            this.depDate = depDate;
            return this;
        }
        public Long getDepDate() {
            return this.depDate;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setMostExpensive(EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive mostExpensive) {
            this.mostExpensive = mostExpensive;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive getMostExpensive() {
            return this.mostExpensive;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class EstimatedPriceQueryResponseBodyModuleTrafficFee extends TeaModel {
        @NameInMap("btrip_routes")
        public java.util.List<EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes> btripRoutes;

        @NameInMap("err_msg")
        public String errMsg;

        @NameInMap("max_fee")
        public Long maxFee;

        @NameInMap("min_fee")
        public Long minFee;

        @NameInMap("success")
        public Boolean success;

        public static EstimatedPriceQueryResponseBodyModuleTrafficFee build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleTrafficFee self = new EstimatedPriceQueryResponseBodyModuleTrafficFee();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFee setBtripRoutes(java.util.List<EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes> btripRoutes) {
            this.btripRoutes = btripRoutes;
            return this;
        }
        public java.util.List<EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes> getBtripRoutes() {
            return this.btripRoutes;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFee setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFee setMaxFee(Long maxFee) {
            this.maxFee = maxFee;
            return this;
        }
        public Long getMaxFee() {
            return this.maxFee;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFee setMinFee(Long minFee) {
            this.minFee = minFee;
            return this;
        }
        public Long getMinFee() {
            return this.minFee;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFee setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class EstimatedPriceQueryResponseBodyModule extends TeaModel {
        @NameInMap("hotel_fee_detail")
        public java.util.List<EstimatedPriceQueryResponseBodyModuleHotelFeeDetail> hotelFeeDetail;

        /**
         * <p>酒店费用总额，单位为元</p>
         */
        @NameInMap("total_hotel_fee")
        public Long totalHotelFee;

        @NameInMap("traffic_fee")
        public EstimatedPriceQueryResponseBodyModuleTrafficFee trafficFee;

        public static EstimatedPriceQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModule self = new EstimatedPriceQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModule setHotelFeeDetail(java.util.List<EstimatedPriceQueryResponseBodyModuleHotelFeeDetail> hotelFeeDetail) {
            this.hotelFeeDetail = hotelFeeDetail;
            return this;
        }
        public java.util.List<EstimatedPriceQueryResponseBodyModuleHotelFeeDetail> getHotelFeeDetail() {
            return this.hotelFeeDetail;
        }

        public EstimatedPriceQueryResponseBodyModule setTotalHotelFee(Long totalHotelFee) {
            this.totalHotelFee = totalHotelFee;
            return this;
        }
        public Long getTotalHotelFee() {
            return this.totalHotelFee;
        }

        public EstimatedPriceQueryResponseBodyModule setTrafficFee(EstimatedPriceQueryResponseBodyModuleTrafficFee trafficFee) {
            this.trafficFee = trafficFee;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFee getTrafficFee() {
            return this.trafficFee;
        }

    }

}
