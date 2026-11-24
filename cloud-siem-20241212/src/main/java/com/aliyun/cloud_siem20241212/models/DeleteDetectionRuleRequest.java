// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDetectionRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DetectionRuleId")
    public String detectionRuleId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteDetectionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionRuleRequest self = new DeleteDetectionRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionRuleRequest setDetectionRuleId(String detectionRuleId) {
        this.detectionRuleId = detectionRuleId;
        return this;
    }
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    public DeleteDetectionRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDetectionRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDetectionRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
