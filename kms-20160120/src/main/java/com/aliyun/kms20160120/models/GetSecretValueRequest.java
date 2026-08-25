// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable DryRun mode. Valid values:</p>
     * <ul>
     * <li>true: enables DryRun mode.</li>
     * <li>false (default): disables DryRun mode.</li>
     * </ul>
     * <p>DryRun mode is used to test API calls and verify whether you have the required permissions on the corresponding resources and whether the request parameters are correctly configured. When DryRun mode is enabled, KMS always returns a failure and provides the failure reason. Failure reasons include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed without the DryRun parameter.</li>
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
     * <p>Specifies whether to retrieve the extended configuration of the secret. Valid values:</p>
     * <ul>
     * <li>true: retrieves the extended configuration.</li>
     * <li>false (default): does not retrieve the extended configuration.</li>
     * </ul>
     * <blockquote>
     * <p>Generic secrets do not support extended configurations. This parameter is ignored if specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FetchExtendedConfig")
    public Boolean fetchExtendedConfig;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;AttestationDocument&quot;:&quot;base64-encoded-attestion-document&quot;,  &quot;KeyEncryptionAlgorithm&quot;:&quot;RSAES_OAEP_SHA_256&quot; }</p>
     */
    @NameInMap("Recipient")
    public String recipient;

    /**
     * <p>The secret name or secret Alibaba Cloud Resource Name (ARN).</p>
     * <blockquote>
     * <p>To access a secret in another Alibaba Cloud account, you must specify the secret ARN. The format of the secret ARN is <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version number.</p>
     * <blockquote>
     * <p>ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, and ECS secrets do not support specifying VersionId. This parameter is ignored if specified.</p>
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
     * <p>For ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, and ECS secrets, you can retrieve only the secret values of the ACSPrevious and ACSCurrent versions.</p>
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
