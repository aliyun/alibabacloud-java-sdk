// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssStorageAndAccByBucketsRequest extends TeaModel {
    /**
     * <p>The information about the bucket.</p>
     */
    @NameInMap("BucketList")
    public String bucketList;

    public static GetOssStorageAndAccByBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssStorageAndAccByBucketsRequest self = new GetOssStorageAndAccByBucketsRequest();
        return TeaModel.build(map, self);
    }

    public GetOssStorageAndAccByBucketsRequest setBucketList(String bucketList) {
        this.bucketList = bucketList;
        return this;
    }
    public String getBucketList() {
        return this.bucketList;
    }

}
