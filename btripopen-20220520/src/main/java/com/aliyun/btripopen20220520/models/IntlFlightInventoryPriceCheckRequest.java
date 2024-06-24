// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ZJTD</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>chinese</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>102000</p>
     */
    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22111acaf9ea47c09ed0db6abc45be2d_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> passengerList;

    /**
     * <strong>example:</strong>
     * <p>12412341234</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static IntlFlightInventoryPriceCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckRequest self = new IntlFlightInventoryPriceCheckRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightInventoryPriceCheckRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightInventoryPriceCheckRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightInventoryPriceCheckRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightInventoryPriceCheckRequest setPassengerList(java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> passengerList) {
        this.passengerList = passengerList;
        return this;
    }
    public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> getPassengerList() {
        return this.passengerList;
    }

    public IntlFlightInventoryPriceCheckRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IntlFlightInventoryPriceCheckRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class IntlFlightInventoryPriceCheckRequestPassengerListCertInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>H123456</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>2033-01-09</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("name")
        public String name;

        public static IntlFlightInventoryPriceCheckRequestPassengerListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckRequestPassengerListCertInfo self = new IntlFlightInventoryPriceCheckRequestPassengerListCertInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <strong>example:</strong>
         * <p>H123456</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>2033-01-09</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("name")
        public String name;

        public static IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList self = new IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightInventoryPriceCheckRequestPassengerList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>100/1001</p>
         */
        @NameInMap("cascade_dept_mask")
        public String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_info")
        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo certInfo;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>100231</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("dept_id")
        public String deptId;

        @NameInMap("dept_name")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>10001313</p>
         */
        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>L5000924</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <strong>example:</strong>
         * <p>086</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18012341234</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>10123143</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("subsidiary_cert_info_list")
        public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightInventoryPriceCheckRequestPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckRequestPassengerList self = new IntlFlightInventoryPriceCheckRequestPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCascadeDeptMask(String cascadeDeptMask) {
            this.cascadeDeptMask = cascadeDeptMask;
            return this;
        }
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCertInfo(IntlFlightInventoryPriceCheckRequestPassengerListCertInfo certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo getCertInfo() {
            return this.certInfo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setSubsidiaryCertInfoList(java.util.List<IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList) {
            this.subsidiaryCertInfoList = subsidiaryCertInfoList;
            return this;
        }
        public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerListSubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
            return this.subsidiaryCertInfoList;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
