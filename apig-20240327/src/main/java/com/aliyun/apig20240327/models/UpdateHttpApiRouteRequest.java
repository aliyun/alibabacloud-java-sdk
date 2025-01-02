// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRouteRequest extends TeaModel {
    /**
     * <p>Backend service configuration for the route.</p>
     */
    @NameInMap("backendConfig")
    public UpdateHttpApiRouteRequestBackendConfig backendConfig;

    /**
     * <p>Route description.</p>
     * 
     * <strong>example:</strong>
     * <p>test route</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>List of domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>Environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cquqsollhtgid***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    public static UpdateHttpApiRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRouteRequest self = new UpdateHttpApiRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRouteRequest setBackendConfig(UpdateHttpApiRouteRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public UpdateHttpApiRouteRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public UpdateHttpApiRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHttpApiRouteRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public UpdateHttpApiRouteRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateHttpApiRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public static class UpdateHttpApiRouteRequestBackendConfigServices extends TeaModel {
        /**
         * <p>Service port, do not pass in for dynamic ports.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Service protocol:</p>
         * <ul>
         * <li>HTTP.</li>
         * <li>HTTPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>Percentage value of traffic ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static UpdateHttpApiRouteRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfigServices self = new UpdateHttpApiRouteRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateHttpApiRouteRequestBackendConfig extends TeaModel {
        /**
         * <p>Backend service scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>List of backend services.</p>
         */
        @NameInMap("services")
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services;

        public static UpdateHttpApiRouteRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfig self = new UpdateHttpApiRouteRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHttpApiRouteRequestBackendConfig setServices(java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

}
