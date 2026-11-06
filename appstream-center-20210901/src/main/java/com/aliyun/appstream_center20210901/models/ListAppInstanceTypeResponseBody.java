// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>The list of session instance types on the current page.</p>
     */
    @NameInMap("AppInstanceTypeModels")
    public java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModels> appInstanceTypeModels;

    /**
     * <p>The page number used in this query, which corresponds to the request parameters and the total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instance types that meet all filtering conditions, not the number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceTypeResponseBody self = new ListAppInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceTypeResponseBody setAppInstanceTypeModels(java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModels> appInstanceTypeModels) {
        this.appInstanceTypeModels = appInstanceTypeModels;
        return this;
    }
    public java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModels> getAppInstanceTypeModels() {
        return this.appInstanceTypeModels;
    }

    public ListAppInstanceTypeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstanceTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo extends TeaModel {
        /**
         * <p>The available quantity in the zone obtained in this query. Unit: instances. This value is an inventory snapshot and does not indicate that resources have been reserved for the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The zone ID, which can be queried by calling the <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListZones">ListZones</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo self = new ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo extends TeaModel {
        /**
         * <p>The business region ID corresponding to the inventory query.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance type inventory status obtained in the current query.</p>
         * <ul>
         * <li><code>Available</code>: The total inventory of the queried zones is greater than 0.</li>
         * <li><code>SoldOut</code>: The total inventory of the queried zones is not greater than 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of inventory information returned by zone.</p>
         */
        @NameInMap("ZoneInventoryInfo")
        public java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo> zoneInventoryInfo;

        public static ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo self = new ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo setZoneInventoryInfo(java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo> zoneInventoryInfo) {
            this.zoneInventoryInfo = zoneInventoryInfo;
            return this;
        }
        public java.util.List<ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfoZoneInventoryInfo> getZoneInventoryInfo() {
            return this.zoneInventoryInfo;
        }

    }

    public static class ListAppInstanceTypeResponseBodyAppInstanceTypeModels extends TeaModel {
        /**
         * <p>The session instance type code, which can be used as the session instance type parameter for subsequent operations.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g</p>
         */
        @NameInMap("AppInstanceType")
        public String appInstanceType;

        /**
         * <p>The instance type family code to which the session instance type belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        @NameInMap("AppInstanceTypeFamily")
        public String appInstanceTypeFamily;

        /**
         * <p>The number of CPU cores included in the instance type, represented by a numeric string. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The data cloud disk capacity of the instance type. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        /**
         * <p>Not enabled yet. The example value is only used to demonstrate the format and does not represent the actual number of GPUs returned by this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <p>The GPU memory capacity of the instance type. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("GpuMemory")
        public Long gpuMemory;

        /**
         * <p>The display value or display range of the GPU memory. Display it as the returned text. Do not directly use it as a numeric value for capacity conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1~2</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The identifier of the instance type record. When integrating with pricing or creation operations, use <code>AppInstanceType</code>. Do not use this field to replace the instance type code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The display name of the instance type. The Chinese name is used only when <code>Language</code> is set to <code>zh-CN</code>. For other values or when omitted, the instance type code is used.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g</p>
         */
        @NameInMap("InstanceTypeName")
        public String instanceTypeName;

        /**
         * <p>The inventory information of the instance type. This parameter is returned only when the inventory is queried and the relevant information is obtained. If this parameter is not returned, it does not mean that the inventory is 0.</p>
         */
        @NameInMap("InventoryInfo")
        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo inventoryInfo;

        /**
         * <p>The memory capacity of the instance type. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The type of the product to which the instance type belongs. The current document displays the following values:</p>
         * <ul>
         * <li><code>CloudApp</code>: Wuying Cloud Application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The system cloud disk capacity of the instance type. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        public static ListAppInstanceTypeResponseBodyAppInstanceTypeModels build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceTypeResponseBodyAppInstanceTypeModels self = new ListAppInstanceTypeResponseBodyAppInstanceTypeModels();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setAppInstanceTypeFamily(String appInstanceTypeFamily) {
            this.appInstanceTypeFamily = appInstanceTypeFamily;
            return this;
        }
        public String getAppInstanceTypeFamily() {
            return this.appInstanceTypeFamily;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public String getGpu() {
            return this.gpu;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setGpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setInventoryInfo(ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo inventoryInfo) {
            this.inventoryInfo = inventoryInfo;
            return this;
        }
        public ListAppInstanceTypeResponseBodyAppInstanceTypeModelsInventoryInfo getInventoryInfo() {
            return this.inventoryInfo;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListAppInstanceTypeResponseBodyAppInstanceTypeModels setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
