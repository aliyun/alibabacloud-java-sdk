// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoInfoSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainNoInfoSearchResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>requestId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainNoInfoSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainNoInfoSearchResponseBody self = new TrainNoInfoSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainNoInfoSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainNoInfoSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainNoInfoSearchResponseBody setModule(TrainNoInfoSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainNoInfoSearchResponseBodyModule getModule() {
        return this.module;
    }

    public TrainNoInfoSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainNoInfoSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainNoInfoSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos extends TeaModel {
        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("stock")
        public String stock;

        public static TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos self = new TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos setStock(String stock) {
            this.stock = stock;
            return this;
        }
        public String getStock() {
            return this.stock;
        }

    }

    public static class TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO extends TeaModel {
        @NameInMap("arr_day_tag")
        public String arrDayTag;

        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("arr_station_name")
        public String arrStationName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cost_time")
        public String costTime;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_station_name")
        public String depStationName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("is_end_station")
        public Integer isEndStation;

        @NameInMap("is_start_station")
        public Integer isStartStation;

        @NameInMap("price")
        public String price;

        @NameInMap("sale_flag")
        public String saleFlag;

        @NameInMap("seat_infos")
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos> seatInfos;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type")
        public String trainType;

        public static TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO self = new TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setArrDayTag(String arrDayTag) {
            this.arrDayTag = arrDayTag;
            return this;
        }
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setIsEndStation(Integer isEndStation) {
            this.isEndStation = isEndStation;
            return this;
        }
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setIsStartStation(Integer isStartStation) {
            this.isStartStation = isStartStation;
            return this;
        }
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setSaleFlag(String saleFlag) {
            this.saleFlag = saleFlag;
            return this;
        }
        public String getSaleFlag() {
            return this.saleFlag;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setSeatInfos(java.util.List<TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos> seatInfos) {
            this.seatInfos = seatInfos;
            return this;
        }
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainStationSearchVOSeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

    public static class TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos extends TeaModel {
        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("stock")
        public String stock;

        public static TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos self = new TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos setStock(String stock) {
            this.stock = stock;
            return this;
        }
        public String getStock() {
            return this.stock;
        }

    }

    public static class TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList extends TeaModel {
        @NameInMap("arr_day_tag")
        public String arrDayTag;

        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("arr_station_name")
        public String arrStationName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cost_time")
        public String costTime;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_station_name")
        public String depStationName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("is_end_station")
        public Integer isEndStation;

        @NameInMap("is_start_station")
        public Integer isStartStation;

        @NameInMap("price")
        public String price;

        @NameInMap("sale_flag")
        public String saleFlag;

        @NameInMap("seat_infos")
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos> seatInfos;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type")
        public String trainType;

        public static TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList self = new TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setArrDayTag(String arrDayTag) {
            this.arrDayTag = arrDayTag;
            return this;
        }
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setIsEndStation(Integer isEndStation) {
            this.isEndStation = isEndStation;
            return this;
        }
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setIsStartStation(Integer isStartStation) {
            this.isStartStation = isStartStation;
            return this;
        }
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setSaleFlag(String saleFlag) {
            this.saleFlag = saleFlag;
            return this;
        }
        public String getSaleFlag() {
            return this.saleFlag;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setSeatInfos(java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos> seatInfos) {
            this.seatInfos = seatInfos;
            return this;
        }
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailListSeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

    public static class TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO extends TeaModel {
        @NameInMap("transfer_detail_list")
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList> transferDetailList;

        @NameInMap("transfer_type")
        public String transferType;

        public static TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO self = new TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO setTransferDetailList(java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList> transferDetailList) {
            this.transferDetailList = transferDetailList;
            return this;
        }
        public java.util.List<TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVOTransferDetailList> getTransferDetailList() {
            return this.transferDetailList;
        }

        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO setTransferType(String transferType) {
            this.transferType = transferType;
            return this;
        }
        public String getTransferType() {
            return this.transferType;
        }

    }

    public static class TrainNoInfoSearchResponseBodyModule extends TeaModel {
        @NameInMap("train_station_search_v_o")
        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO trainStationSearchVO;

        @NameInMap("train_transfer_station_search_v_o")
        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO trainTransferStationSearchVO;

        public static TrainNoInfoSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainNoInfoSearchResponseBodyModule self = new TrainNoInfoSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainNoInfoSearchResponseBodyModule setTrainStationSearchVO(TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO trainStationSearchVO) {
            this.trainStationSearchVO = trainStationSearchVO;
            return this;
        }
        public TrainNoInfoSearchResponseBodyModuleTrainStationSearchVO getTrainStationSearchVO() {
            return this.trainStationSearchVO;
        }

        public TrainNoInfoSearchResponseBodyModule setTrainTransferStationSearchVO(TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO trainTransferStationSearchVO) {
            this.trainTransferStationSearchVO = trainTransferStationSearchVO;
            return this;
        }
        public TrainNoInfoSearchResponseBodyModuleTrainTransferStationSearchVO getTrainTransferStationSearchVO() {
            return this.trainTransferStationSearchVO;
        }

    }

}
