// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelExceedApplyQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelExceedApplyQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>E03779E6-71C2-5082-ABE3-6315B8247EE8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelExceedApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelExceedApplyQueryResponseBody self = new HotelExceedApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelExceedApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelExceedApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelExceedApplyQueryResponseBody setModule(HotelExceedApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelExceedApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public HotelExceedApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelExceedApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelExceedApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-07-08</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>2021-07-08</p>
         */
        @NameInMap("check_out")
        public String checkOut;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("together")
        public Boolean together;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("type")
        public Integer type;

        public static HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo self = new HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo();
            return TeaModel.build(map, self);
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setTogether(Boolean together) {
            this.together = together;
            return this;
        }
        public Boolean getTogether() {
            return this.together;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class HotelExceedApplyQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>27238197</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_do")
        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo;

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
         * <p>16</p>
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
         * <p>2022-02-11T16:25Z</p>
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
         * <p>test_corp</p>
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

        public static HotelExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelExceedApplyQueryResponseBodyModule self = new HotelExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public HotelExceedApplyQueryResponseBodyModule setApplyIntentionInfoDo(HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo) {
            this.applyIntentionInfoDo = applyIntentionInfoDo;
            return this;
        }
        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
        }

        public HotelExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public HotelExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public HotelExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public HotelExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public HotelExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public HotelExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public HotelExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public HotelExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HotelExceedApplyQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
