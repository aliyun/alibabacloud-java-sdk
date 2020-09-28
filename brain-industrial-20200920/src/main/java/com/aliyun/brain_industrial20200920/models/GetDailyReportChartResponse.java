// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportChartResponse extends TeaModel {
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

    @NameInMap("DayLineChartDataRsp")
    @Validation(required = true)
    public GetDailyReportChartResponseDayLineChartDataRsp dayLineChartDataRsp;

    public static GetDailyReportChartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportChartResponse self = new GetDailyReportChartResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyReportChartResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDailyReportChartResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyReportChartResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyReportChartResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDailyReportChartResponse setDayLineChartDataRsp(GetDailyReportChartResponseDayLineChartDataRsp dayLineChartDataRsp) {
        this.dayLineChartDataRsp = dayLineChartDataRsp;
        return this;
    }
    public GetDailyReportChartResponseDayLineChartDataRsp getDayLineChartDataRsp() {
        return this.dayLineChartDataRsp;
    }

    public static class GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris self = new GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop self = new GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode self = new GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage extends TeaModel {
        @NameInMap("Xlabel")
        @Validation(required = true)
        public Float xlabel;

        @NameInMap("Ylabel")
        @Validation(required = true)
        public Float ylabel;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage self = new GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage setXlabel(Float xlabel) {
            this.xlabel = xlabel;
            return this;
        }
        public Float getXlabel() {
            return this.xlabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage setYlabel(Float ylabel) {
            this.ylabel = ylabel;
            return this;
        }
        public Float getYlabel() {
            return this.ylabel;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDailyReportChartResponseDayLineChartDataRspDayLineChartData extends TeaModel {
        @NameInMap("Harris")
        @Validation(required = true)
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris> harris;

        @NameInMap("CloseLoop")
        @Validation(required = true)
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop> closeLoop;

        @NameInMap("Bode")
        @Validation(required = true)
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode> bode;

        @NameInMap("ResidualStage")
        @Validation(required = true)
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage> residualStage;

        public static GetDailyReportChartResponseDayLineChartDataRspDayLineChartData build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRspDayLineChartData self = new GetDailyReportChartResponseDayLineChartDataRspDayLineChartData();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData setHarris(java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris> harris) {
            this.harris = harris;
            return this;
        }
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataHarris> getHarris() {
            return this.harris;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData setCloseLoop(java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop> closeLoop) {
            this.closeLoop = closeLoop;
            return this;
        }
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataCloseLoop> getCloseLoop() {
            return this.closeLoop;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData setBode(java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode> bode) {
            this.bode = bode;
            return this;
        }
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataBode> getBode() {
            return this.bode;
        }

        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData setResidualStage(java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage> residualStage) {
            this.residualStage = residualStage;
            return this;
        }
        public java.util.List<GetDailyReportChartResponseDayLineChartDataRspDayLineChartDataResidualStage> getResidualStage() {
            return this.residualStage;
        }

    }

    public static class GetDailyReportChartResponseDayLineChartDataRsp extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("DayLineChartData")
        @Validation(required = true)
        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData dayLineChartData;

        public static GetDailyReportChartResponseDayLineChartDataRsp build(java.util.Map<String, ?> map) throws Exception {
            GetDailyReportChartResponseDayLineChartDataRsp self = new GetDailyReportChartResponseDayLineChartDataRsp();
            return TeaModel.build(map, self);
        }

        public GetDailyReportChartResponseDayLineChartDataRsp setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDailyReportChartResponseDayLineChartDataRsp setDayLineChartData(GetDailyReportChartResponseDayLineChartDataRspDayLineChartData dayLineChartData) {
            this.dayLineChartData = dayLineChartData;
            return this;
        }
        public GetDailyReportChartResponseDayLineChartDataRspDayLineChartData getDayLineChartData() {
            return this.dayLineChartData;
        }

    }

}
