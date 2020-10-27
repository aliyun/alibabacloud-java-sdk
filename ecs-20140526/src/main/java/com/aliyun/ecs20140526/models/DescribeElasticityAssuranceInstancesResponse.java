// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("ElasticityAssuranceItem")
    @Validation(required = true)
    public DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem elasticityAssuranceItem;

    public static DescribeElasticityAssuranceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesResponse self = new DescribeElasticityAssuranceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticityAssuranceInstancesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssuranceInstancesResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssuranceInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeElasticityAssuranceInstancesResponse setElasticityAssuranceItem(DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem elasticityAssuranceItem) {
        this.elasticityAssuranceItem = elasticityAssuranceItem;
        return this;
    }
    public DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem getElasticityAssuranceItem() {
        return this.elasticityAssuranceItem;
    }

    public static class DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet self = new DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem extends TeaModel {
        @NameInMap("InstanceIdSet")
        @Validation(required = true)
        public java.util.List<DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet> instanceIdSet;

        public static DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem self = new DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItem setInstanceIdSet(java.util.List<DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<DescribeElasticityAssuranceInstancesResponseElasticityAssuranceItemInstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
