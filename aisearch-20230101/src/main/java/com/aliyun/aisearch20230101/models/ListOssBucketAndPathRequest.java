// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListOssBucketAndPathRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("OssPath")
    public String ossPath;

    public static ListOssBucketAndPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketAndPathRequest self = new ListOssBucketAndPathRequest();
        return TeaModel.build(map, self);
    }

    public ListOssBucketAndPathRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListOssBucketAndPathRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
