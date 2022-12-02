// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusRequest extends TeaModel {
    @NameInMap("AggregateDataName")
    public String aggregateDataName;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    @NameInMap("DedicatedLineName")
    public String dedicatedLineName;

    @NameInMap("DeviceForm")
    public String deviceForm;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Manufacturer")
    public String manufacturer;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Model")
    public String model;

    @NameInMap("MonitorItemId")
    public String monitorItemId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("PortCollectionId")
    public String portCollectionId;

    @NameInMap("PortCollectionName")
    public String portCollectionName;

    @NameInMap("Province")
    public String province;

    @NameInMap("Region")
    public String region;

    @NameInMap("Role")
    public String role;

    @NameInMap("SecurityDomain")
    public String securityDomain;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("Space")
    public String space;

    @NameInMap("SpaceType")
    public String spaceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("UniqueKey")
    public String uniqueKey;

    public static ListAlarmStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusRequest self = new ListAlarmStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusRequest setAggregateDataName(String aggregateDataName) {
        this.aggregateDataName = aggregateDataName;
        return this;
    }
    public String getAggregateDataName() {
        return this.aggregateDataName;
    }

    public ListAlarmStatusRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ListAlarmStatusRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ListAlarmStatusRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public ListAlarmStatusRequest setDedicatedLineName(String dedicatedLineName) {
        this.dedicatedLineName = dedicatedLineName;
        return this;
    }
    public String getDedicatedLineName() {
        return this.dedicatedLineName;
    }

    public ListAlarmStatusRequest setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public ListAlarmStatusRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListAlarmStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListAlarmStatusRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListAlarmStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAlarmStatusRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public ListAlarmStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmStatusRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListAlarmStatusRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListAlarmStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmStatusRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListAlarmStatusRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public ListAlarmStatusRequest setPortCollectionName(String portCollectionName) {
        this.portCollectionName = portCollectionName;
        return this;
    }
    public String getPortCollectionName() {
        return this.portCollectionName;
    }

    public ListAlarmStatusRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ListAlarmStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAlarmStatusRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListAlarmStatusRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public ListAlarmStatusRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public ListAlarmStatusRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListAlarmStatusRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public ListAlarmStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAlarmStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListAlarmStatusRequest setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }
    public String getUniqueKey() {
        return this.uniqueKey;
    }

}
