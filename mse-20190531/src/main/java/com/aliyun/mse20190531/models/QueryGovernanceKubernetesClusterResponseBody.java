// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryGovernanceKubernetesClusterResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>DE34D413-2B79-5E77-9696-36D875E822AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGovernanceKubernetesClusterResponseBody self = new QueryGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGovernanceKubernetesClusterResponseBody setData(QueryGovernanceKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGovernanceKubernetesClusterResponseBodyData getData() {
        return this.data;
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef123456789</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>example-cluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.22</p>
         */
        @NameInMap("K8sVersion")
        public String k8sVersion;

        /**
         * <p>The information about the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;ack-onepilot&quot;,&quot;Tags&quot;:{&quot;name&quot;:&quot;ack-onepilot&quot;}}]</p>
         */
        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        /**
         * <p>The time when the pilot component was started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-17T05:39:43.000+0000</p>
         */
        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        @NameInMap("PilotVersion")
        public String pilotVersion;

        /**
         * <p>The region where the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("VersionLifeCycle")
        public String versionLifeCycle;

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

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setPilotVersion(String pilotVersion) {
            this.pilotVersion = pilotVersion;
            return this;
        }
        public String getPilotVersion() {
            return this.pilotVersion;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setVersionLifeCycle(String versionLifeCycle) {
            this.versionLifeCycle = versionLifeCycle;
            return this;
        }
        public String getVersionLifeCycle() {
            return this.versionLifeCycle;
        }

    }

    public static class QueryGovernanceKubernetesClusterResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The details of the data.</p>
         */
        @NameInMap("Result")
        public java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> result;

        /**
         * <p>The total number of clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
