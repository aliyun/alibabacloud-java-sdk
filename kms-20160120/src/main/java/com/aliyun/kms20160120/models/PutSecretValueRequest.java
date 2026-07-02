// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueRequest extends TeaModel {
    /**
     * <p>The secret value. The value is encrypted and stored in the specified new version.</p>
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
     * <li><p>text (default)</p>
     * </li>
     * <li><p>binary</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * <blockquote>
     * <p>When you access a secret in another Alibaba Cloud account, you must specify the ARN of the secret. The ARN of a secret is in the format of <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version number of the secret. The value must be unique in the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that are used to mark the new version. If you do not specify this parameter, KMS marks the new version with ACSCurrent.</p>
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
