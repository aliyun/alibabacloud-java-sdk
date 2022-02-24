// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class ListCompaniesRequest extends TeaModel {
    @NameInMap("BizCategories")
    public java.util.Map<String, ?> bizCategories;

    @NameInMap("BizInfo")
    public java.util.Map<String, ?> bizInfo;

    @NameInMap("BizScopeKeyword")
    public java.util.Map<String, ?> bizScopeKeyword;

    @NameInMap("BizStatus")
    public java.util.Map<String, ?> bizStatus;

    @NameInMap("BizType")
    public java.util.Map<String, ?> bizType;

    @NameInMap("BrandInfo")
    public java.util.Map<String, ?> brandInfo;

    @NameInMap("BuildTime")
    public java.util.Map<String, ?> buildTime;

    @NameInMap("CompanyType")
    public java.util.Map<String, ?> companyType;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("LicenseNumber")
    public String licenseNumber;

    @NameInMap("Lifecycle")
    public java.util.Map<String, ?> lifecycle;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NewCorp")
    public String newCorp;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OrderBy")
    public java.util.Map<String, ?> orderBy;

    @NameInMap("OrgNo")
    public String orgNo;

    @NameInMap("ProductShopMatch")
    public String productShopMatch;

    @NameInMap("RecCap")
    public String recCap;

    @NameInMap("Regions")
    public java.util.Map<String, ?> regions;

    @NameInMap("RegisterAssert")
    public java.util.Map<String, ?> registerAssert;

    @NameInMap("SpreadInfo")
    public java.util.Map<String, ?> spreadInfo;

    @NameInMap("StaffSize")
    public java.util.Map<String, ?> staffSize;

    public static ListCompaniesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompaniesRequest self = new ListCompaniesRequest();
        return TeaModel.build(map, self);
    }

    public ListCompaniesRequest setBizCategories(java.util.Map<String, ?> bizCategories) {
        this.bizCategories = bizCategories;
        return this;
    }
    public java.util.Map<String, ?> getBizCategories() {
        return this.bizCategories;
    }

    public ListCompaniesRequest setBizInfo(java.util.Map<String, ?> bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public java.util.Map<String, ?> getBizInfo() {
        return this.bizInfo;
    }

    public ListCompaniesRequest setBizScopeKeyword(java.util.Map<String, ?> bizScopeKeyword) {
        this.bizScopeKeyword = bizScopeKeyword;
        return this;
    }
    public java.util.Map<String, ?> getBizScopeKeyword() {
        return this.bizScopeKeyword;
    }

    public ListCompaniesRequest setBizStatus(java.util.Map<String, ?> bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public java.util.Map<String, ?> getBizStatus() {
        return this.bizStatus;
    }

    public ListCompaniesRequest setBizType(java.util.Map<String, ?> bizType) {
        this.bizType = bizType;
        return this;
    }
    public java.util.Map<String, ?> getBizType() {
        return this.bizType;
    }

    public ListCompaniesRequest setBrandInfo(java.util.Map<String, ?> brandInfo) {
        this.brandInfo = brandInfo;
        return this;
    }
    public java.util.Map<String, ?> getBrandInfo() {
        return this.brandInfo;
    }

    public ListCompaniesRequest setBuildTime(java.util.Map<String, ?> buildTime) {
        this.buildTime = buildTime;
        return this;
    }
    public java.util.Map<String, ?> getBuildTime() {
        return this.buildTime;
    }

    public ListCompaniesRequest setCompanyType(java.util.Map<String, ?> companyType) {
        this.companyType = companyType;
        return this;
    }
    public java.util.Map<String, ?> getCompanyType() {
        return this.companyType;
    }

    public ListCompaniesRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ListCompaniesRequest setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public ListCompaniesRequest setLifecycle(java.util.Map<String, ?> lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public java.util.Map<String, ?> getLifecycle() {
        return this.lifecycle;
    }

    public ListCompaniesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListCompaniesRequest setNewCorp(String newCorp) {
        this.newCorp = newCorp;
        return this;
    }
    public String getNewCorp() {
        return this.newCorp;
    }

    public ListCompaniesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListCompaniesRequest setOrderBy(java.util.Map<String, ?> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.Map<String, ?> getOrderBy() {
        return this.orderBy;
    }

    public ListCompaniesRequest setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        return this;
    }
    public String getOrgNo() {
        return this.orgNo;
    }

    public ListCompaniesRequest setProductShopMatch(String productShopMatch) {
        this.productShopMatch = productShopMatch;
        return this;
    }
    public String getProductShopMatch() {
        return this.productShopMatch;
    }

    public ListCompaniesRequest setRecCap(String recCap) {
        this.recCap = recCap;
        return this;
    }
    public String getRecCap() {
        return this.recCap;
    }

    public ListCompaniesRequest setRegions(java.util.Map<String, ?> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.Map<String, ?> getRegions() {
        return this.regions;
    }

    public ListCompaniesRequest setRegisterAssert(java.util.Map<String, ?> registerAssert) {
        this.registerAssert = registerAssert;
        return this;
    }
    public java.util.Map<String, ?> getRegisterAssert() {
        return this.registerAssert;
    }

    public ListCompaniesRequest setSpreadInfo(java.util.Map<String, ?> spreadInfo) {
        this.spreadInfo = spreadInfo;
        return this;
    }
    public java.util.Map<String, ?> getSpreadInfo() {
        return this.spreadInfo;
    }

    public ListCompaniesRequest setStaffSize(java.util.Map<String, ?> staffSize) {
        this.staffSize = staffSize;
        return this;
    }
    public java.util.Map<String, ?> getStaffSize() {
        return this.staffSize;
    }

}
