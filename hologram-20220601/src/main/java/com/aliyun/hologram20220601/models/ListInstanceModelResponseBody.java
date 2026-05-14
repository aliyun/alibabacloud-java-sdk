// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListInstanceModelResponseBody extends TeaModel {
    @NameInMap("instanceModelList")
    public java.util.List<ListInstanceModelResponseBodyInstanceModelList> instanceModelList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C2ECDC1-FBAD-14A5-AA4A-96BC787FBDBC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListInstanceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceModelResponseBody self = new ListInstanceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceModelResponseBody setInstanceModelList(java.util.List<ListInstanceModelResponseBodyInstanceModelList> instanceModelList) {
        this.instanceModelList = instanceModelList;
        return this;
    }
    public java.util.List<ListInstanceModelResponseBodyInstanceModelList> getInstanceModelList() {
        return this.instanceModelList;
    }

    public ListInstanceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceModelResponseBodyInstanceModelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hologram_aicombo_public_cn-77xxx</p>
         */
        @NameInMap("aiInstanceId")
        public String aiInstanceId;

        /**
         * <strong>example:</strong>
         * <p>small-8core-30G-24G</p>
         */
        @NameInMap("aiSpec")
        public String aiSpec;

        @NameInMap("autoRenewal")
        public Boolean autoRenewal;

        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>hologram_aipostpay_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("cpu")
        public Long cpu;

        @NameInMap("cpuUsed")
        public Long cpuUsed;

        /**
         * <strong>example:</strong>
         * <p>2026-01-28T07:44:27.535Z</p>
         */
        @NameInMap("expirationTime")
        public String expirationTime;

        @NameInMap("gpu")
        public Long gpu;

        @NameInMap("gpuMemory")
        public Long gpuMemory;

        @NameInMap("gpuMemoryUsed")
        public Long gpuMemoryUsed;

        @NameInMap("gpuUsed")
        public Long gpuUsed;

        /**
         * <strong>example:</strong>
         * <p>hgpostcn-cn-yi34hlzdx003</p>
         */
        @NameInMap("holoInstanceId")
        public String holoInstanceId;

        @NameInMap("holoInstanceName")
        public String holoInstanceName;

        @NameInMap("memory")
        public Long memory;

        @NameInMap("memoryUsed")
        public Long memoryUsed;

        @NameInMap("nodeCount")
        public Long nodeCount;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>ResourceReady</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstanceModelResponseBodyInstanceModelList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceModelResponseBodyInstanceModelList self = new ListInstanceModelResponseBodyInstanceModelList();
            return TeaModel.build(map, self);
        }

        public ListInstanceModelResponseBodyInstanceModelList setAiInstanceId(String aiInstanceId) {
            this.aiInstanceId = aiInstanceId;
            return this;
        }
        public String getAiInstanceId() {
            return this.aiInstanceId;
        }

        public ListInstanceModelResponseBodyInstanceModelList setAiSpec(String aiSpec) {
            this.aiSpec = aiSpec;
            return this;
        }
        public String getAiSpec() {
            return this.aiSpec;
        }

        public ListInstanceModelResponseBodyInstanceModelList setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public ListInstanceModelResponseBodyInstanceModelList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListInstanceModelResponseBodyInstanceModelList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstanceModelResponseBodyInstanceModelList setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public ListInstanceModelResponseBodyInstanceModelList setCpuUsed(Long cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public Long getCpuUsed() {
            return this.cpuUsed;
        }

        public ListInstanceModelResponseBodyInstanceModelList setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListInstanceModelResponseBodyInstanceModelList setGpu(Long gpu) {
            this.gpu = gpu;
            return this;
        }
        public Long getGpu() {
            return this.gpu;
        }

        public ListInstanceModelResponseBodyInstanceModelList setGpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        public ListInstanceModelResponseBodyInstanceModelList setGpuMemoryUsed(Long gpuMemoryUsed) {
            this.gpuMemoryUsed = gpuMemoryUsed;
            return this;
        }
        public Long getGpuMemoryUsed() {
            return this.gpuMemoryUsed;
        }

        public ListInstanceModelResponseBodyInstanceModelList setGpuUsed(Long gpuUsed) {
            this.gpuUsed = gpuUsed;
            return this;
        }
        public Long getGpuUsed() {
            return this.gpuUsed;
        }

        public ListInstanceModelResponseBodyInstanceModelList setHoloInstanceId(String holoInstanceId) {
            this.holoInstanceId = holoInstanceId;
            return this;
        }
        public String getHoloInstanceId() {
            return this.holoInstanceId;
        }

        public ListInstanceModelResponseBodyInstanceModelList setHoloInstanceName(String holoInstanceName) {
            this.holoInstanceName = holoInstanceName;
            return this;
        }
        public String getHoloInstanceName() {
            return this.holoInstanceName;
        }

        public ListInstanceModelResponseBodyInstanceModelList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public ListInstanceModelResponseBodyInstanceModelList setMemoryUsed(Long memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public Long getMemoryUsed() {
            return this.memoryUsed;
        }

        public ListInstanceModelResponseBodyInstanceModelList setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListInstanceModelResponseBodyInstanceModelList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceModelResponseBodyInstanceModelList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListInstanceModelResponseBodyInstanceModelList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
