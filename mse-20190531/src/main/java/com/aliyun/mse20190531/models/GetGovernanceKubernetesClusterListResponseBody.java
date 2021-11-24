// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGovernanceKubernetesClusterListResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGovernanceKubernetesClusterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterListResponseBody self = new GetGovernanceKubernetesClusterListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGovernanceKubernetesClusterListResponseBody setData(GetGovernanceKubernetesClusterListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGovernanceKubernetesClusterListResponseBodyData getData() {
        return this.data;
    }

    public GetGovernanceKubernetesClusterListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGovernanceKubernetesClusterListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGovernanceKubernetesClusterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGovernanceKubernetesClusterListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGovernanceKubernetesClusterListResponseBodyDataResult extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("K8sVersion")
        public String k8sVersion;

        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        @NameInMap("Region")
        public String region;

        public static GetGovernanceKubernetesClusterListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceKubernetesClusterListResponseBodyDataResult self = new GetGovernanceKubernetesClusterListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setNamespaceInfos(String namespaceInfos) {
            this.namespaceInfos = namespaceInfos;
            return this;
        }
        public String getNamespaceInfos() {
            return this.namespaceInfos;
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setPilotStartTime(String pilotStartTime) {
            this.pilotStartTime = pilotStartTime;
            return this;
        }
        public String getPilotStartTime() {
            return this.pilotStartTime;
        }

        public GetGovernanceKubernetesClusterListResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetGovernanceKubernetesClusterListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetGovernanceKubernetesClusterListResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetGovernanceKubernetesClusterListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceKubernetesClusterListResponseBodyData self = new GetGovernanceKubernetesClusterListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGovernanceKubernetesClusterListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetGovernanceKubernetesClusterListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetGovernanceKubernetesClusterListResponseBodyData setResult(java.util.List<GetGovernanceKubernetesClusterListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetGovernanceKubernetesClusterListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetGovernanceKubernetesClusterListResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
