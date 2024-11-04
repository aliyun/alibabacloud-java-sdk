// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertEventIntegrationPolicyForModify extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertEventIntegrationPolicyName")
    public String alertEventIntegrationPolicyName;

    @NameInMap("description")
    public String description;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    @NameInMap("integrationSetting")
    public String integrationSetting;

    @NameInMap("transformerSetting")
    public java.util.List<TransformAction> transformerSetting;

    @NameInMap("type")
    public String type;

    public static AlertEventIntegrationPolicyForModify build(java.util.Map<String, ?> map) throws Exception {
        AlertEventIntegrationPolicyForModify self = new AlertEventIntegrationPolicyForModify();
        return TeaModel.build(map, self);
    }

    public AlertEventIntegrationPolicyForModify setAlertEventIntegrationPolicyName(String alertEventIntegrationPolicyName) {
        this.alertEventIntegrationPolicyName = alertEventIntegrationPolicyName;
        return this;
    }
    public String getAlertEventIntegrationPolicyName() {
        return this.alertEventIntegrationPolicyName;
    }

    public AlertEventIntegrationPolicyForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlertEventIntegrationPolicyForModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public AlertEventIntegrationPolicyForModify setIntegrationSetting(String integrationSetting) {
        this.integrationSetting = integrationSetting;
        return this;
    }
    public String getIntegrationSetting() {
        return this.integrationSetting;
    }

    public AlertEventIntegrationPolicyForModify setTransformerSetting(java.util.List<TransformAction> transformerSetting) {
        this.transformerSetting = transformerSetting;
        return this;
    }
    public java.util.List<TransformAction> getTransformerSetting() {
        return this.transformerSetting;
    }

    public AlertEventIntegrationPolicyForModify setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
