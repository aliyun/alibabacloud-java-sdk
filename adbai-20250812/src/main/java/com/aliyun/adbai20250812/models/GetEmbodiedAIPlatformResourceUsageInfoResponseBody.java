// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class GetEmbodiedAIPlatformResourceUsageInfoResponseBody extends TeaModel {
    @NameInMap("GpuDetails")
    public java.util.List<GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails> gpuDetails;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxRegisteredDevices")
    public Long maxRegisteredDevices;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegisteredDeviceCount")
    public Long registeredDeviceCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlbTraffic")
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic slbTraffic;

    @NameInMap("StorageUsage")
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage storageUsage;

    public static GetEmbodiedAIPlatformResourceUsageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmbodiedAIPlatformResourceUsageInfoResponseBody self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setGpuDetails(java.util.List<GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails> gpuDetails) {
        this.gpuDetails = gpuDetails;
        return this;
    }
    public java.util.List<GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails> getGpuDetails() {
        return this.gpuDetails;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setMaxRegisteredDevices(Long maxRegisteredDevices) {
        this.maxRegisteredDevices = maxRegisteredDevices;
        return this;
    }
    public Long getMaxRegisteredDevices() {
        return this.maxRegisteredDevices;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setRegisteredDeviceCount(Long registeredDeviceCount) {
        this.registeredDeviceCount = registeredDeviceCount;
        return this;
    }
    public Long getRegisteredDeviceCount() {
        return this.registeredDeviceCount;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setSlbTraffic(GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic slbTraffic) {
        this.slbTraffic = slbTraffic;
        return this;
    }
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic getSlbTraffic() {
        return this.slbTraffic;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody setStorageUsage(GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public static class GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails extends TeaModel {
        @NameInMap("AllocatedUnit")
        public Integer allocatedUnit;

        /**
         * <strong>example:</strong>
         * <p>ADB.MLLarge.2</p>
         */
        @NameInMap("GpuModel")
        public String gpuModel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails build(java.util.Map<String, ?> map) throws Exception {
            GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails();
            return TeaModel.build(map, self);
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails setAllocatedUnit(Integer allocatedUnit) {
            this.allocatedUnit = allocatedUnit;
            return this;
        }
        public Integer getAllocatedUnit() {
            return this.allocatedUnit;
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails setGpuModel(String gpuModel) {
            this.gpuModel = gpuModel;
            return this;
        }
        public String getGpuModel() {
            return this.gpuModel;
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyGpuDetails setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBytesIn")
        public Long totalBytesIn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBytesOut")
        public Long totalBytesOut;

        public static GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic build(java.util.Map<String, ?> map) throws Exception {
            GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic();
            return TeaModel.build(map, self);
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic setTotalBytesIn(Long totalBytesIn) {
            this.totalBytesIn = totalBytesIn;
            return this;
        }
        public Long getTotalBytesIn() {
            return this.totalBytesIn;
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodySlbTraffic setTotalBytesOut(Long totalBytesOut) {
            this.totalBytesOut = totalBytesOut;
            return this;
        }
        public Long getTotalBytesOut() {
            return this.totalBytesOut;
        }

    }

    public static class GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        public static GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas build(java.util.Map<String, ?> map) throws Exception {
            GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas();
            return TeaModel.build(map, self);
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

    }

    public static class GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StandardStorageSize")
        public Long standardStorageSize;

        public static GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss build(java.util.Map<String, ?> map) throws Exception {
            GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss();
            return TeaModel.build(map, self);
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss setStandardStorageSize(Long standardStorageSize) {
            this.standardStorageSize = standardStorageSize;
            return this;
        }
        public Long getStandardStorageSize() {
            return this.standardStorageSize;
        }

    }

    public static class GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage extends TeaModel {
        @NameInMap("Nas")
        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas nas;

        @NameInMap("Oss")
        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss oss;

        public static GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage build(java.util.Map<String, ?> map) throws Exception {
            GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage self = new GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage();
            return TeaModel.build(map, self);
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage setNas(GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas nas) {
            this.nas = nas;
            return this;
        }
        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageNas getNas() {
            return this.nas;
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsage setOss(GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss oss) {
            this.oss = oss;
            return this;
        }
        public GetEmbodiedAIPlatformResourceUsageInfoResponseBodyStorageUsageOss getOss() {
            return this.oss;
        }

    }

}
