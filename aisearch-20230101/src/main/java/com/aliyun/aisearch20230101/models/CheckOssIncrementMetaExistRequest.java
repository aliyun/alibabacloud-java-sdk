// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CheckOssIncrementMetaExistRequest extends TeaModel {
    /**
     * <p>oss bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Key")
    public String key;

    /**
     * <p>oss path</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    public static CheckOssIncrementMetaExistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOssIncrementMetaExistRequest self = new CheckOssIncrementMetaExistRequest();
        return TeaModel.build(map, self);
    }

    public CheckOssIncrementMetaExistRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CheckOssIncrementMetaExistRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CheckOssIncrementMetaExistRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
