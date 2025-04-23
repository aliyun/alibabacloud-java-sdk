// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySingleSmsQualificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySingleSmsQualificationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>25D5AFDE-8EBC-132E-8909-1FDC071DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySingleSmsQualificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSmsQualificationResponseBody self = new QuerySingleSmsQualificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySingleSmsQualificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySingleSmsQualificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySingleSmsQualificationResponseBody setData(QuerySingleSmsQualificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySingleSmsQualificationResponseBodyData getData() {
        return this.data;
    }

    public QuerySingleSmsQualificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySingleSmsQualificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySingleSmsQualificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        @NameInMap("LicensePic")
        public String licensePic;

        /**
         * <p>文件的完整路径</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        /**
         * <strong>example:</strong>
         * <p>businessLicense</p>
         */
        @NameInMap("Type")
        public String type;

        public static QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics self = new QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics();
            return TeaModel.build(map, self);
        }

        public QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics setLicensePic(String licensePic) {
            this.licensePic = licensePic;
            return this;
        }
        public String getLicensePic() {
            return this.licensePic;
        }

        public QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QuerySingleSmsQualificationResponseBodyDataOtherFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        @NameInMap("LicensePic")
        public String licensePic;

        /**
         * <p>文件的完整路径</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        public static QuerySingleSmsQualificationResponseBodyDataOtherFiles build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleSmsQualificationResponseBodyDataOtherFiles self = new QuerySingleSmsQualificationResponseBodyDataOtherFiles();
            return TeaModel.build(map, self);
        }

        public QuerySingleSmsQualificationResponseBodyDataOtherFiles setLicensePic(String licensePic) {
            this.licensePic = licensePic;
            return this;
        }
        public String getLicensePic() {
            return this.licensePic;
        }

        public QuerySingleSmsQualificationResponseBodyDataOtherFiles setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

    }

    public static class QuerySingleSmsQualificationResponseBodyData extends TeaModel {
        /**
         * <p>经办人身份证有效期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        @NameInMap("AdminIDCardExpDate")
        public String adminIDCardExpDate;

        /**
         * <p>经办人身份证国徽面，产品需求，要求身份证可以分正反面上传</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
         */
        @NameInMap("AdminIDCardFrontFace")
        public String adminIDCardFrontFace;

        /**
         * <p>经办人身份证号码</p>
         * 
         * <strong>example:</strong>
         * <p>511391********5123</p>
         */
        @NameInMap("AdminIDCardNo")
        public String adminIDCardNo;

        /**
         * <p>经办人身份证图片地址，正反面合一</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong>.aliyuncs.com/</strong></strong></strong></p>
         */
        @NameInMap("AdminIDCardPic")
        public String adminIDCardPic;

        /**
         * <p>管理员身份证类型</p>
         * 
         * <strong>example:</strong>
         * <p>identityCard</p>
         */
        @NameInMap("AdminIDCardType")
        public String adminIDCardType;

        /**
         * <p>经办人姓名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AdminName")
        public String adminName;

        /**
         * <p>经办人手机号码</p>
         * 
         * <strong>example:</strong>
         * <p>137*******</p>
         */
        @NameInMap("AdminPhoneNo")
        public String adminPhoneNo;

        /**
         * <p>证件信息</p>
         */
        @NameInMap("BusinessLicensePics")
        public java.util.List<QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics> businessLicensePics;

        /**
         * <p>行业类型，在当前模式下是可以用产品线code来区分</p>
         * 
         * <strong>example:</strong>
         * <p>dysms</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>公司名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>企业类型, COMPANY:公司，政府或者事业单位:NON_PROFIT_ORGANIZATION</p>
         * 
         * <strong>example:</strong>
         * <p>COMPANY</p>
         */
        @NameInMap("CompanyType")
        public String companyType;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        @NameInMap("EffTimeStr")
        public String effTimeStr;

        /**
         * <p>法人身份证号码</p>
         * 
         * <strong>example:</strong>
         * <p>511391********5123</p>
         */
        @NameInMap("LegalPersonIDCardNo")
        public String legalPersonIDCardNo;

        /**
         * <p>法人身份证类型</p>
         * 
         * <strong>example:</strong>
         * <p>identityCard</p>
         */
        @NameInMap("LegalPersonIDCardType")
        public String legalPersonIDCardType;

        /**
         * <p>法人身份证有效期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2033-01-01</p>
         */
        @NameInMap("LegalPersonIdCardEffTime")
        public String legalPersonIdCardEffTime;

        /**
         * <p>法人姓名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("LegalPersonName")
        public String legalPersonName;

        /**
         * <p>社会统一信用代码</p>
         * 
         * <strong>example:</strong>
         * <p>910X********0012</p>
         */
        @NameInMap("OrganizationCode")
        public String organizationCode;

        /**
         * <p>更多资料</p>
         */
        @NameInMap("OtherFiles")
        public java.util.List<QuerySingleSmsQualificationResponseBodyDataOtherFiles> otherFiles;

        /**
         * <strong>example:</strong>
         * <p>10000****</p>
         */
        @NameInMap("QualificationGroupId")
        public Long qualificationGroupId;

        /**
         * <p>资质名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("QualificationName")
        public String qualificationName;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>当前审核状态</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>是否自用</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseBySelf")
        public Boolean useBySelf;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WhetherShare")
        public Boolean whetherShare;

        /**
         * <p>乾坤袋工单ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001****</p>
         */
        @NameInMap("WorkOrderId")
        public Long workOrderId;

        public static QuerySingleSmsQualificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleSmsQualificationResponseBodyData self = new QuerySingleSmsQualificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminIDCardExpDate(String adminIDCardExpDate) {
            this.adminIDCardExpDate = adminIDCardExpDate;
            return this;
        }
        public String getAdminIDCardExpDate() {
            return this.adminIDCardExpDate;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminIDCardFrontFace(String adminIDCardFrontFace) {
            this.adminIDCardFrontFace = adminIDCardFrontFace;
            return this;
        }
        public String getAdminIDCardFrontFace() {
            return this.adminIDCardFrontFace;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminIDCardNo(String adminIDCardNo) {
            this.adminIDCardNo = adminIDCardNo;
            return this;
        }
        public String getAdminIDCardNo() {
            return this.adminIDCardNo;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminIDCardPic(String adminIDCardPic) {
            this.adminIDCardPic = adminIDCardPic;
            return this;
        }
        public String getAdminIDCardPic() {
            return this.adminIDCardPic;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminIDCardType(String adminIDCardType) {
            this.adminIDCardType = adminIDCardType;
            return this;
        }
        public String getAdminIDCardType() {
            return this.adminIDCardType;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public QuerySingleSmsQualificationResponseBodyData setAdminPhoneNo(String adminPhoneNo) {
            this.adminPhoneNo = adminPhoneNo;
            return this;
        }
        public String getAdminPhoneNo() {
            return this.adminPhoneNo;
        }

        public QuerySingleSmsQualificationResponseBodyData setBusinessLicensePics(java.util.List<QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics> businessLicensePics) {
            this.businessLicensePics = businessLicensePics;
            return this;
        }
        public java.util.List<QuerySingleSmsQualificationResponseBodyDataBusinessLicensePics> getBusinessLicensePics() {
            return this.businessLicensePics;
        }

        public QuerySingleSmsQualificationResponseBodyData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public QuerySingleSmsQualificationResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QuerySingleSmsQualificationResponseBodyData setCompanyType(String companyType) {
            this.companyType = companyType;
            return this;
        }
        public String getCompanyType() {
            return this.companyType;
        }

        public QuerySingleSmsQualificationResponseBodyData setEffTimeStr(String effTimeStr) {
            this.effTimeStr = effTimeStr;
            return this;
        }
        public String getEffTimeStr() {
            return this.effTimeStr;
        }

        public QuerySingleSmsQualificationResponseBodyData setLegalPersonIDCardNo(String legalPersonIDCardNo) {
            this.legalPersonIDCardNo = legalPersonIDCardNo;
            return this;
        }
        public String getLegalPersonIDCardNo() {
            return this.legalPersonIDCardNo;
        }

        public QuerySingleSmsQualificationResponseBodyData setLegalPersonIDCardType(String legalPersonIDCardType) {
            this.legalPersonIDCardType = legalPersonIDCardType;
            return this;
        }
        public String getLegalPersonIDCardType() {
            return this.legalPersonIDCardType;
        }

        public QuerySingleSmsQualificationResponseBodyData setLegalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
            this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
            return this;
        }
        public String getLegalPersonIdCardEffTime() {
            return this.legalPersonIdCardEffTime;
        }

        public QuerySingleSmsQualificationResponseBodyData setLegalPersonName(String legalPersonName) {
            this.legalPersonName = legalPersonName;
            return this;
        }
        public String getLegalPersonName() {
            return this.legalPersonName;
        }

        public QuerySingleSmsQualificationResponseBodyData setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        public QuerySingleSmsQualificationResponseBodyData setOtherFiles(java.util.List<QuerySingleSmsQualificationResponseBodyDataOtherFiles> otherFiles) {
            this.otherFiles = otherFiles;
            return this;
        }
        public java.util.List<QuerySingleSmsQualificationResponseBodyDataOtherFiles> getOtherFiles() {
            return this.otherFiles;
        }

        public QuerySingleSmsQualificationResponseBodyData setQualificationGroupId(Long qualificationGroupId) {
            this.qualificationGroupId = qualificationGroupId;
            return this;
        }
        public Long getQualificationGroupId() {
            return this.qualificationGroupId;
        }

        public QuerySingleSmsQualificationResponseBodyData setQualificationName(String qualificationName) {
            this.qualificationName = qualificationName;
            return this;
        }
        public String getQualificationName() {
            return this.qualificationName;
        }

        public QuerySingleSmsQualificationResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySingleSmsQualificationResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QuerySingleSmsQualificationResponseBodyData setUseBySelf(Boolean useBySelf) {
            this.useBySelf = useBySelf;
            return this;
        }
        public Boolean getUseBySelf() {
            return this.useBySelf;
        }

        public QuerySingleSmsQualificationResponseBodyData setWhetherShare(Boolean whetherShare) {
            this.whetherShare = whetherShare;
            return this;
        }
        public Boolean getWhetherShare() {
            return this.whetherShare;
        }

        public QuerySingleSmsQualificationResponseBodyData setWorkOrderId(Long workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public Long getWorkOrderId() {
            return this.workOrderId;
        }

    }

}
