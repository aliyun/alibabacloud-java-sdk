// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeISVFileUploadSignedUrlRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeISVFileUploadSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeISVFileUploadSignedUrlRequest self = new DescribeISVFileUploadSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeISVFileUploadSignedUrlRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public DescribeISVFileUploadSignedUrlRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeISVFileUploadSignedUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
