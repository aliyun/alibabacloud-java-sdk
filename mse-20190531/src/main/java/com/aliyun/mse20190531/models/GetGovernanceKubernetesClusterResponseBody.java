// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGovernanceKubernetesClusterResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterResponseBody self = new GetGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGovernanceKubernetesClusterResponseBody setData(GetGovernanceKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGovernanceKubernetesClusterResponseBodyData getData() {
        return this.data;
    }

    public GetGovernanceKubernetesClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        @NameInMap("Name")
        public String name;

        @NameInMap("Tags")
        public String tags;

        public static GetGovernanceKubernetesClusterResponseBodyDataNamespaces build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceKubernetesClusterResponseBodyDataNamespaces self = new GetGovernanceKubernetesClusterResponseBodyDataNamespaces();
            return TeaModel.build(map, self);
        }

        public GetGovernanceKubernetesClusterResponseBodyDataNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGovernanceKubernetesClusterResponseBodyDataNamespaces setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetGovernanceKubernetesClusterResponseBodyData extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("K8sVersion")
        public String k8sVersion;

        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        @NameInMap("Namespaces")
        public java.util.List<GetGovernanceKubernetesClusterResponseBodyDataNamespaces> namespaces;

        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        @NameInMap("Region")
        public String region;

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
