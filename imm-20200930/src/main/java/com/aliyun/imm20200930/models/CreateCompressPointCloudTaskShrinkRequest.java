// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskShrinkRequest extends TeaModel {
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
    public String credentialConfigShrink;

    /**
     * <p>The parameters for K-d tree compression.</p>
     */
    @NameInMap("KdtreeOption")
    public String kdtreeOptionShrink;

    /**
     * <p>The notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>Intelligent Media Management API callbacks do not support specifying a webhook address. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The parameters for Octree compression.</p>
     */
    @NameInMap("OctreeOption")
    public String octreeOptionShrink;

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
    public String pointCloudFieldsShrink;

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
    public String tagsShrink;

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
