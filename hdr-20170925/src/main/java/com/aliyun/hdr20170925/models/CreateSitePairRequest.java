// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateSitePairRequest extends TeaModel {
    @NameInMap("PrimarySiteName")
    public String primarySiteName;

    @NameInMap("PrimarySiteRegionId")
    public String primarySiteRegionId;

    @NameInMap("PrimarySiteType")
    public String primarySiteType;

    @NameInMap("PrimarySiteVpcId")
    public String primarySiteVpcId;

    @NameInMap("PrimarySiteZoneId")
    public String primarySiteZoneId;

    @NameInMap("SecondarySiteName")
    public String secondarySiteName;

    @NameInMap("SecondarySiteRegionId")
    public String secondarySiteRegionId;

    @NameInMap("SecondarySiteType")
    public String secondarySiteType;

    @NameInMap("SecondarySiteVpcId")
    public String secondarySiteVpcId;

    @NameInMap("SecondarySiteZoneId")
    public String secondarySiteZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairType")
    public String sitePairType;

    public static CreateSitePairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSitePairRequest self = new CreateSitePairRequest();
        return TeaModel.build(map, self);
    }

    public CreateSitePairRequest setPrimarySiteName(String primarySiteName) {
        this.primarySiteName = primarySiteName;
        return this;
    }
    public String getPrimarySiteName() {
        return this.primarySiteName;
    }

    public CreateSitePairRequest setPrimarySiteRegionId(String primarySiteRegionId) {
        this.primarySiteRegionId = primarySiteRegionId;
        return this;
    }
    public String getPrimarySiteRegionId() {
        return this.primarySiteRegionId;
    }

    public CreateSitePairRequest setPrimarySiteType(String primarySiteType) {
        this.primarySiteType = primarySiteType;
        return this;
    }
    public String getPrimarySiteType() {
        return this.primarySiteType;
    }

    public CreateSitePairRequest setPrimarySiteVpcId(String primarySiteVpcId) {
        this.primarySiteVpcId = primarySiteVpcId;
        return this;
    }
    public String getPrimarySiteVpcId() {
        return this.primarySiteVpcId;
    }

    public CreateSitePairRequest setPrimarySiteZoneId(String primarySiteZoneId) {
        this.primarySiteZoneId = primarySiteZoneId;
        return this;
    }
    public String getPrimarySiteZoneId() {
        return this.primarySiteZoneId;
    }

    public CreateSitePairRequest setSecondarySiteName(String secondarySiteName) {
        this.secondarySiteName = secondarySiteName;
        return this;
    }
    public String getSecondarySiteName() {
        return this.secondarySiteName;
    }

    public CreateSitePairRequest setSecondarySiteRegionId(String secondarySiteRegionId) {
        this.secondarySiteRegionId = secondarySiteRegionId;
        return this;
    }
    public String getSecondarySiteRegionId() {
        return this.secondarySiteRegionId;
    }

    public CreateSitePairRequest setSecondarySiteType(String secondarySiteType) {
        this.secondarySiteType = secondarySiteType;
        return this;
    }
    public String getSecondarySiteType() {
        return this.secondarySiteType;
    }

    public CreateSitePairRequest setSecondarySiteVpcId(String secondarySiteVpcId) {
        this.secondarySiteVpcId = secondarySiteVpcId;
        return this;
    }
    public String getSecondarySiteVpcId() {
        return this.secondarySiteVpcId;
    }

    public CreateSitePairRequest setSecondarySiteZoneId(String secondarySiteZoneId) {
        this.secondarySiteZoneId = secondarySiteZoneId;
        return this;
    }
    public String getSecondarySiteZoneId() {
        return this.secondarySiteZoneId;
    }

    public CreateSitePairRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateSitePairRequest setSitePairType(String sitePairType) {
        this.sitePairType = sitePairType;
        return this;
    }
    public String getSitePairType() {
        return this.sitePairType;
    }

}
