// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowClusterHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostList")
    public ListFlowClusterHostResponseBodyHostList hostList;

    public static ListFlowClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterHostResponseBody self = new ListFlowClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowClusterHostResponseBody setHostList(ListFlowClusterHostResponseBodyHostList hostList) {
        this.hostList = hostList;
        return this;
    }
    public ListFlowClusterHostResponseBodyHostList getHostList() {
        return this.hostList;
    }

    public static class ListFlowClusterHostResponseBodyHostListHost extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

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

        public static ListFlowClusterHostResponseBodyHostListHost build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterHostResponseBodyHostListHost self = new ListFlowClusterHostResponseBodyHostListHost();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterHostResponseBodyHostListHost setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListFlowClusterHostResponseBodyHostListHost setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowClusterHostResponseBodyHostListHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowClusterHostResponseBodyHostListHost setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListFlowClusterHostResponseBodyHostListHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowClusterHostResponseBodyHostListHost setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListFlowClusterHostResponseBodyHostListHost setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListFlowClusterHostResponseBodyHostListHost setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public ListFlowClusterHostResponseBodyHostListHost setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListFlowClusterHostResponseBodyHostListHost setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListFlowClusterHostResponseBodyHostListHost setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListFlowClusterHostResponseBodyHostListHost setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListFlowClusterHostResponseBodyHostList extends TeaModel {
        @NameInMap("Host")
        public java.util.List<ListFlowClusterHostResponseBodyHostListHost> host;

        public static ListFlowClusterHostResponseBodyHostList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterHostResponseBodyHostList self = new ListFlowClusterHostResponseBodyHostList();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterHostResponseBodyHostList setHost(java.util.List<ListFlowClusterHostResponseBodyHostListHost> host) {
            this.host = host;
            return this;
        }
        public java.util.List<ListFlowClusterHostResponseBodyHostListHost> getHost() {
            return this.host;
        }

    }

}
