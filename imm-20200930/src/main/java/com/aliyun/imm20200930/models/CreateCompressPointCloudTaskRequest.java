// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskRequest extends TeaModel {
    /**
     * <p>The compression algorithm. Valid values:</p>
     * <ul>
     * <li>octree</li>
     * <li>kdtree</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>octree</p>
     */
    @NameInMap("CompressMethod")
    public String compressMethod;

    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The configurations of authorization chains. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The k-d tree compression options.</p>
     */
    @NameInMap("KdtreeOption")
    public KdtreeOption kdtreeOption;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The octree compression options.</p>
     */
    @NameInMap("OctreeOption")
    public OctreeOption octreeOption;

    /**
     * <p>The PCD property fields and the compression order in which the data is decompressed after the compression is complete.</p>
     * <ul>
     * <li>If octree of Point Cloud Library (PCL) is used for compression, [&quot;xyz&quot;] is supported.</li>
     * <li>If Draco k-dimensional (k-d) tree is used for compression, [&quot;xyz&quot;] and [&quot;xyz&quot;, &quot;intensity&quot;] are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PointCloudFields")
    public java.util.List<String> pointCloudFields;

    /**
     * <p>The file format. Set the value to the default value: pcd.</p>
     * 
     * <strong>example:</strong>
     * <p>pcd</p>
     */
    @NameInMap("PointCloudFileFormat")
    public String pointCloudFileFormat;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS URL of the PCD file.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/src/test.pcd</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The custom tags, which can be used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LabelKey&quot;: &quot;Value&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The OSS URL of the output file after compression.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test/tgt</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The custom data, which is returned in an asynchronous notification and facilitates notification management. The maximum length is 2,048 bytes.</p>
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
