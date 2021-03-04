// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("VersionStage")
    public String versionStage;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("FetchExtendedConfig")
    public Boolean fetchExtendedConfig;

    public static GetSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueRequest self = new GetSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretValueRequest setVersionStage(String versionStage) {
        this.versionStage = versionStage;
        return this;
    }
    public String getVersionStage() {
        return this.versionStage;
    }

    public GetSecretValueRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetSecretValueRequest setFetchExtendedConfig(Boolean fetchExtendedConfig) {
        this.fetchExtendedConfig = fetchExtendedConfig;
        return this;
    }
    public Boolean getFetchExtendedConfig() {
        return this.fetchExtendedConfig;
    }

}
