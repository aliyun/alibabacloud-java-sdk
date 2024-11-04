// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertEventIntegrationPolicyForView extends TeaModel {
    @NameInMap("alertEventIntegrationPolicyId")
    public String alertEventIntegrationPolicyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertEventIntegrationPolicyName")
    public String alertEventIntegrationPolicyName;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    @NameInMap("integrationSetting")
    public String integrationSetting;

    @NameInMap("transformerSetting")
    public java.util.List<TransformAction> transformerSetting;

    @NameInMap("type")
    public String type;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("workspace")
    public String workspace;

    public static AlertEventIntegrationPolicyForView build(java.util.Map<String, ?> map) throws Exception {
        AlertEventIntegrationPolicyForView self = new AlertEventIntegrationPolicyForView();
        return TeaModel.build(map, self);
    }

    public AlertEventIntegrationPolicyForView setAlertEventIntegrationPolicyId(String alertEventIntegrationPolicyId) {
        this.alertEventIntegrationPolicyId = alertEventIntegrationPolicyId;
        return this;
    }
    public String getAlertEventIntegrationPolicyId() {
        return this.alertEventIntegrationPolicyId;
    }

    public AlertEventIntegrationPolicyForView setAlertEventIntegrationPolicyName(String alertEventIntegrationPolicyName) {
        this.alertEventIntegrationPolicyName = alertEventIntegrationPolicyName;
        return this;
    }
    public String getAlertEventIntegrationPolicyName() {
        return this.alertEventIntegrationPolicyName;
    }

    public AlertEventIntegrationPolicyForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AlertEventIntegrationPolicyForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlertEventIntegrationPolicyForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AlertEventIntegrationPolicyForView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public AlertEventIntegrationPolicyForView setIntegrationSetting(String integrationSetting) {
        this.integrationSetting = integrationSetting;
        return this;
    }
    public String getIntegrationSetting() {
        return this.integrationSetting;
    }

    public AlertEventIntegrationPolicyForView setTransformerSetting(java.util.List<TransformAction> transformerSetting) {
        this.transformerSetting = transformerSetting;
        return this;
    }
    public java.util.List<TransformAction> getTransformerSetting() {
        return this.transformerSetting;
    }

    public AlertEventIntegrationPolicyForView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AlertEventIntegrationPolicyForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public AlertEventIntegrationPolicyForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AlertEventIntegrationPolicyForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
