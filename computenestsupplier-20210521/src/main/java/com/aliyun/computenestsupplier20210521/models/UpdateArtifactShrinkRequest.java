// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactShrinkRequest extends TeaModel {
    /**
     * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
     */
    @NameInMap("ArtifactBuildProperty")
    public String artifactBuildPropertyShrink;

    /**
     * <p>The ID of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The properties of the deployment package.</p>
     */
    @NameInMap("ArtifactProperty")
    public String artifactPropertyShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Permission fields are applicable to container image artifact and Helm Chart artifact. They can only change from Automatic to Public. Options:</p>
     * <p>Public</p>
     * <p>Automatic</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("PermissionType")
    public String permissionType;

    /**
     * <p>The IDs of the regions that support the deployment package.</p>
     */
    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    /**
     * <p>The version name of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateArtifactShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactShrinkRequest self = new UpdateArtifactShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactShrinkRequest setArtifactBuildPropertyShrink(String artifactBuildPropertyShrink) {
        this.artifactBuildPropertyShrink = artifactBuildPropertyShrink;
        return this;
    }
    public String getArtifactBuildPropertyShrink() {
        return this.artifactBuildPropertyShrink;
    }

    public UpdateArtifactShrinkRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public UpdateArtifactShrinkRequest setArtifactPropertyShrink(String artifactPropertyShrink) {
        this.artifactPropertyShrink = artifactPropertyShrink;
        return this;
    }
    public String getArtifactPropertyShrink() {
        return this.artifactPropertyShrink;
    }

    public UpdateArtifactShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateArtifactShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateArtifactShrinkRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public UpdateArtifactShrinkRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public UpdateArtifactShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
