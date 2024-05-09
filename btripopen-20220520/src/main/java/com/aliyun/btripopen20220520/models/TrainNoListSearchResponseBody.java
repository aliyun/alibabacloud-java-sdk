// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoListSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainNoListSearchResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainNoListSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainNoListSearchResponseBody self = new TrainNoListSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainNoListSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainNoListSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainNoListSearchResponseBody setModule(TrainNoListSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainNoListSearchResponseBodyModule getModule() {
        return this.module;
    }

    public TrainNoListSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainNoListSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainNoListSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos extends TeaModel {
        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("stock")
        public String stock;

        public static TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos self = new TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos setStock(String stock) {
            this.stock = stock;
            return this;
        }
        public String getStock() {
            return this.stock;
        }

    }

    public static class TrainNoListSearchResponseBodyModuleTrainStationSearchVOS extends TeaModel {
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

        @NameInMap("sale_flag_msg")
        public String saleFlagMsg;

        @NameInMap("seagment_index")
        public String seagmentIndex;

        @NameInMap("seat_infos")
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos> seatInfos;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type")
        public String trainType;

        public static TrainNoListSearchResponseBodyModuleTrainStationSearchVOS build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModuleTrainStationSearchVOS self = new TrainNoListSearchResponseBodyModuleTrainStationSearchVOS();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setArrDayTag(String arrDayTag) {
            this.arrDayTag = arrDayTag;
            return this;
        }
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setIsEndStation(Integer isEndStation) {
            this.isEndStation = isEndStation;
            return this;
        }
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setIsStartStation(Integer isStartStation) {
            this.isStartStation = isStartStation;
            return this;
        }
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setSaleFlag(String saleFlag) {
            this.saleFlag = saleFlag;
            return this;
        }
        public String getSaleFlag() {
            return this.saleFlag;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setSaleFlagMsg(String saleFlagMsg) {
            this.saleFlagMsg = saleFlagMsg;
            return this;
        }
        public String getSaleFlagMsg() {
            return this.saleFlagMsg;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setSeagmentIndex(String seagmentIndex) {
            this.seagmentIndex = seagmentIndex;
            return this;
        }
        public String getSeagmentIndex() {
            return this.seagmentIndex;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setSeatInfos(java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos> seatInfos) {
            this.seatInfos = seatInfos;
            return this;
        }
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOSSeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainNoListSearchResponseBodyModuleTrainStationSearchVOS setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

    public static class TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos extends TeaModel {
        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("stock")
        public String stock;

        public static TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos self = new TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos setStock(String stock) {
            this.stock = stock;
            return this;
        }
        public String getStock() {
            return this.stock;
        }

    }

    public static class TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList extends TeaModel {
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

        @NameInMap("sale_flag_msg")
        public String saleFlagMsg;

        @NameInMap("seat_infos")
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos> seatInfos;

        @NameInMap("segment_index")
        public String segmentIndex;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type")
        public String trainType;

        public static TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList self = new TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setArrDayTag(String arrDayTag) {
            this.arrDayTag = arrDayTag;
            return this;
        }
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setIsEndStation(Integer isEndStation) {
            this.isEndStation = isEndStation;
            return this;
        }
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setIsStartStation(Integer isStartStation) {
            this.isStartStation = isStartStation;
            return this;
        }
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setSaleFlag(String saleFlag) {
            this.saleFlag = saleFlag;
            return this;
        }
        public String getSaleFlag() {
            return this.saleFlag;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setSaleFlagMsg(String saleFlagMsg) {
            this.saleFlagMsg = saleFlagMsg;
            return this;
        }
        public String getSaleFlagMsg() {
            return this.saleFlagMsg;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setSeatInfos(java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos> seatInfos) {
            this.seatInfos = seatInfos;
            return this;
        }
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailListSeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setSegmentIndex(String segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public String getSegmentIndex() {
            return this.segmentIndex;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

    }

    public static class TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs extends TeaModel {
        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("dep_station")
        public String depStation;

        @NameInMap("line_key")
        public String lineKey;

        @NameInMap("middle_station")
        public String middleStation;

        @NameInMap("transfer_detail_list")
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList> transferDetailList;

        @NameInMap("transfer_type")
        public String transferType;

        public static TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs self = new TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setDepStation(String depStation) {
            this.depStation = depStation;
            return this;
        }
        public String getDepStation() {
            return this.depStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setLineKey(String lineKey) {
            this.lineKey = lineKey;
            return this;
        }
        public String getLineKey() {
            return this.lineKey;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setMiddleStation(String middleStation) {
            this.middleStation = middleStation;
            return this;
        }
        public String getMiddleStation() {
            return this.middleStation;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setTransferDetailList(java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList> transferDetailList) {
            this.transferDetailList = transferDetailList;
            return this;
        }
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOsTransferDetailList> getTransferDetailList() {
            return this.transferDetailList;
        }

        public TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs setTransferType(String transferType) {
            this.transferType = transferType;
            return this;
        }
        public String getTransferType() {
            return this.transferType;
        }

    }

    public static class TrainNoListSearchResponseBodyModule extends TeaModel {
        @NameInMap("train_station_search_v_o_s")
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOS> trainStationSearchVOS;

        @NameInMap("train_transfer_station_search_v_os")
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs> trainTransferStationSearchVOs;

        public static TrainNoListSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchResponseBodyModule self = new TrainNoListSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchResponseBodyModule setTrainStationSearchVOS(java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOS> trainStationSearchVOS) {
            this.trainStationSearchVOS = trainStationSearchVOS;
            return this;
        }
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainStationSearchVOS> getTrainStationSearchVOS() {
            return this.trainStationSearchVOS;
        }

        public TrainNoListSearchResponseBodyModule setTrainTransferStationSearchVOs(java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs> trainTransferStationSearchVOs) {
            this.trainTransferStationSearchVOs = trainTransferStationSearchVOs;
            return this;
        }
        public java.util.List<TrainNoListSearchResponseBodyModuleTrainTransferStationSearchVOs> getTrainTransferStationSearchVOs() {
            return this.trainTransferStationSearchVOs;
        }

    }

}
