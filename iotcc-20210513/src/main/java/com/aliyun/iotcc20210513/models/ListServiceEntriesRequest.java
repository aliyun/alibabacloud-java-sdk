// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceEntriesRequest extends TeaModel {
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("Target")
    public java.util.List<String> target;

    @NameInMap("TargetType")
    public java.util.List<String> targetType;

    @NameInMap("ServiceEntryStatus")
    public java.util.List<String> serviceEntryStatus;

    @NameInMap("ServiceEntryName")
    public java.util.List<String> serviceEntryName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceEntryIds")
    public java.util.List<String> serviceEntryIds;

    public static ListServiceEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEntriesRequest self = new ListServiceEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceEntriesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListServiceEntriesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListServiceEntriesRequest setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

    public ListServiceEntriesRequest setTargetType(java.util.List<String> targetType) {
        this.targetType = targetType;
        return this;
    }
    public java.util.List<String> getTargetType() {
        return this.targetType;
    }

    public ListServiceEntriesRequest setServiceEntryStatus(java.util.List<String> serviceEntryStatus) {
        this.serviceEntryStatus = serviceEntryStatus;
        return this;
    }
    public java.util.List<String> getServiceEntryStatus() {
        return this.serviceEntryStatus;
    }

    public ListServiceEntriesRequest setServiceEntryName(java.util.List<String> serviceEntryName) {
        this.serviceEntryName = serviceEntryName;
        return this;
    }
    public java.util.List<String> getServiceEntryName() {
        return this.serviceEntryName;
    }

    public ListServiceEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceEntriesRequest setServiceEntryIds(java.util.List<String> serviceEntryIds) {
        this.serviceEntryIds = serviceEntryIds;
        return this;
    }
    public java.util.List<String> getServiceEntryIds() {
        return this.serviceEntryIds;
    }

}
