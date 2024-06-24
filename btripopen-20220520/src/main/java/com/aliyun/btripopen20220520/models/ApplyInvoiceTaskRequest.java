// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyInvoiceTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-01</p>
     */
    @NameInMap("bill_date")
    public String billDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("invoice_task_list")
    public java.util.List<ApplyInvoiceTaskRequestInvoiceTaskList> invoiceTaskList;

    public static ApplyInvoiceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceTaskRequest self = new ApplyInvoiceTaskRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceTaskRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public ApplyInvoiceTaskRequest setInvoiceTaskList(java.util.List<ApplyInvoiceTaskRequestInvoiceTaskList> invoiceTaskList) {
        this.invoiceTaskList = invoiceTaskList;
        return this;
    }
    public java.util.List<ApplyInvoiceTaskRequestInvoiceTaskList> getInvoiceTaskList() {
        return this.invoiceTaskList;
    }

    public static class ApplyInvoiceTaskRequestInvoiceTaskList extends TeaModel {
        @NameInMap("contact")
        public String contact;

        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("flight_invoice_fee")
        public String flightInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>3.12</p>
         */
        @NameInMap("fu_point_invoice_fee")
        public String fuPointInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("hotel_normal_invoice_fee")
        public String hotelNormalInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("hotel_special_invoice_fee")
        public String hotelSpecialInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("international_flight_invoice_fee")
        public String internationalFlightInvoiceFee;

        @NameInMap("international_hotel_invoice_fee")
        public String internationalHotelInvoiceFee;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("invoice_third_part_id")
        public String invoiceThirdPartId;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("mail_address")
        public String mailAddress;

        @NameInMap("mail_city")
        public String mailCity;

        @NameInMap("mail_full_address")
        public String mailFullAddress;

        @NameInMap("mail_province")
        public String mailProvince;

        @NameInMap("meal_normal_invoice_fee")
        public String mealNormalInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("penalty_fee")
        public String penaltyFee;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>1.02</p>
         */
        @NameInMap("service_fee")
        public String serviceFee;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("telephone")
        public String telephone;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("train_invoice_fee")
        public String trainInvoiceFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("vehicle_invoice_fee")
        public String vehicleInvoiceFee;

        public static ApplyInvoiceTaskRequestInvoiceTaskList build(java.util.Map<String, ?> map) throws Exception {
            ApplyInvoiceTaskRequestInvoiceTaskList self = new ApplyInvoiceTaskRequestInvoiceTaskList();
            return TeaModel.build(map, self);
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setFlightInvoiceFee(String flightInvoiceFee) {
            this.flightInvoiceFee = flightInvoiceFee;
            return this;
        }
        public String getFlightInvoiceFee() {
            return this.flightInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setFuPointInvoiceFee(String fuPointInvoiceFee) {
            this.fuPointInvoiceFee = fuPointInvoiceFee;
            return this;
        }
        public String getFuPointInvoiceFee() {
            return this.fuPointInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setHotelNormalInvoiceFee(String hotelNormalInvoiceFee) {
            this.hotelNormalInvoiceFee = hotelNormalInvoiceFee;
            return this;
        }
        public String getHotelNormalInvoiceFee() {
            return this.hotelNormalInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setHotelSpecialInvoiceFee(String hotelSpecialInvoiceFee) {
            this.hotelSpecialInvoiceFee = hotelSpecialInvoiceFee;
            return this;
        }
        public String getHotelSpecialInvoiceFee() {
            return this.hotelSpecialInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setInternationalFlightInvoiceFee(String internationalFlightInvoiceFee) {
            this.internationalFlightInvoiceFee = internationalFlightInvoiceFee;
            return this;
        }
        public String getInternationalFlightInvoiceFee() {
            return this.internationalFlightInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setInternationalHotelInvoiceFee(String internationalHotelInvoiceFee) {
            this.internationalHotelInvoiceFee = internationalHotelInvoiceFee;
            return this;
        }
        public String getInternationalHotelInvoiceFee() {
            return this.internationalHotelInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setInvoiceThirdPartId(String invoiceThirdPartId) {
            this.invoiceThirdPartId = invoiceThirdPartId;
            return this;
        }
        public String getInvoiceThirdPartId() {
            return this.invoiceThirdPartId;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setMailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }
        public String getMailAddress() {
            return this.mailAddress;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setMailCity(String mailCity) {
            this.mailCity = mailCity;
            return this;
        }
        public String getMailCity() {
            return this.mailCity;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setMailFullAddress(String mailFullAddress) {
            this.mailFullAddress = mailFullAddress;
            return this;
        }
        public String getMailFullAddress() {
            return this.mailFullAddress;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setMailProvince(String mailProvince) {
            this.mailProvince = mailProvince;
            return this;
        }
        public String getMailProvince() {
            return this.mailProvince;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setMealNormalInvoiceFee(String mealNormalInvoiceFee) {
            this.mealNormalInvoiceFee = mealNormalInvoiceFee;
            return this;
        }
        public String getMealNormalInvoiceFee() {
            return this.mealNormalInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setPenaltyFee(String penaltyFee) {
            this.penaltyFee = penaltyFee;
            return this;
        }
        public String getPenaltyFee() {
            return this.penaltyFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setServiceFee(String serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public String getServiceFee() {
            return this.serviceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setTrainInvoiceFee(String trainInvoiceFee) {
            this.trainInvoiceFee = trainInvoiceFee;
            return this;
        }
        public String getTrainInvoiceFee() {
            return this.trainInvoiceFee;
        }

        public ApplyInvoiceTaskRequestInvoiceTaskList setVehicleInvoiceFee(String vehicleInvoiceFee) {
            this.vehicleInvoiceFee = vehicleInvoiceFee;
            return this;
        }
        public String getVehicleInvoiceFee() {
            return this.vehicleInvoiceFee;
        }

    }

}
