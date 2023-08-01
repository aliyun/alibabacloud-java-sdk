// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sServicesResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of services in the Kubernetes cluster.</p>
     */
    @NameInMap("Services")
    public java.util.List<GetK8sServicesResponseBodyServices> services;

    public static GetK8sServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sServicesResponseBody self = new GetK8sServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetK8sServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetK8sServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetK8sServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetK8sServicesResponseBody setServices(java.util.List<GetK8sServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<GetK8sServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public static class GetK8sServicesResponseBodyServicesServicePorts extends TeaModel {
        /**
         * <p>The port of the node.</p>
         */
        @NameInMap("NodePort")
        public Integer nodePort;

        /**
         * <p>The frontend service port.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol of the service.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The backend container port.</p>
         */
        @NameInMap("TargetPort")
        public String targetPort;

        public static GetK8sServicesResponseBodyServicesServicePorts build(java.util.Map<String, ?> map) throws Exception {
            GetK8sServicesResponseBodyServicesServicePorts self = new GetK8sServicesResponseBodyServicesServicePorts();
            return TeaModel.build(map, self);
        }

        public GetK8sServicesResponseBodyServicesServicePorts setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public GetK8sServicesResponseBodyServicesServicePorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetK8sServicesResponseBodyServicesServicePorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetK8sServicesResponseBodyServicesServicePorts setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class GetK8sServicesResponseBodyServices extends TeaModel {
        /**
         * <p>The IP address of the service in the Kubernetes cluster.</p>
         */
        @NameInMap("ClusterIP")
        public String clusterIP;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The mapping of service ports.</p>
         */
        @NameInMap("ServicePorts")
        public java.util.List<GetK8sServicesResponseBodyServicesServicePorts> servicePorts;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetK8sServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            GetK8sServicesResponseBodyServices self = new GetK8sServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public GetK8sServicesResponseBodyServices setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public String getClusterIP() {
            return this.clusterIP;
        }

        public GetK8sServicesResponseBodyServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetK8sServicesResponseBodyServices setServicePorts(java.util.List<GetK8sServicesResponseBodyServicesServicePorts> servicePorts) {
            this.servicePorts = servicePorts;
            return this;
        }
        public java.util.List<GetK8sServicesResponseBodyServicesServicePorts> getServicePorts() {
            return this.servicePorts;
        }

        public GetK8sServicesResponseBodyServices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
