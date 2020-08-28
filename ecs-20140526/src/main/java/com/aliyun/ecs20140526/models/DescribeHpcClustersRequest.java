// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHpcClustersRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HpcClusterIds")
    public String hpcClusterIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeHpcClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHpcClustersRequest self = new DescribeHpcClustersRequest();
        return TeaModel.build(map, self);
    }

}
