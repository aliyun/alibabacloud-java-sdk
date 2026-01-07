// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("gatewayType")
    public String gatewayType;

    @NameInMap("kmsConfig")
    public KMSConfig kmsConfig;

    @NameInMap("name")
    public String name;

    @NameInMap("secretData")
    public String secretData;

    @NameInMap("secretSource")
    public String secretSource;

    public static CreateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretRequest self = new CreateSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecretRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateSecretRequest setKmsConfig(KMSConfig kmsConfig) {
        this.kmsConfig = kmsConfig;
        return this;
    }
    public KMSConfig getKmsConfig() {
        return this.kmsConfig;
    }

    public CreateSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecretRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public CreateSecretRequest setSecretSource(String secretSource) {
        this.secretSource = secretSource;
        return this;
    }
    public String getSecretSource() {
        return this.secretSource;
    }

}
