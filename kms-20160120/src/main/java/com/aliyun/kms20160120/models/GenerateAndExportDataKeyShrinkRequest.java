// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the dry run feature.</p>
     * <ul>
     * <li><p>true: enables the feature.</p>
     * </li>
     * <li><p>false (default): disables the feature.</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test API calls and verify the permissions on the resources that you have access to and the validity of the request parameters. If you enable the DryRun mode, KMS always returns a failure response and the cause of the failure. The following failure causes are included:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter is not specified.</p>
     * </li>
     * <li><p>ValidationError: The parameters specified in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform this operation on the KMS resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter, you must specify the same parameter when you call the Decrypt operation or other operations to re-encrypt the data key. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The ID of the key. You can also specify the alias or Amazon Resource Name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage aliases</a>.</p>
     * <blockquote>
     * <p>To access a key in another Alibaba Cloud account, you must specify the ARN of the key. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The length of the data key that you want to generate. Valid values:</p>
     * <ul>
     * <li><p>AES_256: a 256-bit symmetric key.</p>
     * </li>
     * <li><p>AES_128: a 128-bit symmetric key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If you do not specify either of the parameters, KMS generates a 256-bit data key. If you specify both parameters, KMS ignores the KeySpec parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES_256</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key that you want to generate.</p>
     * <p>Valid values: 1 to 1024.</p>
     * <p>Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    /**
     * <p>The public key that is encoded in Base64.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAndKfC2ReLL2+y8a0+ZBBeAft/uBYo86GZiYJuflqgUzKxpyuvlo3uQkBv6b+nx+0tz8g8v7GhpPWMSW5L9mNHYsvYFsa7jTxsYdt17yj6GlUHPuMIs8hr5qbwl38IHU1iIa7nYWwE2fb3ePOvLDACRJVgGpU0yxioW80d2QD+9aU4jF5dlAahcfgsNzo2CXzCUc1+xbmNuq7Rp+H9VJB9dyYOwqnW3RhOLBo21FzpORapf0UiRlrHRpk1V6ez+aE1dofaYh/9bh0m6ioxj7j5hpZbWccuEZTMBKd+cbuBkRhJzc6Tti6qwZbDiu4fUwbZS0Tqpuo1UadiyxMW********</p>
     */
    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    /**
     * <p>The encryption algorithm that is used to encrypt the data key using the public key specified by PublicKeyBlob. For more information about encryption algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.<br> Valid values:<br><br></p>
     * <ul>
     * <li><p>RSAES_OAEP_SHA_256</p>
     * </li>
     * <li><p>RSAES_OAEP_SHA_1</p>
     * </li>
     * <li><p>SM2PKE</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_256</p>
     */
    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    /**
     * <p>The type of the key specified by PublicKeyBlob. For more information about key types, see <a href="https://help.aliyun.com/document_detail/148147.html">Introduction to asymmetric keys</a>.<br> Valid values:<br><br></p>
     * <ul>
     * <li><p>RSA_2048</p>
     * </li>
     * <li><p>EC_SM2</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    public static GenerateAndExportDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAndExportDataKeyShrinkRequest self = new GenerateAndExportDataKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAndExportDataKeyShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GenerateAndExportDataKeyShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public GenerateAndExportDataKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateAndExportDataKeyShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateAndExportDataKeyShrinkRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public GenerateAndExportDataKeyShrinkRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public GenerateAndExportDataKeyShrinkRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    public GenerateAndExportDataKeyShrinkRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

}
