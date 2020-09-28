// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetSummaryReportChartResponse extends TeaModel {
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

    @NameInMap("SummaryLineChartDataRsp")
    @Validation(required = true)
    public GetSummaryReportChartResponseSummaryLineChartDataRsp summaryLineChartDataRsp;

    public static GetSummaryReportChartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryReportChartResponse self = new GetSummaryReportChartResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryReportChartResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSummaryReportChartResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryReportChartResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSummaryReportChartResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSummaryReportChartResponse setSummaryLineChartDataRsp(GetSummaryReportChartResponseSummaryLineChartDataRsp summaryLineChartDataRsp) {
        this.summaryLineChartDataRsp = summaryLineChartDataRsp;
        return this;
    }
    public GetSummaryReportChartResponseSummaryLineChartDataRsp getSummaryLineChartDataRsp() {
        return this.summaryLineChartDataRsp;
    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList self = new GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList self = new GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList self = new GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList self = new GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData extends TeaModel {
        @NameInMap("MultipleScoreList")
        @Validation(required = true)
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList> multipleScoreList;

        @NameInMap("OperationRateList")
        @Validation(required = true)
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList> operationRateList;

        @NameInMap("PerformMetricsList")
        @Validation(required = true)
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList> performMetricsList;

        @NameInMap("ValidOperationRateList")
        @Validation(required = true)
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList> validOperationRateList;

        public static GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData self = new GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData setMultipleScoreList(java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList> multipleScoreList) {
            this.multipleScoreList = multipleScoreList;
            return this;
        }
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataMultipleScoreList> getMultipleScoreList() {
            return this.multipleScoreList;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData setOperationRateList(java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList> operationRateList) {
            this.operationRateList = operationRateList;
            return this;
        }
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataOperationRateList> getOperationRateList() {
            return this.operationRateList;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData setPerformMetricsList(java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList> performMetricsList) {
            this.performMetricsList = performMetricsList;
            return this;
        }
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataPerformMetricsList> getPerformMetricsList() {
            return this.performMetricsList;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData setValidOperationRateList(java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList> validOperationRateList) {
            this.validOperationRateList = validOperationRateList;
            return this;
        }
        public java.util.List<GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartDataValidOperationRateList> getValidOperationRateList() {
            return this.validOperationRateList;
        }

    }

    public static class GetSummaryReportChartResponseSummaryLineChartDataRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("SummaryLineChartData")
        @Validation(required = true)
        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData summaryLineChartData;

        public static GetSummaryReportChartResponseSummaryLineChartDataRsp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportChartResponseSummaryLineChartDataRsp self = new GetSummaryReportChartResponseSummaryLineChartDataRsp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetSummaryReportChartResponseSummaryLineChartDataRsp setSummaryLineChartData(GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData summaryLineChartData) {
            this.summaryLineChartData = summaryLineChartData;
            return this;
        }
        public GetSummaryReportChartResponseSummaryLineChartDataRspSummaryLineChartData getSummaryLineChartData() {
            return this.summaryLineChartData;
        }

    }

}
