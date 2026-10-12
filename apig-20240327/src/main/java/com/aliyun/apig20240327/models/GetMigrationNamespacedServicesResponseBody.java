// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMigrationNamespacedServicesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetMigrationNamespacedServicesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D513911-206E-5E93-9C9E-71D63C0D68E7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMigrationNamespacedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationNamespacedServicesResponseBody self = new GetMigrationNamespacedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationNamespacedServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMigrationNamespacedServicesResponseBody setData(GetMigrationNamespacedServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrationNamespacedServicesResponseBodyData getData() {
        return this.data;
    }

    public GetMigrationNamespacedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMigrationNamespacedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices extends TeaModel {
        /**
         * <p>The service name. After you select a Server Load Balancer (SLB) instance, the frontend populates this value into the serviceName field.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx-ingress-lb</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the load balancing instance associated with the service.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-xxxx / nlb-xxxx</p>
         */
        @NameInMap("slbId")
        public String slbId;

        public static GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices self = new GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices();
            return TeaModel.build(map, self);
        }

        public GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

    }

    public static class GetMigrationNamespacedServicesResponseBodyDataNamespacedServices extends TeaModel {
        /**
         * <p>The Kubernetes namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The list of migratable services in the namespace.</p>
         */
        @NameInMap("services")
        public java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices> services;

        public static GetMigrationNamespacedServicesResponseBodyDataNamespacedServices build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationNamespacedServicesResponseBodyDataNamespacedServices self = new GetMigrationNamespacedServicesResponseBodyDataNamespacedServices();
            return TeaModel.build(map, self);
        }

        public GetMigrationNamespacedServicesResponseBodyDataNamespacedServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetMigrationNamespacedServicesResponseBodyDataNamespacedServices setServices(java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServicesServices> getServices() {
            return this.services;
        }

    }

    public static class GetMigrationNamespacedServicesResponseBodyData extends TeaModel {
        /**
         * <p>The list of services grouped by namespace.</p>
         */
        @NameInMap("namespacedServices")
        public java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServices> namespacedServices;

        public static GetMigrationNamespacedServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationNamespacedServicesResponseBodyData self = new GetMigrationNamespacedServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationNamespacedServicesResponseBodyData setNamespacedServices(java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServices> namespacedServices) {
            this.namespacedServices = namespacedServices;
            return this;
        }
        public java.util.List<GetMigrationNamespacedServicesResponseBodyDataNamespacedServices> getNamespacedServices() {
            return this.namespacedServices;
        }

    }

}
