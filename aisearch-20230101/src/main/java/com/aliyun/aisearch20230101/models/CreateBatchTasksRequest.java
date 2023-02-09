// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CreateBatchTasksRequest extends TeaModel {
    /**
     * <p>oss bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CallbackAddress")
    public String callbackAddress;

    /**
     * <p>oss path</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    public static CreateBatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTasksRequest self = new CreateBatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTasksRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateBatchTasksRequest setCallbackAddress(String callbackAddress) {
        this.callbackAddress = callbackAddress;
        return this;
    }
    public String getCallbackAddress() {
        return this.callbackAddress;
    }

    public CreateBatchTasksRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
