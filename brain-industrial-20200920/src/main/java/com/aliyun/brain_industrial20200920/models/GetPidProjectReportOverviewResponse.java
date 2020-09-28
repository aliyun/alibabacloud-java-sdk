// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidProjectReportOverviewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetPidProjectReportOverviewResponseData data;

    public static GetPidProjectReportOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPidProjectReportOverviewResponse self = new GetPidProjectReportOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetPidProjectReportOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPidProjectReportOverviewResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPidProjectReportOverviewResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPidProjectReportOverviewResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPidProjectReportOverviewResponse setData(GetPidProjectReportOverviewResponseData data) {
        this.data = data;
        return this;
    }
    public GetPidProjectReportOverviewResponseData getData() {
        return this.data;
    }

    public static class GetPidProjectReportOverviewResponseDataAllPerformMetricsList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataAllPerformMetricsList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataAllPerformMetricsList self = new GetPidProjectReportOverviewResponseDataAllPerformMetricsList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataAllPerformMetricsList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataAllPerformMetricsList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataKeyPerformMetricsList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataKeyPerformMetricsList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataKeyPerformMetricsList self = new GetPidProjectReportOverviewResponseDataKeyPerformMetricsList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataKeyPerformMetricsList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataKeyPerformMetricsList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataAllOperationRateList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataAllOperationRateList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataAllOperationRateList self = new GetPidProjectReportOverviewResponseDataAllOperationRateList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataAllOperationRateList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataAllOperationRateList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataKeyOperationRateList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataKeyOperationRateList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataKeyOperationRateList self = new GetPidProjectReportOverviewResponseDataKeyOperationRateList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataKeyOperationRateList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataKeyOperationRateList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataLoopScoreList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataLoopScoreList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataLoopScoreList self = new GetPidProjectReportOverviewResponseDataLoopScoreList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataLoopScoreList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataLoopScoreList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataLoopOperationRateList extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public String xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public String ylabel;

        public static GetPidProjectReportOverviewResponseDataLoopOperationRateList build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataLoopOperationRateList self = new GetPidProjectReportOverviewResponseDataLoopOperationRateList();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataLoopOperationRateList setXlabel(String xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public String getXlabel() {
            return this.xlabel;
        }

        public GetPidProjectReportOverviewResponseDataLoopOperationRateList setYlabel(String ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public String getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataStatusAll extends TeaModel {
        @NameInMap("Best")
        @Validation(required = true)
        public Long best;

        @NameInMap("Good")
        @Validation(required = true)
        public Long good;

        @NameInMap("Middle")
        @Validation(required = true)
        public Long middle;

        @NameInMap("Bad")
        @Validation(required = true)
        public Long bad;

        @NameInMap("OpenLoop")
        @Validation(required = true)
        public Long openLoop;

        public static GetPidProjectReportOverviewResponseDataStatusAll build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataStatusAll self = new GetPidProjectReportOverviewResponseDataStatusAll();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataStatusAll setBest(Long best) {
            this.best = best;
            return this;
        }
        public Long getBest() {
            return this.best;
        }

        public GetPidProjectReportOverviewResponseDataStatusAll setGood(Long good) {
            this.good = good;
            return this;
        }
        public Long getGood() {
            return this.good;
        }

        public GetPidProjectReportOverviewResponseDataStatusAll setMiddle(Long middle) {
            this.middle = middle;
            return this;
        }
        public Long getMiddle() {
            return this.middle;
        }

        public GetPidProjectReportOverviewResponseDataStatusAll setBad(Long bad) {
            this.bad = bad;
            return this;
        }
        public Long getBad() {
            return this.bad;
        }

        public GetPidProjectReportOverviewResponseDataStatusAll setOpenLoop(Long openLoop) {
            this.openLoop = openLoop;
            return this;
        }
        public Long getOpenLoop() {
            return this.openLoop;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataStatusKey extends TeaModel {
        @NameInMap("Best")
        @Validation(required = true)
        public Long best;

        @NameInMap("Good")
        @Validation(required = true)
        public Long good;

        @NameInMap("Middle")
        @Validation(required = true)
        public Long middle;

        @NameInMap("Bad")
        @Validation(required = true)
        public Long bad;

        @NameInMap("OpenLoop")
        @Validation(required = true)
        public Long openLoop;

        public static GetPidProjectReportOverviewResponseDataStatusKey build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataStatusKey self = new GetPidProjectReportOverviewResponseDataStatusKey();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataStatusKey setBest(Long best) {
            this.best = best;
            return this;
        }
        public Long getBest() {
            return this.best;
        }

        public GetPidProjectReportOverviewResponseDataStatusKey setGood(Long good) {
            this.good = good;
            return this;
        }
        public Long getGood() {
            return this.good;
        }

        public GetPidProjectReportOverviewResponseDataStatusKey setMiddle(Long middle) {
            this.middle = middle;
            return this;
        }
        public Long getMiddle() {
            return this.middle;
        }

        public GetPidProjectReportOverviewResponseDataStatusKey setBad(Long bad) {
            this.bad = bad;
            return this;
        }
        public Long getBad() {
            return this.bad;
        }

        public GetPidProjectReportOverviewResponseDataStatusKey setOpenLoop(Long openLoop) {
            this.openLoop = openLoop;
            return this;
        }
        public Long getOpenLoop() {
            return this.openLoop;
        }

    }

    public static class GetPidProjectReportOverviewResponseDataStatus extends TeaModel {
        @NameInMap("All")
        @Validation(required = true)
        public GetPidProjectReportOverviewResponseDataStatusAll all;

        @NameInMap("Key")
        @Validation(required = true)
        public GetPidProjectReportOverviewResponseDataStatusKey key;

        public static GetPidProjectReportOverviewResponseDataStatus build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseDataStatus self = new GetPidProjectReportOverviewResponseDataStatus();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseDataStatus setAll(GetPidProjectReportOverviewResponseDataStatusAll all) {
            this.all = all;
            return this;
        }
        public GetPidProjectReportOverviewResponseDataStatusAll getAll() {
            return this.all;
        }

        public GetPidProjectReportOverviewResponseDataStatus setKey(GetPidProjectReportOverviewResponseDataStatusKey key) {
            this.key = key;
            return this;
        }
        public GetPidProjectReportOverviewResponseDataStatusKey getKey() {
            return this.key;
        }

    }

    public static class GetPidProjectReportOverviewResponseData extends TeaModel {
        @NameInMap("PerformMetrics")
        @Validation(required = true)
        public Float performMetrics;

        @NameInMap("OperationRate")
        @Validation(required = true)
        public Long operationRate;

        @NameInMap("AllPerformMetricsList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataAllPerformMetricsList> allPerformMetricsList;

        @NameInMap("KeyPerformMetricsList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataKeyPerformMetricsList> keyPerformMetricsList;

        @NameInMap("AllOperationRateList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataAllOperationRateList> allOperationRateList;

        @NameInMap("KeyOperationRateList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataKeyOperationRateList> keyOperationRateList;

        @NameInMap("LoopScoreList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataLoopScoreList> loopScoreList;

        @NameInMap("LoopOperationRateList")
        @Validation(required = true)
        public java.util.List<GetPidProjectReportOverviewResponseDataLoopOperationRateList> loopOperationRateList;

        @NameInMap("Status")
        @Validation(required = true)
        public GetPidProjectReportOverviewResponseDataStatus status;

        public static GetPidProjectReportOverviewResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPidProjectReportOverviewResponseData self = new GetPidProjectReportOverviewResponseData();
            return TeaModel.build(map, self);
        }

        public GetPidProjectReportOverviewResponseData setPerformMetrics(Float performMetrics) {
            this.performMetrics = performMetrics;
            return this;
        }
        public Float getPerformMetrics() {
            return this.performMetrics;
        }

        public GetPidProjectReportOverviewResponseData setOperationRate(Long operationRate) {
            this.operationRate = operationRate;
            return this;
        }
        public Long getOperationRate() {
            return this.operationRate;
        }

        public GetPidProjectReportOverviewResponseData setAllPerformMetricsList(java.util.List<GetPidProjectReportOverviewResponseDataAllPerformMetricsList> allPerformMetricsList) {
            this.allPerformMetricsList = allPerformMetricsList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataAllPerformMetricsList> getAllPerformMetricsList() {
            return this.allPerformMetricsList;
        }

        public GetPidProjectReportOverviewResponseData setKeyPerformMetricsList(java.util.List<GetPidProjectReportOverviewResponseDataKeyPerformMetricsList> keyPerformMetricsList) {
            this.keyPerformMetricsList = keyPerformMetricsList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataKeyPerformMetricsList> getKeyPerformMetricsList() {
            return this.keyPerformMetricsList;
        }

        public GetPidProjectReportOverviewResponseData setAllOperationRateList(java.util.List<GetPidProjectReportOverviewResponseDataAllOperationRateList> allOperationRateList) {
            this.allOperationRateList = allOperationRateList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataAllOperationRateList> getAllOperationRateList() {
            return this.allOperationRateList;
        }

        public GetPidProjectReportOverviewResponseData setKeyOperationRateList(java.util.List<GetPidProjectReportOverviewResponseDataKeyOperationRateList> keyOperationRateList) {
            this.keyOperationRateList = keyOperationRateList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataKeyOperationRateList> getKeyOperationRateList() {
            return this.keyOperationRateList;
        }

        public GetPidProjectReportOverviewResponseData setLoopScoreList(java.util.List<GetPidProjectReportOverviewResponseDataLoopScoreList> loopScoreList) {
            this.loopScoreList = loopScoreList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataLoopScoreList> getLoopScoreList() {
            return this.loopScoreList;
        }

        public GetPidProjectReportOverviewResponseData setLoopOperationRateList(java.util.List<GetPidProjectReportOverviewResponseDataLoopOperationRateList> loopOperationRateList) {
            this.loopOperationRateList = loopOperationRateList;
            return this;
        }
        public java.util.List<GetPidProjectReportOverviewResponseDataLoopOperationRateList> getLoopOperationRateList() {
            return this.loopOperationRateList;
        }

        public GetPidProjectReportOverviewResponseData setStatus(GetPidProjectReportOverviewResponseDataStatus status) {
            this.status = status;
            return this;
        }
        public GetPidProjectReportOverviewResponseDataStatus getStatus() {
            return this.status;
        }

    }

}
