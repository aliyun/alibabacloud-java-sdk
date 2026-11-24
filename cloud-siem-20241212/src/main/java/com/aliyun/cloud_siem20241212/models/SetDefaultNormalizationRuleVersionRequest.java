// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class SetDefaultNormalizationRuleVersionRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalization rule. This operation is supported only for custom normalization rules. Preset rules are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <p>The version of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NormalizationRuleVersion")
    public Integer normalizationRuleVersion;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator assumes.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
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
