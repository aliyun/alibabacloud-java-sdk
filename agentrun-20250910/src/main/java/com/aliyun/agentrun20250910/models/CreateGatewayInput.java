// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateGatewayInput extends TeaModel {
    @NameInMap("identityId")
    public String identityId;

    @NameInMap("name")
    public String name;

    @NameInMap("networkConfiguration")
    public GatewayNetworkConfiguration networkConfiguration;

    @NameInMap("type")
    public String type;

    public static CreateGatewayInput build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayInput self = new CreateGatewayInput();
        return TeaModel.build(map, self);
    }

    public CreateGatewayInput setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public CreateGatewayInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayInput setNetworkConfiguration(GatewayNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public GatewayNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateGatewayInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
