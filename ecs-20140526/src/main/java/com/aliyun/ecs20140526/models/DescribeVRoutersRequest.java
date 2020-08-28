// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVRoutersRequest extends TeaModel {
    @NameInMap("VRouterId")
    public String VRouterId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVRoutersRequest self = new DescribeVRoutersRequest();
        return TeaModel.build(map, self);
    }

}
