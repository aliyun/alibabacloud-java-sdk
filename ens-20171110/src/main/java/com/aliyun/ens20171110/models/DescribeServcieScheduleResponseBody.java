// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleResponseBody extends TeaModel {
    /**
     * <p>The index number of the scheduled target virtual device (container pod).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>The target instance ID for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5myukg7hnpbto7m024002****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the scheduled target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>120.26.XX.XX</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The start port of the scheduled target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("InstancePort")
    public Integer instancePort;

    /**
     * <p>The summary information of the scheduled virtual device pod.</p>
     */
    @NameInMap("PodAbstractInfo")
    public DescribeServcieScheduleResponseBodyPodAbstractInfo podAbstractInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the resource has been created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequestRepeated")
    public Boolean requestRepeated;

    /**
     * <p>The TCP service port range of the scheduled target virtual machine instance or container. Valid values are in the ${from}-${to} format, such as 80-88.</p>
     * 
     * <strong>example:</strong>
     * <p>80-88</p>
     */
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
        /**
         * <p>The name of the container service.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("ContainerService")
        public Boolean containerService;

        @NameInMap("ContainerStatuses")
        public DescribeServcieScheduleResponseBodyPodAbstractInfoContainerStatuses containerStatuses;

        /**
         * <p>The pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>gcs-prod-websocket-eip-telecom</p>
         */
        @NameInMap("Name")
        public Boolean name;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-aliyun</p>
         */
        @NameInMap("Namespace")
        public Boolean namespace;

        /**
         * <p>The scope where the pod is located.</p>
         * 
         * <strong>example:</strong>
         * <p>FDN</p>
         */
        @NameInMap("ResourceScope")
        public Boolean resourceScope;

        /**
         * <p>The pod status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
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
