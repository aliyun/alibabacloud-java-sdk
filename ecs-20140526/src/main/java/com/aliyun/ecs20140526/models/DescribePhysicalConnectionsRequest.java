// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribePhysicalConnectionsRequestFilter> filter;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static DescribePhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsRequest self = new DescribePhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribePhysicalConnectionsRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribePhysicalConnectionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestFilter self = new DescribePhysicalConnectionsRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
