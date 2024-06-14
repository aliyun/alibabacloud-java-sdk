// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyRequest extends TeaModel {
    /**
     * <p>The ID of the KMS instance.</p>
     * <br>
     * <p>> You must specify this parameter if you need to create a key for a KMS instance. If you need to create a default key of the CMK type, you do not need to specify this parameter.</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the key.</p>
     * <br>
     * <p>The description can be 0 to 8,192 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false (default)</p>
     * <br>
     * <p>This parameter is valid only when the key belongs to an instance type that supports automatic rotation. For more information, see [Key rotation](https://help.aliyun.com/document_detail/2358146.html).</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The key specification. The valid values vary based on the KMS instance type. For more information, see [Overview](https://help.aliyun.com/document_detail/480159.html).</p>
     * <br>
     * <p>> If you do not specify a value for this parameter, the default key specification is Aliyun_AES_256.</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The usage of the key. Valid values:</p>
     * <br>
     * <p>- ENCRYPT/DECRYPT</p>
     * <p>- SIGN/VERIFY</p>
     * <br>
     * <p>If the key supports signing and verification, the default value is SIGN/VERIFY. If the key does not support signing and verification, the default value is ENCRYPT/DECRYPT.</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The key material origin. Valid values:</p>
     * <br>
     * <p>- Aliyun_KMS (default): KMS generates key material.</p>
     * <p>- EXTERNAL: You import key material.</p>
     * <br>
     * <br>
     * <p>> - The value of this parameter is case-sensitive.</p>
     * <p>> - Default keys of the customer master key (CMK) type support Aliyun_KMS and EXTERNAL. Keys in instances of the software key management type support only Aliyun_KMS. Keys in instances of the hardware key management type support Aliyun_KMS and EXTERNAL.</p>
     * <p>> - If you set Origin to EXTERNAL, you must import key material. For more information, see [Import key material into a symmetric key](https://help.aliyun.com/document_detail/607841.html) or [Import key material into an asymmetric key](https://help.aliyun.com/document_detail/608827.html).</p>
     */
    @NameInMap("Origin")
    public String origin;

    @NameInMap("Policy")
    public String policy;

    /**
     * <p>You do not need to specify this parameter. KMS sets a protection level for your key.</p>
     * <br>
     * <p>The protection level of the key. Valid values:</p>
     * <br>
     * <p>- SOFTWARE</p>
     * <p>- HSM</p>
     * <br>
     * <br>
     * <p>> - If DKMSInstanceId is specified, this parameter does not take effect. If your instance is an instance of the software key management type, set the value to SOFTWARE. If your instance is an instance of the hardware key management type, set the value to HSM.</p>
     * <p>> - If you do not specify DKMSInstanceId, we recommend that you do not specify this parameter. KMS sets a protection level for your key. If managed hardware security modules (HSMs) exist in the region of your KMS instance, set the value to HSM. If managed HSMs do not exist in the region of your KMS instance, set the value to SOFTWARE. For more information, see Managed HSM overview.</p>
     */
    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    /**
     * <p>The period of automatic key rotation. Format: integer[unit]. Unit: d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s represent a seven-day interval.</p>
     * <br>
     * <p>- For a default key, set the value to 365 days.</p>
     * <p>- For a software-protected key, set a value that ranges from 7 to 365 days.</p>
     * <p>- A hardware-protected key does not support automatic rotation.</p>
     * <br>
     * <p>> If EnableAutomaticRotation is set to true, this parameter is required.</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The tag that is added to the key. A tag consists of a key-value pair.</p>
     * <br>
     * <p>You can enter up to 20 tags. Enter multiple tags in the [{"TagKey":"key1","TagValue":"value1"},{"TagKey":"key2","TagValue":"value2"},..] format.</p>
     * <br>
     * <p>Each tag key or tag value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
     * <br>
     * <p>> The tag key cannot start with aliyun or acs:.</p>
     */
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

    public CreateKeyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
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
