// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    public static DescribeCapacityReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsRequest self = new DescribeCapacityReservationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCapacityReservationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationsRequest setPrivatePoolOptions(DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeCapacityReservationsRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeCapacityReservationsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeCapacityReservationsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeCapacityReservationsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeCapacityReservationsRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public static class DescribeCapacityReservationsRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Ids")
        public String ids;

        public static DescribeCapacityReservationsRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsRequestPrivatePoolOptions self = new DescribeCapacityReservationsRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsRequestPrivatePoolOptions setIds(String ids) {
            this.ids = ids;
            return this;
        }
        public String getIds() {
            return this.ids;
        }

    }

}
