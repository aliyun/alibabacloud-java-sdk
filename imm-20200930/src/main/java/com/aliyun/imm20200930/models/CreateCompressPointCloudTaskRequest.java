// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompressMethod")
    public String compressMethod;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("KdtreeOption")
    public KdtreeOption kdtreeOption;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("OctreeOption")
    public OctreeOption octreeOption;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PointCloudFields")
    public java.util.List<String> pointCloudFields;

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
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateCompressPointCloudTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompressPointCloudTaskRequest self = new CreateCompressPointCloudTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompressPointCloudTaskRequest setCompressMethod(String compressMethod) {
        this.compressMethod = compressMethod;
        return this;
    }
    public String getCompressMethod() {
        return this.compressMethod;
    }

    public CreateCompressPointCloudTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateCompressPointCloudTaskRequest setKdtreeOption(KdtreeOption kdtreeOption) {
        this.kdtreeOption = kdtreeOption;
        return this;
    }
    public KdtreeOption getKdtreeOption() {
        return this.kdtreeOption;
    }

    public CreateCompressPointCloudTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateCompressPointCloudTaskRequest setOctreeOption(OctreeOption octreeOption) {
        this.octreeOption = octreeOption;
        return this;
    }
    public OctreeOption getOctreeOption() {
        return this.octreeOption;
    }

    public CreateCompressPointCloudTaskRequest setPointCloudFields(java.util.List<String> pointCloudFields) {
        this.pointCloudFields = pointCloudFields;
        return this;
    }
    public java.util.List<String> getPointCloudFields() {
        return this.pointCloudFields;
    }

    public CreateCompressPointCloudTaskRequest setPointCloudFileFormat(String pointCloudFileFormat) {
        this.pointCloudFileFormat = pointCloudFileFormat;
        return this;
    }
    public String getPointCloudFileFormat() {
        return this.pointCloudFileFormat;
    }

    public CreateCompressPointCloudTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCompressPointCloudTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateCompressPointCloudTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateCompressPointCloudTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateCompressPointCloudTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
