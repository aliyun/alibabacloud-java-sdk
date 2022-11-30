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
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("btrip_type")
        public Integer btripType;

        @NameInMap("cheapest")
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest cheapest;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("dest_city")
        public String destCity;

        @NameInMap("err_msg")
        public String errMsg;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_index")
        public Integer itineraryIndex;

        @NameInMap("most_expensive")
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive mostExpensive;

        @NameInMap("org_city")
        public String orgCity;

        @NameInMap("success")
        public Boolean success;

        public static EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes self = new EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setBtripType(Integer btripType) {
            this.btripType = btripType;
            return this;
        }
        public Integer getBtripType() {
            return this.btripType;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setCheapest(EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest cheapest) {
            this.cheapest = cheapest;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesCheapest getCheapest() {
            return this.cheapest;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setDestCity(String destCity) {
            this.destCity = destCity;
            return this;
        }
        public String getDestCity() {
            return this.destCity;
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

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setItineraryIndex(Integer itineraryIndex) {
            this.itineraryIndex = itineraryIndex;
            return this;
        }
        public Integer getItineraryIndex() {
            return this.itineraryIndex;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setMostExpensive(EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive mostExpensive) {
            this.mostExpensive = mostExpensive;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutesMostExpensive getMostExpensive() {
            return this.mostExpensive;
        }

        public EstimatedPriceQueryResponseBodyModuleTrafficFeeBtripRoutes setOrgCity(String orgCity) {
            this.orgCity = orgCity;
            return this;
        }
        public String getOrgCity() {
            return this.orgCity;
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

        public EstimatedPriceQueryResponseBodyModule setTrafficFee(EstimatedPriceQueryResponseBodyModuleTrafficFee trafficFee) {
            this.trafficFee = trafficFee;
            return this;
        }
        public EstimatedPriceQueryResponseBodyModuleTrafficFee getTrafficFee() {
            return this.trafficFee;
        }

    }

}
