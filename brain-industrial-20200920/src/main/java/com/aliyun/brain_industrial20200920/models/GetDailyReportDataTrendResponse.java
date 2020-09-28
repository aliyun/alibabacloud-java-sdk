// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportDataTrendResponse extends TeaModel {
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

    @NameInMap("TagsValuesRsp")
    @Validation(required = true)
    public GetDailyReportDataTrendResponseTagsValuesRsp tagsValuesRsp;

    public static GetDailyReportDataTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportDataTrendResponse self = new GetDailyReportDataTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyReportDataTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDailyReportDataTrendResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyReportDataTrendResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyReportDataTrendResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDailyReportDataTrendResponse setTagsValuesRsp(GetDailyReportDataTrendResponseTagsValuesRsp tagsValuesRsp) {
        this.tagsValuesRsp = tagsValuesRsp;
        return this;
    }
    public GetDailyReportDataTrendResponseTagsValuesRsp getTagsValuesRsp() {
        return this.tagsValuesRsp;
    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspDataOp extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportDataTrendResponseTagsValuesRspDataOp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspDataOp self = new GetDailyReportDataTrendResponseTagsValuesRspDataOp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspDataOp1 extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportDataTrendResponseTagsValuesRspDataOp1 build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspDataOp1 self = new GetDailyReportDataTrendResponseTagsValuesRspDataOp1();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp1 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp1 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp1 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspDataOp2 extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportDataTrendResponseTagsValuesRspDataOp2 build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspDataOp2 self = new GetDailyReportDataTrendResponseTagsValuesRspDataOp2();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp2 setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp2 setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataOp2 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspDataSp extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportDataTrendResponseTagsValuesRspDataSp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspDataSp self = new GetDailyReportDataTrendResponseTagsValuesRspDataSp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataSp setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataSp setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataSp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspDataPv extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportDataTrendResponseTagsValuesRspDataPv build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspDataPv self = new GetDailyReportDataTrendResponseTagsValuesRspDataPv();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataPv setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataPv setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspDataPv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRspData extends TeaModel {
        @NameInMap("Op")
        @Validation(required = true)
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp> op;

        @NameInMap("Op1")
        @Validation(required = true)
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp1> op1;

        @NameInMap("Op2")
        @Validation(required = true)
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp2> op2;

        @NameInMap("Sp")
        @Validation(required = true)
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataSp> sp;

        @NameInMap("Pv")
        @Validation(required = true)
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataPv> pv;

        public static GetDailyReportDataTrendResponseTagsValuesRspData build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRspData self = new GetDailyReportDataTrendResponseTagsValuesRspData();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRspData setOp(java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp> op) {
            this.op = op;
            return this;
        }
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp> getOp() {
            return this.op;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspData setOp1(java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp1> op1) {
            this.op1 = op1;
            return this;
        }
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp1> getOp1() {
            return this.op1;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspData setOp2(java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp2> op2) {
            this.op2 = op2;
            return this;
        }
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataOp2> getOp2() {
            return this.op2;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspData setSp(java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataSp> sp) {
            this.sp = sp;
            return this;
        }
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataSp> getSp() {
            return this.sp;
        }

        public GetDailyReportDataTrendResponseTagsValuesRspData setPv(java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataPv> pv) {
            this.pv = pv;
            return this;
        }
        public java.util.List<GetDailyReportDataTrendResponseTagsValuesRspDataPv> getPv() {
            return this.pv;
        }

    }

    public static class GetDailyReportDataTrendResponseTagsValuesRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Data")
        @Validation(required = true)
        public GetDailyReportDataTrendResponseTagsValuesRspData data;

        public static GetDailyReportDataTrendResponseTagsValuesRsp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportDataTrendResponseTagsValuesRsp self = new GetDailyReportDataTrendResponseTagsValuesRsp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportDataTrendResponseTagsValuesRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDailyReportDataTrendResponseTagsValuesRsp setData(GetDailyReportDataTrendResponseTagsValuesRspData data) {
            this.data = data;
            return this;
        }
        public GetDailyReportDataTrendResponseTagsValuesRspData getData() {
            return this.data;
        }

    }

}
