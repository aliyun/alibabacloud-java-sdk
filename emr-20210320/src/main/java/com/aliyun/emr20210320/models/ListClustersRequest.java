// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    /**
     * <p>The IDs of the clusters. You can specify a maximum of 100 items.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The states of clusters. You can specify a maximum of 100 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;HADOOP&quot;]</p>
     */
    @NameInMap("ClusterStates")
    public java.util.List<String> clusterStates;

    /**
     * <p>The types of the clusters. You can specify a maximum of 100 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-b933c5aac8fe****&quot;]</p>
     */
    @NameInMap("ClusterTypes")
    public java.util.List<String> clusterTypes;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The starting point of the current query. If you do not configure this parameter, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJlY21OZXh0VG9rZW4iOiIxIiwidGFpaGFvTmV4dFRva2VuIjoiNTYiLCJ0YWloYW9OZXh0VG9rZW5JbnQiOjU2LCJlY21OZXh0VG9rZW5JbnQiOjF9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing methods. You can specify a maximum of 2 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ECS&quot;]</p>
     */
    @NameInMap("PaymentTypes")
    public java.util.List<String> paymentTypes;

    /**
     * <p>The region ID.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-qingdao</li>
     * <li>cn-beijing</li>
     * <li>cn-zhangjiakou</li>
     * <li>cn-huhehaote</li>
     * <li>cn-hangzhou</li>
     * <li>cn-shanghai</li>
     * <li>cn-shenzhen</li>
     * <li>cn-chengdu</li>
     * <li>cn-hongkong</li>
     * <li>cn-wulanchabu</li>
     * <li>cn-heyuan-acdr-1</li>
     * <li>cn-qingdao-acdr-ut-1</li>
     * <li>ap-northeast-1</li>
     * <li>ap-southeast-1</li>
     * <li>ap-southeast-2</li>
     * <li>ap-southeast-3</li>
     * <li>ap-southeast-5</li>
     * <li>ap-south-1</li>
     * <li>us-east-1</li>
     * <li>us-west-1</li>
     * <li>me-east-1</li>
     * <li>me-central-1</li>
     * <li>eu-central-1</li>
     * <li>eu-west-1</li>
     * <li>cn-north-2-gov-1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags. Number of elements in the array: 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PayAsYouGo&quot;]</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public ListClustersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListClustersRequest setClusterStates(java.util.List<String> clusterStates) {
        this.clusterStates = clusterStates;
        return this;
    }
    public java.util.List<String> getClusterStates() {
        return this.clusterStates;
    }

    public ListClustersRequest setClusterTypes(java.util.List<String> clusterTypes) {
        this.clusterTypes = clusterTypes;
        return this;
    }
    public java.util.List<String> getClusterTypes() {
        return this.clusterTypes;
    }

    public ListClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClustersRequest setPaymentTypes(java.util.List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
        return this;
    }
    public java.util.List<String> getPaymentTypes() {
        return this.paymentTypes;
    }

    public ListClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListClustersRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
