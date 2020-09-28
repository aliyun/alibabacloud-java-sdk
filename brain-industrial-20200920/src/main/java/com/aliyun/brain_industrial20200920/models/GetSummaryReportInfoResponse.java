// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetSummaryReportInfoResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("SummaryResultRsp")
    @Validation(required = true)
    public GetSummaryReportInfoResponseSummaryResultRsp summaryResultRsp;

    public static GetSummaryReportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryReportInfoResponse self = new GetSummaryReportInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryReportInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSummaryReportInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryReportInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSummaryReportInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSummaryReportInfoResponse setSummaryResultRsp(GetSummaryReportInfoResponseSummaryResultRsp summaryResultRsp) {
        this.summaryResultRsp = summaryResultRsp;
        return this;
    }
    public GetSummaryReportInfoResponseSummaryResultRsp getSummaryResultRsp() {
        return this.summaryResultRsp;
    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex extends TeaModel {
        @NameInMap("Average")
        @Validation(required = true)
        public String average;

        @NameInMap("Best")
        @Validation(required = true)
        public String best;

        @NameInMap("Worst")
        @Validation(required = true)
        public String worst;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex setBest(String best) {
            this.best = best;
            return this;
        }
        public String getBest() {
            return this.best;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex setWorst(String worst) {
            this.worst = worst;
            return this;
        }
        public String getWorst() {
            return this.worst;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRspSummaryResultData extends TeaModel {
        @NameInMap("LoopName")
        @Validation(required = true)
        public String loopName;

        @NameInMap("MultipleScoreIndexRsp")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp multipleScoreIndexRsp;

        @NameInMap("MultipleScoreRsp")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp multipleScoreRsp;

        @NameInMap("OperationRate")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate operationRate;

        @NameInMap("OscillationIndex")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex oscillationIndex;

        @NameInMap("PerformMetrics")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics performMetrics;

        @NameInMap("ValidOperationRate")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate validOperationRate;

        @NameInMap("ValveStickIndex")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex valveStickIndex;

        public static GetSummaryReportInfoResponseSummaryResultRspSummaryResultData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRspSummaryResultData self = new GetSummaryReportInfoResponseSummaryResultRspSummaryResultData();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setLoopName(String loopName) {
            this.loopName = loopName;
            return this;
        }
        public String getLoopName() {
            return this.loopName;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setMultipleScoreIndexRsp(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp multipleScoreIndexRsp) {
            this.multipleScoreIndexRsp = multipleScoreIndexRsp;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreIndexRsp getMultipleScoreIndexRsp() {
            return this.multipleScoreIndexRsp;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setMultipleScoreRsp(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp multipleScoreRsp) {
            this.multipleScoreRsp = multipleScoreRsp;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataMultipleScoreRsp getMultipleScoreRsp() {
            return this.multipleScoreRsp;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setOperationRate(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate operationRate) {
            this.operationRate = operationRate;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOperationRate getOperationRate() {
            return this.operationRate;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setOscillationIndex(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex oscillationIndex) {
            this.oscillationIndex = oscillationIndex;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataOscillationIndex getOscillationIndex() {
            return this.oscillationIndex;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setPerformMetrics(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics performMetrics) {
            this.performMetrics = performMetrics;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataPerformMetrics getPerformMetrics() {
            return this.performMetrics;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setValidOperationRate(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate validOperationRate) {
            this.validOperationRate = validOperationRate;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValidOperationRate getValidOperationRate() {
            return this.validOperationRate;
        }

        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData setValveStickIndex(GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex valveStickIndex) {
            this.valveStickIndex = valveStickIndex;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultDataValveStickIndex getValveStickIndex() {
            return this.valveStickIndex;
        }

    }

    public static class GetSummaryReportInfoResponseSummaryResultRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("SummaryResultData")
        @Validation(required = true)
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData summaryResultData;

        public static GetSummaryReportInfoResponseSummaryResultRsp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportInfoResponseSummaryResultRsp self = new GetSummaryReportInfoResponseSummaryResultRsp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportInfoResponseSummaryResultRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetSummaryReportInfoResponseSummaryResultRsp setSummaryResultData(GetSummaryReportInfoResponseSummaryResultRspSummaryResultData summaryResultData) {
            this.summaryResultData = summaryResultData;
            return this;
        }
        public GetSummaryReportInfoResponseSummaryResultRspSummaryResultData getSummaryResultData() {
            return this.summaryResultData;
        }

    }

}
