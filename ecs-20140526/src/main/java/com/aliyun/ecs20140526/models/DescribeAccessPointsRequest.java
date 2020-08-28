// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeAccessPointsRequestFilter> filter;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsRequest self = new DescribeAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeAccessPointsRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribeAccessPointsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsRequestFilter self = new DescribeAccessPointsRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
