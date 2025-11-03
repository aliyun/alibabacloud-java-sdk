// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class RouteItem extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceDomain")
    public String instanceDomain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageDomain")
    public String storageDomain;

    public static RouteItem build(java.util.Map<String, ?> map) throws Exception {
        RouteItem self = new RouteItem();
        return TeaModel.build(map, self);
    }

    public RouteItem setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public RouteItem setInstanceDomain(String instanceDomain) {
        this.instanceDomain = instanceDomain;
        return this;
    }
    public String getInstanceDomain() {
        return this.instanceDomain;
    }

    public RouteItem setStorageDomain(String storageDomain) {
        this.storageDomain = storageDomain;
        return this;
    }
    public String getStorageDomain() {
        return this.storageDomain;
    }

}
