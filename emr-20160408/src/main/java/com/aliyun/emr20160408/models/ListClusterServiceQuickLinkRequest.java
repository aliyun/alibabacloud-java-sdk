// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceQuickLinkRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("DirectType")
    public Boolean directType;

    public static ListClusterServiceQuickLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceQuickLinkRequest self = new ListClusterServiceQuickLinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceQuickLinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListClusterServiceQuickLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClusterServiceQuickLinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterServiceQuickLinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListClusterServiceQuickLinkRequest setDirectType(Boolean directType) {
        this.directType = directType;
        return this;
    }
    public Boolean getDirectType() {
        return this.directType;
    }

}
