// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public ListAnsServiceClustersResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAnsServiceClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServiceClustersResponseBody self = new ListAnsServiceClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnsServiceClustersResponseBody setData(ListAnsServiceClustersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAnsServiceClustersResponseBodyData getData() {
        return this.data;
    }

    public ListAnsServiceClustersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAnsServiceClustersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnsServiceClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnsServiceClustersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnsServiceClustersResponseBodyDataClusters extends TeaModel {
        /**
         * <p>The default port used for a health check.</p>
         */
        @NameInMap("DefaultCheckPort")
        public Integer defaultCheckPort;

        /**
         * <p>The default port.</p>
         */
        @NameInMap("DefaultPort")
        public Integer defaultPort;

        /**
         * <p>The type of health check.</p>
         */
        @NameInMap("HealthCheckerType")
        public String healthCheckerType;

        /**
         * <p>The metadata of the cluster.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The full name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Indicates whether an end-to-end health check is initiated by the server. This parameter is valid only if the service is a temporary service.</p>
         */
        @NameInMap("UseIPPort4Check")
        public Boolean useIPPort4Check;

        public static ListAnsServiceClustersResponseBodyDataClusters build(java.util.Map<String, ?> map) throws Exception {
            ListAnsServiceClustersResponseBodyDataClusters self = new ListAnsServiceClustersResponseBodyDataClusters();
            return TeaModel.build(map, self);
        }

        public ListAnsServiceClustersResponseBodyDataClusters setDefaultCheckPort(Integer defaultCheckPort) {
            this.defaultCheckPort = defaultCheckPort;
            return this;
        }
        public Integer getDefaultCheckPort() {
            return this.defaultCheckPort;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setDefaultPort(Integer defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }
        public Integer getDefaultPort() {
            return this.defaultPort;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setHealthCheckerType(String healthCheckerType) {
            this.healthCheckerType = healthCheckerType;
            return this;
        }
        public String getHealthCheckerType() {
            return this.healthCheckerType;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAnsServiceClustersResponseBodyDataClusters setUseIPPort4Check(Boolean useIPPort4Check) {
            this.useIPPort4Check = useIPPort4Check;
            return this;
        }
        public Boolean getUseIPPort4Check() {
            return this.useIPPort4Check;
        }

    }

    public static class ListAnsServiceClustersResponseBodyData extends TeaModel {
        /**
         * <p>The information about the clusters.</p>
         */
        @NameInMap("Clusters")
        public java.util.List<ListAnsServiceClustersResponseBodyDataClusters> clusters;

        /**
         * <p>Indicates whether the service is a temporary service. Valid values:</p>
         * <br>
         * <p>*   `true`: yes</p>
         * <p>*   `false`: no</p>
         */
        @NameInMap("Ephemeral")
        public Boolean ephemeral;

        /**
         * <p>The name of the contact group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The metadata of the service.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protection threshold.</p>
         */
        @NameInMap("ProtectThreshold")
        public Float protectThreshold;

        /**
         * <p>The election mode.</p>
         */
        @NameInMap("SelectorType")
        public String selectorType;

        public static ListAnsServiceClustersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnsServiceClustersResponseBodyData self = new ListAnsServiceClustersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnsServiceClustersResponseBodyData setClusters(java.util.List<ListAnsServiceClustersResponseBodyDataClusters> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<ListAnsServiceClustersResponseBodyDataClusters> getClusters() {
            return this.clusters;
        }

        public ListAnsServiceClustersResponseBodyData setEphemeral(Boolean ephemeral) {
            this.ephemeral = ephemeral;
            return this;
        }
        public Boolean getEphemeral() {
            return this.ephemeral;
        }

        public ListAnsServiceClustersResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAnsServiceClustersResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListAnsServiceClustersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAnsServiceClustersResponseBodyData setProtectThreshold(Float protectThreshold) {
            this.protectThreshold = protectThreshold;
            return this;
        }
        public Float getProtectThreshold() {
            return this.protectThreshold;
        }

        public ListAnsServiceClustersResponseBodyData setSelectorType(String selectorType) {
            this.selectorType = selectorType;
            return this;
        }
        public String getSelectorType() {
            return this.selectorType;
        }

    }

}
