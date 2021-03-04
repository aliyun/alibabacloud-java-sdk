// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageRequest extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("VersionStage")
    public String versionStage;

    @NameInMap("RemoveFromVersion")
    public String removeFromVersion;

    @NameInMap("MoveToVersion")
    public String moveToVersion;

    public static UpdateSecretVersionStageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageRequest self = new UpdateSecretVersionStageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public UpdateSecretVersionStageRequest setVersionStage(String versionStage) {
        this.versionStage = versionStage;
        return this;
    }
    public String getVersionStage() {
        return this.versionStage;
    }

    public UpdateSecretVersionStageRequest setRemoveFromVersion(String removeFromVersion) {
        this.removeFromVersion = removeFromVersion;
        return this;
    }
    public String getRemoveFromVersion() {
        return this.removeFromVersion;
    }

    public UpdateSecretVersionStageRequest setMoveToVersion(String moveToVersion) {
        this.moveToVersion = moveToVersion;
        return this;
    }
    public String getMoveToVersion() {
        return this.moveToVersion;
    }

}
