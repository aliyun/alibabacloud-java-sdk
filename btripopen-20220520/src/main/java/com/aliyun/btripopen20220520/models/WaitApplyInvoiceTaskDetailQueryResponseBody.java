// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class WaitApplyInvoiceTaskDetailQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<WaitApplyInvoiceTaskDetailQueryResponseBodyModule> module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static WaitApplyInvoiceTaskDetailQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WaitApplyInvoiceTaskDetailQueryResponseBody self = new WaitApplyInvoiceTaskDetailQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setModule(java.util.List<WaitApplyInvoiceTaskDetailQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<WaitApplyInvoiceTaskDetailQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public WaitApplyInvoiceTaskDetailQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class WaitApplyInvoiceTaskDetailQueryResponseBodyModule extends TeaModel {
        @NameInMap("contact")
        public String contact;

        @NameInMap("email")
        public String email;

        @NameInMap("flight_invoice_fee")
        public String flightInvoiceFee;

        @NameInMap("fu_point_invoice_fee")
        public String fuPointInvoiceFee;

        @NameInMap("hotel_normal_invoice_fee")
        public String hotelNormalInvoiceFee;

        @NameInMap("hotel_special_invoice_fee")
        public String hotelSpecialInvoiceFee;

        @NameInMap("international_flight_invoice_fee")
        public String internationalFlightInvoiceFee;

        @NameInMap("international_hotel_invoice_fee")
        public String internationalHotelInvoiceFee;

        @NameInMap("invoice_third_part_id")
        public String invoiceThirdPartId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("mail_address")
        public String mailAddress;

        @NameInMap("mail_city")
        public String mailCity;

        @NameInMap("mail_full_address")
        public String mailFullAddress;

        @NameInMap("mail_province")
        public String mailProvince;

        @NameInMap("penalty_fee")
        public String penaltyFee;

        @NameInMap("remark")
        public String remark;

        @NameInMap("service_fee")
        public String serviceFee;

        @NameInMap("telephone")
        public String telephone;

        @NameInMap("train_invoice_fee")
        public String trainInvoiceFee;

        @NameInMap("vehicle_invoice_fee")
        public String vehicleInvoiceFee;

        public static WaitApplyInvoiceTaskDetailQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            WaitApplyInvoiceTaskDetailQueryResponseBodyModule self = new WaitApplyInvoiceTaskDetailQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setFlightInvoiceFee(String flightInvoiceFee) {
            this.flightInvoiceFee = flightInvoiceFee;
            return this;
        }
        public String getFlightInvoiceFee() {
            return this.flightInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setFuPointInvoiceFee(String fuPointInvoiceFee) {
            this.fuPointInvoiceFee = fuPointInvoiceFee;
            return this;
        }
        public String getFuPointInvoiceFee() {
            return this.fuPointInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setHotelNormalInvoiceFee(String hotelNormalInvoiceFee) {
            this.hotelNormalInvoiceFee = hotelNormalInvoiceFee;
            return this;
        }
        public String getHotelNormalInvoiceFee() {
            return this.hotelNormalInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setHotelSpecialInvoiceFee(String hotelSpecialInvoiceFee) {
            this.hotelSpecialInvoiceFee = hotelSpecialInvoiceFee;
            return this;
        }
        public String getHotelSpecialInvoiceFee() {
            return this.hotelSpecialInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setInternationalFlightInvoiceFee(String internationalFlightInvoiceFee) {
            this.internationalFlightInvoiceFee = internationalFlightInvoiceFee;
            return this;
        }
        public String getInternationalFlightInvoiceFee() {
            return this.internationalFlightInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setInternationalHotelInvoiceFee(String internationalHotelInvoiceFee) {
            this.internationalHotelInvoiceFee = internationalHotelInvoiceFee;
            return this;
        }
        public String getInternationalHotelInvoiceFee() {
            return this.internationalHotelInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setInvoiceThirdPartId(String invoiceThirdPartId) {
            this.invoiceThirdPartId = invoiceThirdPartId;
            return this;
        }
        public String getInvoiceThirdPartId() {
            return this.invoiceThirdPartId;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setMailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }
        public String getMailAddress() {
            return this.mailAddress;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setMailCity(String mailCity) {
            this.mailCity = mailCity;
            return this;
        }
        public String getMailCity() {
            return this.mailCity;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setMailFullAddress(String mailFullAddress) {
            this.mailFullAddress = mailFullAddress;
            return this;
        }
        public String getMailFullAddress() {
            return this.mailFullAddress;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setMailProvince(String mailProvince) {
            this.mailProvince = mailProvince;
            return this;
        }
        public String getMailProvince() {
            return this.mailProvince;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setPenaltyFee(String penaltyFee) {
            this.penaltyFee = penaltyFee;
            return this;
        }
        public String getPenaltyFee() {
            return this.penaltyFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setServiceFee(String serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public String getServiceFee() {
            return this.serviceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setTrainInvoiceFee(String trainInvoiceFee) {
            this.trainInvoiceFee = trainInvoiceFee;
            return this;
        }
        public String getTrainInvoiceFee() {
            return this.trainInvoiceFee;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBodyModule setVehicleInvoiceFee(String vehicleInvoiceFee) {
            this.vehicleInvoiceFee = vehicleInvoiceFee;
            return this;
        }
        public String getVehicleInvoiceFee() {
            return this.vehicleInvoiceFee;
        }

    }

}
