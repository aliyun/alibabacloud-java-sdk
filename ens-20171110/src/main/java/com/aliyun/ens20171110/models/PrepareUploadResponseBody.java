// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PrepareUploadResponseBody extends TeaModel {
    /**
     * <p>The name of the bucket. This parameter is available only when the OSS SDK is used.</p>
     * 
     * <strong>example:</strong>
     * <p>test-xxxxxx</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The endpoint. This parameter is available only when the OSS SDK is used.</p>
     * 
     * <strong>example:</strong>
     * <p>eos.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PrepareUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadResponseBody self = new PrepareUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepareUploadResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PrepareUploadResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public PrepareUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
