// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public ListAnsServiceClustersResponseBodyData data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
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
        // The default port used for a health check.
        @NameInMap("DefaultCheckPort")
        public Integer defaultCheckPort;

        // The default port.
        @NameInMap("DefaultPort")
        public Integer defaultPort;

        // The type of health check.
        @NameInMap("HealthCheckerType")
        public String healthCheckerType;

        // The metadata.
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        // The name of the cluster.
        @NameInMap("Name")
        public String name;

        // The name of the service.
        @NameInMap("ServiceName")
        public String serviceName;

        // Indicates whether the IP address is used for a health check.
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
        // The information about clusters.
        @NameInMap("Clusters")
        public java.util.List<ListAnsServiceClustersResponseBodyDataClusters> clusters;

        // Indicates whether the service is marked as a temporary node. Valid values:
        // - `true` 
        // - `false`
        @NameInMap("Ephemeral")
        public Boolean ephemeral;

        // The name of the contact group.
        @NameInMap("GroupName")
        public String groupName;

        // The metadata.
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The protection threshold.
        @NameInMap("ProtectThreshold")
        public Float protectThreshold;

        // The election mode.
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
