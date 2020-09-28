// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetSummaryReportDataTrendResponse extends TeaModel {
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

    @NameInMap("SummaryTrendData")
    @Validation(required = true)
    public GetSummaryReportDataTrendResponseSummaryTrendData summaryTrendData;

    public static GetSummaryReportDataTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryReportDataTrendResponse self = new GetSummaryReportDataTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryReportDataTrendResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSummaryReportDataTrendResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryReportDataTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSummaryReportDataTrendResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSummaryReportDataTrendResponse setSummaryTrendData(GetSummaryReportDataTrendResponseSummaryTrendData summaryTrendData) {
        this.summaryTrendData = summaryTrendData;
        return this;
    }
    public GetSummaryReportDataTrendResponseSummaryTrendData getSummaryTrendData() {
        return this.summaryTrendData;
    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 self = new GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataDataOp extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataDataOp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataDataOp self = new GetSummaryReportDataTrendResponseSummaryTrendDataDataOp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 self = new GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataDataPv extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataDataPv build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataDataPv self = new GetSummaryReportDataTrendResponseSummaryTrendDataDataPv();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataDataSp extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataDataSp build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataDataSp self = new GetSummaryReportDataTrendResponseSummaryTrendDataDataSp();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataSp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataSp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataDataSp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendDataData extends TeaModel {
        @NameInMap("Op2")
        @Validation(required = true)
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2> op2;

        @NameInMap("Op")
        @Validation(required = true)
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp> op;

        @NameInMap("Op1")
        @Validation(required = true)
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1> op1;

        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataPv> pv;

        @NameInMap("Sp")
        @Validation(required = true)
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataSp> sp;

        public static GetSummaryReportDataTrendResponseSummaryTrendDataData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendDataData self = new GetSummaryReportDataTrendResponseSummaryTrendDataData();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataData setOp2(java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2> op2) {
            this.op2 = op2;
            return this;
        }
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp2> getOp2() {
            return this.op2;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataData setOp(java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp> op) {
            this.op = op;
            return this;
        }
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp> getOp() {
            return this.op;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataData setOp1(java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1> op1) {
            this.op1 = op1;
            return this;
        }
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataOp1> getOp1() {
            return this.op1;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataData setPv(java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataPv> getPv() {
            return this.pv;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendDataData setSp(java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataSp> sp) {
            this.sp = sp;
            return this;
        }
        public java.util.List<GetSummaryReportDataTrendResponseSummaryTrendDataDataSp> getSp() {
            return this.sp;
        }

    }

    public static class GetSummaryReportDataTrendResponseSummaryTrendData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Data")
        @Validation(required = true)
        public GetSummaryReportDataTrendResponseSummaryTrendDataData data;

        public static GetSummaryReportDataTrendResponseSummaryTrendData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryReportDataTrendResponseSummaryTrendData self = new GetSummaryReportDataTrendResponseSummaryTrendData();
            return TeaModel.build(map, self);
        }

        public GetSummaryReportDataTrendResponseSummaryTrendData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetSummaryReportDataTrendResponseSummaryTrendData setData(GetSummaryReportDataTrendResponseSummaryTrendDataData data) {
            this.data = data;
            return this;
        }
        public GetSummaryReportDataTrendResponseSummaryTrendDataData getData() {
            return this.data;
        }

    }

}
