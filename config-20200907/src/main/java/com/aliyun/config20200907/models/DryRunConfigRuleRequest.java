// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DryRunConfigRuleRequest extends TeaModel {
    @NameInMap("ConfigurationItem")
    public String configurationItem;

    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DryRunConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunConfigRuleRequest self = new DryRunConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public DryRunConfigRuleRequest setConfigurationItem(String configurationItem) {
        this.configurationItem = configurationItem;
        return this;
    }
    public String getConfigurationItem() {
        return this.configurationItem;
    }

    public DryRunConfigRuleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
