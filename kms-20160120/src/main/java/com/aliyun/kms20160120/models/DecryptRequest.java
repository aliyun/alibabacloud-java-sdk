// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to decrypt.</p>
     * <p>You can generate the ciphertext by calling the following operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmaaSl+TztSIMe43nbTH/Z1Wr4XfLftKhAciUmDQXuMRl4WTvKhxjMThjK****</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The JSON string that consists of key-value pairs.</p>
     * <blockquote>
     * <p> If you specify the EncryptionContext parameter when you call the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, or <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation, you must specify the same context when you call the Decrypt operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    public static DecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptRequest self = new DecryptRequest();
        return TeaModel.build(map, self);
    }

    public DecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public DecryptRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public DecryptRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

}
