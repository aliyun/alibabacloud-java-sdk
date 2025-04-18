// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOSSBucketAttachmentRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>examplebucket</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    public static GetOSSBucketAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOSSBucketAttachmentRequest self = new GetOSSBucketAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public GetOSSBucketAttachmentRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

}
