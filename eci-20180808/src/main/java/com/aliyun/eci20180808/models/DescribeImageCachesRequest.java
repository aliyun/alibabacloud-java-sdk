// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageCacheId")
    public String imageCacheId;

    @NameInMap("ImageCacheName")
    public String imageCacheName;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("Image")
    public String image;

    public static DescribeImageCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesRequest self = new DescribeImageCachesRequest();
        return TeaModel.build(map, self);
    }

}
