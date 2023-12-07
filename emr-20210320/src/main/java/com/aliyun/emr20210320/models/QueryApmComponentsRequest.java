// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmComponentsRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Provider")
    public String provider;

    /**
     * <p>地域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>如果存在clusterId，从Cluster中获取该值，如果clusterId为空，用户显式指定</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static QueryApmComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApmComponentsRequest self = new QueryApmComponentsRequest();
        return TeaModel.build(map, self);
    }

    public QueryApmComponentsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryApmComponentsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryApmComponentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryApmComponentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
