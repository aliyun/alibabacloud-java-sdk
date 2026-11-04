// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the dry run mode. Valid values:</p>
     * <ul>
     * <li>true: Enables the dry run mode.</li>
     * <li>false: Disables the dry run mode. This is the default value.</li>
     * </ul>
     * <p>The dry run mode is used to test API calls, verify whether you have the required permissions on the resources, and check whether the request parameters are correctly configured. After the dry run mode is enabled, KMS always returns a failure and provides the cause of the failure. The causes include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not configured.</li>
     * <li>ValidationError: The specified parameters in the request are invalid.</li>
     * <li>AccessDeniedError: You do not have the permissions to perform the operation on the KMS resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to retrieve the extended configuration of the secret. Valid values:</p>
     * <ul>
     * <li>true: Retrieves the extended configuration.</li>
     * <li>false: Does not retrieve the extended configuration. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>Generic secrets do not support extended configurations. If you specify this parameter for a generic secret, it is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FetchExtendedConfig")
    public Boolean fetchExtendedConfig;

    /**
     * <p>The remote attestation.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AttestationDocument&quot;:&quot;base64-encoded-attestion-document&quot;,  &quot;KeyEncryptionAlgorithm&quot;:&quot;RSAES_OAEP_SHA_256&quot; }</p>
     */
    @NameInMap("Recipient")
    public String recipient;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * <blockquote>
     * <p>To access a secret that belongs to another Alibaba Cloud account, you must specify the ARN of the secret. The ARN of a secret is in the <code>acs:kms:${region}:${account}:secret/${secret-name}</code> format.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version ID.</p>
     * <blockquote>
     * <p>ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, and ECS secrets do not support the VersionId parameter. If you specify this parameter, it is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The version stage. Default value: ACSCurrent.</p>
     * <p>If you specify this parameter, the secret value of the specified version stage is returned. If you do not specify this parameter, the secret value of the ACSCurrent version stage is returned.</p>
     * <blockquote>
     * <p>For ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, and ECS secrets, you can only retrieve the secret values of the versions marked with ACSPrevious and ACSCurrent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ACSCurrent</p>
     */
    @NameInMap("VersionStage")
    public String versionStage;

    public static GetSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueRequest self = new GetSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretValueRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GetSecretValueRequest setFetchExtendedConfig(Boolean fetchExtendedConfig) {
        this.fetchExtendedConfig = fetchExtendedConfig;
        return this;
    }
    public Boolean getFetchExtendedConfig() {
        return this.fetchExtendedConfig;
    }

    public GetSecretValueRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    public String getRecipient() {
        return this.recipient;
    }

    public GetSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretValueRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetSecretValueRequest setVersionStage(String versionStage) {
        this.versionStage = versionStage;
        return this;
    }
    public String getVersionStage() {
        return this.versionStage;
    }

}
