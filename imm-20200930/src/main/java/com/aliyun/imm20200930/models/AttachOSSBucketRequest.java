// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketRequest extends TeaModel {
    @NameInMap("OSSBucket")
    public String OSSBucket;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    public static AttachOSSBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachOSSBucketRequest self = new AttachOSSBucketRequest();
        return TeaModel.build(map, self);
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
