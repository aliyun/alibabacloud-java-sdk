// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerInstances")
    public DescribeServerInstancesResponseBodyServerInstances serverInstances;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeServerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerInstancesResponseBody self = new DescribeServerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServerInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServerInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeServerInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeServerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerInstancesResponseBody setServerInstances(DescribeServerInstancesResponseBodyServerInstances serverInstances) {
        this.serverInstances = serverInstances;
        return this;
    }
    public DescribeServerInstancesResponseBodyServerInstances getServerInstances() {
        return this.serverInstances;
    }

    public DescribeServerInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeServerInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeServerInstancesResponseBodyServerInstancesServerInstance extends TeaModel {
        @NameInMap("CloudAssistantInstalled")
        public Boolean cloudAssistantInstalled;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeServerInstancesResponseBodyServerInstancesServerInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerInstancesResponseBodyServerInstancesServerInstance self = new DescribeServerInstancesResponseBodyServerInstancesServerInstance();
            return TeaModel.build(map, self);
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setCloudAssistantInstalled(Boolean cloudAssistantInstalled) {
            this.cloudAssistantInstalled = cloudAssistantInstalled;
            return this;
        }
        public Boolean getCloudAssistantInstalled() {
            return this.cloudAssistantInstalled;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeServerInstancesResponseBodyServerInstancesServerInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeServerInstancesResponseBodyServerInstances extends TeaModel {
        @NameInMap("serverInstance")
        public java.util.List<DescribeServerInstancesResponseBodyServerInstancesServerInstance> serverInstance;

        public static DescribeServerInstancesResponseBodyServerInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerInstancesResponseBodyServerInstances self = new DescribeServerInstancesResponseBodyServerInstances();
            return TeaModel.build(map, self);
        }

        public DescribeServerInstancesResponseBodyServerInstances setServerInstance(java.util.List<DescribeServerInstancesResponseBodyServerInstancesServerInstance> serverInstance) {
            this.serverInstance = serverInstance;
            return this;
        }
        public java.util.List<DescribeServerInstancesResponseBodyServerInstancesServerInstance> getServerInstance() {
            return this.serverInstance;
        }

    }

}
