// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceResourcesResponseBody extends TeaModel {
    @NameInMap("DeviceResource")
    public java.util.List<ListDeviceResourcesResponseBodyDeviceResource> deviceResource;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDeviceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceResourcesResponseBody self = new ListDeviceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceResourcesResponseBody setDeviceResource(java.util.List<ListDeviceResourcesResponseBodyDeviceResource> deviceResource) {
        this.deviceResource = deviceResource;
        return this;
    }
    public java.util.List<ListDeviceResourcesResponseBodyDeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    public ListDeviceResourcesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceResourcesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDeviceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceResourcesResponseBodyDeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        public String blockNumber;

        @NameInMap("Business")
        public String business;

        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigTaskId")
        public String configTaskId;

        @NameInMap("ConfigTaskStatus")
        public String configTaskStatus;

        @NameInMap("DeliveryIp")
        public String deliveryIp;

        @NameInMap("DeviceNumber")
        public String deviceNumber;

        @NameInMap("DeviceResourceId")
        public String deviceResourceId;

        @NameInMap("GenerateConfig")
        public String generateConfig;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InterConnection")
        public String interConnection;

        @NameInMap("Location")
        public String location;

        @NameInMap("Loopback")
        public String loopback;

        @NameInMap("ManagerIp")
        public String managerIp;

        @NameInMap("Model")
        public String model;

        @NameInMap("Params")
        public String params;

        @NameInMap("Role")
        public String role;

        @NameInMap("SetupProjectId")
        public String setupProjectId;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Stack")
        public Boolean stack;

        @NameInMap("Vendor")
        public String vendor;

        public static ListDeviceResourcesResponseBodyDeviceResource build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceResourcesResponseBodyDeviceResource self = new ListDeviceResourcesResponseBodyDeviceResource();
            return TeaModel.build(map, self);
        }

        public ListDeviceResourcesResponseBodyDeviceResource setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfigTaskId(String configTaskId) {
            this.configTaskId = configTaskId;
            return this;
        }
        public String getConfigTaskId() {
            return this.configTaskId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfigTaskStatus(String configTaskStatus) {
            this.configTaskStatus = configTaskStatus;
            return this;
        }
        public String getConfigTaskStatus() {
            return this.configTaskStatus;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeliveryIp(String deliveryIp) {
            this.deliveryIp = deliveryIp;
            return this;
        }
        public String getDeliveryIp() {
            return this.deliveryIp;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setGenerateConfig(String generateConfig) {
            this.generateConfig = generateConfig;
            return this;
        }
        public String getGenerateConfig() {
            return this.generateConfig;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setInterConnection(String interConnection) {
            this.interConnection = interConnection;
            return this;
        }
        public String getInterConnection() {
            return this.interConnection;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setLoopback(String loopback) {
            this.loopback = loopback;
            return this;
        }
        public String getLoopback() {
            return this.loopback;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setManagerIp(String managerIp) {
            this.managerIp = managerIp;
            return this;
        }
        public String getManagerIp() {
            return this.managerIp;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setStack(Boolean stack) {
            this.stack = stack;
            return this;
        }
        public Boolean getStack() {
            return this.stack;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
