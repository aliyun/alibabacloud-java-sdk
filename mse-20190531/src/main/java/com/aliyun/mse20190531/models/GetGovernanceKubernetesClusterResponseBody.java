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
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B170A0D-2C5D-4CF8-B808-03966B86****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
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
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("MseNamespace")
        public String mseNamespace;

        /**
         * <p>The name of the namespace in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
         * 
         * <strong>example:</strong>
         * <p>cd23228b3c80c4d4f9ad7af1d87cc30d5</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>myCluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The version of Kubernetes.</p>
         * 
         * <strong>example:</strong>
         * <p>1.20.11-aliyun.1</p>
         */
        @NameInMap("K8sVersion")
        public String k8sVersion;

        /**
         * <p>The information of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Name\&quot;:\&quot;ack-onepilot\&quot;,\&quot;Tags\&quot;:null},{\&quot;Name\&quot;:\&quot;default\&quot;,\&quot;Tags\&quot;:{\&quot;mse-enable\&quot;:\&quot;enabled\&quot;}},{\&quot;Name\&quot;:\&quot;kube-node-lease\&quot;,\&quot;Tags\&quot;:null},{\&quot;Name\&quot;:\&quot;kube-public\&quot;,\&quot;Tags\&quot;:null},{\&quot;Name\&quot;:\&quot;kube-system\&quot;,\&quot;Tags\&quot;:null}]</p>
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
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T11:50:38.000+0000</p>
         */
        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        @NameInMap("PilotVersion")
        public String pilotVersion;

        /**
         * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time of the last modification.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T05:24:31.000+0000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VersionLifeCycle")
        public String versionLifeCycle;

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

        public GetGovernanceKubernetesClusterResponseBodyData setPilotVersion(String pilotVersion) {
            this.pilotVersion = pilotVersion;
            return this;
        }
        public String getPilotVersion() {
            return this.pilotVersion;
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

        public GetGovernanceKubernetesClusterResponseBodyData setVersionLifeCycle(String versionLifeCycle) {
            this.versionLifeCycle = versionLifeCycle;
            return this;
        }
        public String getVersionLifeCycle() {
            return this.versionLifeCycle;
        }

    }

}
