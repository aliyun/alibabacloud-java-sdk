// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentKubeResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListEnvironmentKubeResourcesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentKubeResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentKubeResourcesResponseBody self = new ListEnvironmentKubeResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentKubeResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentKubeResourcesResponseBody setData(java.util.List<ListEnvironmentKubeResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnvironmentKubeResourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListEnvironmentKubeResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentKubeResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentKubeResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentKubeResourcesResponseBodyDataMetadata extends TeaModel {
        @NameInMap("Annotations")
        public java.util.Map<String, String> annotations;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <strong>example:</strong>
         * <p>arms-prometheus-ack-arms-prometheus-c577b6cc8-mvdwd</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static ListEnvironmentKubeResourcesResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentKubeResourcesResponseBodyDataMetadata self = new ListEnvironmentKubeResourcesResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentKubeResourcesResponseBodyDataMetadata setAnnotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        public ListEnvironmentKubeResourcesResponseBodyDataMetadata setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListEnvironmentKubeResourcesResponseBodyDataMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentKubeResourcesResponseBodyDataMetadata setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class ListEnvironmentKubeResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("ApiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        @NameInMap("Kind")
        public String kind;

        @NameInMap("Metadata")
        public ListEnvironmentKubeResourcesResponseBodyDataMetadata metadata;

        /**
         * <strong>example:</strong>
         * <p>{
         *         &quot;dnsPolicy&quot;: &quot;ClusterFirst&quot;,
         *         &quot;nodeName&quot;: &quot;cn-hangzhou.172.16.0.60&quot;,
         *         &quot;terminationGracePeriodSeconds&quot;: 30,
         *         &quot;enableServiceLinks&quot;: true,
         *         &quot;serviceAccountName&quot;: &quot;arms-prom-operator&quot;,
         *         &quot;volumes&quot;: [
         *           {
         *             &quot;name&quot;: &quot;certs&quot;,
         *             &quot;secret&quot;: {
         *               &quot;secretName&quot;: &quot;arms-prometheus-ack-arms-prometheus-cert&quot;,
         *               &quot;defaultMode&quot;: 420
         *             }
         *           }</p>
         */
        @NameInMap("Spec")
        public Object spec;

        /**
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public Object status;

        public static ListEnvironmentKubeResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentKubeResourcesResponseBodyData self = new ListEnvironmentKubeResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentKubeResourcesResponseBodyData setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListEnvironmentKubeResourcesResponseBodyData setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListEnvironmentKubeResourcesResponseBodyData setMetadata(ListEnvironmentKubeResourcesResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public ListEnvironmentKubeResourcesResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public ListEnvironmentKubeResourcesResponseBodyData setSpec(Object spec) {
            this.spec = spec;
            return this;
        }
        public Object getSpec() {
            return this.spec;
        }

        public ListEnvironmentKubeResourcesResponseBodyData setStatus(Object status) {
            this.status = status;
            return this;
        }
        public Object getStatus() {
            return this.status;
        }

    }

}
