// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecResponseBody extends TeaModel {
    @NameInMap("InstanceMetas")
    public java.util.List<DescribeMachineSpecResponseBodyInstanceMetas> instanceMetas;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <strong>example:</strong>
         * <p>GU30</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("GPUMemory")
        public Float GPUMemory;

        /**
         * <strong>example:</strong>
         * <p>ml.gu7i.c32m188.1-gu30</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("NonProtectSpotDiscount")
        public Float nonProtectSpotDiscount;

        /**
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("SpotDiscount")
        public Float spotDiscount;

        /**
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        @NameInMap("StockStatus")
        public String stockStatus;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

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
