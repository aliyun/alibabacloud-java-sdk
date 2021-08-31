// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("DescribeInstancesRequest")
    public DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setDescribeInstancesRequest(DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest) {
        this.describeInstancesRequest = describeInstancesRequest;
        return this;
    }
    public DescribeInstancesRequestDescribeInstancesRequest getDescribeInstancesRequest() {
        return this.describeInstancesRequest;
    }

    public static class DescribeInstancesRequestDescribeInstancesRequest extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        // 付款类型
        @NameInMap("ChargeType")
        public String chargeType;

        public static DescribeInstancesRequestDescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestDescribeInstancesRequest self = new DescribeInstancesRequestDescribeInstancesRequest();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestDescribeInstancesRequest setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

    }

}
