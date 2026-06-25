// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecResponseBody extends TeaModel {
    /**
     * <p>A list of available instance types for deployment.</p>
     */
    @NameInMap("InstanceMetas")
    public java.util.List<DescribeMachineSpecResponseBodyInstanceMetas> instanceMetas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported combinations of CPU and memory values for deployment.</p>
     */
    @NameInMap("Types")
    public java.util.List<DescribeMachineSpecResponseBodyTypes> types;

    public static DescribeMachineSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecResponseBody self = new DescribeMachineSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMachineSpecResponseBody setInstanceMetas(java.util.List<DescribeMachineSpecResponseBodyInstanceMetas> instanceMetas) {
        this.instanceMetas = instanceMetas;
        return this;
    }
    public java.util.List<DescribeMachineSpecResponseBodyInstanceMetas> getInstanceMetas() {
        return this.instanceMetas;
    }

    public DescribeMachineSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMachineSpecResponseBody setTypes(java.util.List<DescribeMachineSpecResponseBodyTypes> types) {
        this.types = types;
        return this;
    }
    public java.util.List<DescribeMachineSpecResponseBodyTypes> getTypes() {
        return this.types;
    }

    public static class DescribeMachineSpecResponseBodyInstanceMetas extends TeaModel {
        /**
         * <p>The number of CPU cores of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>The GPU model of the instance type. This field is not returned for non-GPU instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>GU30</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The number of GPUs in the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        /**
         * <p>The GPU memory size of the instance type, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("GPUMemory")
        public Float GPUMemory;

        /**
         * <p>The instance type name.</p>
         * 
         * <strong>example:</strong>
         * <p>ml.gu7i.c32m188.1-gu30</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the instance type is currently available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The memory size of the instance type, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum discount currently offered for a spot instance in no-protection mode. A value of 0.1 indicates a 90% discount. If this field is not returned, the instance type does not support spot instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("NonProtectSpotDiscount")
        public Float nonProtectSpotDiscount;

        /**
         * <p>The current lowest discount for a spot instance with a 1-hour protection period. A value of 0.1 indicates a 90% discount. If this field is not returned, the instance type does not support spot instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("SpotDiscount")
        public Float spotDiscount;

        /**
         * <p>The inventory status of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        @NameInMap("StockStatus")
        public String stockStatus;

        /**
         * <p>The source of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static DescribeMachineSpecResponseBodyInstanceMetas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineSpecResponseBodyInstanceMetas self = new DescribeMachineSpecResponseBodyInstanceMetas();
            return TeaModel.build(map, self);
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setGPUMemory(Float GPUMemory) {
            this.GPUMemory = GPUMemory;
            return this;
        }
        public Float getGPUMemory() {
            return this.GPUMemory;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setNonProtectSpotDiscount(Float nonProtectSpotDiscount) {
            this.nonProtectSpotDiscount = nonProtectSpotDiscount;
            return this;
        }
        public Float getNonProtectSpotDiscount() {
            return this.nonProtectSpotDiscount;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setSpotDiscount(Float spotDiscount) {
            this.spotDiscount = spotDiscount;
            return this;
        }
        public Float getSpotDiscount() {
            return this.spotDiscount;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }
        public String getStockStatus() {
            return this.stockStatus;
        }

        public DescribeMachineSpecResponseBodyInstanceMetas setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeMachineSpecResponseBodyTypes extends TeaModel {
        /**
         * <p>The valid values for the number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>The valid memory values for the specified number of CPU cores.</p>
         */
        @NameInMap("Memory")
        public java.util.List<Integer> memory;

        public static DescribeMachineSpecResponseBodyTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineSpecResponseBodyTypes self = new DescribeMachineSpecResponseBodyTypes();
            return TeaModel.build(map, self);
        }

        public DescribeMachineSpecResponseBodyTypes setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeMachineSpecResponseBodyTypes setMemory(java.util.List<Integer> memory) {
            this.memory = memory;
            return this;
        }
        public java.util.List<Integer> getMemory() {
            return this.memory;
        }

    }

}
