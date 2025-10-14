// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetWarehouseDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned values.</p>
     */
    @NameInMap("WarehouseDetail")
    public GetWarehouseDetailResponseBodyWarehouseDetail warehouseDetail;

    public static GetWarehouseDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseDetailResponseBody self = new GetWarehouseDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWarehouseDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWarehouseDetailResponseBody setWarehouseDetail(GetWarehouseDetailResponseBodyWarehouseDetail warehouseDetail) {
        this.warehouseDetail = warehouseDetail;
        return this;
    }
    public GetWarehouseDetailResponseBodyWarehouseDetail getWarehouseDetail() {
        return this.warehouseDetail;
    }

    public static class GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("AutoScaleType")
        public String autoScaleType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterCount")
        public String clusterCount;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ClusterCpu")
        public String clusterCpu;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("DefaultWarehouse")
        public Boolean defaultWarehouse;

        @NameInMap("ElasticCpu")
        public Long elasticCpu;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InitClusterCount")
        public String initClusterCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxClusterCount")
        public String maxClusterCount;

        /**
         * <p>The memory capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Mem")
        public Long mem;

        /**
         * <p>The name of the virtual warehouse instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MyWarehouse</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        @NameInMap("RebalanceStatus")
        public String rebalanceStatus;

        /**
         * <p>The status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>kRunning</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kSuspended</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kInit</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kAllocating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kRunning</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList build(java.util.Map<String, ?> map) throws Exception {
            GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList self = new GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList();
            return TeaModel.build(map, self);
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setAutoScaleType(String autoScaleType) {
            this.autoScaleType = autoScaleType;
            return this;
        }
        public String getAutoScaleType() {
            return this.autoScaleType;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setClusterCount(String clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public String getClusterCount() {
            return this.clusterCount;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setClusterCpu(String clusterCpu) {
            this.clusterCpu = clusterCpu;
            return this;
        }
        public String getClusterCpu() {
            return this.clusterCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setDefaultWarehouse(Boolean defaultWarehouse) {
            this.defaultWarehouse = defaultWarehouse;
            return this;
        }
        public Boolean getDefaultWarehouse() {
            return this.defaultWarehouse;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setElasticCpu(Long elasticCpu) {
            this.elasticCpu = elasticCpu;
            return this;
        }
        public Long getElasticCpu() {
            return this.elasticCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setInitClusterCount(String initClusterCount) {
            this.initClusterCount = initClusterCount;
            return this;
        }
        public String getInitClusterCount() {
            return this.initClusterCount;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setMaxClusterCount(String maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public String getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setRebalanceStatus(String rebalanceStatus) {
            this.rebalanceStatus = rebalanceStatus;
            return this;
        }
        public String getRebalanceStatus() {
            return this.rebalanceStatus;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWarehouseDetailResponseBodyWarehouseDetail extends TeaModel {
        @NameInMap("AutoElasticCpu")
        public String autoElasticCpu;

        /**
         * <p>The remaining unallocated computing resources of the virtual warehouse instance.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("RemainingCpu")
        public String remainingCpu;

        /**
         * <p>The reserved computing resources. The amount of computing resources in all running virtual warehouses in an instance cannot exceed the amount of reserved computing resources in the virtual warehouses.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("ReservedCpu")
        public String reservedCpu;

        @NameInMap("TimedElasticCpu")
        public String timedElasticCpu;

        /**
         * <p>The list of virtual warehouses.</p>
         */
        @NameInMap("WarehouseList")
        public java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> warehouseList;

        public static GetWarehouseDetailResponseBodyWarehouseDetail build(java.util.Map<String, ?> map) throws Exception {
            GetWarehouseDetailResponseBodyWarehouseDetail self = new GetWarehouseDetailResponseBodyWarehouseDetail();
            return TeaModel.build(map, self);
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setAutoElasticCpu(String autoElasticCpu) {
            this.autoElasticCpu = autoElasticCpu;
            return this;
        }
        public String getAutoElasticCpu() {
            return this.autoElasticCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setRemainingCpu(String remainingCpu) {
            this.remainingCpu = remainingCpu;
            return this;
        }
        public String getRemainingCpu() {
            return this.remainingCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setReservedCpu(String reservedCpu) {
            this.reservedCpu = reservedCpu;
            return this;
        }
        public String getReservedCpu() {
            return this.reservedCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setTimedElasticCpu(String timedElasticCpu) {
            this.timedElasticCpu = timedElasticCpu;
            return this;
        }
        public String getTimedElasticCpu() {
            return this.timedElasticCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setWarehouseList(java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> warehouseList) {
            this.warehouseList = warehouseList;
            return this;
        }
        public java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> getWarehouseList() {
            return this.warehouseList;
        }

    }

}
