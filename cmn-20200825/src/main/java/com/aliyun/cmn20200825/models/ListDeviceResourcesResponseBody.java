// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceResourcesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 数组，返回示例目录。
    @NameInMap("DeviceResource")
    public java.util.List<ListDeviceResourcesResponseBodyDeviceResource> deviceResource;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    public static ListDeviceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceResourcesResponseBody self = new ListDeviceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDeviceResourcesResponseBody setDeviceResource(java.util.List<ListDeviceResourcesResponseBodyDeviceResource> deviceResource) {
        this.deviceResource = deviceResource;
        return this;
    }
    public java.util.List<ListDeviceResourcesResponseBodyDeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    public ListDeviceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceResourcesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDeviceResourcesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public static class ListDeviceResourcesResponseBodyDeviceResource extends TeaModel {
        // 建设项目id
        @NameInMap("SetupProjectId")
        public String setupProjectId;

        // 资源一级ID
        @NameInMap("DeviceResourceId")
        public String deviceResourceId;

        // 角色
        @NameInMap("Role")
        public String role;

        // 组号
        @NameInMap("BlockNumber")
        public String blockNumber;

        // 设备号
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 模型
        @NameInMap("Model")
        public String model;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // 设备sn号
        @NameInMap("Sn")
        public String sn;

        // 配置任务Id
        @NameInMap("ConfigTaskId")
        public String configTaskId;

        // 物理空间位置
        @NameInMap("Location")
        public String location;

        // 带内管理地址
        @NameInMap("ManagerIp")
        public String managerIp;

        // 交付登录地址
        @NameInMap("DeliveryIp")
        public String deliveryIp;

        // 配置生成
        @NameInMap("GenerateConfig")
        public String generateConfig;

        // 配置下发状态
        @NameInMap("ConfigTaskStatus")
        public String configTaskStatus;

        // 设备配置
        @NameInMap("Config")
        public String config;

        // 配置规范
        @NameInMap("Specification")
        public String specification;

        // 配置入参
        @NameInMap("Params")
        public String params;

        // loopback地址
        @NameInMap("Loopback")
        public String loopback;

        // 设备互联地址
        @NameInMap("InterConnection")
        public String interConnection;

        // 设备业务地址
        @NameInMap("Business")
        public String business;

        // 堆叠状态
        @NameInMap("Stack")
        public Boolean stack;

        public static ListDeviceResourcesResponseBodyDeviceResource build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceResourcesResponseBodyDeviceResource self = new ListDeviceResourcesResponseBodyDeviceResource();
            return TeaModel.build(map, self);
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfigTaskId(String configTaskId) {
            this.configTaskId = configTaskId;
            return this;
        }
        public String getConfigTaskId() {
            return this.configTaskId;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setManagerIp(String managerIp) {
            this.managerIp = managerIp;
            return this;
        }
        public String getManagerIp() {
            return this.managerIp;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setDeliveryIp(String deliveryIp) {
            this.deliveryIp = deliveryIp;
            return this;
        }
        public String getDeliveryIp() {
            return this.deliveryIp;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setGenerateConfig(String generateConfig) {
            this.generateConfig = generateConfig;
            return this;
        }
        public String getGenerateConfig() {
            return this.generateConfig;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfigTaskStatus(String configTaskStatus) {
            this.configTaskStatus = configTaskStatus;
            return this;
        }
        public String getConfigTaskStatus() {
            return this.configTaskStatus;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setLoopback(String loopback) {
            this.loopback = loopback;
            return this;
        }
        public String getLoopback() {
            return this.loopback;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setInterConnection(String interConnection) {
            this.interConnection = interConnection;
            return this;
        }
        public String getInterConnection() {
            return this.interConnection;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListDeviceResourcesResponseBodyDeviceResource setStack(Boolean stack) {
            this.stack = stack;
            return this;
        }
        public Boolean getStack() {
            return this.stack;
        }

    }

}
