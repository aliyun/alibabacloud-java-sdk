// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthBillGetResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static MonthBillGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonthBillGetResponseBody self = new MonthBillGetResponseBody();
        return TeaModel.build(map, self);
    }

    public MonthBillGetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MonthBillGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MonthBillGetResponseBody setModule(java.util.List<MonthBillGetResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<MonthBillGetResponseBodyModule> getModule() {
        return this.module;
    }

    public MonthBillGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonthBillGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MonthBillGetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MonthBillGetResponseBodyModuleMonthAccountBillDetail extends TeaModel {
        @NameInMap("carAmount")
        public Double carAmount;

        @NameInMap("damageAmount")
        public Double damageAmount;

        @NameInMap("flightAmount")
        public Double flightAmount;

        @NameInMap("fuPoint")
        public Double fuPoint;

        @NameInMap("hotelAmount")
        public Double hotelAmount;

        @NameInMap("ieFlightAmount")
        public Double ieFlightAmount;

        @NameInMap("mailBillDate")
        public Long mailBillDate;

        @NameInMap("serviceAmount")
        public Double serviceAmount;

        @NameInMap("trainAmount")
        public Double trainAmount;

        public static MonthBillGetResponseBodyModuleMonthAccountBillDetail build(java.util.Map<String, ?> map) throws Exception {
            MonthBillGetResponseBodyModuleMonthAccountBillDetail self = new MonthBillGetResponseBodyModuleMonthAccountBillDetail();
            return TeaModel.build(map, self);
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setCarAmount(Double carAmount) {
            this.carAmount = carAmount;
            return this;
        }
        public Double getCarAmount() {
            return this.carAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setDamageAmount(Double damageAmount) {
            this.damageAmount = damageAmount;
            return this;
        }
        public Double getDamageAmount() {
            return this.damageAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setFlightAmount(Double flightAmount) {
            this.flightAmount = flightAmount;
            return this;
        }
        public Double getFlightAmount() {
            return this.flightAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setFuPoint(Double fuPoint) {
            this.fuPoint = fuPoint;
            return this;
        }
        public Double getFuPoint() {
            return this.fuPoint;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setHotelAmount(Double hotelAmount) {
            this.hotelAmount = hotelAmount;
            return this;
        }
        public Double getHotelAmount() {
            return this.hotelAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setIeFlightAmount(Double ieFlightAmount) {
            this.ieFlightAmount = ieFlightAmount;
            return this;
        }
        public Double getIeFlightAmount() {
            return this.ieFlightAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setMailBillDate(Long mailBillDate) {
            this.mailBillDate = mailBillDate;
            return this;
        }
        public Long getMailBillDate() {
            return this.mailBillDate;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setServiceAmount(Double serviceAmount) {
            this.serviceAmount = serviceAmount;
            return this;
        }
        public Double getServiceAmount() {
            return this.serviceAmount;
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setTrainAmount(Double trainAmount) {
            this.trainAmount = trainAmount;
            return this;
        }
        public Double getTrainAmount() {
            return this.trainAmount;
        }

    }

    public static class MonthBillGetResponseBodyModule extends TeaModel {
        @NameInMap("end_date")
        public String endDate;

        @NameInMap("monthAccountBillDetail")
        public MonthBillGetResponseBodyModuleMonthAccountBillDetail monthAccountBillDetail;

        @NameInMap("start_date")
        public String startDate;

        @NameInMap("url")
        public String url;

        public static MonthBillGetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MonthBillGetResponseBodyModule self = new MonthBillGetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MonthBillGetResponseBodyModule setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MonthBillGetResponseBodyModule setMonthAccountBillDetail(MonthBillGetResponseBodyModuleMonthAccountBillDetail monthAccountBillDetail) {
            this.monthAccountBillDetail = monthAccountBillDetail;
            return this;
        }
        public MonthBillGetResponseBodyModuleMonthAccountBillDetail getMonthAccountBillDetail() {
            return this.monthAccountBillDetail;
        }

        public MonthBillGetResponseBodyModule setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MonthBillGetResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
