// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainExceedApplyQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainExceedApplyQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static TrainExceedApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainExceedApplyQueryResponseBody self = new TrainExceedApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainExceedApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainExceedApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainExceedApplyQueryResponseBody setModule(TrainExceedApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainExceedApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TrainExceedApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainExceedApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainExceedApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_station")
        public String depStation;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type_desc")
        public String trainTypeDesc;

        @NameInMap("type")
        public Integer type;

        public static TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO build(java.util.Map<String, ?> map) throws Exception {
            TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO self = new TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO();
            return TeaModel.build(map, self);
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepStation(String depStation) {
            this.depStation = depStation;
            return this;
        }
        public String getDepStation() {
            return this.depStation;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setTrainTypeDesc(String trainTypeDesc) {
            this.trainTypeDesc = trainTypeDesc;
            return this;
        }
        public String getTrainTypeDesc() {
            return this.trainTypeDesc;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TrainExceedApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_d_o")
        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO applyIntentionInfoDO;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("exceed_type")
        public Integer exceedType;

        @NameInMap("origin_standard")
        public String originStandard;

        @NameInMap("status")
        public Integer status;

        @NameInMap("submit_time")
        public String submitTime;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static TrainExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainExceedApplyQueryResponseBodyModule self = new TrainExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public TrainExceedApplyQueryResponseBodyModule setApplyIntentionInfoDO(TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO applyIntentionInfoDO) {
            this.applyIntentionInfoDO = applyIntentionInfoDO;
            return this;
        }
        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO getApplyIntentionInfoDO() {
            return this.applyIntentionInfoDO;
        }

        public TrainExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public TrainExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public TrainExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public TrainExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public TrainExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TrainExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public TrainExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public TrainExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public TrainExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainExceedApplyQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
