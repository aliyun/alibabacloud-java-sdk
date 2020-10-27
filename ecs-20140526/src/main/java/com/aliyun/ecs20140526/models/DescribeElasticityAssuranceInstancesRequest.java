// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrivatePoolOptions")
    public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions privatePoolOptions;

    public static DescribeElasticityAssuranceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesRequest self = new DescribeElasticityAssuranceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticityAssuranceInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssuranceInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssuranceInstancesRequest setPrivatePoolOptions(DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public static class DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions self = new DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
