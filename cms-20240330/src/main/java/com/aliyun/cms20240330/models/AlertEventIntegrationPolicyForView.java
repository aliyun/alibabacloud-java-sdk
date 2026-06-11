// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertEventIntegrationPolicyForView extends TeaModel {
    /**
     * <p>The universally unique identifier (UUID).</p>
     * 
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("alertEventIntegrationPolicyId")
    public String alertEventIntegrationPolicyId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>集成名</p>
     */
    @NameInMap("alertEventIntegrationPolicyName")
    public String alertEventIntegrationPolicyName;

    /**
     * <p>The time when the policy was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The filter configuration.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>The subscription settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
     */
    @NameInMap("integrationSetting")
    public String integrationSetting;

    /**
     * <p>The key for the integration\&quot;s reporting endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>10-16818f1445e10a1d012922b285bfb334</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The transformation settings.</p>
     */
    @NameInMap("transformerSetting")
    public java.util.List<TransformAction> transformerSetting;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT_CUSTOM</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The time when the policy was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-16T02:00:23Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
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

    public AlertEventIntegrationPolicyForView setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
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
