// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddClusterServiceRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Service")
    public java.util.List<AddClusterServiceRequestService> service;

    public static AddClusterServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterServiceRequest self = new AddClusterServiceRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterServiceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddClusterServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddClusterServiceRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AddClusterServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddClusterServiceRequest setService(java.util.List<AddClusterServiceRequestService> service) {
        this.service = service;
        return this;
    }
    public java.util.List<AddClusterServiceRequestService> getService() {
        return this.service;
    }

    public static class AddClusterServiceRequestService extends TeaModel {
        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("ServiceName")
        public String serviceName;

        public static AddClusterServiceRequestService build(java.util.Map<String, ?> map) throws Exception {
            AddClusterServiceRequestService self = new AddClusterServiceRequestService();
            return TeaModel.build(map, self);
        }

        public AddClusterServiceRequestService setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public AddClusterServiceRequestService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
