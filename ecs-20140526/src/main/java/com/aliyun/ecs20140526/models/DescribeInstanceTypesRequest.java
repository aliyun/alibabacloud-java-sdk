// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesRequest extends TeaModel {
    @NameInMap("Filters")
    public java.util.List<DescribeInstanceTypesRequestFilters> filters;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesRequest self = new DescribeInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesRequest setFilters(java.util.List<DescribeInstanceTypesRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeInstanceTypesRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeInstanceTypesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeInstanceTypesRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceTypesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceTypesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceTypesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceTypesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceTypesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeInstanceTypesRequestFilters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceTypesRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesRequestFilters self = new DescribeInstanceTypesRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceTypesRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
