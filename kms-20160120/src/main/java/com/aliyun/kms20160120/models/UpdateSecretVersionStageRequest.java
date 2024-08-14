// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageRequest extends TeaModel {
    /**
     * <p>The version from which you want to remove the specified stage label.</p>
     * <blockquote>
     * <p> You must specify at least one of the RemoveFromVersion and MoveToVersion parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>002</p>
     */
    @NameInMap("MoveToVersion")
    public String moveToVersion;

    /**
     * <p>The specified stage label. Valid values:</p>
     * <ul>
     * <li>ACSCurrent</li>
     * <li>ACSPrevious</li>
     * <li>Custom stage label</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("RemoveFromVersion")
    public String removeFromVersion;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>UpdateSecretVersionStage</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACSCurrent</p>
     */
    @NameInMap("VersionStage")
    public String versionStage;

    public static UpdateSecretVersionStageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageRequest self = new UpdateSecretVersionStageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageRequest setMoveToVersion(String moveToVersion) {
        this.moveToVersion = moveToVersion;
        return this;
    }
    public String getMoveToVersion() {
        return this.moveToVersion;
    }

    public UpdateSecretVersionStageRequest setRemoveFromVersion(String removeFromVersion) {
        this.removeFromVersion = removeFromVersion;
        return this;
    }
    public String getRemoveFromVersion() {
        return this.removeFromVersion;
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

}
