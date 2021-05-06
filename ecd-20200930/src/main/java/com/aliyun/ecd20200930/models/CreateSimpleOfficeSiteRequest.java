// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    public static CreateSimpleOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteRequest self = new CreateSimpleOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSimpleOfficeSiteRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateSimpleOfficeSiteRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateSimpleOfficeSiteRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateSimpleOfficeSiteRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public CreateSimpleOfficeSiteRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateSimpleOfficeSiteRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateSimpleOfficeSiteRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

}
