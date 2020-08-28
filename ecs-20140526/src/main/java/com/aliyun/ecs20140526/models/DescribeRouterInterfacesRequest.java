// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribeRouterInterfacesRequestFilter> filter;

    public static DescribeRouterInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesRequest self = new DescribeRouterInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeRouterInterfacesRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribeRouterInterfacesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesRequestFilter self = new DescribeRouterInterfacesRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
