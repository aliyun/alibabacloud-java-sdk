// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterResourceDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the cluster resource usage.</p>
     */
    @NameInMap("Data")
    public DescribeClusterResourceDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterResourceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourceDetailResponseBody self = new DescribeClusterResourceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourceDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeClusterResourceDetailResponseBody setData(DescribeClusterResourceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeClusterResourceDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeClusterResourceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterResourceDetailResponseBodyDataResourceGroupList extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ClusterMode")
        public String clusterMode;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        /**
         * <p>Indicates whether the preemptible instance feature is enabled for the resource group. After the preemptible instance feature is enabled, you are charged for resources at a lower unit price but the resources are probably released. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>The True value is returned only for job resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSpot")
        public Boolean enableSpot;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxClusterCount")
        public Integer maxClusterCount;

        /**
         * <p>The maximum amount of reserved computing resources. Unit: ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>128ACU</p>
         */
        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinClusterCount")
        public Integer minClusterCount;

        /**
         * <p>The minimum amount of reserved computing resources. Unit: ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("MinComputeResource")
        public String minComputeResource;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("PoolId")
        public Long poolId;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testadb</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <p>The type of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        @NameInMap("PoolType")
        public String poolType;

        /**
         * <p>The user of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("PoolUsers")
        public String poolUsers;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>deleting</strong></li>
         * <li><strong>scaling</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeClusterResourceDetailResponseBodyDataResourceGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourceDetailResponseBodyDataResourceGroupList self = new DescribeClusterResourceDetailResponseBodyDataResourceGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setClusterSizeResource(String clusterSizeResource) {
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setEnableSpot(Boolean enableSpot) {
            this.enableSpot = enableSpot;
            return this;
        }
        public Boolean getEnableSpot() {
            return this.enableSpot;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setMaxClusterCount(Integer maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setMinClusterCount(Integer minClusterCount) {
            this.minClusterCount = minClusterCount;
            return this;
        }
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setPoolId(Long poolId) {
            this.poolId = poolId;
            return this;
        }
        public Long getPoolId() {
            return this.poolId;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setPoolType(String poolType) {
            this.poolType = poolType;
            return this;
        }
        public String getPoolType() {
            return this.poolType;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setPoolUsers(String poolUsers) {
            this.poolUsers = poolUsers;
            return this;
        }
        public String getPoolUsers() {
            return this.poolUsers;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public DescribeClusterResourceDetailResponseBodyDataResourceGroupList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeClusterResourceDetailResponseBodyData extends TeaModel {
        /**
         * <p>The amount of reserved computing resources. Unit: AnalyticDB compute units (ACUs). Valid values: 0 to 4096. The value must be in increments of 16 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ComputeResource")
        public String computeResource;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-adbxxxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The amount of idle reserved computing resources. Unit: ACUs. Valid values: 0 to 4096. The value must be in increments of 16 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>0ACU</p>
         */
        @NameInMap("FreeComputeResource")
        public String freeComputeResource;

        /**
         * <p>The resource groups.</p>
         */
        @NameInMap("ResourceGroupList")
        public java.util.List<DescribeClusterResourceDetailResponseBodyDataResourceGroupList> resourceGroupList;

        /**
         * <p>The amount of reserved storage resources. Unit: ACUs. Valid values: 0 to 2064. The value must be in increments of 24 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        @NameInMap("StorageResource")
        public String storageResource;

        public static DescribeClusterResourceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourceDetailResponseBodyData self = new DescribeClusterResourceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourceDetailResponseBodyData setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeClusterResourceDetailResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeClusterResourceDetailResponseBodyData setFreeComputeResource(String freeComputeResource) {
            this.freeComputeResource = freeComputeResource;
            return this;
        }
        public String getFreeComputeResource() {
            return this.freeComputeResource;
        }

        public DescribeClusterResourceDetailResponseBodyData setResourceGroupList(java.util.List<DescribeClusterResourceDetailResponseBodyDataResourceGroupList> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }
        public java.util.List<DescribeClusterResourceDetailResponseBodyDataResourceGroupList> getResourceGroupList() {
            return this.resourceGroupList;
        }

        public DescribeClusterResourceDetailResponseBodyData setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

    }

}
