// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionRequest self = new DescribeImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

}
