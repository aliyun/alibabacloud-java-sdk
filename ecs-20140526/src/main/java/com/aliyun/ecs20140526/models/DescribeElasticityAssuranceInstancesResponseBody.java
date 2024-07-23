// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the instances that match and use the elasticity assurance.</p>
     */
    @NameInMap("ElasticityAssuranceItem")
    public DescribeElasticityAssuranceInstancesResponseBodyElasticityAssuranceItem elasticityAssuranceItem;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4****</p>
         */
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
