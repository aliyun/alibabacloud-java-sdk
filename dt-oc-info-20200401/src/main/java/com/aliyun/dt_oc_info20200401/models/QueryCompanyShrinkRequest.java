// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyShrinkRequest extends TeaModel {
    @NameInMap("BizCategory")
    public String bizCategoryShrink;

    @NameInMap("BizScope")
    public String bizScopeShrink;

    @NameInMap("BizScopeKeyword")
    public String bizScopeKeyword;

    @NameInMap("BizStatus")
    public String bizStatusShrink;

    @NameInMap("BizType")
    public String bizTypeShrink;

    @NameInMap("BrandInfo")
    public String brandInfoShrink;

    @NameInMap("BuildTime")
    public String buildTimeShrink;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("CompanyNames")
    public String companyNamesShrink;

    @NameInMap("CompanyType")
    public String companyTypeShrink;

    @NameInMap("CorpHouseId")
    public Integer corpHouseId;

    @NameInMap("CorpHouseName")
    public String corpHouseName;

    @NameInMap("DataModuleIds")
    public String dataModuleIdsShrink;

    @NameInMap("ElectronicBusinessYear")
    public String electronicBusinessYear;

    @NameInMap("ElectronicBusinessYearType")
    public String electronicBusinessYearType;

    @NameInMap("EsDateEnd")
    public String esDateEnd;

    @NameInMap("EsDateStart")
    public String esDateStart;

    @NameInMap("FetchFieldList")
    public String fetchFieldListShrink;

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
    public String lbsParamShrink;

    @NameInMap("Lifecycle")
    public String lifecycleShrink;

    @NameInMap("ListedStatus")
    public String listedStatusShrink;

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
    public String powerTagShrink;

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
    public String regionsShrink;

    @NameInMap("RegisterCapital")
    public String registerCapitalShrink;

    @NameInMap("RegisterCapitalEnd")
    public Integer registerCapitalEnd;

    @NameInMap("RegisterCapitalStart")
    public Integer registerCapitalStart;

    @NameInMap("RegisterCapitalType")
    public String registerCapitalTypeShrink;

    @NameInMap("SearchNewComp")
    public Boolean searchNewComp;

    @NameInMap("SpreadInfo")
    public String spreadInfoShrink;

    @NameInMap("StaffSize")
    public String staffSizeShrink;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TransformRate")
    public String transformRateShrink;

    public static QueryCompanyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyShrinkRequest self = new QueryCompanyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompanyShrinkRequest setBizCategoryShrink(String bizCategoryShrink) {
        this.bizCategoryShrink = bizCategoryShrink;
        return this;
    }
    public String getBizCategoryShrink() {
        return this.bizCategoryShrink;
    }

    public QueryCompanyShrinkRequest setBizScopeShrink(String bizScopeShrink) {
        this.bizScopeShrink = bizScopeShrink;
        return this;
    }
    public String getBizScopeShrink() {
        return this.bizScopeShrink;
    }

    public QueryCompanyShrinkRequest setBizScopeKeyword(String bizScopeKeyword) {
        this.bizScopeKeyword = bizScopeKeyword;
        return this;
    }
    public String getBizScopeKeyword() {
        return this.bizScopeKeyword;
    }

    public QueryCompanyShrinkRequest setBizStatusShrink(String bizStatusShrink) {
        this.bizStatusShrink = bizStatusShrink;
        return this;
    }
    public String getBizStatusShrink() {
        return this.bizStatusShrink;
    }

    public QueryCompanyShrinkRequest setBizTypeShrink(String bizTypeShrink) {
        this.bizTypeShrink = bizTypeShrink;
        return this;
    }
    public String getBizTypeShrink() {
        return this.bizTypeShrink;
    }

    public QueryCompanyShrinkRequest setBrandInfoShrink(String brandInfoShrink) {
        this.brandInfoShrink = brandInfoShrink;
        return this;
    }
    public String getBrandInfoShrink() {
        return this.brandInfoShrink;
    }

    public QueryCompanyShrinkRequest setBuildTimeShrink(String buildTimeShrink) {
        this.buildTimeShrink = buildTimeShrink;
        return this;
    }
    public String getBuildTimeShrink() {
        return this.buildTimeShrink;
    }

    public QueryCompanyShrinkRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public QueryCompanyShrinkRequest setCompanyNamesShrink(String companyNamesShrink) {
        this.companyNamesShrink = companyNamesShrink;
        return this;
    }
    public String getCompanyNamesShrink() {
        return this.companyNamesShrink;
    }

    public QueryCompanyShrinkRequest setCompanyTypeShrink(String companyTypeShrink) {
        this.companyTypeShrink = companyTypeShrink;
        return this;
    }
    public String getCompanyTypeShrink() {
        return this.companyTypeShrink;
    }

    public QueryCompanyShrinkRequest setCorpHouseId(Integer corpHouseId) {
        this.corpHouseId = corpHouseId;
        return this;
    }
    public Integer getCorpHouseId() {
        return this.corpHouseId;
    }

    public QueryCompanyShrinkRequest setCorpHouseName(String corpHouseName) {
        this.corpHouseName = corpHouseName;
        return this;
    }
    public String getCorpHouseName() {
        return this.corpHouseName;
    }

    public QueryCompanyShrinkRequest setDataModuleIdsShrink(String dataModuleIdsShrink) {
        this.dataModuleIdsShrink = dataModuleIdsShrink;
        return this;
    }
    public String getDataModuleIdsShrink() {
        return this.dataModuleIdsShrink;
    }

    public QueryCompanyShrinkRequest setElectronicBusinessYear(String electronicBusinessYear) {
        this.electronicBusinessYear = electronicBusinessYear;
        return this;
    }
    public String getElectronicBusinessYear() {
        return this.electronicBusinessYear;
    }

    public QueryCompanyShrinkRequest setElectronicBusinessYearType(String electronicBusinessYearType) {
        this.electronicBusinessYearType = electronicBusinessYearType;
        return this;
    }
    public String getElectronicBusinessYearType() {
        return this.electronicBusinessYearType;
    }

    public QueryCompanyShrinkRequest setEsDateEnd(String esDateEnd) {
        this.esDateEnd = esDateEnd;
        return this;
    }
    public String getEsDateEnd() {
        return this.esDateEnd;
    }

    public QueryCompanyShrinkRequest setEsDateStart(String esDateStart) {
        this.esDateStart = esDateStart;
        return this;
    }
    public String getEsDateStart() {
        return this.esDateStart;
    }

    public QueryCompanyShrinkRequest setFetchFieldListShrink(String fetchFieldListShrink) {
        this.fetchFieldListShrink = fetchFieldListShrink;
        return this;
    }
    public String getFetchFieldListShrink() {
        return this.fetchFieldListShrink;
    }

    public QueryCompanyShrinkRequest setFetchLbsInfo(Boolean fetchLbsInfo) {
        this.fetchLbsInfo = fetchLbsInfo;
        return this;
    }
    public Boolean getFetchLbsInfo() {
        return this.fetchLbsInfo;
    }

    public QueryCompanyShrinkRequest setFilterUnusedCompany(Boolean filterUnusedCompany) {
        this.filterUnusedCompany = filterUnusedCompany;
        return this;
    }
    public Boolean getFilterUnusedCompany() {
        return this.filterUnusedCompany;
    }

    public QueryCompanyShrinkRequest setHasFinance(String hasFinance) {
        this.hasFinance = hasFinance;
        return this;
    }
    public String getHasFinance() {
        return this.hasFinance;
    }

    public QueryCompanyShrinkRequest setIsAboveScale(String isAboveScale) {
        this.isAboveScale = isAboveScale;
        return this;
    }
    public String getIsAboveScale() {
        return this.isAboveScale;
    }

    public QueryCompanyShrinkRequest setIsAgency(String isAgency) {
        this.isAgency = isAgency;
        return this;
    }
    public String getIsAgency() {
        return this.isAgency;
    }

    public QueryCompanyShrinkRequest setIsBidding(String isBidding) {
        this.isBidding = isBidding;
        return this;
    }
    public String getIsBidding() {
        return this.isBidding;
    }

    public QueryCompanyShrinkRequest setIsBranch(String isBranch) {
        this.isBranch = isBranch;
        return this;
    }
    public String getIsBranch() {
        return this.isBranch;
    }

    public QueryCompanyShrinkRequest setIsDeadNum(String isDeadNum) {
        this.isDeadNum = isDeadNum;
        return this;
    }
    public String getIsDeadNum() {
        return this.isDeadNum;
    }

    public QueryCompanyShrinkRequest setIsElectronicBusiness(String isElectronicBusiness) {
        this.isElectronicBusiness = isElectronicBusiness;
        return this;
    }
    public String getIsElectronicBusiness() {
        return this.isElectronicBusiness;
    }

    public QueryCompanyShrinkRequest setIsEmail(String isEmail) {
        this.isEmail = isEmail;
        return this;
    }
    public String getIsEmail() {
        return this.isEmail;
    }

    public QueryCompanyShrinkRequest setIsFixedPhone(String isFixedPhone) {
        this.isFixedPhone = isFixedPhone;
        return this;
    }
    public String getIsFixedPhone() {
        return this.isFixedPhone;
    }

    public QueryCompanyShrinkRequest setIsHasEShop(String isHasEShop) {
        this.isHasEShop = isHasEShop;
        return this;
    }
    public String getIsHasEShop() {
        return this.isHasEShop;
    }

    public QueryCompanyShrinkRequest setIsHomeUrl(String isHomeUrl) {
        this.isHomeUrl = isHomeUrl;
        return this;
    }
    public String getIsHomeUrl() {
        return this.isHomeUrl;
    }

    public QueryCompanyShrinkRequest setIsImportOutput(String isImportOutput) {
        this.isImportOutput = isImportOutput;
        return this;
    }
    public String getIsImportOutput() {
        return this.isImportOutput;
    }

    public QueryCompanyShrinkRequest setIsIndividual(String isIndividual) {
        this.isIndividual = isIndividual;
        return this;
    }
    public String getIsIndividual() {
        return this.isIndividual;
    }

    public QueryCompanyShrinkRequest setIsInvestment(String isInvestment) {
        this.isInvestment = isInvestment;
        return this;
    }
    public String getIsInvestment() {
        return this.isInvestment;
    }

    public QueryCompanyShrinkRequest setIsIpDomains(String isIpDomains) {
        this.isIpDomains = isIpDomains;
        return this;
    }
    public String getIsIpDomains() {
        return this.isIpDomains;
    }

    public QueryCompanyShrinkRequest setIsLegalComp(String isLegalComp) {
        this.isLegalComp = isLegalComp;
        return this;
    }
    public String getIsLegalComp() {
        return this.isLegalComp;
    }

    public QueryCompanyShrinkRequest setIsMobilePhone(String isMobilePhone) {
        this.isMobilePhone = isMobilePhone;
        return this;
    }
    public String getIsMobilePhone() {
        return this.isMobilePhone;
    }

    public QueryCompanyShrinkRequest setIsNormalCopyrights(String isNormalCopyrights) {
        this.isNormalCopyrights = isNormalCopyrights;
        return this;
    }
    public String getIsNormalCopyrights() {
        return this.isNormalCopyrights;
    }

    public QueryCompanyShrinkRequest setIsPatents(String isPatents) {
        this.isPatents = isPatents;
        return this;
    }
    public String getIsPatents() {
        return this.isPatents;
    }

    public QueryCompanyShrinkRequest setIsProductNames(String isProductNames) {
        this.isProductNames = isProductNames;
        return this;
    }
    public String getIsProductNames() {
        return this.isProductNames;
    }

    public QueryCompanyShrinkRequest setIsPublic(String isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public String getIsPublic() {
        return this.isPublic;
    }

    public QueryCompanyShrinkRequest setIsRecruit(String isRecruit) {
        this.isRecruit = isRecruit;
        return this;
    }
    public String getIsRecruit() {
        return this.isRecruit;
    }

    public QueryCompanyShrinkRequest setIsRiskLegalExecutions(String isRiskLegalExecutions) {
        this.isRiskLegalExecutions = isRiskLegalExecutions;
        return this;
    }
    public String getIsRiskLegalExecutions() {
        return this.isRiskLegalExecutions;
    }

    public QueryCompanyShrinkRequest setIsSoftCopyrights(String isSoftCopyrights) {
        this.isSoftCopyrights = isSoftCopyrights;
        return this;
    }
    public String getIsSoftCopyrights() {
        return this.isSoftCopyrights;
    }

    public QueryCompanyShrinkRequest setIsTierATaxpayer(String isTierATaxpayer) {
        this.isTierATaxpayer = isTierATaxpayer;
        return this;
    }
    public String getIsTierATaxpayer() {
        return this.isTierATaxpayer;
    }

    public QueryCompanyShrinkRequest setIsTrademarks(String isTrademarks) {
        this.isTrademarks = isTrademarks;
        return this;
    }
    public String getIsTrademarks() {
        return this.isTrademarks;
    }

    public QueryCompanyShrinkRequest setIsValidPhone(String isValidPhone) {
        this.isValidPhone = isValidPhone;
        return this;
    }
    public String getIsValidPhone() {
        return this.isValidPhone;
    }

    public QueryCompanyShrinkRequest setIsZone(String isZone) {
        this.isZone = isZone;
        return this;
    }
    public String getIsZone() {
        return this.isZone;
    }

    public QueryCompanyShrinkRequest setJobTimeLevel(String jobTimeLevel) {
        this.jobTimeLevel = jobTimeLevel;
        return this;
    }
    public String getJobTimeLevel() {
        return this.jobTimeLevel;
    }

    public QueryCompanyShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryCompanyShrinkRequest setLbsParamShrink(String lbsParamShrink) {
        this.lbsParamShrink = lbsParamShrink;
        return this;
    }
    public String getLbsParamShrink() {
        return this.lbsParamShrink;
    }

    public QueryCompanyShrinkRequest setLifecycleShrink(String lifecycleShrink) {
        this.lifecycleShrink = lifecycleShrink;
        return this;
    }
    public String getLifecycleShrink() {
        return this.lifecycleShrink;
    }

    public QueryCompanyShrinkRequest setListedStatusShrink(String listedStatusShrink) {
        this.listedStatusShrink = listedStatusShrink;
        return this;
    }
    public String getListedStatusShrink() {
        return this.listedStatusShrink;
    }

    public QueryCompanyShrinkRequest setOneCompanyId(String oneCompanyId) {
        this.oneCompanyId = oneCompanyId;
        return this;
    }
    public String getOneCompanyId() {
        return this.oneCompanyId;
    }

    public QueryCompanyShrinkRequest setOrderByType(Integer orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public Integer getOrderByType() {
        return this.orderByType;
    }

    public QueryCompanyShrinkRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryCompanyShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryCompanyShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCompanyShrinkRequest setPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }
    public String getPositionName() {
        return this.positionName;
    }

    public QueryCompanyShrinkRequest setPositionRequirement(String positionRequirement) {
        this.positionRequirement = positionRequirement;
        return this;
    }
    public String getPositionRequirement() {
        return this.positionRequirement;
    }

    public QueryCompanyShrinkRequest setPositionWelfare(String positionWelfare) {
        this.positionWelfare = positionWelfare;
        return this;
    }
    public String getPositionWelfare() {
        return this.positionWelfare;
    }

    public QueryCompanyShrinkRequest setPowerTagShrink(String powerTagShrink) {
        this.powerTagShrink = powerTagShrink;
        return this;
    }
    public String getPowerTagShrink() {
        return this.powerTagShrink;
    }

    public QueryCompanyShrinkRequest setProductShopMatch(String productShopMatch) {
        this.productShopMatch = productShopMatch;
        return this;
    }
    public String getProductShopMatch() {
        return this.productShopMatch;
    }

    public QueryCompanyShrinkRequest setPushDataLimit(Long pushDataLimit) {
        this.pushDataLimit = pushDataLimit;
        return this;
    }
    public Long getPushDataLimit() {
        return this.pushDataLimit;
    }

    public QueryCompanyShrinkRequest setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
        return this;
    }
    public String getPushUrl() {
        return this.pushUrl;
    }

    public QueryCompanyShrinkRequest setRecruitEducationLevel(String recruitEducationLevel) {
        this.recruitEducationLevel = recruitEducationLevel;
        return this;
    }
    public String getRecruitEducationLevel() {
        return this.recruitEducationLevel;
    }

    public QueryCompanyShrinkRequest setRecruitPayLevel(String recruitPayLevel) {
        this.recruitPayLevel = recruitPayLevel;
        return this;
    }
    public String getRecruitPayLevel() {
        return this.recruitPayLevel;
    }

    public QueryCompanyShrinkRequest setRecruitProvince(String recruitProvince) {
        this.recruitProvince = recruitProvince;
        return this;
    }
    public String getRecruitProvince() {
        return this.recruitProvince;
    }

    public QueryCompanyShrinkRequest setRegionsShrink(String regionsShrink) {
        this.regionsShrink = regionsShrink;
        return this;
    }
    public String getRegionsShrink() {
        return this.regionsShrink;
    }

    public QueryCompanyShrinkRequest setRegisterCapitalShrink(String registerCapitalShrink) {
        this.registerCapitalShrink = registerCapitalShrink;
        return this;
    }
    public String getRegisterCapitalShrink() {
        return this.registerCapitalShrink;
    }

    public QueryCompanyShrinkRequest setRegisterCapitalEnd(Integer registerCapitalEnd) {
        this.registerCapitalEnd = registerCapitalEnd;
        return this;
    }
    public Integer getRegisterCapitalEnd() {
        return this.registerCapitalEnd;
    }

    public QueryCompanyShrinkRequest setRegisterCapitalStart(Integer registerCapitalStart) {
        this.registerCapitalStart = registerCapitalStart;
        return this;
    }
    public Integer getRegisterCapitalStart() {
        return this.registerCapitalStart;
    }

    public QueryCompanyShrinkRequest setRegisterCapitalTypeShrink(String registerCapitalTypeShrink) {
        this.registerCapitalTypeShrink = registerCapitalTypeShrink;
        return this;
    }
    public String getRegisterCapitalTypeShrink() {
        return this.registerCapitalTypeShrink;
    }

    public QueryCompanyShrinkRequest setSearchNewComp(Boolean searchNewComp) {
        this.searchNewComp = searchNewComp;
        return this;
    }
    public Boolean getSearchNewComp() {
        return this.searchNewComp;
    }

    public QueryCompanyShrinkRequest setSpreadInfoShrink(String spreadInfoShrink) {
        this.spreadInfoShrink = spreadInfoShrink;
        return this;
    }
    public String getSpreadInfoShrink() {
        return this.spreadInfoShrink;
    }

    public QueryCompanyShrinkRequest setStaffSizeShrink(String staffSizeShrink) {
        this.staffSizeShrink = staffSizeShrink;
        return this;
    }
    public String getStaffSizeShrink() {
        return this.staffSizeShrink;
    }

    public QueryCompanyShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryCompanyShrinkRequest setTransformRateShrink(String transformRateShrink) {
        this.transformRateShrink = transformRateShrink;
        return this;
    }
    public String getTransformRateShrink() {
        return this.transformRateShrink;
    }

}
