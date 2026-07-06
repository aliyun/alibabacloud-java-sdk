// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskRequest extends TeaModel {
    /**
     * <p>Source instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to overwrite an existing image:</p>
     * <ul>
     * <li><p><code>true</code>: Overwrite the existing image.</p>
     * </li>
     * <li><p><code>false</code>: Do not overwrite the existing image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Override")
    public Boolean override;

    /**
     * <p>Image repository ID in the source instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-iql7jalx4g0****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>Image tag in the source instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>Target instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-ibxs3piklys3****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>Namespace in the target instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("TargetNamespace")
    public String targetNamespace;

    /**
     * <p>Region ID of the target instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    /**
     * <p>Name of the image repository in the target instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("TargetRepoName")
    public String targetRepoName;

    /**
     * <p>Image tag in the target instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1</p>
     */
    @NameInMap("TargetTag")
    public String targetTag;

    /**
     * <p>UID of the account to which the target instance belongs</p>
     * 
     * <strong>example:</strong>
     * <p>12345***</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    public static CreateRepoSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskRequest self = new CreateRepoSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSyncTaskRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public CreateRepoSyncTaskRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoSyncTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateRepoSyncTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateRepoSyncTaskRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public CreateRepoSyncTaskRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    public CreateRepoSyncTaskRequest setTargetRepoName(String targetRepoName) {
        this.targetRepoName = targetRepoName;
        return this;
    }
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    public CreateRepoSyncTaskRequest setTargetTag(String targetTag) {
        this.targetTag = targetTag;
        return this;
    }
    public String getTargetTag() {
        return this.targetTag;
    }

    public CreateRepoSyncTaskRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
