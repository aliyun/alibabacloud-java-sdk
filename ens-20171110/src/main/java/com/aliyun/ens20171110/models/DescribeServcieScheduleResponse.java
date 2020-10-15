// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceIp")
    @Validation(required = true)
    public String instanceIp;

    @NameInMap("InstancePort")
    @Validation(required = true)
    public Integer instancePort;

    @NameInMap("Index")
    @Validation(required = true)
    public Integer index;

    @NameInMap("TcpPorts")
    @Validation(required = true)
    public String tcpPorts;

    @NameInMap("RequestRepeated")
    @Validation(required = true)
    public Boolean requestRepeated;

    @NameInMap("PodAbstractInfo")
    @Validation(required = true)
    public DescribeServcieScheduleResponsePodAbstractInfo podAbstractInfo;

    public static DescribeServcieScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServcieScheduleResponse self = new DescribeServcieScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServcieScheduleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServcieScheduleResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeServcieScheduleResponse setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeServcieScheduleResponse setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public DescribeServcieScheduleResponse setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public DescribeServcieScheduleResponse setTcpPorts(String tcpPorts) {
        this.tcpPorts = tcpPorts;
        return this;
    }
    public String getTcpPorts() {
        return this.tcpPorts;
    }

    public DescribeServcieScheduleResponse setRequestRepeated(Boolean requestRepeated) {
        this.requestRepeated = requestRepeated;
        return this;
    }
    public Boolean getRequestRepeated() {
        return this.requestRepeated;
    }

    public DescribeServcieScheduleResponse setPodAbstractInfo(DescribeServcieScheduleResponsePodAbstractInfo podAbstractInfo) {
        this.podAbstractInfo = podAbstractInfo;
        return this;
    }
    public DescribeServcieScheduleResponsePodAbstractInfo getPodAbstractInfo() {
        return this.podAbstractInfo;
    }

    public static class DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ContainerId")
        @Validation(required = true)
        public String containerId;

        public static DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus self = new DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

    }

    public static class DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses extends TeaModel {
        @NameInMap("ContainerStatus")
        @Validation(required = true)
        public java.util.List<DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus> containerStatus;

        public static DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses self = new DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses setContainerStatus(java.util.List<DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus> containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public java.util.List<DescribeServcieScheduleResponsePodAbstractInfoContainerStatusesContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

    }

    public static class DescribeServcieScheduleResponsePodAbstractInfo extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public Boolean name;

        @NameInMap("ResourceScope")
        @Validation(required = true)
        public Boolean resourceScope;

        @NameInMap("ContainerService")
        @Validation(required = true)
        public Boolean containerService;

        @NameInMap("Namespace")
        @Validation(required = true)
        public Boolean namespace;

        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("ContainerStatuses")
        @Validation(required = true)
        public DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses containerStatuses;

        public static DescribeServcieScheduleResponsePodAbstractInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServcieScheduleResponsePodAbstractInfo self = new DescribeServcieScheduleResponsePodAbstractInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setResourceScope(Boolean resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public Boolean getResourceScope() {
            return this.resourceScope;
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setContainerService(Boolean containerService) {
            this.containerService = containerService;
            return this;
        }
        public Boolean getContainerService() {
            return this.containerService;
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setNamespace(Boolean namespace) {
            this.namespace = namespace;
            return this;
        }
        public Boolean getNamespace() {
            return this.namespace;
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeServcieScheduleResponsePodAbstractInfo setContainerStatuses(DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public DescribeServcieScheduleResponsePodAbstractInfoContainerStatuses getContainerStatuses() {
            return this.containerStatuses;
        }

    }

}
