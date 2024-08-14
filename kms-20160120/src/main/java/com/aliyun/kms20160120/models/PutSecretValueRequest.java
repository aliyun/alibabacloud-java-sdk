// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueRequest extends TeaModel {
    /**
     * <p>The secret value. The value is encrypted and then stored in the new version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>importantdata</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <ul>
     * <li>text: This is the default value.</li>
     * <li>binary</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The new version of the secret value. Version numbers must be unique in each secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000000000000000000000000000203</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that are used to mark the new version. If you do not specify this parameter, Secrets Manager marks the new version with ACSCurrent.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ACSCurrent&quot;,&quot;ACSNext&quot;]</p>
     */
    @NameInMap("VersionStages")
    public String versionStages;

    public static PutSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueRequest self = new PutSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public PutSecretValueRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public PutSecretValueRequest setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public PutSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public PutSecretValueRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PutSecretValueRequest setVersionStages(String versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public String getVersionStages() {
        return this.versionStages;
    }

}
