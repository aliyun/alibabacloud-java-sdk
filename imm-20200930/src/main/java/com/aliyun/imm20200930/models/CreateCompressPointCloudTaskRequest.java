// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskRequest extends TeaModel {
    /**
     * <p>The name of the compression algorithm. Valid values:</p>
     * <ul>
     * <li><p>octree: octree</p>
     * </li>
     * <li><p>kdtree: K-d tree</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>octree</p>
     */
    @NameInMap("CompressMethod")
    public String compressMethod;

    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access other entity resources</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The parameters for K-d tree compression.</p>
     */
    @NameInMap("KdtreeOption")
    public KdtreeOption kdtreeOption;

    /**
     * <p>The notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>Intelligent Media Management API callbacks do not support specifying a webhook address. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The parameters for Octree compression.</p>
     */
    @NameInMap("OctreeOption")
    public OctreeOption octreeOption;

    /**
     * <p>The PCD property fields to compress and the compression order. After compression, the data is decompressed in this order.</p>
     * <ul>
     * <li><p>If you use Octree compression from the Point Cloud Library (PCL), only [&quot;xyz&quot;] is supported.</p>
     * </li>
     * <li><p>If you use K-d tree compression from the Draco library, [&quot;xyz&quot;] or [&quot;xyz&quot;, &quot;intensity&quot;] is supported.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PointCloudFields")
    public java.util.List<String> pointCloudFields;

    /**
     * <p>The format of the point cloud file. Only the PCD format is supported. The default value is pcd.</p>
     * 
     * <strong>example:</strong>
     * <p>pcd</p>
     */
    @NameInMap("PointCloudFileFormat")
    public String pointCloudFileFormat;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS URI of the point cloud file.</p>
     * <p>The URI must be in the format oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket in the same region as the project. ${Object} is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/src/test.pcd</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Custom tags to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LabelKey&quot;: &quot;Value&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The OSS URI of the output file after compression.</p>
     * <p>The URI must be in the format oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket in the same region as the project. ${Object} is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/tgt</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. You can use this information to associate notification messages in your system. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
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
