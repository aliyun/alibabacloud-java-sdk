// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteGlobalResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PubPhoenixSLBQueryServerVip</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL_VIP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteGlobalResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalResourceRequest self = new DeleteGlobalResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteGlobalResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGlobalResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DeleteGlobalResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
