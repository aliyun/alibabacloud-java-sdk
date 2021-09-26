// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostList")
    public ListFlowClusterAllHostsResponseBodyHostList hostList;

    public static ListFlowClusterAllHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllHostsResponseBody self = new ListFlowClusterAllHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowClusterAllHostsResponseBody setHostList(ListFlowClusterAllHostsResponseBodyHostList hostList) {
        this.hostList = hostList;
        return this;
    }
    public ListFlowClusterAllHostsResponseBodyHostList getHostList() {
        return this.hostList;
    }

    public static class ListFlowClusterAllHostsResponseBodyHostListHost extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostInstanceId")
        public String hostInstanceId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Role")
        public String role;

        public static ListFlowClusterAllHostsResponseBodyHostListHost build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllHostsResponseBodyHostListHost self = new ListFlowClusterAllHostsResponseBodyHostListHost();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListFlowClusterAllHostsResponseBodyHostListHost setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListFlowClusterAllHostsResponseBodyHostList extends TeaModel {
        @NameInMap("Host")
        public java.util.List<ListFlowClusterAllHostsResponseBodyHostListHost> host;

        public static ListFlowClusterAllHostsResponseBodyHostList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllHostsResponseBodyHostList self = new ListFlowClusterAllHostsResponseBodyHostList();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllHostsResponseBodyHostList setHost(java.util.List<ListFlowClusterAllHostsResponseBodyHostListHost> host) {
            this.host = host;
            return this;
        }
        public java.util.List<ListFlowClusterAllHostsResponseBodyHostListHost> getHost() {
            return this.host;
        }

    }

}
