// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleResponseBody extends TeaModel {
    @NameInMap("Index")
    public Integer index;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIp")
    public String instanceIp;

    @NameInMap("InstancePort")
    public Integer instancePort;

    @NameInMap("PodAbstractInfo")
    public DescribeServcieScheduleResponseBodyPodAbstractInfo podAbstractInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestRepeated")
    public Boolean requestRepeated;

    @NameInMap("TcpPorts")
    public String tcpPorts;

    public static DescribeServcieScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServcieScheduleResponseBody self = new DescribeServcieScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServcieScheduleResponseBody setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public DescribeServcieScheduleResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeServcieScheduleResponseBody setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeServcieScheduleResponseBody setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public DescribeServcieScheduleResponseBody setPodAbstractInfo(DescribeServcieScheduleResponseBodyPodAbstractInfo podAbstractInfo) {
        this.podAbstractInfo = podAbstractInfo;
        return this;
    }
    public DescribeServcieScheduleResponseBodyPodAbstractInfo getPodAbstractInfo() {
        return this.podAbstractInfo;
    }

    public DescribeServcieScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServcieScheduleResponseBody setRequestRepeated(Boolean requestRepeated) {
        this.requestRepeated = requestRepeated;
        return this;
    }
    public Boolean getRequestRepeated() {
        return this.requestRepeated;
    }

    public DescribeServcieScheduleResponseBody setTcpPorts(String tcpPorts) {
        this.tcpPorts = tcpPorts;
        return this;
    }
    public String getTcpPorts() {
        return this.tcpPorts;
    }

    public static class DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus extends TeaModel {
        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("Name")
        public String name;

        public static DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus self = new DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses extends TeaModel {
        @NameInMap("ContainerStatus")
        public java.util.List<DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus> containerStatus;

        public static DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses self = new DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses setContainerStatus(java.util.List<DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus> containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public java.util.List<DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatusesContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

    }

    public static class DescribeServcieScheduleResponseBodyPodAbstractInfo extends TeaModel {
        @NameInMap("ContainerService")
        public Boolean containerService;

        @NameInMap("ContainerStatuses")
        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses containerStatuses;

        @NameInMap("Name")
        public Boolean name;

        @NameInMap("Namespace")
        public Boolean namespace;

        @NameInMap("ResourceScope")
        public Boolean resourceScope;

        @NameInMap("Status")
        public Boolean status;

        public static DescribeServcieScheduleResponseBodyPodAbstractInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponseBodyPodAbstractInfo self = new DescribeServcieScheduleResponseBodyPodAbstractInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setContainerService(Boolean containerService) {
            this.containerService = containerService;
            return this;
        }
        public Boolean getContainerService() {
            return this.containerService;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setContainerStatuses(DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses getContainerStatuses() {
            return this.containerStatuses;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setNamespace(Boolean namespace) {
            this.namespace = namespace;
            return this;
        }
        public Boolean getNamespace() {
            return this.namespace;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setResourceScope(Boolean resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public Boolean getResourceScope() {
            return this.resourceScope;
        }

        public DescribeServcieScheduleResponseBodyPodAbstractInfo setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
