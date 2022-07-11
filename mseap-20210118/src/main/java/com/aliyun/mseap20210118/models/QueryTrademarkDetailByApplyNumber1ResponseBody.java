// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumber1ResponseBody extends TeaModel {
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public QueryTrademarkDetailByApplyNumber1ResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTrademarkDetailByApplyNumber1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumber1ResponseBody self = new QueryTrademarkDetailByApplyNumber1ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setModule(QueryTrademarkDetailByApplyNumber1ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryTrademarkDetailByApplyNumber1ResponseBodyModule getModule() {
        return this.module;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkDetailByApplyNumber1ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes extends TeaModel {
        @NameInMap("Associated")
        public Boolean associated;

        @NameInMap("Children")
        public java.util.List<?> children;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Env")
        public String env;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("OfficialCode")
        public String officialCode;

        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes self = new QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setAssociated(Boolean associated) {
            this.associated = associated;
            return this;
        }
        public Boolean getAssociated() {
            return this.associated;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo extends TeaModel {
        // 申请人地址
        @NameInMap("Address")
        public String address;

        // 营业执照URL
        @NameInMap("BusinessLicenceUrl")
        public String businessLicenceUrl;

        // 身份证号, 此字段为复用字段
        @NameInMap("CardNumber")
        public String cardNumber;

        // 盖章的中文名称地址图片 (翻译件)
        @NameInMap("CnInfoUrl")
        public String cnInfoUrl;

        @NameInMap("ContactAddress")
        public String contactAddress;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactPhoneNumber")
        public String contactPhoneNumber;

        @NameInMap("ContactZipCode")
        public String contactZipCode;

        // 国家编号
        @NameInMap("Country")
        public String country;

        // 申请人地址,国外地址
        @NameInMap("EAddress")
        public String EAddress;

        // 申请人的应为名称
        @NameInMap("EName")
        public String EName;

        // 身份证号
        @NameInMap("IdCardNumber")
        public String idCardNumber;

        // 身份证URL
        @NameInMap("IdCardUrl")
        public String idCardUrl;

        // 委托书osskey
        @NameInMap("LoaKey")
        public String loaKey;

        // 授权书临时URL
        @NameInMap("LoaUrl")
        public String loaUrl;

        // 申请人姓名
        @NameInMap("Name")
        public String name;

        // 护照URL
        @NameInMap("PassportUrl")
        public String passportUrl;

        // （1：个人名字，2：个体工商户名称） 个人类型
        @NameInMap("PersonalType")
        public Integer personalType;

        // 邮政编码
        @NameInMap("PostCode")
        public String postCode;

        // 申请人地址所在省
        @NameInMap("Province")
        public String province;

        // 理由书
        @NameInMap("ReasonFileOssKey")
        public String reasonFileOssKey;

        // 申请人地区（大陆、港、澳门、台湾、海外）
        @NameInMap("Region")
        public Integer region;

        @NameInMap("ReviewFileMap")
        public java.util.Map<String, String> reviewFileMap;

        // 申请人类型 自然人 or 法人
        @NameInMap("Type")
        public Integer type;

        public static QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo self = new QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }
        public String getContactPhoneNumber() {
            return this.contactPhoneNumber;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setReviewFileMap(java.util.Map<String, String> reviewFileMap) {
            this.reviewFileMap = reviewFileMap;
            return this;
        }
        public java.util.Map<String, String> getReviewFileMap() {
            return this.reviewFileMap;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode extends TeaModel {
        @NameInMap("Associated")
        public Boolean associated;

        @NameInMap("Children")
        public java.util.List<?> children;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Env")
        public String env;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("OfficialCode")
        public String officialCode;

        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode self = new QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setAssociated(Boolean associated) {
            this.associated = associated;
            return this;
        }
        public Boolean getAssociated() {
            return this.associated;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel extends TeaModel {
        // 二进制位
        @NameInMap("BitFlag")
        public Integer bitFlag;

        // 实例ID
        @NameInMap("BizId")
        public String bizId;

        // 在和ESP交互是使用的bizType
        @NameInMap("BizType")
        public String bizType;

        // 扩展字段
        @NameInMap("ExtendInfo")
        public java.util.Map<String, String> extendInfo;

        // 图标黑白icon
        @NameInMap("GrayIconUrl")
        public String grayIconUrl;

        // 图标
        @NameInMap("Icon")
        public String icon;

        // 三级分类Code
        @NameInMap("LeafCodes")
        public java.util.List<QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes> leafCodes;

        // 申请人信息
        @NameInMap("MaterialInfo")
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo materialInfo;

        // 订单ID
        @NameInMap("OrderId")
        public String orderId;

        // partnerCode
        @NameInMap("PartnerCode")
        public String partnerCode;

        // 主体Key
        @NameInMap("PrincipalKey")
        public String principalKey;

        // 主体名称 (ALIBABA, ZYHL, ZLSWS, SBQ, HNSBQ, BZZCDL)
        @NameInMap("PrincipalName")
        public String principalName;

        // 业务类型 (CREATE, RENEW, CHESAN, TRADE_PRE, TRADE_FINAL, EXPERT_APPLY_CREATE, EXPERT_REVIEW, EXPERT_APPLY_CREATE_VIRTUAL, ENSURE_REG, YIYI_REPLY, CHESAN_REPLY, WUXIAOXUANGAO_REPLY)
        @NameInMap("ProduceType")
        public String produceType;

        // 一级品类Code
        @NameInMap("RootCode")
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode rootCode;

        // 状态 (PAID, COMPLETE_MATERIAL, FAIL_ALIYUN_VERIFY, PASS_ALIYUN_VERIFY, FAIL, WAIT_RE_AUDIT, COMPLAINT, FAIL_NAME, COMPLETE_NAME_UPDATE, SUBMIT_SBJ, SBJ_ACCEPT, SBJ_ACCEPT_NOT, FAIL_XS, PASS_XS, PART_FAIL_SS, FAIL_SS, PASS_SS, DISSENSION, SBJ_REJECT, SUCCESS, MAILED, APPROVE_PASS, APPROVE_FAIL, UN_PAID, WAITING_COMPLETION, PART_PAID, MATERIAL_AUDITING, KEEP_TM, CANCEL_TM, REVIEW_STATUS_WAITING_MATERIAL, REVIEW_STATUS_WAITING_CONFIRM, REVIEW_STATUS_WAITING_SBJ, REVIEW_STATUS_SUBMIT_SBJ, REVIEW_STATUS_RECEIPT_SBJ, REVIEW_STATUS_SBJ_ACCEPT, REVIEW_STATUS_SBJ_ACCEPT_NOT, REVIEW_STATUS_SUPPLEMENT, REVIEW_STATUS_SBJ_AUDIT, REVIEW_STATUS_PASS, REVIEW_STATUS_KEEP, REVIEW_STATUS_PART, REVIEW_STATUS_CLOSE, TM_EAV_PARTNER_UN_COMPLETE, TM_EAV_PARTNER_CONFIRMED)
        @NameInMap("Status")
        public String status;

        // 状态
        @NameInMap("StatusStr")
        public String statusStr;

        // 提交审核时间
        @NameInMap("SubmitAuditTime")
        public String submitAuditTime;

        @NameInMap("SubmitAuditTimeStr")
        public String submitAuditTimeStr;

        @NameInMap("SubmitAuditTimeValue")
        public Long submitAuditTimeValue;

        // 递交状态 (INIT, WAIT, ING, DONE, FAILED, CHECK)
        @NameInMap("SubmitStatus")
        public String submitStatus;

        // 递交商标局时间
        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("SubmitTimeStr")
        public String submitTimeStr;

        @NameInMap("SubmitTimeValue")
        public Long submitTimeValue;

        // 递交次数
        @NameInMap("SubmitTimes")
        public Integer submitTimes;

        // 商标基础信息
        @NameInMap("TrademarkName")
        public String trademarkName;

        // 商标基础信息
        @NameInMap("TrademarkNameType")
        public Integer trademarkNameType;

        // 商标申请号
        @NameInMap("TrademarkNumber")
        public String trademarkNumber;

        public static QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel self = new QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setExtendInfo(java.util.Map<String, String> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setLeafCodes(java.util.List<QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes> leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public java.util.List<QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelLeafCodes> getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setMaterialInfo(QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setRootCode(QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModelRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitAuditTime(String submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public String getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

    }

    public static class QueryTrademarkDetailByApplyNumber1ResponseBodyModule extends TeaModel {
        @NameInMap("TrademarkModel")
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel trademarkModel;

        public static QueryTrademarkDetailByApplyNumber1ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumber1ResponseBodyModule self = new QueryTrademarkDetailByApplyNumber1ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumber1ResponseBodyModule setTrademarkModel(QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel trademarkModel) {
            this.trademarkModel = trademarkModel;
            return this;
        }
        public QueryTrademarkDetailByApplyNumber1ResponseBodyModuleTrademarkModel getTrademarkModel() {
            return this.trademarkModel;
        }

    }

}
