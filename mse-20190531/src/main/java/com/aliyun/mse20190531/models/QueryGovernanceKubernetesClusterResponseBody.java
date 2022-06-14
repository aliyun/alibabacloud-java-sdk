// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterResponseBody extends TeaModel {
    // 后端状态码
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryGovernanceKubernetesClusterResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static QueryGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGovernanceKubernetesClusterResponseBody self = new QueryGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGovernanceKubernetesClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryGovernanceKubernetesClusterResponseBody setData(QueryGovernanceKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGovernanceKubernetesClusterResponseBodyData getData() {
        return this.data;
    }

    public QueryGovernanceKubernetesClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryGovernanceKubernetesClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGovernanceKubernetesClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGovernanceKubernetesClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGovernanceKubernetesClusterResponseBodyDataResult extends TeaModel {
        // Kubernetes集群Id
        @NameInMap("ClusterId")
        public String clusterId;

        // Kubernetes集群名
        @NameInMap("ClusterName")
        public String clusterName;

        // Kubernetes集群版本
        @NameInMap("K8sVersion")
        public String k8sVersion;

        // Kubernetes集群命名空间信息（json格式）
        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        // pilot启动时间
        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        // Kubernetes集群所在的地域
        @NameInMap("Region")
        public String region;

        public static QueryGovernanceKubernetesClusterResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryGovernanceKubernetesClusterResponseBodyDataResult self = new QueryGovernanceKubernetesClusterResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setNamespaceInfos(String namespaceInfos) {
            this.namespaceInfos = namespaceInfos;
            return this;
        }
        public String getNamespaceInfos() {
            return this.namespaceInfos;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setPilotStartTime(String pilotStartTime) {
            this.pilotStartTime = pilotStartTime;
            return this;
        }
        public String getPilotStartTime() {
            return this.pilotStartTime;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class QueryGovernanceKubernetesClusterResponseBodyData extends TeaModel {
        // 当前页码
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> result;

        // 页码总数
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static QueryGovernanceKubernetesClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGovernanceKubernetesClusterResponseBodyData self = new QueryGovernanceKubernetesClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setResult(java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
