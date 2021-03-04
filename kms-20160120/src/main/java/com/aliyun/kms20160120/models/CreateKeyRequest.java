// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("KeyUsage")
    public String keyUsage;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("KeySpec")
    public String keySpec;

    public static CreateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyRequest self = new CreateKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKeyRequest setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }
    public String getKeyUsage() {
        return this.keyUsage;
    }

    public CreateKeyRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateKeyRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public CreateKeyRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public CreateKeyRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateKeyRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

}
