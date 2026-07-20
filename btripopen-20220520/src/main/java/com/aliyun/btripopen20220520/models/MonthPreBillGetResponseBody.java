// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthPreBillGetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthPreBillGetResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>3D082D37-160A-53BE-9CF1-7AB8E100045B</p>
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
     * <p>3b52151317702574069534727d0099</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MonthPreBillGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonthPreBillGetResponseBody self = new MonthPreBillGetResponseBody();
        return TeaModel.build(map, self);
    }

    public MonthPreBillGetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MonthPreBillGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MonthPreBillGetResponseBody setModule(java.util.List<MonthPreBillGetResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<MonthPreBillGetResponseBodyModule> getModule() {
        return this.module;
    }

    public MonthPreBillGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonthPreBillGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MonthPreBillGetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MonthPreBillGetResponseBodyModuleMonthAccountBillDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("billConfirmed")
        public Integer billConfirmed;

        /**
         * <strong>example:</strong>
         * <p>56.70</p>
         */
        @NameInMap("carAmount")
        public Double carAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("damageAmount")
        public Double damageAmount;

        /**
         * <strong>example:</strong>
         * <p>1234.00</p>
         */
        @NameInMap("flightAmount")
        public Double flightAmount;

        /**
         * <strong>example:</strong>
         * <p>1.50</p>
         */
        @NameInMap("fuPoint")
        public Double fuPoint;

        /**
         * <strong>example:</strong>
         * <p>500.00</p>
         */
        @NameInMap("hotelAmount")
        public Double hotelAmount;

        /**
         * <strong>example:</strong>
         * <p>3456.00</p>
         */
        @NameInMap("ieFlightAmount")
        public Double ieFlightAmount;

        /**
         * <strong>example:</strong>
         * <p>3000.00</p>
         */
        @NameInMap("ieHotelAmount")
        public Double ieHotelAmount;

        /**
         * <strong>example:</strong>
         * <p>20200601</p>
         */
        @NameInMap("mailBillDate")
        public Long mailBillDate;

        /**
         * <strong>example:</strong>
         * <p>22.40</p>
         */
        @NameInMap("mealAmount")
        public Double mealAmount;

        /**
         * <strong>example:</strong>
         * <p>45.00</p>
         */
        @NameInMap("serviceAmount")
        public Double serviceAmount;

        /**
         * <strong>example:</strong>
         * <p>648.00</p>
         */
        @NameInMap("trainAmount")
        public Double trainAmount;

        /**
         * <strong>example:</strong>
         * <p>19.22</p>
         */
        @NameInMap("vasAmount")
        public Double vasAmount;

        public static MonthPreBillGetResponseBodyModuleMonthAccountBillDetail build(java.util.Map<String, ?> map) throws Exception {
            MonthPreBillGetResponseBodyModuleMonthAccountBillDetail self = new MonthPreBillGetResponseBodyModuleMonthAccountBillDetail();
            return TeaModel.build(map, self);
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setBillConfirmed(Integer billConfirmed) {
            this.billConfirmed = billConfirmed;
            return this;
        }
        public Integer getBillConfirmed() {
            return this.billConfirmed;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setCarAmount(Double carAmount) {
            this.carAmount = carAmount;
            return this;
        }
        public Double getCarAmount() {
            return this.carAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setDamageAmount(Double damageAmount) {
            this.damageAmount = damageAmount;
            return this;
        }
        public Double getDamageAmount() {
            return this.damageAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setFlightAmount(Double flightAmount) {
            this.flightAmount = flightAmount;
            return this;
        }
        public Double getFlightAmount() {
            return this.flightAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setFuPoint(Double fuPoint) {
            this.fuPoint = fuPoint;
            return this;
        }
        public Double getFuPoint() {
            return this.fuPoint;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setHotelAmount(Double hotelAmount) {
            this.hotelAmount = hotelAmount;
            return this;
        }
        public Double getHotelAmount() {
            return this.hotelAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setIeFlightAmount(Double ieFlightAmount) {
            this.ieFlightAmount = ieFlightAmount;
            return this;
        }
        public Double getIeFlightAmount() {
            return this.ieFlightAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setIeHotelAmount(Double ieHotelAmount) {
            this.ieHotelAmount = ieHotelAmount;
            return this;
        }
        public Double getIeHotelAmount() {
            return this.ieHotelAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setMailBillDate(Long mailBillDate) {
            this.mailBillDate = mailBillDate;
            return this;
        }
        public Long getMailBillDate() {
            return this.mailBillDate;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setMealAmount(Double mealAmount) {
            this.mealAmount = mealAmount;
            return this;
        }
        public Double getMealAmount() {
            return this.mealAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setServiceAmount(Double serviceAmount) {
            this.serviceAmount = serviceAmount;
            return this;
        }
        public Double getServiceAmount() {
            return this.serviceAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setTrainAmount(Double trainAmount) {
            this.trainAmount = trainAmount;
            return this;
        }
        public Double getTrainAmount() {
            return this.trainAmount;
        }

        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail setVasAmount(Double vasAmount) {
            this.vasAmount = vasAmount;
            return this;
        }
        public Double getVasAmount() {
            return this.vasAmount;
        }

    }

    public static class MonthPreBillGetResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-04-30</p>
         */
        @NameInMap("end_date")
        public String endDate;

        @NameInMap("monthAccountBillDetail")
        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail monthAccountBillDetail;

        /**
         * <strong>example:</strong>
         * <p>2020-04-01</p>
         */
        @NameInMap("start_date")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cdn.ewt360.com/resources/tiku_h5/uploads/2026/5/3/6fc104f3-561e-4960-b962-a112db1e9d00.jpg">https://cdn.ewt360.com/resources/tiku_h5/uploads/2026/5/3/6fc104f3-561e-4960-b962-a112db1e9d00.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static MonthPreBillGetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MonthPreBillGetResponseBodyModule self = new MonthPreBillGetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MonthPreBillGetResponseBodyModule setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MonthPreBillGetResponseBodyModule setMonthAccountBillDetail(MonthPreBillGetResponseBodyModuleMonthAccountBillDetail monthAccountBillDetail) {
            this.monthAccountBillDetail = monthAccountBillDetail;
            return this;
        }
        public MonthPreBillGetResponseBodyModuleMonthAccountBillDetail getMonthAccountBillDetail() {
            return this.monthAccountBillDetail;
        }

        public MonthPreBillGetResponseBodyModule setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MonthPreBillGetResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
