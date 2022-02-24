// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyRequest extends TeaModel {
    @NameInMap("BizCategory")
    public java.util.Map<String, ?> bizCategory;

    @NameInMap("BizScope")
    public java.util.Map<String, ?> bizScope;

    @NameInMap("BizScopeKeyword")
    public String bizScopeKeyword;

    @NameInMap("BizStatus")
    public java.util.Map<String, ?> bizStatus;

    @NameInMap("BizType")
    public java.util.Map<String, ?> bizType;

    @NameInMap("BrandInfo")
    public java.util.Map<String, ?> brandInfo;

    @NameInMap("BuildTime")
    public java.util.Map<String, ?> buildTime;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("CompanyNames")
    public java.util.Map<String, ?> companyNames;

    @NameInMap("CompanyType")
    public java.util.Map<String, ?> companyType;

    @NameInMap("CorpHouseId")
    public Integer corpHouseId;

    @NameInMap("CorpHouseName")
    public String corpHouseName;

    @NameInMap("DataModuleIds")
    public java.util.Map<String, ?> dataModuleIds;

    @NameInMap("ElectronicBusinessYear")
    public String electronicBusinessYear;

    @NameInMap("ElectronicBusinessYearType")
    public String electronicBusinessYearType;

    @NameInMap("EsDateEnd")
    public String esDateEnd;

    @NameInMap("EsDateStart")
    public String esDateStart;

    @NameInMap("FetchFieldList")
    public java.util.Map<String, ?> fetchFieldList;

    @NameInMap("FetchLbsInfo")
    public Boolean fetchLbsInfo;

    @NameInMap("FilterUnusedCompany")
    public Boolean filterUnusedCompany;

    @NameInMap("HasFinance")
    public String hasFinance;

    @NameInMap("IsAboveScale")
    public String isAboveScale;

    @NameInMap("IsAgency")
    public String isAgency;

    @NameInMap("IsBidding")
    public String isBidding;

    @NameInMap("IsBranch")
    public String isBranch;

    @NameInMap("IsDeadNum")
    public String isDeadNum;

    @NameInMap("IsElectronicBusiness")
    public String isElectronicBusiness;

    @NameInMap("IsEmail")
    public String isEmail;

    @NameInMap("IsFixedPhone")
    public String isFixedPhone;

    @NameInMap("IsHasEShop")
    public String isHasEShop;

    @NameInMap("IsHomeUrl")
    public String isHomeUrl;

    @NameInMap("IsImportOutput")
    public String isImportOutput;

    @NameInMap("IsIndividual")
    public String isIndividual;

    @NameInMap("IsInvestment")
    public String isInvestment;

    @NameInMap("IsIpDomains")
    public String isIpDomains;

    @NameInMap("IsLegalComp")
    public String isLegalComp;

    @NameInMap("IsMobilePhone")
    public String isMobilePhone;

    @NameInMap("IsNormalCopyrights")
    public String isNormalCopyrights;

    @NameInMap("IsPatents")
    public String isPatents;

    @NameInMap("IsProductNames")
    public String isProductNames;

    @NameInMap("IsPublic")
    public String isPublic;

    @NameInMap("IsRecruit")
    public String isRecruit;

    @NameInMap("IsRiskLegalExecutions")
    public String isRiskLegalExecutions;

    @NameInMap("IsSoftCopyrights")
    public String isSoftCopyrights;

    @NameInMap("IsTierATaxpayer")
    public String isTierATaxpayer;

    @NameInMap("IsTrademarks")
    public String isTrademarks;

    @NameInMap("IsValidPhone")
    public String isValidPhone;

    @NameInMap("IsZone")
    public String isZone;

    @NameInMap("JobTimeLevel")
    public String jobTimeLevel;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("LbsParam")
    public java.util.Map<String, ?> lbsParam;

    @NameInMap("Lifecycle")
    public java.util.Map<String, ?> lifecycle;

    @NameInMap("ListedStatus")
    public java.util.Map<String, ?> listedStatus;

    @NameInMap("OneCompanyId")
    public String oneCompanyId;

    @NameInMap("OrderByType")
    public Integer orderByType;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PositionName")
    public String positionName;

    @NameInMap("PositionRequirement")
    public String positionRequirement;

    @NameInMap("PositionWelfare")
    public String positionWelfare;

    @NameInMap("PowerTag")
    public java.util.Map<String, ?> powerTag;

    @NameInMap("ProductShopMatch")
    public String productShopMatch;

    @NameInMap("PushDataLimit")
    public Long pushDataLimit;

    @NameInMap("PushUrl")
    public String pushUrl;

    @NameInMap("RecruitEducationLevel")
    public String recruitEducationLevel;

    @NameInMap("RecruitPayLevel")
    public String recruitPayLevel;

    @NameInMap("RecruitProvince")
    public String recruitProvince;

    @NameInMap("Regions")
    public java.util.Map<String, ?> regions;

    @NameInMap("RegisterCapital")
    public java.util.Map<String, ?> registerCapital;

    @NameInMap("RegisterCapitalEnd")
    public Integer registerCapitalEnd;

    @NameInMap("RegisterCapitalStart")
    public Integer registerCapitalStart;

    @NameInMap("RegisterCapitalType")
    public java.util.Map<String, ?> registerCapitalType;

    @NameInMap("SearchNewComp")
    public Boolean searchNewComp;

    @NameInMap("SpreadInfo")
    public java.util.Map<String, ?> spreadInfo;

    @NameInMap("StaffSize")
    public java.util.Map<String, ?> staffSize;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TransformRate")
    public java.util.Map<String, ?> transformRate;

    public static QueryCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyRequest self = new QueryCompanyRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompanyRequest setBizCategory(java.util.Map<String, ?> bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public java.util.Map<String, ?> getBizCategory() {
        return this.bizCategory;
    }

    public QueryCompanyRequest setBizScope(java.util.Map<String, ?> bizScope) {
        this.bizScope = bizScope;
        return this;
    }
    public java.util.Map<String, ?> getBizScope() {
        return this.bizScope;
    }

    public QueryCompanyRequest setBizScopeKeyword(String bizScopeKeyword) {
        this.bizScopeKeyword = bizScopeKeyword;
        return this;
    }
    public String getBizScopeKeyword() {
        return this.bizScopeKeyword;
    }

    public QueryCompanyRequest setBizStatus(java.util.Map<String, ?> bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public java.util.Map<String, ?> getBizStatus() {
        return this.bizStatus;
    }

    public QueryCompanyRequest setBizType(java.util.Map<String, ?> bizType) {
        this.bizType = bizType;
        return this;
    }
    public java.util.Map<String, ?> getBizType() {
        return this.bizType;
    }

    public QueryCompanyRequest setBrandInfo(java.util.Map<String, ?> brandInfo) {
        this.brandInfo = brandInfo;
        return this;
    }
    public java.util.Map<String, ?> getBrandInfo() {
        return this.brandInfo;
    }

    public QueryCompanyRequest setBuildTime(java.util.Map<String, ?> buildTime) {
        this.buildTime = buildTime;
        return this;
    }
    public java.util.Map<String, ?> getBuildTime() {
        return this.buildTime;
    }

    public QueryCompanyRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public QueryCompanyRequest setCompanyNames(java.util.Map<String, ?> companyNames) {
        this.companyNames = companyNames;
        return this;
    }
    public java.util.Map<String, ?> getCompanyNames() {
        return this.companyNames;
    }

    public QueryCompanyRequest setCompanyType(java.util.Map<String, ?> companyType) {
        this.companyType = companyType;
        return this;
    }
    public java.util.Map<String, ?> getCompanyType() {
        return this.companyType;
    }

    public QueryCompanyRequest setCorpHouseId(Integer corpHouseId) {
        this.corpHouseId = corpHouseId;
        return this;
    }
    public Integer getCorpHouseId() {
        return this.corpHouseId;
    }

    public QueryCompanyRequest setCorpHouseName(String corpHouseName) {
        this.corpHouseName = corpHouseName;
        return this;
    }
    public String getCorpHouseName() {
        return this.corpHouseName;
    }

    public QueryCompanyRequest setDataModuleIds(java.util.Map<String, ?> dataModuleIds) {
        this.dataModuleIds = dataModuleIds;
        return this;
    }
    public java.util.Map<String, ?> getDataModuleIds() {
        return this.dataModuleIds;
    }

    public QueryCompanyRequest setElectronicBusinessYear(String electronicBusinessYear) {
        this.electronicBusinessYear = electronicBusinessYear;
        return this;
    }
    public String getElectronicBusinessYear() {
        return this.electronicBusinessYear;
    }

    public QueryCompanyRequest setElectronicBusinessYearType(String electronicBusinessYearType) {
        this.electronicBusinessYearType = electronicBusinessYearType;
        return this;
    }
    public String getElectronicBusinessYearType() {
        return this.electronicBusinessYearType;
    }

    public QueryCompanyRequest setEsDateEnd(String esDateEnd) {
        this.esDateEnd = esDateEnd;
        return this;
    }
    public String getEsDateEnd() {
        return this.esDateEnd;
    }

    public QueryCompanyRequest setEsDateStart(String esDateStart) {
        this.esDateStart = esDateStart;
        return this;
    }
    public String getEsDateStart() {
        return this.esDateStart;
    }

    public QueryCompanyRequest setFetchFieldList(java.util.Map<String, ?> fetchFieldList) {
        this.fetchFieldList = fetchFieldList;
        return this;
    }
    public java.util.Map<String, ?> getFetchFieldList() {
        return this.fetchFieldList;
    }

    public QueryCompanyRequest setFetchLbsInfo(Boolean fetchLbsInfo) {
        this.fetchLbsInfo = fetchLbsInfo;
        return this;
    }
    public Boolean getFetchLbsInfo() {
        return this.fetchLbsInfo;
    }

    public QueryCompanyRequest setFilterUnusedCompany(Boolean filterUnusedCompany) {
        this.filterUnusedCompany = filterUnusedCompany;
        return this;
    }
    public Boolean getFilterUnusedCompany() {
        return this.filterUnusedCompany;
    }

    public QueryCompanyRequest setHasFinance(String hasFinance) {
        this.hasFinance = hasFinance;
        return this;
    }
    public String getHasFinance() {
        return this.hasFinance;
    }

    public QueryCompanyRequest setIsAboveScale(String isAboveScale) {
        this.isAboveScale = isAboveScale;
        return this;
    }
    public String getIsAboveScale() {
        return this.isAboveScale;
    }

    public QueryCompanyRequest setIsAgency(String isAgency) {
        this.isAgency = isAgency;
        return this;
    }
    public String getIsAgency() {
        return this.isAgency;
    }

    public QueryCompanyRequest setIsBidding(String isBidding) {
        this.isBidding = isBidding;
        return this;
    }
    public String getIsBidding() {
        return this.isBidding;
    }

    public QueryCompanyRequest setIsBranch(String isBranch) {
        this.isBranch = isBranch;
        return this;
    }
    public String getIsBranch() {
        return this.isBranch;
    }

    public QueryCompanyRequest setIsDeadNum(String isDeadNum) {
        this.isDeadNum = isDeadNum;
        return this;
    }
    public String getIsDeadNum() {
        return this.isDeadNum;
    }

    public QueryCompanyRequest setIsElectronicBusiness(String isElectronicBusiness) {
        this.isElectronicBusiness = isElectronicBusiness;
        return this;
    }
    public String getIsElectronicBusiness() {
        return this.isElectronicBusiness;
    }

    public QueryCompanyRequest setIsEmail(String isEmail) {
        this.isEmail = isEmail;
        return this;
    }
    public String getIsEmail() {
        return this.isEmail;
    }

    public QueryCompanyRequest setIsFixedPhone(String isFixedPhone) {
        this.isFixedPhone = isFixedPhone;
        return this;
    }
    public String getIsFixedPhone() {
        return this.isFixedPhone;
    }

    public QueryCompanyRequest setIsHasEShop(String isHasEShop) {
        this.isHasEShop = isHasEShop;
        return this;
    }
    public String getIsHasEShop() {
        return this.isHasEShop;
    }

    public QueryCompanyRequest setIsHomeUrl(String isHomeUrl) {
        this.isHomeUrl = isHomeUrl;
        return this;
    }
    public String getIsHomeUrl() {
        return this.isHomeUrl;
    }

    public QueryCompanyRequest setIsImportOutput(String isImportOutput) {
        this.isImportOutput = isImportOutput;
        return this;
    }
    public String getIsImportOutput() {
        return this.isImportOutput;
    }

    public QueryCompanyRequest setIsIndividual(String isIndividual) {
        this.isIndividual = isIndividual;
        return this;
    }
    public String getIsIndividual() {
        return this.isIndividual;
    }

    public QueryCompanyRequest setIsInvestment(String isInvestment) {
        this.isInvestment = isInvestment;
        return this;
    }
    public String getIsInvestment() {
        return this.isInvestment;
    }

    public QueryCompanyRequest setIsIpDomains(String isIpDomains) {
        this.isIpDomains = isIpDomains;
        return this;
    }
    public String getIsIpDomains() {
        return this.isIpDomains;
    }

    public QueryCompanyRequest setIsLegalComp(String isLegalComp) {
        this.isLegalComp = isLegalComp;
        return this;
    }
    public String getIsLegalComp() {
        return this.isLegalComp;
    }

    public QueryCompanyRequest setIsMobilePhone(String isMobilePhone) {
        this.isMobilePhone = isMobilePhone;
        return this;
    }
    public String getIsMobilePhone() {
        return this.isMobilePhone;
    }

    public QueryCompanyRequest setIsNormalCopyrights(String isNormalCopyrights) {
        this.isNormalCopyrights = isNormalCopyrights;
        return this;
    }
    public String getIsNormalCopyrights() {
        return this.isNormalCopyrights;
    }

    public QueryCompanyRequest setIsPatents(String isPatents) {
        this.isPatents = isPatents;
        return this;
    }
    public String getIsPatents() {
        return this.isPatents;
    }

    public QueryCompanyRequest setIsProductNames(String isProductNames) {
        this.isProductNames = isProductNames;
        return this;
    }
    public String getIsProductNames() {
        return this.isProductNames;
    }

    public QueryCompanyRequest setIsPublic(String isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public String getIsPublic() {
        return this.isPublic;
    }

    public QueryCompanyRequest setIsRecruit(String isRecruit) {
        this.isRecruit = isRecruit;
        return this;
    }
    public String getIsRecruit() {
        return this.isRecruit;
    }

    public QueryCompanyRequest setIsRiskLegalExecutions(String isRiskLegalExecutions) {
        this.isRiskLegalExecutions = isRiskLegalExecutions;
        return this;
    }
    public String getIsRiskLegalExecutions() {
        return this.isRiskLegalExecutions;
    }

    public QueryCompanyRequest setIsSoftCopyrights(String isSoftCopyrights) {
        this.isSoftCopyrights = isSoftCopyrights;
        return this;
    }
    public String getIsSoftCopyrights() {
        return this.isSoftCopyrights;
    }

    public QueryCompanyRequest setIsTierATaxpayer(String isTierATaxpayer) {
        this.isTierATaxpayer = isTierATaxpayer;
        return this;
    }
    public String getIsTierATaxpayer() {
        return this.isTierATaxpayer;
    }

    public QueryCompanyRequest setIsTrademarks(String isTrademarks) {
        this.isTrademarks = isTrademarks;
        return this;
    }
    public String getIsTrademarks() {
        return this.isTrademarks;
    }

    public QueryCompanyRequest setIsValidPhone(String isValidPhone) {
        this.isValidPhone = isValidPhone;
        return this;
    }
    public String getIsValidPhone() {
        return this.isValidPhone;
    }

    public QueryCompanyRequest setIsZone(String isZone) {
        this.isZone = isZone;
        return this;
    }
    public String getIsZone() {
        return this.isZone;
    }

    public QueryCompanyRequest setJobTimeLevel(String jobTimeLevel) {
        this.jobTimeLevel = jobTimeLevel;
        return this;
    }
    public String getJobTimeLevel() {
        return this.jobTimeLevel;
    }

    public QueryCompanyRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryCompanyRequest setLbsParam(java.util.Map<String, ?> lbsParam) {
        this.lbsParam = lbsParam;
        return this;
    }
    public java.util.Map<String, ?> getLbsParam() {
        return this.lbsParam;
    }

    public QueryCompanyRequest setLifecycle(java.util.Map<String, ?> lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public java.util.Map<String, ?> getLifecycle() {
        return this.lifecycle;
    }

    public QueryCompanyRequest setListedStatus(java.util.Map<String, ?> listedStatus) {
        this.listedStatus = listedStatus;
        return this;
    }
    public java.util.Map<String, ?> getListedStatus() {
        return this.listedStatus;
    }

    public QueryCompanyRequest setOneCompanyId(String oneCompanyId) {
        this.oneCompanyId = oneCompanyId;
        return this;
    }
    public String getOneCompanyId() {
        return this.oneCompanyId;
    }

    public QueryCompanyRequest setOrderByType(Integer orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public Integer getOrderByType() {
        return this.orderByType;
    }

    public QueryCompanyRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryCompanyRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryCompanyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCompanyRequest setPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }
    public String getPositionName() {
        return this.positionName;
    }

    public QueryCompanyRequest setPositionRequirement(String positionRequirement) {
        this.positionRequirement = positionRequirement;
        return this;
    }
    public String getPositionRequirement() {
        return this.positionRequirement;
    }

    public QueryCompanyRequest setPositionWelfare(String positionWelfare) {
        this.positionWelfare = positionWelfare;
        return this;
    }
    public String getPositionWelfare() {
        return this.positionWelfare;
    }

    public QueryCompanyRequest setPowerTag(java.util.Map<String, ?> powerTag) {
        this.powerTag = powerTag;
        return this;
    }
    public java.util.Map<String, ?> getPowerTag() {
        return this.powerTag;
    }

    public QueryCompanyRequest setProductShopMatch(String productShopMatch) {
        this.productShopMatch = productShopMatch;
        return this;
    }
    public String getProductShopMatch() {
        return this.productShopMatch;
    }

    public QueryCompanyRequest setPushDataLimit(Long pushDataLimit) {
        this.pushDataLimit = pushDataLimit;
        return this;
    }
    public Long getPushDataLimit() {
        return this.pushDataLimit;
    }

    public QueryCompanyRequest setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
        return this;
    }
    public String getPushUrl() {
        return this.pushUrl;
    }

    public QueryCompanyRequest setRecruitEducationLevel(String recruitEducationLevel) {
        this.recruitEducationLevel = recruitEducationLevel;
        return this;
    }
    public String getRecruitEducationLevel() {
        return this.recruitEducationLevel;
    }

    public QueryCompanyRequest setRecruitPayLevel(String recruitPayLevel) {
        this.recruitPayLevel = recruitPayLevel;
        return this;
    }
    public String getRecruitPayLevel() {
        return this.recruitPayLevel;
    }

    public QueryCompanyRequest setRecruitProvince(String recruitProvince) {
        this.recruitProvince = recruitProvince;
        return this;
    }
    public String getRecruitProvince() {
        return this.recruitProvince;
    }

    public QueryCompanyRequest setRegions(java.util.Map<String, ?> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.Map<String, ?> getRegions() {
        return this.regions;
    }

    public QueryCompanyRequest setRegisterCapital(java.util.Map<String, ?> registerCapital) {
        this.registerCapital = registerCapital;
        return this;
    }
    public java.util.Map<String, ?> getRegisterCapital() {
        return this.registerCapital;
    }

    public QueryCompanyRequest setRegisterCapitalEnd(Integer registerCapitalEnd) {
        this.registerCapitalEnd = registerCapitalEnd;
        return this;
    }
    public Integer getRegisterCapitalEnd() {
        return this.registerCapitalEnd;
    }

    public QueryCompanyRequest setRegisterCapitalStart(Integer registerCapitalStart) {
        this.registerCapitalStart = registerCapitalStart;
        return this;
    }
    public Integer getRegisterCapitalStart() {
        return this.registerCapitalStart;
    }

    public QueryCompanyRequest setRegisterCapitalType(java.util.Map<String, ?> registerCapitalType) {
        this.registerCapitalType = registerCapitalType;
        return this;
    }
    public java.util.Map<String, ?> getRegisterCapitalType() {
        return this.registerCapitalType;
    }

    public QueryCompanyRequest setSearchNewComp(Boolean searchNewComp) {
        this.searchNewComp = searchNewComp;
        return this;
    }
    public Boolean getSearchNewComp() {
        return this.searchNewComp;
    }

    public QueryCompanyRequest setSpreadInfo(java.util.Map<String, ?> spreadInfo) {
        this.spreadInfo = spreadInfo;
        return this;
    }
    public java.util.Map<String, ?> getSpreadInfo() {
        return this.spreadInfo;
    }

    public QueryCompanyRequest setStaffSize(java.util.Map<String, ?> staffSize) {
        this.staffSize = staffSize;
        return this;
    }
    public java.util.Map<String, ?> getStaffSize() {
        return this.staffSize;
    }

    public QueryCompanyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryCompanyRequest setTransformRate(java.util.Map<String, ?> transformRate) {
        this.transformRate = transformRate;
        return this;
    }
    public java.util.Map<String, ?> getTransformRate() {
        return this.transformRate;
    }

}
