// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateTargetConfigurationInput extends TeaModel {
    @NameInMap("domainId")
    public String domainId;

    @NameInMap("targetConfiguration")
    public TargetConfiguration targetConfiguration;

    public static UpdateTargetConfigurationInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTargetConfigurationInput self = new UpdateTargetConfigurationInput();
        return TeaModel.build(map, self);
    }

    public UpdateTargetConfigurationInput setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public UpdateTargetConfigurationInput setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

}
