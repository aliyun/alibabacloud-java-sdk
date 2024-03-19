// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderRequest extends TeaModel {
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    @NameInMap("contact_info")
    public IntlFlightCreateOrderRequestContactInfo contactInfo;

    @NameInMap("cost_center")
    public IntlFlightCreateOrderRequestCostCenter costCenter;

    @NameInMap("extra_info")
    public java.util.Map<String, String> extraInfo;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("language")
    public String language;

    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_list")
    public java.util.List<IntlFlightCreateOrderRequestPassengerList> passengerList;

    @NameInMap("render_key")
    public String renderKey;

    @NameInMap("total_price_cent")
    public Long totalPriceCent;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static IntlFlightCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderRequest self = new IntlFlightCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderRequest setAsyncCreateOrderKey(String asyncCreateOrderKey) {
        this.asyncCreateOrderKey = asyncCreateOrderKey;
        return this;
    }
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    public IntlFlightCreateOrderRequest setAsyncCreateOrderMode(Boolean asyncCreateOrderMode) {
        this.asyncCreateOrderMode = asyncCreateOrderMode;
        return this;
    }
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    public IntlFlightCreateOrderRequest setContactInfo(IntlFlightCreateOrderRequestContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IntlFlightCreateOrderRequestContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public IntlFlightCreateOrderRequest setCostCenter(IntlFlightCreateOrderRequestCostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }
    public IntlFlightCreateOrderRequestCostCenter getCostCenter() {
        return this.costCenter;
    }

    public IntlFlightCreateOrderRequest setExtraInfo(java.util.Map<String, String> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    public IntlFlightCreateOrderRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightCreateOrderRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightCreateOrderRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightCreateOrderRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightCreateOrderRequest setPassengerList(java.util.List<IntlFlightCreateOrderRequestPassengerList> passengerList) {
        this.passengerList = passengerList;
        return this;
    }
    public java.util.List<IntlFlightCreateOrderRequestPassengerList> getPassengerList() {
        return this.passengerList;
    }

    public IntlFlightCreateOrderRequest setRenderKey(String renderKey) {
        this.renderKey = renderKey;
        return this;
    }
    public String getRenderKey() {
        return this.renderKey;
    }

    public IntlFlightCreateOrderRequest setTotalPriceCent(Long totalPriceCent) {
        this.totalPriceCent = totalPriceCent;
        return this;
    }
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    public IntlFlightCreateOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IntlFlightCreateOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class IntlFlightCreateOrderRequestContactInfo extends TeaModel {
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("contact_phone")
        public String contactPhone;

        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static IntlFlightCreateOrderRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestContactInfo self = new IntlFlightCreateOrderRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestContactInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public IntlFlightCreateOrderRequestContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public IntlFlightCreateOrderRequestContactInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public IntlFlightCreateOrderRequestContactInfo setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class IntlFlightCreateOrderRequestCostCenter extends TeaModel {
        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        public static IntlFlightCreateOrderRequestCostCenter build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestCostCenter self = new IntlFlightCreateOrderRequestCostCenter();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestCostCenter setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IntlFlightCreateOrderRequestCostCenter setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

    }

    public static class IntlFlightCreateOrderRequestPassengerListCertInfo extends TeaModel {
        @NameInMap("cert_nation")
        public String certNation;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("cert_valid_date")
        public String certValidDate;

        @NameInMap("name")
        public String name;

        public static IntlFlightCreateOrderRequestPassengerListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestPassengerListCertInfo self = new IntlFlightCreateOrderRequestPassengerListCertInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList extends TeaModel {
        @NameInMap("cert_nation")
        public String certNation;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("cert_valid_date")
        public String certValidDate;

        @NameInMap("name")
        public String name;

        public static IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList self = new IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightCreateOrderRequestPassengerList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("cascade_dept_mask")
        public String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        @NameInMap("cert_info")
        public IntlFlightCreateOrderRequestPassengerListCertInfo certInfo;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("dept_id")
        public String deptId;

        @NameInMap("dept_name")
        public String deptName;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("nationality_code")
        public String nationalityCode;

        @NameInMap("passenger_type")
        public Integer passengerType;

        @NameInMap("phone")
        public String phone;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("subsidiary_cert_info_list")
        public java.util.List<IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightCreateOrderRequestPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestPassengerList self = new IntlFlightCreateOrderRequestPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightCreateOrderRequestPassengerList setCascadeDeptMask(String cascadeDeptMask) {
            this.cascadeDeptMask = cascadeDeptMask;
            return this;
        }
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        public IntlFlightCreateOrderRequestPassengerList setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public IntlFlightCreateOrderRequestPassengerList setCertInfo(IntlFlightCreateOrderRequestPassengerListCertInfo certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public IntlFlightCreateOrderRequestPassengerListCertInfo getCertInfo() {
            return this.certInfo;
        }

        public IntlFlightCreateOrderRequestPassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IntlFlightCreateOrderRequestPassengerList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IntlFlightCreateOrderRequestPassengerList setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public IntlFlightCreateOrderRequestPassengerList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public IntlFlightCreateOrderRequestPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightCreateOrderRequestPassengerList setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public IntlFlightCreateOrderRequestPassengerList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IntlFlightCreateOrderRequestPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightCreateOrderRequestPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public IntlFlightCreateOrderRequestPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightCreateOrderRequestPassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightCreateOrderRequestPassengerList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IntlFlightCreateOrderRequestPassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IntlFlightCreateOrderRequestPassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IntlFlightCreateOrderRequestPassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public IntlFlightCreateOrderRequestPassengerList setSubsidiaryCertInfoList(java.util.List<IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList) {
            this.subsidiaryCertInfoList = subsidiaryCertInfoList;
            return this;
        }
        public java.util.List<IntlFlightCreateOrderRequestPassengerListSubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
            return this.subsidiaryCertInfoList;
        }

        public IntlFlightCreateOrderRequestPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightCreateOrderRequestPassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
