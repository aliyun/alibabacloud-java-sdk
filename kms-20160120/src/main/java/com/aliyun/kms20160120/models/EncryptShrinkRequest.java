// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the dry run feature.</p>
     * <ul>
     * <li><p>true: enables the dry run feature.</p>
     * </li>
     * <li><p>false (default): disables the dry run feature.</p>
     * </li>
     * </ul>
     * <p>The dry run feature is used to test API calls and verify the permissions on the resources that you have and the validity of the request parameters. You can view the check results in the response.</p>
     * <ul>
     * <li><p>DryRunOperationError: The permissions and parameters are valid. If you do not specify the DryRun parameter, the request is successful.</p>
     * </li>
     * <li><p>ValidationError: The parameters in the request are invalid.</p>
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
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter, you must specify the same parameter when you call the Decrypt operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The ID of the key. You can also specify the alias or Amazon Resource Name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage aliases</a>.</p>
     * <blockquote>
     * <p>When you access a key in another Alibaba Cloud account, you must specify the ARN of the key. The ARN of a key is in the <code>acs:kms:${region}:${account}:key/${keyid}</code> format.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The plaintext to be encrypted. The plaintext must be Base64-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SGVsbG8gd29y****</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    public static EncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptShrinkRequest self = new EncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EncryptShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public EncryptShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public EncryptShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public EncryptShrinkRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
