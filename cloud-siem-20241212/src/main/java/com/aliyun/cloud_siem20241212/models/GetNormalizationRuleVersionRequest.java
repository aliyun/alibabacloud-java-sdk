// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleVersionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    @NameInMap("NormalizationRuleVersion")
    public Integer normalizationRuleVersion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetNormalizationRuleVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleVersionRequest self = new GetNormalizationRuleVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleVersionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetNormalizationRuleVersionRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public GetNormalizationRuleVersionRequest setNormalizationRuleVersion(Integer normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public Integer getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public GetNormalizationRuleVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNormalizationRuleVersionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
