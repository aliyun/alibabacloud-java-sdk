// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompressMethod")
    public String compressMethod;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("KdtreeOption")
    public String kdtreeOptionShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("OctreeOption")
    public String octreeOptionShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PointCloudFields")
    public String pointCloudFieldsShrink;

    @NameInMap("PointCloudFileFormat")
    public String pointCloudFileFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateCompressPointCloudTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompressPointCloudTaskShrinkRequest self = new CreateCompressPointCloudTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompressPointCloudTaskShrinkRequest setCompressMethod(String compressMethod) {
        this.compressMethod = compressMethod;
        return this;
    }
    public String getCompressMethod() {
        return this.compressMethod;
    }

    public CreateCompressPointCloudTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setKdtreeOptionShrink(String kdtreeOptionShrink) {
        this.kdtreeOptionShrink = kdtreeOptionShrink;
        return this;
    }
    public String getKdtreeOptionShrink() {
        return this.kdtreeOptionShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setOctreeOptionShrink(String octreeOptionShrink) {
        this.octreeOptionShrink = octreeOptionShrink;
        return this;
    }
    public String getOctreeOptionShrink() {
        return this.octreeOptionShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setPointCloudFieldsShrink(String pointCloudFieldsShrink) {
        this.pointCloudFieldsShrink = pointCloudFieldsShrink;
        return this;
    }
    public String getPointCloudFieldsShrink() {
        return this.pointCloudFieldsShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setPointCloudFileFormat(String pointCloudFileFormat) {
        this.pointCloudFileFormat = pointCloudFileFormat;
        return this;
    }
    public String getPointCloudFileFormat() {
        return this.pointCloudFileFormat;
    }

    public CreateCompressPointCloudTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCompressPointCloudTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateCompressPointCloudTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateCompressPointCloudTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateCompressPointCloudTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
