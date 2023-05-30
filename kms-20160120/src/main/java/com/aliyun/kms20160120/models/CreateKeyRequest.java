// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyRequest extends TeaModel {
    /**
     * <p>The type of the CMK. Valid values:</p>
     * <br>
     * <p>*   Aliyun_AES\_256</p>
     * <p>*   Aliyun_AES\_128</p>
     * <p>*   Aliyun_AES\_192</p>
     * <p>*   Aliyun_SM4</p>
     * <p>*   RSA\_2048</p>
     * <p>*   RSA\_3072</p>
     * <p>*   EC_P256</p>
     * <p>*   EC_P256K</p>
     * <p>*   EC_SM2</p>
     * <br>
     * <p>> * The default type of the CMK is Aliyun\_AES\_256.</p>
     * <p>> * Only Dedicated KMS supports Aliyun\_AES\_128 and Aliyun\_AES\_192.</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateKey**.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The protection level of the CMK. Valid values:</p>
     * <br>
     * <p>*   SOFTWARE</p>
     * <p>*   HSM</p>
     * <br>
     * <p>Default value: SOFTWARE.</p>
     * <br>
     * <p>> * The value of this parameter is case-sensitive.</p>
     * <p>> * Assume that you set this parameter to HSM. If you set the Origin parameter to Aliyun_KMS, the CMK is created in a managed HSM. If you set the Origin parameter to EXTERNAL, you can import an external key into the managed HSM.</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The period of automatic key rotation. Specify the value in the integer\[unit] format. Unit: d (day), h (hour), m (minute), or s (second). For example, you can use either 7d or 604800s to specify a seven-day period. The period can range from 7 days to 730 days.</p>
     * <br>
     * <p>>  If you set the EnableAutomaticRotation parameter to true, you must also specify this parameter. If you set the EnableAutomaticRotation parameter to false, you can leave this parameter unspecified.</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The description of the CMK.</p>
     * <br>
     * <p>The description can be 0 to 8,192 characters in length.</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The usage of the CMK. Valid values:</p>
     * <br>
     * <p>*   ENCRYPT/DECRYPT: encrypts or decrypts data.</p>
     * <p>*   SIGN/VERIFY: generates or verifies a digital signature.</p>
     * <br>
     * <p>If the CMK supports signature verification, the default value is SIGN/VERIFY. If the CMK does not support signature verification, the default value is ENCRYPT/DECRYPT.</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The source of key material. Valid values:</p>
     * <br>
     * <p>*   Aliyun_KMS (default value)</p>
     * <p>*   EXTERNAL</p>
     * <br>
     * <p>> * The value of this parameter is case-sensitive.</p>
     * <p>> * If you set the KeySpec parameter to an asymmetric CMK type, you are not allowed to set the Origin parameter to EXTERNAL.</p>
     * <p>> * If you set the Origin parameter to EXTERNAL, you must import key material. For more information, see [Import key material](~~68523~~).</p>
     */
    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    /**
     * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>>  If the Origin parameter is set to EXTERNAL or the KeySpec parameter is set to an asymmetric CMK type, automatic key rotation is not supported.</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("Tags")
    public String tags;

    public static CreateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyRequest self = new CreateKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyRequest setDKMSInstanceId(String DKMSInstanceId) {
        this.DKMSInstanceId = DKMSInstanceId;
        return this;
    }
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    public CreateKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKeyRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public CreateKeyRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
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

    public CreateKeyRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateKeyRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
