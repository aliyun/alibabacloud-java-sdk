// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaleControlAvailableResource")
    public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource> saleControlAvailableResource;

    public static DescribeEnsSaleControlAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlAvailableResourceResponseBody self = new DescribeEnsSaleControlAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsSaleControlAvailableResourceResponseBody setSaleControlAvailableResource(java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource> saleControlAvailableResource) {
        this.saleControlAvailableResource = saleControlAvailableResource;
        return this;
    }
    public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource> getSaleControlAvailableResource() {
        return this.saleControlAvailableResource;
    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType extends TeaModel {
        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("DiskType")
        public String diskType;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("EnsRegionName")
        public String ensRegionName;

        @NameInMap("Province")
        public String province;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion setEnsRegionName(String ensRegionName) {
            this.ensRegionName = ensRegionName;
            return this;
        }
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec extends TeaModel {
        @NameInMap("Cores")
        public String cores;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("SpecValue")
        public String specValue;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec setCores(String cores) {
            this.cores = cores;
            return this;
        }
        public String getCores() {
            return this.cores;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec setSpecValue(String specValue) {
            this.specValue = specValue;
            return this;
        }
        public String getSpecValue() {
            return this.specValue;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType extends TeaModel {
        @NameInMap("StorageName")
        public String storageName;

        @NameInMap("StorageType")
        public String storageType;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType setStorageName(String storageName) {
            this.storageName = storageName;
            return this;
        }
        public String getStorageName() {
            return this.storageName;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType extends TeaModel {
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("StorageName")
        public String storageName;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType setStorageName(String storageName) {
            this.storageName = storageName;
            return this;
        }
        public String getStorageName() {
            return this.storageName;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType extends TeaModel {
        @NameInMap("AvailableDefaultStorageType")
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType> availableDefaultStorageType;

        @NameInMap("AvailableSpecialStorageType")
        public java.util.List<java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType>> availableSpecialStorageType;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType setAvailableDefaultStorageType(java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType> availableDefaultStorageType) {
            this.availableDefaultStorageType = availableDefaultStorageType;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableDefaultStorageType> getAvailableDefaultStorageType() {
            return this.availableDefaultStorageType;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType setAvailableSpecialStorageType(java.util.List<java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType>> availableSpecialStorageType) {
            this.availableSpecialStorageType = availableSpecialStorageType;
            return this;
        }
        public java.util.List<java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageTypeAvailableSpecialStorageType>> getAvailableSpecialStorageType() {
            return this.availableSpecialStorageType;
        }

    }

    public static class DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource extends TeaModel {
        @NameInMap("AvailableDiskType")
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType> availableDiskType;

        @NameInMap("AvailableRegion")
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion> availableRegion;

        @NameInMap("AvailableSpec")
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec> availableSpec;

        @NameInMap("AvailableStorageType")
        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType availableStorageType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("OrderType")
        public String orderType;

        public static DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource self = new DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setAvailableDiskType(java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType> availableDiskType) {
            this.availableDiskType = availableDiskType;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableDiskType> getAvailableDiskType() {
            return this.availableDiskType;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setAvailableRegion(java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion> availableRegion) {
            this.availableRegion = availableRegion;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableRegion> getAvailableRegion() {
            return this.availableRegion;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setAvailableSpec(java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec> availableSpec) {
            this.availableSpec = availableSpec;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableSpec> getAvailableSpec() {
            return this.availableSpec;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setAvailableStorageType(DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType availableStorageType) {
            this.availableStorageType = availableStorageType;
            return this;
        }
        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResourceAvailableStorageType getAvailableStorageType() {
            return this.availableStorageType;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBodySaleControlAvailableResource setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
