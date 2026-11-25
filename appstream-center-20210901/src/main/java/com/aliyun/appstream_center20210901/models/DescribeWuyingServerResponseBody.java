// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerResponseBody extends TeaModel {
    /**
     * <p>The details of the development host.</p>
     */
    @NameInMap("Data")
    public DescribeWuyingServerResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerResponseBody self = new DescribeWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerResponseBody setData(DescribeWuyingServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWuyingServerResponseBodyData getData() {
        return this.data;
    }

    public DescribeWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWuyingServerResponseBodyDataPrivateIpSets extends TeaModel {
        /**
         * <p>Indicates whether the IP address is the primary private IP address. Valid values: true: The IP address is the primary private IP address. false: The IP address is a secondary private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeWuyingServerResponseBodyDataPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyDataPrivateIpSets self = new DescribeWuyingServerResponseBodyDataPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyDataPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeWuyingServerResponseBodyDataPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        /**
         * <strong>example:</strong>
         * <p>NVIDIA T4</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <strong>example:</strong>
         * <p>appstreaming.general.4c8g</p>
         */
        @NameInMap("ServerInstanceType")
        public String serverInstanceType;

        public static DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo self = new DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public String getGpu() {
            return this.gpu;
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setGpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo setServerInstanceType(String serverInstanceType) {
            this.serverInstanceType = serverInstanceType;
            return this;
        }
        public String getServerInstanceType() {
            return this.serverInstanceType;
        }

    }

    public static class DescribeWuyingServerResponseBodyDataServerModelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vLLM</p>
         */
        @NameInMap("InferenceEngine")
        public String inferenceEngine;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("InputModalities")
        public java.util.List<String> inputModalities;

        /**
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("MaxModelLen")
        public Long maxModelLen;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxNumSeqs")
        public Integer maxNumSeqs;

        /**
         * <strong>example:</strong>
         * <p>Lan</p>
         */
        @NameInMap("ModelAccessMethod")
        public String modelAccessMethod;

        /**
         * <strong>example:</strong>
         * <p>demo-model</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>示例模型</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ModelServiceInferenceStatus")
        public String modelServiceInferenceStatus;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("OutputModalities")
        public java.util.List<String> outputModalities;

        /**
         * <strong>example:</strong>
         * <p>demo-model</p>
         */
        @NameInMap("ServedModelName")
        public String servedModelName;

        public static DescribeWuyingServerResponseBodyDataServerModelInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyDataServerModelInfo self = new DescribeWuyingServerResponseBodyDataServerModelInfo();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setInferenceEngine(String inferenceEngine) {
            this.inferenceEngine = inferenceEngine;
            return this;
        }
        public String getInferenceEngine() {
            return this.inferenceEngine;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setInputModalities(java.util.List<String> inputModalities) {
            this.inputModalities = inputModalities;
            return this;
        }
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setMaxModelLen(Long maxModelLen) {
            this.maxModelLen = maxModelLen;
            return this;
        }
        public Long getMaxModelLen() {
            return this.maxModelLen;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setMaxNumSeqs(Integer maxNumSeqs) {
            this.maxNumSeqs = maxNumSeqs;
            return this;
        }
        public Integer getMaxNumSeqs() {
            return this.maxNumSeqs;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setModelAccessMethod(String modelAccessMethod) {
            this.modelAccessMethod = modelAccessMethod;
            return this;
        }
        public String getModelAccessMethod() {
            return this.modelAccessMethod;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setModelServiceInferenceStatus(String modelServiceInferenceStatus) {
            this.modelServiceInferenceStatus = modelServiceInferenceStatus;
            return this;
        }
        public String getModelServiceInferenceStatus() {
            return this.modelServiceInferenceStatus;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setOutputModalities(java.util.List<String> outputModalities) {
            this.outputModalities = outputModalities;
            return this;
        }
        public java.util.List<String> getOutputModalities() {
            return this.outputModalities;
        }

        public DescribeWuyingServerResponseBodyDataServerModelInfo setServedModelName(String servedModelName) {
            this.servedModelName = servedModelName;
            return this;
        }
        public String getServedModelName() {
            return this.servedModelName;
        }

    }

    public static class DescribeWuyingServerResponseBodyData extends TeaModel {
        /**
         * <p>The bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The creation time. The time is displayed in the 12-hour US English date and time format.</p>
         * 
         * <strong>example:</strong>
         * <p>Sep 2, 2026 1:46:41 PM</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The maximum number of private IP addresses per elastic network interface (ENI), including the primary IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        /**
         * <p>The expiration time. The time is displayed in the 12-hour US English date and time format.</p>
         * 
         * <strong>example:</strong>
         * <p>Oct 3, 2026 12:00:00 AM</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp1234567890abcde</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu 22.04</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-abc123</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default workspace</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The workspace type.</p>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The set of private IP addresses, including the primary and secondary IP addresses.</p>
         */
        @NameInMap("PrivateIpSets")
        public java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> privateIpSets;

        @NameInMap("ServerInstanceTypeInfo")
        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo serverInstanceTypeInfo;

        @NameInMap("ServerModelInfo")
        public DescribeWuyingServerResponseBodyDataServerModelInfo serverModelInfo;

        /**
         * <p>The status of the development host.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Whether ASP streaming connection is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportASP")
        public Boolean supportASP;

        /**
         * <p>The category of the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The size of the system cloud disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The ID of the development host.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-bp1234567890abcde</p>
         */
        @NameInMap("WuyingServerId")
        public String wuyingServerId;

        /**
         * <p>The name of the development host.</p>
         * 
         * <strong>example:</strong>
         * <p>my-dev-server</p>
         */
        @NameInMap("WuyingServerName")
        public String wuyingServerName;

        public static DescribeWuyingServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyData self = new DescribeWuyingServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyData setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeWuyingServerResponseBodyData setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public DescribeWuyingServerResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeWuyingServerResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWuyingServerResponseBodyData setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        public DescribeWuyingServerResponseBodyData setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeWuyingServerResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeWuyingServerResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeWuyingServerResponseBodyData setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeWuyingServerResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeWuyingServerResponseBodyData setPrivateIpSets(java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeWuyingServerResponseBodyData setServerInstanceTypeInfo(DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo serverInstanceTypeInfo) {
            this.serverInstanceTypeInfo = serverInstanceTypeInfo;
            return this;
        }
        public DescribeWuyingServerResponseBodyDataServerInstanceTypeInfo getServerInstanceTypeInfo() {
            return this.serverInstanceTypeInfo;
        }

        public DescribeWuyingServerResponseBodyData setServerModelInfo(DescribeWuyingServerResponseBodyDataServerModelInfo serverModelInfo) {
            this.serverModelInfo = serverModelInfo;
            return this;
        }
        public DescribeWuyingServerResponseBodyDataServerModelInfo getServerModelInfo() {
            return this.serverModelInfo;
        }

        public DescribeWuyingServerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWuyingServerResponseBodyData setSupportASP(Boolean supportASP) {
            this.supportASP = supportASP;
            return this;
        }
        public Boolean getSupportASP() {
            return this.supportASP;
        }

        public DescribeWuyingServerResponseBodyData setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeWuyingServerResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeWuyingServerResponseBodyData setWuyingServerId(String wuyingServerId) {
            this.wuyingServerId = wuyingServerId;
            return this;
        }
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        public DescribeWuyingServerResponseBodyData setWuyingServerName(String wuyingServerName) {
            this.wuyingServerName = wuyingServerName;
            return this;
        }
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

    }

}
