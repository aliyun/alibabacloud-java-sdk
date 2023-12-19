// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeContainerClusterResponseBody extends TeaModel {
    /**
     * <p>The information of clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeContainerClusterResponseBodyClusters> clusters;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeContainerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerClusterResponseBody self = new DescribeContainerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerClusterResponseBody setClusters(java.util.List<DescribeContainerClusterResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeContainerClusterResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeContainerClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeContainerClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContainerClusterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeContainerClusterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeContainerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContainerClusterResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeContainerClusterResponseBodyClusters extends TeaModel {
        /**
         * <p>The status of the client. Valid values:</p>
         * <br>
         * <p>*   **MISS**: The client is disconnected.</p>
         * <p>*   **UNKNOWN**: The client is in an unknown state.</p>
         * <p>*   **READY**: The client is ready.</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster. Valid value: ACK, which indicates ACK clusters.</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the cluster.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **CLASSIC**: the classic network</p>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The token that is used to register the Hybrid Backup Recovery (HBR) client in the cluster.</p>
         */
        @NameInMap("Token")
        public String token;

        public static DescribeContainerClusterResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerClusterResponseBodyClusters self = new DescribeContainerClusterResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeContainerClusterResponseBodyClusters setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeContainerClusterResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerClusterResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeContainerClusterResponseBodyClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeContainerClusterResponseBodyClusters setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeContainerClusterResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerClusterResponseBodyClusters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeContainerClusterResponseBodyClusters setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
