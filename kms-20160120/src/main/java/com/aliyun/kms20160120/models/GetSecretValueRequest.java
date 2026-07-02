// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    /**
     * <p>Indicates whether to enable DryRun mode.</p>
     * <ul>
     * <li>true: Enabled  </li>
     * <li>false (Default Value): Disabled</li>
     * </ul>
     * <p>DryRun mode is used for Testing API Calls to authenticate whether you have the required permissions on the specified resource and whether the Request Parameters are correctly configured. When DryRun mode is enabled, KMS always returns a failed response along with the failure reason. Possible failure reasons include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not specified.  </li>
     * <li>ValidationError: One or more parameters in the request are invalid.  </li>
     * <li>AccessDeniedError: You do not have permission to execute this operation on the KMS resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Indicates whether to retrieve the extended configuration of the credential. Valid values:</p>
     * <ul>
     * <li>true: Retrieve  </li>
     * <li>false (Default Value): Do not retrieve</li>
     * </ul>
     * <blockquote>
     * <p>Generic secrets do not support extended configuration. If you specify this parameter, it will be ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FetchExtendedConfig")
    public Boolean fetchExtendedConfig;

    /**
     * <p>The name or ARN of the credential.  </p>
     * <blockquote>
     * <p>When accessing a credential under another Alibaba Cloud account, you must specify the credential ARN. The ARN format is <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>Version number.</p>
     * <blockquote>
     * <p>The VersionId parameter is not supported for RDS credentials, PolarDB credentials, Redis/Tair credentials, RAM credentials, and ECS credentials. If you specify this parameter, it will be ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The version stage. Default value: ACSCurrent.  </p>
     * <p>If you specify this parameter, the credential value of the specified version stage is returned. If you do not specify this parameter, the credential value of the ACSCurrent version stage is returned.  </p>
     * <blockquote>
     * <p>For RDS credentials, PolarDB credentials, Redis/Tair credentials, RAM credentials, and ECS credentials, you can retrieve only the credential values corresponding to the ACSPrevious or ACSCurrent version stages.</p>
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
