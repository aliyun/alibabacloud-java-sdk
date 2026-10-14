// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateC2paBucketSignTaskRequest extends TeaModel {
    /**
     * <p>The name of the user OSS bucket. You must authorize the service-linked role AliyunServiceRoleForAIDeepSign to access the bucket in advance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The region of the user OSS bucket. It must be consistent with the actual region of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegionId")
    public String bucketRegionId;

    /**
     * <p>The optional name of the software that generated the content. This parameter is not supported in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>Adobe Photoshop 25.0</p>
     */
    @NameInMap("SoftwareAgent")
    public String softwareAgent;

    /**
     * <p>The source object prefix. It must be <code>ai-deepsign/</code> or its subdirectory. The service recursively processes objects under this prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-deepsign/images/</p>
     */
    @NameInMap("SourcePrefix")
    public String sourcePrefix;

    /**
     * <p>The optional content source type. This parameter is not supported in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>digitalCapture</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateC2paBucketSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateC2paBucketSignTaskRequest self = new CreateC2paBucketSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateC2paBucketSignTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateC2paBucketSignTaskRequest setBucketRegionId(String bucketRegionId) {
        this.bucketRegionId = bucketRegionId;
        return this;
    }
    public String getBucketRegionId() {
        return this.bucketRegionId;
    }

    public CreateC2paBucketSignTaskRequest setSoftwareAgent(String softwareAgent) {
        this.softwareAgent = softwareAgent;
        return this;
    }
    public String getSoftwareAgent() {
        return this.softwareAgent;
    }

    public CreateC2paBucketSignTaskRequest setSourcePrefix(String sourcePrefix) {
        this.sourcePrefix = sourcePrefix;
        return this;
    }
    public String getSourcePrefix() {
        return this.sourcePrefix;
    }

    public CreateC2paBucketSignTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
