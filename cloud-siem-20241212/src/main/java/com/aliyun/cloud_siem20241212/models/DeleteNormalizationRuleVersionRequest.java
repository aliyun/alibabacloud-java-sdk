// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleVersionRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalization rule.</p>
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
     * <p>The region of the Data Management center. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. An administrator can specify this parameter to switch to the member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteNormalizationRuleVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleVersionRequest self = new DeleteNormalizationRuleVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleVersionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNormalizationRuleVersionRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public DeleteNormalizationRuleVersionRequest setNormalizationRuleVersion(Integer normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public Integer getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public DeleteNormalizationRuleVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNormalizationRuleVersionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
