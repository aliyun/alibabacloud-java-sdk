// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Hosts")
    public DescribeMonitoringAgentHostsResponseBodyHosts hosts;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribeMonitoringAgentHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsResponseBody self = new DescribeMonitoringAgentHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentHostsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentHostsResponseBody setHosts(DescribeMonitoringAgentHostsResponseBodyHosts hosts) {
        this.hosts = hosts;
        return this;
    }
    public DescribeMonitoringAgentHostsResponseBodyHosts getHosts() {
        return this.hosts;
    }

    public DescribeMonitoringAgentHostsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentHostsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitoringAgentHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitoringAgentHostsResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    public DescribeMonitoringAgentHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentHostsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitoringAgentHostsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeMonitoringAgentHostsResponseBodyHostsHost extends TeaModel {
        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("EipAddress")
        public String eipAddress;

        @NameInMap("EipId")
        public String eipId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("IpGroup")
        public String ipGroup;

        @NameInMap("NatIp")
        public String natIp;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        @NameInMap("Region")
        public String region;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("isAliyunHost")
        public Boolean isAliyunHost;

        public static DescribeMonitoringAgentHostsResponseBodyHostsHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentHostsResponseBodyHostsHost self = new DescribeMonitoringAgentHostsResponseBodyHostsHost();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setEipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public String getEipAddress() {
            return this.eipAddress;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setIpGroup(String ipGroup) {
            this.ipGroup = ipGroup;
            return this;
        }
        public String getIpGroup() {
            return this.ipGroup;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeMonitoringAgentHostsResponseBodyHostsHost setIsAliyunHost(Boolean isAliyunHost) {
            this.isAliyunHost = isAliyunHost;
            return this;
        }
        public Boolean getIsAliyunHost() {
            return this.isAliyunHost;
        }

    }

    public static class DescribeMonitoringAgentHostsResponseBodyHosts extends TeaModel {
        @NameInMap("Host")
        public java.util.List<DescribeMonitoringAgentHostsResponseBodyHostsHost> host;

        public static DescribeMonitoringAgentHostsResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentHostsResponseBodyHosts self = new DescribeMonitoringAgentHostsResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentHostsResponseBodyHosts setHost(java.util.List<DescribeMonitoringAgentHostsResponseBodyHostsHost> host) {
            this.host = host;
            return this;
        }
        public java.util.List<DescribeMonitoringAgentHostsResponseBodyHostsHost> getHost() {
            return this.host;
        }

    }

}
