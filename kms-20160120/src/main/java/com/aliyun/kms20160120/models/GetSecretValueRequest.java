// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to obtain the extended configuration of the secret. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false: This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is ignored for a generic secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FetchExtendedConfig")
    public Boolean fetchExtendedConfig;

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
     * <p>The version number of the secret value. If you specify this parameter, Secrets Manager returns the secret value of the specified version.</p>
     * <blockquote>
     * <p> This parameter is ignored for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00000000000000000000000000000001</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage label that marks the secret version. If you specify this parameter, Secrets Manager returns the secret value of the version that is marked with the specified stage label.</p>
     * <p>Default value: ACSCurrent.</p>
     * <blockquote>
     * <p> For a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret, Secrets Manager can return only the secret value of the version marked with ACSPrevious or ACSCurrent.</p>
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
