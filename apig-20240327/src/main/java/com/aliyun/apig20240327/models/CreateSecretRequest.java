// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    /**
     * <p>The description of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The gateway type.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The KMS key configuration. This parameter is required when secretSource is set to KMS. If this parameter is omitted, the API returns InvalidParameter.IsEmpty(400) with the message &quot;Parameter kmsConfig should not be empty.&quot;. This parameter contains two sub-fields: kmsInstanceId (the KMS instance ID) and kmsKeyId (the KMS key ID).</p>
     */
    @NameInMap("kmsConfig")
    public KMSConfig kmsConfig;

    /**
     * <p>The name of the secret. The name can contain letters, digits, and underscores (_) and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my_secret</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The KMS secret value. This parameter is required. If this parameter is omitted, the API returns InvalidParameter.IsEmpty(400). Because secretSource only supports KMS, you must always provide this parameter in actual calls.</p>
     * 
     * <strong>example:</strong>
     * <p>apikey-123456xxxxxxxx</p>
     */
    @NameInMap("secretData")
    public String secretData;

    /**
     * <p>The source of the secret. Currently, only KMS is supported. If you specify other values such as MANUAL, the API returns InvalidParameter.WithValue(400). This parameter is required. If this parameter is not provided, the API also returns InvalidParameter.WithValue(400).</p>
     * 
     * <strong>example:</strong>
     * <p>KMS</p>
     */
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
