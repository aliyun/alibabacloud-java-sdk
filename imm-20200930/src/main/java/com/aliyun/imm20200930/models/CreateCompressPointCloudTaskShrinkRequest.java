// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>octree</p>
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

    /**
     * <strong>example:</strong>
     * <p>pcd</p>
     */
    @NameInMap("PointCloudFileFormat")
    public String pointCloudFileFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/src/test.pcd</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <strong>example:</strong>
     * <p>{&quot;LabelKey&quot;: &quot;Value&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/tgt</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
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
