// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApmDataRequest extends TeaModel {
    /**
     * <p>集群ID。非必传参数。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("Language")
    public String language;

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

    public static GetApmDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApmDataRequest self = new GetApmDataRequest();
        return TeaModel.build(map, self);
    }

    public GetApmDataRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetApmDataRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public GetApmDataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApmDataRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetApmDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetApmDataRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
