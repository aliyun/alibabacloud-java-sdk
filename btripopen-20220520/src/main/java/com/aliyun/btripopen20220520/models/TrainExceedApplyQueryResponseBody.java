// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainExceedApplyQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainExceedApplyQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>BE3FBA15-C5E1-5B99-8120-9FB84A04FB81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>2022-02-24T09:55Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_station")
        public String depStation;

        /**
         * <strong>example:</strong>
         * <p>2022-02-24T09:55Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        /**
         * <strong>example:</strong>
         * <p>G39</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type_desc")
        public String trainTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>apply1</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_d_o")
        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO applyIntentionInfoDO;

        @NameInMap("btrip_cause")
        public String btripCause;

        /**
         * <strong>example:</strong>
         * <p>corp1</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("exceed_type")
        public Integer exceedType;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("origin_standard")
        public String originStandard;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2022-02-24T09:55Z</p>
         */
        @NameInMap("submit_time")
        public String submitTime;

        /**
         * <strong>example:</strong>
         * <p>0001A1100000007EX08O</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>testcorp1</p>
         */
        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
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
