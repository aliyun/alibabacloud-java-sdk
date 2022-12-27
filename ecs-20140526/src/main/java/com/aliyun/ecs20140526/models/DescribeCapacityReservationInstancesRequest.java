// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationInstancesRequestPrivatePoolOptions privatePoolOptions;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token used to start the query. The token is obtained from the response of the previous request.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the capacity reservation. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeCapacityReservationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesRequest self = new DescribeCapacityReservationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesRequest setPrivatePoolOptions(DescribeCapacityReservationInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeCapacityReservationInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeCapacityReservationInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCapacityReservationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCapacityReservationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCapacityReservationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCapacityReservationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeCapacityReservationInstancesRequestPrivatePoolOptions extends TeaModel {
        // The ID of the capacity reservation.
        @NameInMap("Id")
        public String id;

        public static DescribeCapacityReservationInstancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesRequestPrivatePoolOptions self = new DescribeCapacityReservationInstancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
