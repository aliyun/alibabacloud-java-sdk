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

    public DescribePhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePhysicalConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsRequest setFilter(java.util.List<DescribePhysicalConnectionsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribePhysicalConnectionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePhysicalConnectionsRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public static class DescribePhysicalConnectionsRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribePhysicalConnectionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestFilter self = new DescribePhysicalConnectionsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
