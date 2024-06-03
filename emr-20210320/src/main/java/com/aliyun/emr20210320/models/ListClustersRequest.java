// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    /**
     * <p>The IDs of the clusters. You can specify a maximum of 100 items.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The states of clusters. You can specify a maximum of 100 items.</p>
     */
    @NameInMap("ClusterStates")
    public java.util.List<String> clusterStates;

    /**
     * <p>The types of the clusters. You can specify a maximum of 100 items.</p>
     */
    @NameInMap("ClusterTypes")
    public java.util.List<String> clusterTypes;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The starting point of the current query. If you do not configure this parameter, the query starts from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing methods. You can specify a maximum of 2 items.</p>
     */
    @NameInMap("PaymentTypes")
    public java.util.List<String> paymentTypes;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   cn-qingdao</p>
     * <p>*   cn-beijing</p>
     * <p>*   cn-zhangjiakou</p>
     * <p>*   cn-huhehaote</p>
     * <p>*   cn-hangzhou</p>
     * <p>*   cn-shanghai</p>
     * <p>*   cn-shenzhen</p>
     * <p>*   cn-chengdu</p>
     * <p>*   cn-hongkong</p>
     * <p>*   cn-wulanchabu</p>
     * <p>*   cn-heyuan-acdr-1</p>
     * <p>*   cn-qingdao-acdr-ut-1</p>
     * <p>*   ap-northeast-1</p>
     * <p>*   ap-southeast-1</p>
     * <p>*   ap-southeast-2</p>
     * <p>*   ap-southeast-3</p>
     * <p>*   ap-southeast-5</p>
     * <p>*   ap-south-1</p>
     * <p>*   us-east-1</p>
     * <p>*   us-west-1</p>
     * <p>*   me-east-1</p>
     * <p>*   me-central-1</p>
     * <p>*   eu-central-1</p>
     * <p>*   eu-west-1</p>
     * <p>*   cn-north-2-gov-1</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags. You can specify a maximum of 20 items.</p>
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
