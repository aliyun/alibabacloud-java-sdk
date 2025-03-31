// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRouteRequest extends TeaModel {
    /**
     * <p>The backend service configurations of the route.</p>
     */
    @NameInMap("backendConfig")
    public UpdateHttpApiRouteRequestBackendConfig backendConfig;

    /**
     * <p>The route description.</p>
     * 
     * <strong>example:</strong>
     * <p>test route</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cquqsollhtgid***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The rules for matching the route.</p>
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
         * <p>The service port. If you want to use a dynamic port, do not pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
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
         * <p>svc-cr6pk4tlhtgm58e***</p>
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
         * <p>The backend service scenario.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SingleService</li>
         * <li>MultiServiceByRatio</li>
         * <li>Redirect</li>
         * <li>Mock</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The backend services.</p>
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
