// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketRequest extends TeaModel {
    /**
     * <p>The description of the binding. The description must be 1 to 128 characters in length. By default, no description is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>test-attachment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the OSS bucket in the same region as the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>examplebucket</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The name of the project. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static AttachOSSBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachOSSBucketRequest self = new AttachOSSBucketRequest();
        return TeaModel.build(map, self);
    }

    public AttachOSSBucketRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AttachOSSBucketRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public AttachOSSBucketRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
