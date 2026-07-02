// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class VerifyMacRequest extends TeaModel {
    /**
     * <p>The algorithm used to generate the message authentication code. Valid values vary based on the key specification:  </p>
     * <ul>
     * <li><p>HMAC_SM3</p>
     * </li>
     * <li><p>HMAC_SHA_224</p>
     * </li>
     * <li><p>HMAC_SHA_256</p>
     * </li>
     * <li><p>HMAC_SHA_384</p>
     * </li>
     * <li><p>HMAC_SHA_512</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HMAC_SHA_256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Specifies whether to enable DryRun mode. Valid values:</p>
     * <ul>
     * <li>true: enables DryRun mode.</li>
     * <li>false (default): disables DryRun mode.</li>
     * </ul>
     * <p>DryRun mode is used to test API calls and verify whether you have the required permissions on the corresponding resources and whether the request parameters are correctly configured. When DryRun mode is enabled, KMS always returns a failure and provides the failure reason. Failure reasons include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not specified.</li>
     * <li>ValidationError: The parameters specified in the request are invalid.</li>
     * <li>AccessDeniedError: You are not authorized to perform this operation on the KMS resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The ID of the key. You can also specify a key alias or key Amazon Resource Name (ARN). For more information about aliases, refer to <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
     * <blockquote>
     * <p>To access a key in a different Alibaba Cloud account, you must specify the key ARN. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The Base64-encoding message authentication code to verify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vz1Snp+jGJbgydCFRWVWxAwIMdyfKCSp+jnMWQ==</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The original message data.  </p>
     * <p>Use Base64 encoding. For example, if the hexadecimal content of the message for which you want to generate a message authentication code is <code>[0x31, 0x32, 0x33, 0x34]</code>, the corresponding Base64-encoded value is <code>MTIzNA==</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</p>
     */
    @NameInMap("Message")
    public String message;

    public static VerifyMacRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMacRequest self = new VerifyMacRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMacRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public VerifyMacRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public VerifyMacRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public VerifyMacRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public VerifyMacRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
