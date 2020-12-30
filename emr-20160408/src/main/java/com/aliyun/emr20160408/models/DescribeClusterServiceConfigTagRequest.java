// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigTagRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ConfigTag")
    public String configTag;

    public static DescribeClusterServiceConfigTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigTagRequest self = new DescribeClusterServiceConfigTagRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigTagRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterServiceConfigTagRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterServiceConfigTagRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterServiceConfigTagRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeClusterServiceConfigTagRequest setConfigTag(String configTag) {
        this.configTag = configTag;
        return this;
    }
    public String getConfigTag() {
        return this.configTag;
    }

}
