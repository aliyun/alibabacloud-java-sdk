// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthBillGetResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
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
        @NameInMap("billConfirmed")
        public Integer billConfirmed;

        /**
         * <p>用车金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("carAmount")
        public Double carAmount;

        /**
         * <p>违约金金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("damageAmount")
        public Double damageAmount;

        /**
         * <p>机票金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("flightAmount")
        public Double flightAmount;

        /**
         * <p>福豆金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("fuPoint")
        public Double fuPoint;

        /**
         * <p>酒店金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("hotelAmount")
        public Double hotelAmount;

        /**
         * <p>国际机票金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("ieFlightAmount")
        public Double ieFlightAmount;

        @NameInMap("ieHotelAmount")
        public Double ieHotelAmount;

        /**
         * <p>账期日：YYYYMMDD</p>
         * 
         * <strong>example:</strong>
         * <p>20200501</p>
         */
        @NameInMap("mailBillDate")
        public Long mailBillDate;

        /**
         * <p>服务费金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("serviceAmount")
        public Double serviceAmount;

        /**
         * <p>火车票金额（单位：元）</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx</p>
         */
        @NameInMap("trainAmount")
        public Double trainAmount;

        public static MonthBillGetResponseBodyModuleMonthAccountBillDetail build(java.util.Map<String, ?> map) throws Exception {
            MonthBillGetResponseBodyModuleMonthAccountBillDetail self = new MonthBillGetResponseBodyModuleMonthAccountBillDetail();
            return TeaModel.build(map, self);
        }

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setBillConfirmed(Integer billConfirmed) {
            this.billConfirmed = billConfirmed;
            return this;
        }
        public Integer getBillConfirmed() {
            return this.billConfirmed;
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

        public MonthBillGetResponseBodyModuleMonthAccountBillDetail setIeHotelAmount(Double ieHotelAmount) {
            this.ieHotelAmount = ieHotelAmount;
            return this;
        }
        public Double getIeHotelAmount() {
            return this.ieHotelAmount;
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

        /**
         * <p>CorpMonthAccountBillFeeDetail</p>
         */
        @NameInMap("monthAccountBillDetail")
        public MonthBillGetResponseBodyModuleMonthAccountBillDetail monthAccountBillDetail;

        @NameInMap("start_date")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
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
