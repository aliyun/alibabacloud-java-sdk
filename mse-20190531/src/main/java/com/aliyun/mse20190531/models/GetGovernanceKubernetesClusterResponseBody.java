// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public GetGovernanceKubernetesClusterResponseBodyData data;

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

    public static GetGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterResponseBody self = new GetGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterResponseBody setData(GetGovernanceKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGovernanceKubernetesClusterResponseBodyData getData() {
        return this.data;
    }

    public GetGovernanceKubernetesClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGovernanceKubernetesClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGovernanceKubernetesClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGovernanceKubernetesClusterResponseBodyDataNamespaces extends TeaModel {
        /**
         * <p>The name of the MSE namespace that you want to access.</p>
         */
        @NameInMap("MseNamespace")
        public String mseNamespace;

        /**
         * <p>The name of the namespace in the ACK cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetGovernanceKubernetesClusterResponseBodyDataNamespaces build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceKubernetesClusterResponseBodyDataNamespaces self = new GetGovernanceKubernetesClusterResponseBodyDataNamespaces();
            return TeaModel.build(map, self);
        }

        public GetGovernanceKubernetesClusterResponseBodyDataNamespaces setMseNamespace(String mseNamespace) {
            this.mseNamespace = mseNamespace;
            return this;
        }
        public String getMseNamespace() {
            return this.mseNamespace;
        }

        public GetGovernanceKubernetesClusterResponseBodyDataNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetGovernanceKubernetesClusterResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The version of Kubernetes.</p>
         */
        @NameInMap("K8sVersion")
        public String k8sVersion;

        /**
         * <p>The information of the namespace.</p>
         */
        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        /**
         * <p>The queried namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<GetGovernanceKubernetesClusterResponseBodyDataNamespaces> namespaces;

        /**
         * <p>The time when the pilot component was started.</p>
         */
        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        /**
         * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time of the last modification.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetGovernanceKubernetesClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceKubernetesClusterResponseBodyData self = new GetGovernanceKubernetesClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGovernanceKubernetesClusterResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setNamespaceInfos(String namespaceInfos) {
            this.namespaceInfos = namespaceInfos;
            return this;
        }
        public String getNamespaceInfos() {
            return this.namespaceInfos;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setNamespaces(java.util.List<GetGovernanceKubernetesClusterResponseBodyDataNamespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<GetGovernanceKubernetesClusterResponseBodyDataNamespaces> getNamespaces() {
            return this.namespaces;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setPilotStartTime(String pilotStartTime) {
            this.pilotStartTime = pilotStartTime;
            return this;
        }
        public String getPilotStartTime() {
            return this.pilotStartTime;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetGovernanceKubernetesClusterResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
