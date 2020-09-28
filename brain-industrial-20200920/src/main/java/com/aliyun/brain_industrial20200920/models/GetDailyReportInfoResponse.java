// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportInfoResponse extends TeaModel {
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

    @NameInMap("DayResultRsp")
    @Validation(required = true)
    public GetDailyReportInfoResponseDayResultRsp dayResultRsp;

    public static GetDailyReportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportInfoResponse self = new GetDailyReportInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyReportInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDailyReportInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyReportInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyReportInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDailyReportInfoResponse setDayResultRsp(GetDailyReportInfoResponseDayResultRsp dayResultRsp) {
        this.dayResultRsp = dayResultRsp;
        return this;
    }
    public GetDailyReportInfoResponseDayResultRsp getDayResultRsp() {
        return this.dayResultRsp;
    }

    public static class GetDailyReportInfoResponseDayResultRspDayResultData extends TeaModel {
        @NameInMap("LoopName")
        @Validation(required = true)
        public String loopName;

        @NameInMap("ReportDate")
        @Validation(required = true)
        public String reportDate;

        @NameInMap("MultipleScore")
        @Validation(required = true)
        public String multipleScore;

        @NameInMap("PerformMetrics")
        @Validation(required = true)
        public String performMetrics;

        @NameInMap("MultipleScoreIndex")
        @Validation(required = true)
        public String multipleScoreIndex;

        @NameInMap("OperationRate")
        @Validation(required = true)
        public String operationRate;

        @NameInMap("ValidOperationRate")
        @Validation(required = true)
        public String validOperationRate;

        @NameInMap("OscillationIndex")
        @Validation(required = true)
        public String oscillationIndex;

        @NameInMap("ValveStickIndex")
        @Validation(required = true)
        public String valveStickIndex;

        @NameInMap("PvMean")
        @Validation(required = true)
        public String pvMean;

        @NameInMap("PvStd")
        @Validation(required = true)
        public String pvStd;

        @NameInMap("PvMax")
        @Validation(required = true)
        public String pvMax;

        @NameInMap("PvMin")
        @Validation(required = true)
        public String pvMin;

        @NameInMap("ErrMean")
        @Validation(required = true)
        public String errMean;

        @NameInMap("ErrStd")
        @Validation(required = true)
        public String errStd;

        @NameInMap("ErrMax")
        @Validation(required = true)
        public String errMax;

        @NameInMap("ErrMin")
        @Validation(required = true)
        public String errMin;

        @NameInMap("OpMean")
        @Validation(required = true)
        public String opMean;

        @NameInMap("OpStd")
        @Validation(required = true)
        public String opStd;

        @NameInMap("OpMax")
        @Validation(required = true)
        public String opMax;

        @NameInMap("OpMin")
        @Validation(required = true)
        public String opMin;

        @NameInMap("LoopTrans")
        @Validation(required = true)
        public String loopTrans;

        @NameInMap("SpCross")
        @Validation(required = true)
        public String spCross;

        @NameInMap("OpTurn")
        @Validation(required = true)
        public String opTurn;

        @NameInMap("OpSum")
        @Validation(required = true)
        public String opSum;

        @NameInMap("GoodRate")
        @Validation(required = true)
        public String goodRate;

        @NameInMap("SatuRate")
        @Validation(required = true)
        public String satuRate;

        public static GetDailyReportInfoResponseDayResultRspDayResultData build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportInfoResponseDayResultRspDayResultData self = new GetDailyReportInfoResponseDayResultRspDayResultData();
            return TeaModel.build(map, self);
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setLoopName(String loopName) {
            this.loopName = loopName;
            return this;
        }
        public String getLoopName() {
            return this.loopName;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public String getReportDate() {
            return this.reportDate;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setMultipleScore(String multipleScore) {
            this.multipleScore = multipleScore;
            return this;
        }
        public String getMultipleScore() {
            return this.multipleScore;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setPerformMetrics(String performMetrics) {
            this.performMetrics = performMetrics;
            return this;
        }
        public String getPerformMetrics() {
            return this.performMetrics;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setMultipleScoreIndex(String multipleScoreIndex) {
            this.multipleScoreIndex = multipleScoreIndex;
            return this;
        }
        public String getMultipleScoreIndex() {
            return this.multipleScoreIndex;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOperationRate(String operationRate) {
            this.operationRate = operationRate;
            return this;
        }
        public String getOperationRate() {
            return this.operationRate;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setValidOperationRate(String validOperationRate) {
            this.validOperationRate = validOperationRate;
            return this;
        }
        public String getValidOperationRate() {
            return this.validOperationRate;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOscillationIndex(String oscillationIndex) {
            this.oscillationIndex = oscillationIndex;
            return this;
        }
        public String getOscillationIndex() {
            return this.oscillationIndex;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setValveStickIndex(String valveStickIndex) {
            this.valveStickIndex = valveStickIndex;
            return this;
        }
        public String getValveStickIndex() {
            return this.valveStickIndex;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setPvMean(String pvMean) {
            this.pvMean = pvMean;
            return this;
        }
        public String getPvMean() {
            return this.pvMean;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setPvStd(String pvStd) {
            this.pvStd = pvStd;
            return this;
        }
        public String getPvStd() {
            return this.pvStd;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setPvMax(String pvMax) {
            this.pvMax = pvMax;
            return this;
        }
        public String getPvMax() {
            return this.pvMax;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setPvMin(String pvMin) {
            this.pvMin = pvMin;
            return this;
        }
        public String getPvMin() {
            return this.pvMin;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setErrMean(String errMean) {
            this.errMean = errMean;
            return this;
        }
        public String getErrMean() {
            return this.errMean;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setErrStd(String errStd) {
            this.errStd = errStd;
            return this;
        }
        public String getErrStd() {
            return this.errStd;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setErrMax(String errMax) {
            this.errMax = errMax;
            return this;
        }
        public String getErrMax() {
            return this.errMax;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setErrMin(String errMin) {
            this.errMin = errMin;
            return this;
        }
        public String getErrMin() {
            return this.errMin;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpMean(String opMean) {
            this.opMean = opMean;
            return this;
        }
        public String getOpMean() {
            return this.opMean;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpStd(String opStd) {
            this.opStd = opStd;
            return this;
        }
        public String getOpStd() {
            return this.opStd;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpMax(String opMax) {
            this.opMax = opMax;
            return this;
        }
        public String getOpMax() {
            return this.opMax;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpMin(String opMin) {
            this.opMin = opMin;
            return this;
        }
        public String getOpMin() {
            return this.opMin;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setLoopTrans(String loopTrans) {
            this.loopTrans = loopTrans;
            return this;
        }
        public String getLoopTrans() {
            return this.loopTrans;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setSpCross(String spCross) {
            this.spCross = spCross;
            return this;
        }
        public String getSpCross() {
            return this.spCross;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpTurn(String opTurn) {
            this.opTurn = opTurn;
            return this;
        }
        public String getOpTurn() {
            return this.opTurn;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setOpSum(String opSum) {
            this.opSum = opSum;
            return this;
        }
        public String getOpSum() {
            return this.opSum;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setGoodRate(String goodRate) {
            this.goodRate = goodRate;
            return this;
        }
        public String getGoodRate() {
            return this.goodRate;
        }

        public GetDailyReportInfoResponseDayResultRspDayResultData setSatuRate(String satuRate) {
            this.satuRate = satuRate;
            return this;
        }
        public String getSatuRate() {
            return this.satuRate;
        }

    }

    public static class GetDailyReportInfoResponseDayResultRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("DayResultData")
        @Validation(required = true)
        public GetDailyReportInfoResponseDayResultRspDayResultData dayResultData;

        public static GetDailyReportInfoResponseDayResultRsp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportInfoResponseDayResultRsp self = new GetDailyReportInfoResponseDayResultRsp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportInfoResponseDayResultRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDailyReportInfoResponseDayResultRsp setDayResultData(GetDailyReportInfoResponseDayResultRspDayResultData dayResultData) {
            this.dayResultData = dayResultData;
            return this;
        }
        public GetDailyReportInfoResponseDayResultRspDayResultData getDayResultData() {
            return this.dayResultData;
        }

    }

}
