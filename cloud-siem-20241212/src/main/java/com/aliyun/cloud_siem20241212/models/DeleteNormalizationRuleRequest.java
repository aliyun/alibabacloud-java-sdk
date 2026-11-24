// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteNormalizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleRequest self = new DeleteNormalizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNormalizationRuleRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public DeleteNormalizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNormalizationRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
