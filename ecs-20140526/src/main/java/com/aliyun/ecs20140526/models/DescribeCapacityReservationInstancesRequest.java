// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationInstancesRequestPrivatePoolOptions privatePoolOptions;

    public static DescribeCapacityReservationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesRequest self = new DescribeCapacityReservationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeCapacityReservationInstancesRequest setPrivatePoolOptions(DescribeCapacityReservationInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeCapacityReservationInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public static class DescribeCapacityReservationInstancesRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
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
