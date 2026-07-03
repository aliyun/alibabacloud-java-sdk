// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The normalization rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>NETWORK_AND_WEB_SECURITY</p>
     */
    @NameInMap("NormalizationSecurityDomainId")
    public String normalizationSecurityDomainId;

    /**
     * <p>The region where the data management center of threat analysis is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the asset is in the Chinese mainland.</li>
     * <li>ap-southeast-1: the asset is outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the view of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetNormalizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleRequest self = new GetNormalizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetNormalizationRuleRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public GetNormalizationRuleRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    public GetNormalizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNormalizationRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
