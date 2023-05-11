// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the hosts.</p>
     */
    @NameInMap("Hosts")
    public DescribeMonitoringAgentHostsResponseBodyHosts hosts;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of returned pages.</p>
     */
    @NameInMap("PageTotal")
    public Integer pageTotal;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The version of the CloudMonitor agent.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The elastic IP address (EIP) of the host.</p>
         */
        @NameInMap("EipAddress")
        public String eipAddress;

        /**
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("EipId")
        public String eipId;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the ECS instance.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The IP address of the host.</p>
         * <br>
         * <p>> Multiple IP addresses are separated with commas (,).</p>
         */
        @NameInMap("IpGroup")
        public String ipGroup;

        /**
         * <p>The IP address of the Network Address Translation (NAT) gateway.</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The operating system.</p>
         */
        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The serial number of the host. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
         * <br>
         * <p>> This parameter can be used to accurately search for a monitored host.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>Indicates whether the host is provided by Alibaba Cloud. Valid values:</p>
         * <br>
         * <p>*   true: The host is provided by Alibaba Cloud.</p>
         * <p>*   false: The host is not provided by Alibaba Cloud.</p>
         */
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
