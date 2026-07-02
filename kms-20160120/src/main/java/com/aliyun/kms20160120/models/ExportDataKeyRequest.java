// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyRequest extends TeaModel {
    /**
     * <p>The ciphertext of the data key that is encrypted using a master key (CMK).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901q********</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>Specifies whether to enable the DryRun mode.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test the API call and verify the permissions on the specified resources and the validity of the request parameters. If you enable the DryRun mode, KMS returns a failure response and a failure reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not specified.</p>
     * </li>
     * <li><p>ValidationError: The specified parameters in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform the operation on the KMS resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>A JSON string that consists of key-value pairs. EncryptionContext is the encryption context that is passed in when the data key is encrypted using a CMK. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    /**
     * <p>The public key in Base64 format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAndKfC2ReLL2+y8a0+ZBBeAft/uBYo86GZiYJuflqgUzKxpyuvlo3uQkBv6b+nx+0tz8g8v7GhpPWMSW5L9mNHYsvYFsa7jTxsYdt17yj6GlUHPuMIs8hr5qbwl38IHU1iIa7nYWwE2fb3ePOvLDACRJVgGpU0yxioW80d2QD+9aU4jF5dlAahcfgsNzo2CXzCUc1+xbmNuq7Rp+H9VJB9dyYOwqnW3RhOLBo21FzpORapf0UiRlrHRpk1V6ez+aE1dofaYh/9bh0m6ioxj7j5hpZbWccuEZTMBKd+cbuBkRhJzc6Tti6qwZbDiu4fUwbZS0Tqpuo1UadiyxMW********</p>
     */
    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    /**
     * <p>The encryption algorithm that is used to encrypt the data key using the public key specified by PublicKeyBlob. For more information about the algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.<br> Valid values:<br><br></p>
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
     * <p>The type of the public key specified by PublicKeyBlob. For more information about key types, see <a href="https://help.aliyun.com/document_detail/148147.html">Introduction to asymmetric keys</a>.<br> Valid values:<br><br></p>
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

    public static ExportDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyRequest self = new ExportDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ExportDataKeyRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public ExportDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public ExportDataKeyRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public ExportDataKeyRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    public ExportDataKeyRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

}
