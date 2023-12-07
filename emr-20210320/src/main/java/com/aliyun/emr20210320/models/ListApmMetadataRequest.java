// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApmMetadataRequest extends TeaModel {
    /**
     * <p>集群ID。非必传参数。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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

    /**
     * <p>元数据类型。</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListApmMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApmMetadataRequest self = new ListApmMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListApmMetadataRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApmMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApmMetadataRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApmMetadataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
