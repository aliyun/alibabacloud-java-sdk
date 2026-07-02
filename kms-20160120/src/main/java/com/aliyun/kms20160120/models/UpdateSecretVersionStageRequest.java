// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageRequest extends TeaModel {
    /**
     * <p>The version number of the secret. This parameter specifies that the version stage set by VersionStage is attached to this version.</p>
     * <blockquote>
     * <ul>
     * <li><p>You must specify at least one of RemoveFromVersion and MoveToVersion.</p>
     * </li>
     * <li><p>If you set VersionStage to ACSCurrent or ACSPrevious, you must specify this parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>002</p>
     */
    @NameInMap("MoveToVersion")
    public String moveToVersion;

    /**
     * <p>The version number of the secret. This parameter specifies that the version stage set by VersionStage is removed from this version.</p>
     * <blockquote>
     * <p>You must specify at least one of RemoveFromVersion and MoveToVersion.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("RemoveFromVersion")
    public String removeFromVersion;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * <blockquote>
     * <p>To access a secret in a different Alibaba Cloud account, you must specify the ARN of the secret. The ARN is in the format of <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version stage of the secret.</p>
     * <p><strong>Scenario 1: Add a version stage to a specified secret version.</strong></p>
     * <p>Specify this parameter and MoveToVersion. Do not specify RemoveFromVersion. This parameter can be set to ACSCurrent, ACSPrevious, or a custom stage.</p>
     * <p><strong>Scenario 2: Remove a version stage from a specified secret version.</strong></p>
     * <p>Specify this parameter and RemoveFromVersion. Do not specify MoveToVersion. This parameter must be set to a custom stage.</p>
     * <blockquote>
     * <p>ACSCurrent and ACSPrevious are system-reserved stages. You cannot directly remove them. You can only remove them from one secret version and attach them to another.</p>
     * </blockquote>
     * <p><strong>Scenario 3: Remove a version stage from a specified secret version and attach it to another secret version.</strong></p>
     * <p>Specify this parameter, MoveToVersion, and RemoveFromVersion. This parameter can be set to ACSCurrent, ACSPrevious, or a custom stage.</p>
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
