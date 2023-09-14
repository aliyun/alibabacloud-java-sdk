// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>应用名称列表。</p>
     */
    @NameInMap("ApplicationNames")
    public java.util.List<String> applicationNames;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ListApplicationsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
