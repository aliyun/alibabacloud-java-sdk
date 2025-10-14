// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class SetDefaultNormalizationRuleVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp。</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>V1。</p>
     */
    @NameInMap("NormalizationRuleVersion")
    public Integer normalizationRuleVersion;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static SetDefaultNormalizationRuleVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultNormalizationRuleVersionRequest self = new SetDefaultNormalizationRuleVersionRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultNormalizationRuleVersionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDefaultNormalizationRuleVersionRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public SetDefaultNormalizationRuleVersionRequest setNormalizationRuleVersion(Integer normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public Integer getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public SetDefaultNormalizationRuleVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDefaultNormalizationRuleVersionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
