// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("OSSBucket")
    public String OSSBucket;

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
