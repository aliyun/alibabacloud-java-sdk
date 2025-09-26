// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateGatewayTargetInput extends TeaModel {
    @NameInMap("domainId")
    public String domainId;

    @NameInMap("name")
    public String name;

    @NameInMap("targetConfiguration")
    public TargetConfiguration targetConfiguration;

    public static CreateGatewayTargetInput build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayTargetInput self = new CreateGatewayTargetInput();
        return TeaModel.build(map, self);
    }

    public CreateGatewayTargetInput setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateGatewayTargetInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayTargetInput setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

}
