// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportPidParamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DayPidParamRsp")
    @Validation(required = true)
    public GetDailyReportPidParamResponseDayPidParamRsp dayPidParamRsp;

    public static GetDailyReportPidParamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportPidParamResponse self = new GetDailyReportPidParamResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyReportPidParamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDailyReportPidParamResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyReportPidParamResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyReportPidParamResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDailyReportPidParamResponse setDayPidParamRsp(GetDailyReportPidParamResponseDayPidParamRsp dayPidParamRsp) {
        this.dayPidParamRsp = dayPidParamRsp;
        return this;
    }
    public GetDailyReportPidParamResponseDayPidParamRsp getDayPidParamRsp() {
        return this.dayPidParamRsp;
    }

    public static class GetDailyReportPidParamResponseDayPidParamRspDayPidParam extends TeaModel {
        @NameInMap("Kp")
        @Validation(required = true)
        public Float kp;

        @NameInMap("Ti")
        @Validation(required = true)
        public Float ti;

        @NameInMap("Td")
        @Validation(required = true)
        public Float td;

        @NameInMap("RecommendIndex")
        @Validation(required = true)
        public Float recommendIndex;

        public static GetDailyReportPidParamResponseDayPidParamRspDayPidParam build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportPidParamResponseDayPidParamRspDayPidParam self = new GetDailyReportPidParamResponseDayPidParamRspDayPidParam();
            return TeaModel.build(map, self);
        }

        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam setKp(Float kp) {
            this.kp = kp;
            return this;
        }
        public Float getKp() {
            return this.kp;
        }

        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam setTi(Float ti) {
            this.ti = ti;
            return this;
        }
        public Float getTi() {
            return this.ti;
        }

        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam setTd(Float td) {
            this.td = td;
            return this;
        }
        public Float getTd() {
            return this.td;
        }

        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam setRecommendIndex(Float recommendIndex) {
            this.recommendIndex = recommendIndex;
            return this;
        }
        public Float getRecommendIndex() {
            return this.recommendIndex;
        }

    }

    public static class GetDailyReportPidParamResponseDayPidParamRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("DayPidParam")
        @Validation(required = true)
        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam dayPidParam;

        public static GetDailyReportPidParamResponseDayPidParamRsp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportPidParamResponseDayPidParamRsp self = new GetDailyReportPidParamResponseDayPidParamRsp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportPidParamResponseDayPidParamRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDailyReportPidParamResponseDayPidParamRsp setDayPidParam(GetDailyReportPidParamResponseDayPidParamRspDayPidParam dayPidParam) {
            this.dayPidParam = dayPidParam;
            return this;
        }
        public GetDailyReportPidParamResponseDayPidParamRspDayPidParam getDayPidParam() {
            return this.dayPidParam;
        }

    }

}
