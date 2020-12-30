// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EmrZoneInfoList")
    public ListEmrAvailableResourceResponseBodyEmrZoneInfoList emrZoneInfoList;

    public static ListEmrAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrAvailableResourceResponseBody self = new ListEmrAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEmrAvailableResourceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEmrAvailableResourceResponseBody setEmrZoneInfoList(ListEmrAvailableResourceResponseBodyEmrZoneInfoList emrZoneInfoList) {
        this.emrZoneInfoList = emrZoneInfoList;
        return this;
    }
    public ListEmrAvailableResourceResponseBodyEmrZoneInfoList getEmrZoneInfoList() {
        return this.emrZoneInfoList;
    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType extends TeaModel {
        @NameInMap("InstanceBandwidthRx")
        public Integer instanceBandwidthRx;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("InstanceBandwidthTx")
        public Integer instanceBandwidthTx;

        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("InitialCredit")
        public Integer initialCredit;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("InstancePpsRx")
        public Long instancePpsRx;

        @NameInMap("BaselineCredit")
        public Integer baselineCredit;

        @NameInMap("InstancePpsTx")
        public Long instancePpsTx;

        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("EniQuantity")
        public Integer eniQuantity;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstanceBandwidthRx(Integer instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstanceBandwidthTx(Integer instanceBandwidthTx) {
            this.instanceBandwidthTx = instanceBandwidthTx;
            return this;
        }
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInitialCredit(Integer initialCredit) {
            this.initialCredit = initialCredit;
            return this;
        }
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstancePpsRx(Long instancePpsRx) {
            this.instancePpsRx = instancePpsRx;
            return this;
        }
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setBaselineCredit(Integer baselineCredit) {
            this.baselineCredit = baselineCredit;
            return this;
        }
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstancePpsTx(Long instancePpsTx) {
            this.instancePpsTx = instancePpsTx;
            return this;
        }
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType setEniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList extends TeaModel {
        @NameInMap("SupportNodeType")
        public java.util.List<String> supportNodeType;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList setSupportNodeType(java.util.List<String> supportNodeType) {
            this.supportNodeType = supportNodeType;
            return this;
        }
        public java.util.List<String> getSupportNodeType() {
            return this.supportNodeType;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Max")
        public Integer max;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("EmrInstanceType")
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType emrInstanceType;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("SupportNodeTypeList")
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList supportNodeTypeList;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setEmrInstanceType(ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType emrInstanceType) {
            this.emrInstanceType = emrInstanceType;
            return this;
        }
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceEmrInstanceType getEmrInstanceType() {
            return this.emrInstanceType;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource setSupportNodeTypeList(ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList supportNodeTypeList) {
            this.supportNodeTypeList = supportNodeTypeList;
            return this;
        }
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResourceSupportNodeTypeList getSupportNodeTypeList() {
            return this.supportNodeTypeList;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList extends TeaModel {
        @NameInMap("SupportedResource")
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource> supportedResource;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList setSupportedResource(java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceListSupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SupportedResourceList")
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList supportedResourceList;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo setSupportedResourceList(ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList supportedResourceList) {
            this.supportedResourceList = supportedResourceList;
            return this;
        }
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfoSupportedResourceList getSupportedResourceList() {
            return this.supportedResourceList;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList extends TeaModel {
        @NameInMap("EmrResourceInfo")
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo> emrResourceInfo;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList setEmrResourceInfo(java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo> emrResourceInfo) {
            this.emrResourceInfo = emrResourceInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoListEmrResourceInfo> getEmrResourceInfo() {
            return this.emrResourceInfo;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("EmrResourceInfoList")
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList emrResourceInfoList;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo setEmrResourceInfoList(ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList emrResourceInfoList) {
            this.emrResourceInfoList = emrResourceInfoList;
            return this;
        }
        public ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfoEmrResourceInfoList getEmrResourceInfoList() {
            return this.emrResourceInfoList;
        }

    }

    public static class ListEmrAvailableResourceResponseBodyEmrZoneInfoList extends TeaModel {
        @NameInMap("EmrZoneInfo")
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo> emrZoneInfo;

        public static ListEmrAvailableResourceResponseBodyEmrZoneInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableResourceResponseBodyEmrZoneInfoList self = new ListEmrAvailableResourceResponseBodyEmrZoneInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableResourceResponseBodyEmrZoneInfoList setEmrZoneInfo(java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo> emrZoneInfo) {
            this.emrZoneInfo = emrZoneInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableResourceResponseBodyEmrZoneInfoListEmrZoneInfo> getEmrZoneInfo() {
            return this.emrZoneInfo;
        }

    }

}
