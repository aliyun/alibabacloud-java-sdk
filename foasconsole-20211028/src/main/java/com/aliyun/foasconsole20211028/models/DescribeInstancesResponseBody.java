// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the instance group.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of instances per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8DF2A5B-6FBA-5651-A3D4-960F3664****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
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
        /**
         * <strong>example:</strong>
         * <p>f0957e82de6e47</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CurrentStage")
        public Integer currentStage;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the project space. Valid values:</p>
         * <ul>
         * <li>CREATING: Being created.</li>
         * <li>DELETING: Being deleted.</li>
         * <li>MODIFYING: Resource specifications are being modified.</li>
         * <li>SUCCESS: The previous operation was successful.</li>
         * <li>FAILED: The previous operation failed.</li>
         * </ul>
         */
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
        /**
         * <strong>example:</strong>
         * <p>a6f35c0ff73448</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterStage")
        public DescribeInstancesResponseBodyInstancesClusterStateClusterStage clusterStage;

        @NameInMap("CreateTimeout")
        public Boolean createTimeout;

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><p>CREATING: Being created.</p>
         * </li>
         * <li><p>RUNNING: Running.</p>
         * </li>
         * <li><p>DISABLE: Invalid.</p>
         * </li>
         * <li><p>DELETING: Being deleted.</p>
         * </li>
         * <li><p>DELETED: Deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><p>CREATING: Being created.</p>
         * </li>
         * <li><p>RUNNING: Running.</p>
         * </li>
         * <li><p>DISABLE: Invalid.</p>
         * </li>
         * <li><p>DELETING: Being deleted.</p>
         * </li>
         * <li><p>DELETED: Deleted.</p>
         * </li>
         * </ul>
         */
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
        /**
         * <strong>example:</strong>
         * <p>ea2e9545fdc942</p>
         */
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

        /**
         * <p>Indicates whether zone-disaster recovery resources are selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>f0957e82de6e47</p>
         */
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
        /**
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The amount of memory used.</p>
         * 
         * <strong>example:</strong>
         * <p>280</p>
         */
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
        /**
         * <p>The number of CPUs for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size of zone-disaster recovery resources.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
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
        /**
         * <p>The number of available IP addresses in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <p>The description of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vSwitch CIDR block information.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.16.0/24</p>
         */
        @NameInMap("VSwitchCidr")
        public String vSwitchCidr;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9e9zt38b9f3l6*****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The vSwitch name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test vSwitch</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6d0akr6lzd75v****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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

        /**
         * <p>The name of the bound OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>flink-log-john</p>
         */
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
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The configured memory size.</p>
         * 
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
         * <p>The name of the bound OSS bucket.</p>
         * 
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
        /**
         * <p>Indicates whether fully managed storage is selected. Valid values:</p>
         * <ul>
         * <li>true: Used.</li>
         * <li>false: Not used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullyManaged")
        public Boolean fullyManaged;

        /**
         * <p>The order status of fully managed storage. Valid values:</p>
         * <ul>
         * <li><p>NOT_INIT: The order is placed but components are not yet deployed.</p>
         * </li>
         * <li><p>NORMAL: Normal.</p>
         * </li>
         * <li><p>CEASE: Expired.</p>
         * </li>
         * <li><p>RELEASE: Overdue.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("OrderState")
        public String orderState;

        /**
         * <p>The OSS storage information.</p>
         */
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>flink</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
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
        /**
         * <p>The number of available IP addresses in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public String availableIpAddressCount;

        /**
         * <p>The description of the vSwitch group.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vSwitch CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.16.0/24</p>
         */
        @NameInMap("VSwitchCidr")
        public String vSwitchCidr;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb6jk75wfcwnuq****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16h9ru9gvz2tygo*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
        /**
         * <p>The VPC CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.5.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The VPC description.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The VPC status. Valid values:</p>
         * <ul>
         * <li><p>Pending: Being configured.</p>
         * </li>
         * <li><p>Available: Available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-gw8c6nhjta3eq12y****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>flink集群vpc</p>
         */
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

        /**
         * <p>The processor architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c20c******404</p>
         */
        @NameInMap("AskClusterId")
        public String askClusterId;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POST: pay-as-you-go.</li>
         * <li>PRE: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The cluster state.</p>
         */
        @NameInMap("ClusterState")
        public DescribeInstancesResponseBodyInstancesClusterState clusterState;

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li>CREATING: Being created.</li>
         * <li>RUNNING: Running.</li>
         * <li>DISABLE: Invalid.</li>
         * <li>DELETING: Being deleted.</li>
         * <li>DELETED: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <p>The overall resource usage of the Flink service.</p>
         */
        @NameInMap("ClusterUsedResources")
        public DescribeInstancesResponseBodyInstancesClusterUsedResources clusterUsedResources;

        @NameInMap("ClusterUsedStorage")
        public DescribeInstancesResponseBodyInstancesClusterUsedStorage clusterUsedStorage;

        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The elastic order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-e3afbd321</p>
         */
        @NameInMap("ElasticInstanceId")
        public String elasticInstanceId;

        @NameInMap("ElasticOrderState")
        public String elasticOrderState;

        @NameInMap("ElasticResourceSpec")
        public DescribeInstancesResponseBodyInstancesElasticResourceSpec elasticResourceSpec;

        /**
         * <p>Indicates whether zone-disaster recovery resources are selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <p>The zone-disaster recovery resource description.</p>
         */
        @NameInMap("HaResourceSpec")
        public DescribeInstancesResponseBodyInstancesHaResourceSpec haResourceSpec;

        /**
         * <p>The vSwitch group in the secondary zone for zone-disaster recovery.</p>
         */
        @NameInMap("HaVSwitchIds")
        public java.util.List<String> haVSwitchIds;

        /**
         * <p>The vSwitch group information for the secondary zone of zone-disaster recovery.</p>
         */
        @NameInMap("HaVSwitchInfo")
        public java.util.List<DescribeInstancesResponseBodyInstancesHaVSwitchInfo> haVSwitchInfo;

        /**
         * <p>The secondary zone ID for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong-b</p>
         */
        @NameInMap("HaZoneId")
        public String haZoneId;

        /**
         * <p>The domain name information added by the user.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> hostAliases;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-zvp2q0z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>vvp1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the monitoring and alerting service. You can select ARMS or CloudMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>TAIHAO</p>
         */
        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <p>The order status of the Flink compute service. Valid values:</p>
         * <ul>
         * <li>NOT_INIT: The order is placed but components are not yet deployed.</li>
         * <li>NORMAL: Normal.</li>
         * <li>CEASE: Expired.</li>
         * <li>RELEASE: Overdue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("OrderState")
        public String orderState;

        @NameInMap("OssInfo")
        public DescribeInstancesResponseBodyInstancesOssInfo ossInfo;

        /**
         * <p>The region to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1629879567394</p>
         */
        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        /**
         * <p>The overdue time.</p>
         * 
         * <strong>example:</strong>
         * <p>1637337600000</p>
         */
        @NameInMap("ResourceExpiredTime")
        public Long resourceExpiredTime;

        /**
         * <p>The resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b3690a1655****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource specification information.</p>
         */
        @NameInMap("ResourceSpec")
        public DescribeInstancesResponseBodyInstancesResourceSpec resourceSpec;

        /**
         * <p>The storage information.</p>
         */
        @NameInMap("Storage")
        public DescribeInstancesResponseBodyInstancesStorage storage;

        @NameInMap("SupportDisasterRecoveryDrill")
        public Boolean supportDisasterRecoveryDrill;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> tags;

        /**
         * <p>The ID of the user to whom the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>183899668736****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The vSwitch ID group.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The information about the primary vSwitch group.</p>
         */
        @NameInMap("VSwitchInfo")
        public java.util.List<DescribeInstancesResponseBodyInstancesVSwitchInfo> vSwitchInfo;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9*******nxfmfcdi</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC information.</p>
         */
        @NameInMap("VpcInfo")
        public DescribeInstancesResponseBodyInstancesVpcInfo vpcInfo;

        /**
         * <p>The zone ID of the instance.</p>
         * 
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

        public DescribeInstancesResponseBodyInstances setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
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

        public DescribeInstancesResponseBodyInstances setSupportDisasterRecoveryDrill(Boolean supportDisasterRecoveryDrill) {
            this.supportDisasterRecoveryDrill = supportDisasterRecoveryDrill;
            return this;
        }
        public Boolean getSupportDisasterRecoveryDrill() {
            return this.supportDisasterRecoveryDrill;
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
