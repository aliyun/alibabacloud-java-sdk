// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyRequest extends TeaModel {
    /**
     * <p>The ID of the KMS instance.</p>
     * <blockquote>
     * <p>You must specify this parameter if you need to create a key for a KMS instance. If you need to create a default key of the CMK type, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kst-bjj62d8f5e0sgtx8h****</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the key.</p>
     * <p>The description can be 0 to 8,192 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>key description example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * <p>This parameter is valid only when the key belongs to an instance type that supports automatic rotation. For more information, see <a href="https://help.aliyun.com/document_detail/2358146.html">Key rotation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The key specification. The valid values vary based on the KMS instance type. For more information, see <a href="https://help.aliyun.com/document_detail/480159.html">Overview</a>.</p>
     * <blockquote>
     * <p>If you do not specify a value for this parameter, the default key specification is Aliyun_AES_256.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_AES_256</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The usage of the key. Valid values:</p>
     * <ul>
     * <li>ENCRYPT/DECRYPT</li>
     * <li>SIGN/VERIFY</li>
     * </ul>
     * <p>If the key supports signing and verification, the default value is SIGN/VERIFY. If the key does not support signing and verification, the default value is ENCRYPT/DECRYPT.</p>
     * 
     * <strong>example:</strong>
     * <p>ENCRYPT/DECRYPT</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The key material origin. Valid values:</p>
     * <ul>
     * <li>Aliyun_KMS (default): KMS generates key material.</li>
     * <li>EXTERNAL: You import key material.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter is case-sensitive.</li>
     * <li>Default keys of the customer master key (CMK) type support Aliyun_KMS and EXTERNAL. Keys in instances of the software key management type support only Aliyun_KMS. Keys in instances of the hardware key management type support Aliyun_KMS and EXTERNAL.</li>
     * <li>If you set Origin to EXTERNAL, you must import key material. For more information, see <a href="https://help.aliyun.com/document_detail/607841.html">Import key material into a symmetric key</a> or <a href="https://help.aliyun.com/document_detail/608827.html">Import key material into an asymmetric key</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_KMS</p>
     */
    @NameInMap("Origin")
    public String origin;

    @NameInMap("Policy")
    public String policy;

    /**
     * <p>You do not need to specify this parameter. KMS sets a protection level for your key.</p>
     * <p>The protection level of the key. Valid values:</p>
     * <ul>
     * <li>SOFTWARE</li>
     * <li>HSM</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If DKMSInstanceId is specified, this parameter does not take effect. If your instance is an instance of the software key management type, set the value to SOFTWARE. If your instance is an instance of the hardware key management type, set the value to HSM.</li>
     * <li>If you do not specify DKMSInstanceId, we recommend that you do not specify this parameter. KMS sets a protection level for your key. If managed hardware security modules (HSMs) exist in the region of your KMS instance, set the value to HSM. If managed HSMs do not exist in the region of your KMS instance, set the value to SOFTWARE. For more information, see Managed HSM overview.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SOFTWARE</p>
     */
    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    /**
     * <p>The period of automatic key rotation. Format: integer[unit]. Unit: d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s represent a seven-day interval.</p>
     * <ul>
     * <li>For a default key, set the value to 365 days.</li>
     * <li>For a software-protected key, set a value that ranges from 7 to 365 days.</li>
     * <li>A hardware-protected key does not support automatic rotation.</li>
     * </ul>
     * <blockquote>
     * <p>If EnableAutomaticRotation is set to true, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>365d</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The tag that is added to the key. A tag consists of a key-value pair.</p>
     * <p>You can enter up to 20 tags. Enter multiple tags in the [{&quot;TagKey&quot;:&quot;key1&quot;,&quot;TagValue&quot;:&quot;value1&quot;},{&quot;TagKey&quot;:&quot;key2&quot;,&quot;TagValue&quot;:&quot;value2&quot;},..] format.</p>
     * <p>Each tag key or tag value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
     * <blockquote>
     * <p>The tag key cannot start with aliyun or acs:.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;TagKey&quot;:&quot;disk-encryption&quot;,&quot;TagValue&quot;:&quot;true&quot;}]</p>
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
