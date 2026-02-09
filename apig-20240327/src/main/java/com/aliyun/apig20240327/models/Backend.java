// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Backend extends TeaModel {
    /**
     * <p>The backend service scenario. Valid values: Single, MultiServiceByRatio, MultiServiceByTag, Mock, and Redirect.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>The backend services.</p>
     */
    @NameInMap("services")
    public java.util.List<BackendServices> services;

    public static Backend build(java.util.Map<String, ?> map) throws Exception {
        Backend self = new Backend();
        return TeaModel.build(map, self);
    }

    public Backend setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public Backend setServices(java.util.List<BackendServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<BackendServices> getServices() {
        return this.services;
    }

    public static class BackendServices extends TeaModel {
        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>item-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service port. If you want to use a dynamic port, do not pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol. Valid values: HTTP, TCP, and DUBBO.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-cq2bmmdlhtgj***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The percentage value of traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static BackendServices build(java.util.Map<String, ?> map) throws Exception {
            BackendServices self = new BackendServices();
            return TeaModel.build(map, self);
        }

        public BackendServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BackendServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public BackendServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public BackendServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public BackendServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public BackendServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
