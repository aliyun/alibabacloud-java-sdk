// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageTotal")
    @Validation(required = true)
    public Integer pageTotal;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Hosts")
    @Validation(required = true)
    public DescribeMonitoringAgentHostsResponseHosts hosts;

    public static DescribeMonitoringAgentHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsResponse self = new DescribeMonitoringAgentHostsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitoringAgentHostsResponseHostsHost extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("AliUid")
        @Validation(required = true)
        public Long aliUid;

        @NameInMap("OperatingSystem")
        @Validation(required = true)
        public String operatingSystem;

        @NameInMap("IpGroup")
        @Validation(required = true)
        public String ipGroup;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AgentVersion")
        @Validation(required = true)
        public String agentVersion;

        @NameInMap("EipAddress")
        @Validation(required = true)
        public String eipAddress;

        @NameInMap("EipId")
        @Validation(required = true)
        public String eipId;

        @NameInMap("isAliyunHost")
        @Validation(required = true)
        public Boolean isAliyunHost;

        @NameInMap("NatIp")
        @Validation(required = true)
        public String natIp;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        public static DescribeMonitoringAgentHostsResponseHostsHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentHostsResponseHostsHost self = new DescribeMonitoringAgentHostsResponseHostsHost();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitoringAgentHostsResponseHosts extends TeaModel {
        @NameInMap("Host")
        @Validation(required = true)
        public java.util.List<DescribeMonitoringAgentHostsResponseHostsHost> host;

        public static DescribeMonitoringAgentHostsResponseHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentHostsResponseHosts self = new DescribeMonitoringAgentHostsResponseHosts();
            return TeaModel.build(map, self);
        }

    }

}
