// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponseBody extends TeaModel {
    // Details about the instances that were created by using the elasticity assurance.
    @NameInMap("ElasticityAssuranceItem")
    public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem elasticityAssuranceItem;

    // The number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token used to start the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of entries that meet the query criteria.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeElasticityAssuranceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesResponseBody self = new DescribeElasticityAssuranceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesResponseBody setElasticityAssuranceItem(DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem elasticityAssuranceItem) {
        this.elasticityAssuranceItem = elasticityAssuranceItem;
        return this;
    }
    public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem getElasticityAssuranceItem() {
        return this.elasticityAssuranceItem;
    }

    public DescribeElasticityAssuranceInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssuranceInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssuranceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticityAssuranceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet extends TeaModel {
        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet self = new DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem extends TeaModel {
        @NameInMap("InstanceIdSet")
        public java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet> instanceIdSet;

        public static DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem self = new DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem setInstanceIdSet(java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItemInstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
