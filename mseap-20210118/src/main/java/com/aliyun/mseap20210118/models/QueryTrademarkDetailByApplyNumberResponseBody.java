// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberResponseBody extends TeaModel {
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
    public QueryTrademarkDetailByApplyNumberResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTrademarkDetailByApplyNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberResponseBody self = new QueryTrademarkDetailByApplyNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setModule(QueryTrademarkDetailByApplyNumberResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryTrademarkDetailByApplyNumberResponseBodyModule getModule() {
        return this.module;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes extends TeaModel {
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

        public static QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes self = new QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setAssociated(Boolean associated) {
            this.associated = associated;
            return this;
        }
        public Boolean getAssociated() {
            return this.associated;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo extends TeaModel {
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

        public static QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo self = new QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }
        public String getContactPhoneNumber() {
            return this.contactPhoneNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setReviewFileMap(java.util.Map<String, String> reviewFileMap) {
            this.reviewFileMap = reviewFileMap;
            return this;
        }
        public java.util.Map<String, String> getReviewFileMap() {
            return this.reviewFileMap;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode extends TeaModel {
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

        public static QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode self = new QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setAssociated(Boolean associated) {
            this.associated = associated;
            return this;
        }
        public Boolean getAssociated() {
            return this.associated;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel extends TeaModel {
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
        public java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes> leafCodes;

        // 申请人信息
        @NameInMap("MaterialInfo")
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo materialInfo;

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
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode rootCode;

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

        public static QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel self = new QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setExtendInfo(java.util.Map<String, String> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setLeafCodes(java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes> leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelLeafCodes> getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setMaterialInfo(QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setRootCode(QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModelRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitAuditTime(String submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public String getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyModule extends TeaModel {
        @NameInMap("TrademarkModel")
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel trademarkModel;

        public static QueryTrademarkDetailByApplyNumberResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyModule self = new QueryTrademarkDetailByApplyNumberResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyModule setTrademarkModel(QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel trademarkModel) {
            this.trademarkModel = trademarkModel;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyModuleTrademarkModel getTrademarkModel() {
            return this.trademarkModel;
        }

    }

}
