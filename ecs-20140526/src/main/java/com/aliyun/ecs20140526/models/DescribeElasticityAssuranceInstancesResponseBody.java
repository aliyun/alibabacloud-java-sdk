// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ElasticityAssuranceItem")
    public java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem> elasticityAssuranceItem;

    public static DescribeElasticityAssuranceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesResponseBody self = new DescribeElasticityAssuranceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeElasticityAssuranceInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssuranceInstancesResponseBody setElasticityAssuranceItem(java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem> elasticityAssuranceItem) {
        this.elasticityAssuranceItem = elasticityAssuranceItem;
        return this;
    }
    public java.util.List<DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem> getElasticityAssuranceItem() {
        return this.elasticityAssuranceItem;
    }

    public static class DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem self = new DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
