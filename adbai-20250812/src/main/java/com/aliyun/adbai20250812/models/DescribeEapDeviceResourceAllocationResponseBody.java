// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeEapDeviceResourceAllocationResponseBody extends TeaModel {
    /**
     * <p>The list of specification recommendations.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeEapDeviceResourceAllocationResponseBodyItems> items;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>19E994DC-A816-56DB-9F90-5F8E403DD19D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEapDeviceResourceAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEapDeviceResourceAllocationResponseBody self = new DescribeEapDeviceResourceAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEapDeviceResourceAllocationResponseBody setItems(java.util.List<DescribeEapDeviceResourceAllocationResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeEapDeviceResourceAllocationResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeEapDeviceResourceAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEapDeviceResourceAllocationResponseBodyItems extends TeaModel {
        /**
         * <p>The total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DeviceCount")
        public Integer deviceCount;

        /**
         * <p>The total number of ACUs for the Ray Cluster Head of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("HeadAcu")
        public Double headAcu;

        /**
         * <p>The number of vCPU cores for the Ray Cluster Head of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadCpu")
        public Integer headCpu;

        /**
         * <p>The Ray Cluster Head specification of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;medium&quot;</p>
         */
        @NameInMap("HeadSpecName")
        public String headSpecName;

        /**
         * <p>The total number of actually deployed ACUs on the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalAcu")
        public Double totalAcu;

        /**
         * <p>The total number of actually deployed vCPU cores on the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalDeployedCpu")
        public Integer totalDeployedCpu;

        /**
         * <p>The total number of target vCPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("TotalTargetCpu")
        public Integer totalTargetCpu;

        /**
         * <p>The total number of ACUs for the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("WebserverAcu")
        public Double webserverAcu;

        /**
         * <p>The total number of vCPU cores for the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("WebserverCpu")
        public Integer webserverCpu;

        /**
         * <p>The Webserver specification of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;xlarge&quot;</p>
         */
        @NameInMap("WebserverSpecName")
        public String webserverSpecName;

        /**
         * <p>The total number of ACUs for a single Ray Cluster Worker of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>16.0</p>
         */
        @NameInMap("WorkerAcu")
        public Double workerAcu;

        /**
         * <p>The total number of Ray Cluster Workers of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WorkerCount")
        public Integer workerCount;

        /**
         * <p>The number of vCPU cores for a single Ray Cluster Worker of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("WorkerCpu")
        public Integer workerCpu;

        /**
         * <p>The Ray Cluster Worker specification of the embodied intelligence platform.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;xlarge&quot;</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        public static DescribeEapDeviceResourceAllocationResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEapDeviceResourceAllocationResponseBodyItems self = new DescribeEapDeviceResourceAllocationResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setHeadAcu(Double headAcu) {
            this.headAcu = headAcu;
            return this;
        }
        public Double getHeadAcu() {
            return this.headAcu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setHeadCpu(Integer headCpu) {
            this.headCpu = headCpu;
            return this;
        }
        public Integer getHeadCpu() {
            return this.headCpu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setHeadSpecName(String headSpecName) {
            this.headSpecName = headSpecName;
            return this;
        }
        public String getHeadSpecName() {
            return this.headSpecName;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setTotalAcu(Double totalAcu) {
            this.totalAcu = totalAcu;
            return this;
        }
        public Double getTotalAcu() {
            return this.totalAcu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setTotalDeployedCpu(Integer totalDeployedCpu) {
            this.totalDeployedCpu = totalDeployedCpu;
            return this;
        }
        public Integer getTotalDeployedCpu() {
            return this.totalDeployedCpu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setTotalTargetCpu(Integer totalTargetCpu) {
            this.totalTargetCpu = totalTargetCpu;
            return this;
        }
        public Integer getTotalTargetCpu() {
            return this.totalTargetCpu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWebserverAcu(Double webserverAcu) {
            this.webserverAcu = webserverAcu;
            return this;
        }
        public Double getWebserverAcu() {
            return this.webserverAcu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWebserverCpu(Integer webserverCpu) {
            this.webserverCpu = webserverCpu;
            return this;
        }
        public Integer getWebserverCpu() {
            return this.webserverCpu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWebserverSpecName(String webserverSpecName) {
            this.webserverSpecName = webserverSpecName;
            return this;
        }
        public String getWebserverSpecName() {
            return this.webserverSpecName;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWorkerAcu(Double workerAcu) {
            this.workerAcu = workerAcu;
            return this;
        }
        public Double getWorkerAcu() {
            return this.workerAcu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWorkerCount(Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }
        public Integer getWorkerCount() {
            return this.workerCount;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWorkerCpu(Integer workerCpu) {
            this.workerCpu = workerCpu;
            return this;
        }
        public Integer getWorkerCpu() {
            return this.workerCpu;
        }

        public DescribeEapDeviceResourceAllocationResponseBodyItems setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

    }

}
