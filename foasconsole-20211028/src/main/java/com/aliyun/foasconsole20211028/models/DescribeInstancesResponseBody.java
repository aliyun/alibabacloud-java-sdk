// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>C8DF2A5B-6FBA-5651-A3D4-960F36640E6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight extends TeaModel {
        @NameInMap("StepIndex")
        public Integer stepIndex;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight self = new DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight setStepIndex(Integer stepIndex) {
            this.stepIndex = stepIndex;
            return this;
        }
        public Integer getStepIndex() {
            return this.stepIndex;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterStateClusterStage extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CurrentStage")
        public Integer currentStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalStageWithWeight")
        public java.util.List<DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight> totalStageWithWeight;

        public static DescribeInstancesResponseBodyInstancesClusterStateClusterStage build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterStateClusterStage self = new DescribeInstancesResponseBodyInstancesClusterStateClusterStage();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage setCurrentStage(Integer currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public Integer getCurrentStage() {
            return this.currentStage;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage setTotalStageWithWeight(java.util.List<DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight> totalStageWithWeight) {
            this.totalStageWithWeight = totalStageWithWeight;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesClusterStateClusterStageTotalStageWithWeight> getTotalStageWithWeight() {
            return this.totalStageWithWeight;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners extends TeaModel {
        @NameInMap("ListenersStatus")
        public String listenersStatus;

        @NameInMap("Port")
        public String port;

        public static DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners self = new DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners setListenersStatus(String listenersStatus) {
            this.listenersStatus = listenersStatus;
            return this;
        }
        public String getListenersStatus() {
            return this.listenersStatus;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto extends TeaModel {
        @NameInMap("ExistSlb")
        public Boolean existSlb;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbStatus")
        public String slbStatus;

        @NameInMap("UserSlbListeners")
        public java.util.List<DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners> userSlbListeners;

        public static DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto self = new DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto setExistSlb(Boolean existSlb) {
            this.existSlb = existSlb;
            return this;
        }
        public Boolean getExistSlb() {
            return this.existSlb;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto setSlbStatus(String slbStatus) {
            this.slbStatus = slbStatus;
            return this;
        }
        public String getSlbStatus() {
            return this.slbStatus;
        }

        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto setUserSlbListeners(java.util.List<DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners> userSlbListeners) {
            this.userSlbListeners = userSlbListeners;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesClusterStateUserSlbDtoUserSlbListeners> getUserSlbListeners() {
            return this.userSlbListeners;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterState extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterStage")
        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage clusterStage;

        @NameInMap("CreateTimeout")
        public Boolean createTimeout;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubStatus")
        public String subStatus;

        @NameInMap("Url")
        public String url;

        @NameInMap("UserSlbDto")
        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto userSlbDto;

        @NameInMap("VpcCidr")
        public String vpcCidr;

        public static DescribeInstancesResponseBodyInstancesClusterState build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterState self = new DescribeInstancesResponseBodyInstancesClusterState();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterState setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setClusterStage(DescribeInstancesResponseBodyInstancesClusterStateClusterStage clusterStage) {
            this.clusterStage = clusterStage;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage getClusterStage() {
            return this.clusterStage;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setCreateTimeout(Boolean createTimeout) {
            this.createTimeout = createTimeout;
            return this;
        }
        public Boolean getCreateTimeout() {
            return this.createTimeout;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setUserSlbDto(DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto userSlbDto) {
            this.userSlbDto = userSlbDto;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesClusterStateUserSlbDto getUserSlbDto() {
            return this.userSlbDto;
        }

        public DescribeInstancesResponseBodyInstancesClusterState setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterUsedResources extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ElasticUsedCpu")
        public Float elasticUsedCpu;

        @NameInMap("ElasticUsedMemory")
        public Float elasticUsedMemory;

        @NameInMap("ElasticUsedResource")
        public Float elasticUsedResource;

        @NameInMap("GuaranteedUsedCpu")
        public Float guaranteedUsedCpu;

        @NameInMap("GuaranteedUsedMemory")
        public Float guaranteedUsedMemory;

        @NameInMap("GuaranteedUsedResource")
        public Float guaranteedUsedResource;

        @NameInMap("Ha")
        public Boolean ha;

        @NameInMap("HaUsedCpu")
        public Float haUsedCpu;

        @NameInMap("HaUsedMemory")
        public Float haUsedMemory;

        @NameInMap("HaUsedResource")
        public Float haUsedResource;

        @NameInMap("UsedCpu")
        public Float usedCpu;

        @NameInMap("UsedMemory")
        public Float usedMemory;

        @NameInMap("UsedResource")
        public Float usedResource;

        public static DescribeInstancesResponseBodyInstancesClusterUsedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterUsedResources self = new DescribeInstancesResponseBodyInstancesClusterUsedResources();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setElasticUsedCpu(Float elasticUsedCpu) {
            this.elasticUsedCpu = elasticUsedCpu;
            return this;
        }
        public Float getElasticUsedCpu() {
            return this.elasticUsedCpu;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setElasticUsedMemory(Float elasticUsedMemory) {
            this.elasticUsedMemory = elasticUsedMemory;
            return this;
        }
        public Float getElasticUsedMemory() {
            return this.elasticUsedMemory;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setElasticUsedResource(Float elasticUsedResource) {
            this.elasticUsedResource = elasticUsedResource;
            return this;
        }
        public Float getElasticUsedResource() {
            return this.elasticUsedResource;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setGuaranteedUsedCpu(Float guaranteedUsedCpu) {
            this.guaranteedUsedCpu = guaranteedUsedCpu;
            return this;
        }
        public Float getGuaranteedUsedCpu() {
            return this.guaranteedUsedCpu;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setGuaranteedUsedMemory(Float guaranteedUsedMemory) {
            this.guaranteedUsedMemory = guaranteedUsedMemory;
            return this;
        }
        public Float getGuaranteedUsedMemory() {
            return this.guaranteedUsedMemory;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setGuaranteedUsedResource(Float guaranteedUsedResource) {
            this.guaranteedUsedResource = guaranteedUsedResource;
            return this;
        }
        public Float getGuaranteedUsedResource() {
            return this.guaranteedUsedResource;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setHaUsedCpu(Float haUsedCpu) {
            this.haUsedCpu = haUsedCpu;
            return this;
        }
        public Float getHaUsedCpu() {
            return this.haUsedCpu;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setHaUsedMemory(Float haUsedMemory) {
            this.haUsedMemory = haUsedMemory;
            return this;
        }
        public Float getHaUsedMemory() {
            return this.haUsedMemory;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setHaUsedResource(Float haUsedResource) {
            this.haUsedResource = haUsedResource;
            return this;
        }
        public Float getHaUsedResource() {
            return this.haUsedResource;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedResources setUsedResource(Float usedResource) {
            this.usedResource = usedResource;
            return this;
        }
        public Float getUsedResource() {
            return this.usedResource;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesClusterUsedStorage extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("UsedStorage")
        public Float usedStorage;

        public static DescribeInstancesResponseBodyInstancesClusterUsedStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesClusterUsedStorage self = new DescribeInstancesResponseBodyInstancesClusterUsedStorage();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedStorage setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesClusterUsedStorage setUsedStorage(Float usedStorage) {
            this.usedStorage = usedStorage;
            return this;
        }
        public Float getUsedStorage() {
            return this.usedStorage;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesElasticResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static DescribeInstancesResponseBodyInstancesElasticResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesElasticResourceSpec self = new DescribeInstancesResponseBodyInstancesElasticResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesElasticResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesElasticResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static DescribeInstancesResponseBodyInstancesHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesHaResourceSpec self = new DescribeInstancesResponseBodyInstancesHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesHaVSwitchInfo extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchCidr")
        public String vSwitchCidr;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesHaVSwitchInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesHaVSwitchInfo self = new DescribeInstancesResponseBodyInstancesHaVSwitchInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setVSwitchCidr(String vSwitchCidr) {
            this.vSwitchCidr = vSwitchCidr;
            return this;
        }
        public String getVSwitchCidr() {
            return this.vSwitchCidr;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesHaVSwitchInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesHostAliases extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeInstancesResponseBodyInstancesHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesHostAliases self = new DescribeInstancesResponseBodyInstancesHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesHostAliases setHostNames(java.util.List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public java.util.List<String> getHostNames() {
            return this.hostNames;
        }

        public DescribeInstancesResponseBodyInstancesHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesOssInfo extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("BucketVersioningStatus")
        public String bucketVersioningStatus;

        @NameInMap("Endpoint")
        public String endpoint;

        public static DescribeInstancesResponseBodyInstancesOssInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesOssInfo self = new DescribeInstancesResponseBodyInstancesOssInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesOssInfo setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeInstancesResponseBodyInstancesOssInfo setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeInstancesResponseBodyInstancesOssInfo setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeInstancesResponseBodyInstancesOssInfo setBucketVersioningStatus(String bucketVersioningStatus) {
            this.bucketVersioningStatus = bucketVersioningStatus;
            return this;
        }
        public String getBucketVersioningStatus() {
            return this.bucketVersioningStatus;
        }

        public DescribeInstancesResponseBodyInstancesOssInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static DescribeInstancesResponseBodyInstancesResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceSpec self = new DescribeInstancesResponseBodyInstancesResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesStorageOss extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss_flink</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        public static DescribeInstancesResponseBodyInstancesStorageOss build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesStorageOss self = new DescribeInstancesResponseBodyInstancesStorageOss();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesStorage extends TeaModel {
        @NameInMap("FullyManaged")
        public Boolean fullyManaged;

        @NameInMap("OrderState")
        public String orderState;

        @NameInMap("Oss")
        public DescribeInstancesResponseBodyInstancesStorageOss oss;

        @NameInMap("SupportCreateFullyManagedStorage")
        public Boolean supportCreateFullyManagedStorage;

        @NameInMap("SupportMigrationProgressDetection")
        public Boolean supportMigrationProgressDetection;

        public static DescribeInstancesResponseBodyInstancesStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesStorage self = new DescribeInstancesResponseBodyInstancesStorage();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesStorage setFullyManaged(Boolean fullyManaged) {
            this.fullyManaged = fullyManaged;
            return this;
        }
        public Boolean getFullyManaged() {
            return this.fullyManaged;
        }

        public DescribeInstancesResponseBodyInstancesStorage setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

        public DescribeInstancesResponseBodyInstancesStorage setOss(DescribeInstancesResponseBodyInstancesStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesStorageOss getOss() {
            return this.oss;
        }

        public DescribeInstancesResponseBodyInstancesStorage setSupportCreateFullyManagedStorage(Boolean supportCreateFullyManagedStorage) {
            this.supportCreateFullyManagedStorage = supportCreateFullyManagedStorage;
            return this;
        }
        public Boolean getSupportCreateFullyManagedStorage() {
            return this.supportCreateFullyManagedStorage;
        }

        public DescribeInstancesResponseBodyInstancesStorage setSupportMigrationProgressDetection(Boolean supportMigrationProgressDetection) {
            this.supportMigrationProgressDetection = supportMigrationProgressDetection;
            return this;
        }
        public Boolean getSupportMigrationProgressDetection() {
            return this.supportMigrationProgressDetection;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>flink</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesTags self = new DescribeInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesVSwitchInfo extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        public String availableIpAddressCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchCidr")
        public String vSwitchCidr;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesVSwitchInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesVSwitchInfo self = new DescribeInstancesResponseBodyInstancesVSwitchInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setAvailableIpAddressCount(String availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public String getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setVSwitchCidr(String vSwitchCidr) {
            this.vSwitchCidr = vSwitchCidr;
            return this;
        }
        public String getVSwitchCidr() {
            return this.vSwitchCidr;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesVSwitchInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesVpcInfo extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeInstancesResponseBodyInstancesVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesVpcInfo self = new DescribeInstancesResponseBodyInstancesVpcInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesVpcInfo setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Ansm")
        public Boolean ansm;

        @NameInMap("ArchitectureType")
        public String architectureType;

        @NameInMap("AskClusterId")
        public String askClusterId;

        /**
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterState")
        public DescribeInstancesResponseBodyInstancesClusterState clusterState;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("ClusterUsedResources")
        public DescribeInstancesResponseBodyInstancesClusterUsedResources clusterUsedResources;

        @NameInMap("ClusterUsedStorage")
        public DescribeInstancesResponseBodyInstancesClusterUsedStorage clusterUsedStorage;

        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <strong>example:</strong>
         * <p>f-cn-e3afbd321</p>
         */
        @NameInMap("ElasticInstanceId")
        public String elasticInstanceId;

        @NameInMap("ElasticOrderState")
        public String elasticOrderState;

        @NameInMap("ElasticResourceSpec")
        public DescribeInstancesResponseBodyInstancesElasticResourceSpec elasticResourceSpec;

        @NameInMap("Ha")
        public Boolean ha;

        @NameInMap("HaResourceSpec")
        public DescribeInstancesResponseBodyInstancesHaResourceSpec haResourceSpec;

        @NameInMap("HaVSwitchIds")
        public java.util.List<String> haVSwitchIds;

        @NameInMap("HaVSwitchInfo")
        public java.util.List<DescribeInstancesResponseBodyInstancesHaVSwitchInfo> haVSwitchInfo;

        @NameInMap("HaZoneId")
        public String haZoneId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> hostAliases;

        /**
         * <strong>example:</strong>
         * <p>f-cn-zvp2q0zik06</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>vvp1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("OrderState")
        public String orderState;

        @NameInMap("OssInfo")
        public DescribeInstancesResponseBodyInstancesOssInfo ossInfo;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1629879567394</p>
         */
        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        /**
         * <strong>example:</strong>
         * <p>1637337600000</p>
         */
        @NameInMap("ResourceExpiredTime")
        public Long resourceExpiredTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>b3690a1655da47</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceSpec")
        public DescribeInstancesResponseBodyInstancesResourceSpec resourceSpec;

        @NameInMap("Storage")
        public DescribeInstancesResponseBodyInstancesStorage storage;

        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>1838996687368452</p>
         */
        @NameInMap("Uid")
        public String uid;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VSwitchInfo")
        public java.util.List<DescribeInstancesResponseBodyInstancesVSwitchInfo> vSwitchInfo;

        /**
         * <strong>example:</strong>
         * <p>vpc-2ze9*******nxfmfcdi</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInfo")
        public DescribeInstancesResponseBodyInstancesVpcInfo vpcInfo;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setAnsm(Boolean ansm) {
            this.ansm = ansm;
            return this;
        }
        public Boolean getAnsm() {
            return this.ansm;
        }

        public DescribeInstancesResponseBodyInstances setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstancesResponseBodyInstances setAskClusterId(String askClusterId) {
            this.askClusterId = askClusterId;
            return this;
        }
        public String getAskClusterId() {
            return this.askClusterId;
        }

        public DescribeInstancesResponseBodyInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstancesResponseBodyInstances setClusterState(DescribeInstancesResponseBodyInstancesClusterState clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesClusterState getClusterState() {
            return this.clusterState;
        }

        public DescribeInstancesResponseBodyInstances setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public DescribeInstancesResponseBodyInstances setClusterUsedResources(DescribeInstancesResponseBodyInstancesClusterUsedResources clusterUsedResources) {
            this.clusterUsedResources = clusterUsedResources;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesClusterUsedResources getClusterUsedResources() {
            return this.clusterUsedResources;
        }

        public DescribeInstancesResponseBodyInstances setClusterUsedStorage(DescribeInstancesResponseBodyInstancesClusterUsedStorage clusterUsedStorage) {
            this.clusterUsedStorage = clusterUsedStorage;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesClusterUsedStorage getClusterUsedStorage() {
            return this.clusterUsedStorage;
        }

        public DescribeInstancesResponseBodyInstances setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public DescribeInstancesResponseBodyInstances setElasticInstanceId(String elasticInstanceId) {
            this.elasticInstanceId = elasticInstanceId;
            return this;
        }
        public String getElasticInstanceId() {
            return this.elasticInstanceId;
        }

        public DescribeInstancesResponseBodyInstances setElasticOrderState(String elasticOrderState) {
            this.elasticOrderState = elasticOrderState;
            return this;
        }
        public String getElasticOrderState() {
            return this.elasticOrderState;
        }

        public DescribeInstancesResponseBodyInstances setElasticResourceSpec(DescribeInstancesResponseBodyInstancesElasticResourceSpec elasticResourceSpec) {
            this.elasticResourceSpec = elasticResourceSpec;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesElasticResourceSpec getElasticResourceSpec() {
            return this.elasticResourceSpec;
        }

        public DescribeInstancesResponseBodyInstances setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public DescribeInstancesResponseBodyInstances setHaResourceSpec(DescribeInstancesResponseBodyInstancesHaResourceSpec haResourceSpec) {
            this.haResourceSpec = haResourceSpec;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesHaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        public DescribeInstancesResponseBodyInstances setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }
        public java.util.List<String> getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        public DescribeInstancesResponseBodyInstances setHaVSwitchInfo(java.util.List<DescribeInstancesResponseBodyInstancesHaVSwitchInfo> haVSwitchInfo) {
            this.haVSwitchInfo = haVSwitchInfo;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesHaVSwitchInfo> getHaVSwitchInfo() {
            return this.haVSwitchInfo;
        }

        public DescribeInstancesResponseBodyInstances setHaZoneId(String haZoneId) {
            this.haZoneId = haZoneId;
            return this;
        }
        public String getHaZoneId() {
            return this.haZoneId;
        }

        public DescribeInstancesResponseBodyInstances setHostAliases(java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstances setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public DescribeInstancesResponseBodyInstances setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

        public DescribeInstancesResponseBodyInstances setOssInfo(DescribeInstancesResponseBodyInstancesOssInfo ossInfo) {
            this.ossInfo = ossInfo;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesOssInfo getOssInfo() {
            return this.ossInfo;
        }

        public DescribeInstancesResponseBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstancesResponseBodyInstances setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public DescribeInstancesResponseBodyInstances setResourceExpiredTime(Long resourceExpiredTime) {
            this.resourceExpiredTime = resourceExpiredTime;
            return this;
        }
        public Long getResourceExpiredTime() {
            return this.resourceExpiredTime;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeInstancesResponseBodyInstances setResourceSpec(DescribeInstancesResponseBodyInstancesResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeInstancesResponseBodyInstances setStorage(DescribeInstancesResponseBodyInstancesStorage storage) {
            this.storage = storage;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesStorage getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstances setTags(java.util.List<DescribeInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstances setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeInstancesResponseBodyInstances setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeInstancesResponseBodyInstances setVSwitchInfo(java.util.List<DescribeInstancesResponseBodyInstancesVSwitchInfo> vSwitchInfo) {
            this.vSwitchInfo = vSwitchInfo;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesVSwitchInfo> getVSwitchInfo() {
            return this.vSwitchInfo;
        }

        public DescribeInstancesResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstances setVpcInfo(DescribeInstancesResponseBodyInstancesVpcInfo vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesVpcInfo getVpcInfo() {
            return this.vpcInfo;
        }

        public DescribeInstancesResponseBodyInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
