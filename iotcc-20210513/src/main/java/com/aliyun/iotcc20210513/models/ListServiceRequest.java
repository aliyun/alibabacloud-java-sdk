// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("ServiceIds")
    public java.util.List<String> serviceIds;

    @NameInMap("ServiceNames")
    public java.util.List<String> serviceNames;

    @NameInMap("ResourceStatuses")
    public java.util.List<String> resourceStatuses;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RegionId")
    public String regionId;

    public static ListServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRequest self = new ListServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListServiceRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public ListServiceRequest setServiceNames(java.util.List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public java.util.List<String> getServiceNames() {
        return this.serviceNames;
    }

    public ListServiceRequest setResourceStatuses(java.util.List<String> resourceStatuses) {
        this.resourceStatuses = resourceStatuses;
        return this;
    }
    public java.util.List<String> getResourceStatuses() {
        return this.resourceStatuses;
    }

    public ListServiceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
