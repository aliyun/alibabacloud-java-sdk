// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the call is successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageTotal")
    public Integer pageTotal;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>63EEBB2A-9E51-41E4-9E83-5DE7F3B292E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>3.4.6</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>103201326074****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The elastic IP address (EIP) of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("EipAddress")
        public String eipAddress;

        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp16i16k9gcezyfrp****</p>
         */
        @NameInMap("EipId")
        public String eipId;

        /**
         * <p>The name of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>hostIP</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a2d5q7pm3f9yr212****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n4</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The IP address of the host.</p>
         * <blockquote>
         * <p>Multiple IP addresses are separated with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IpGroup")
        public String ipGroup;

        /**
         * <p>The IP address of the Network Address Translation (NAT) gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The serial number of the host. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
         * <blockquote>
         * <p>This parameter can be used to accurately search for a monitored host.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>x12335-6cc8-4a22-9f21-1a00a719****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>Indicates whether the host is provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li>true: The host is provided by Alibaba Cloud.</li>
         * <li>false: The host is not provided by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
