// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateGlobalResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
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

    public static CreateGlobalResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalResourceRequest self = new CreateGlobalResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGlobalResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateGlobalResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGlobalResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateGlobalResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
