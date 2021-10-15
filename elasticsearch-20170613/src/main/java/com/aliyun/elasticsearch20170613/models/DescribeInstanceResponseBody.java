// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeInstanceResponseBodyResult result;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setResult(DescribeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeInstanceResponseBodyResultDictList extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static DescribeInstanceResponseBodyResultDictList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultDictList self = new DescribeInstanceResponseBodyResultDictList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultDictList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeInstanceResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultSynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static DescribeInstanceResponseBodyResultSynonymsDicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultSynonymsDicts self = new DescribeInstanceResponseBodyResultSynonymsDicts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultZoneInfos extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeInstanceResponseBodyResultZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultZoneInfos self = new DescribeInstanceResponseBodyResultZoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultZoneInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyResultZoneInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstanceResponseBodyResultAliwsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static DescribeInstanceResponseBodyResultAliwsDicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultAliwsDicts self = new DescribeInstanceResponseBodyResultAliwsDicts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultTags extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static DescribeInstanceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultTags self = new DescribeInstanceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInstanceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInstanceResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        public static DescribeInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNodeSpec self = new DescribeInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultNodeSpec setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList extends TeaModel {
        @NameInMap("whiteIpType")
        public String whiteIpType;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList self = new DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

        public DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class DescribeInstanceResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("type")
        public String type;

        @NameInMap("vswitchId")
        public String vswitchId;

        @NameInMap("whiteIpGroupList")
        public java.util.List<DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList;

        public static DescribeInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNetworkConfig self = new DescribeInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setWhiteIpGroupList(java.util.List<DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

    }

    public static class DescribeInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("spec")
        public String spec;

        public static DescribeInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultKibanaConfiguration self = new DescribeInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static DescribeInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultMasterConfiguration self = new DescribeInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeInstanceResponseBodyResultClientNodeConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static DescribeInstanceResponseBodyResultClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultClientNodeConfiguration self = new DescribeInstanceResponseBodyResultClientNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeInstanceResponseBodyResultWarmNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("spec")
        public String spec;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        public static DescribeInstanceResponseBodyResultWarmNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultWarmNodeConfiguration self = new DescribeInstanceResponseBodyResultWarmNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeInstanceResponseBodyResultAdvancedSetting extends TeaModel {
        @NameInMap("gcName")
        public String gcName;

        public static DescribeInstanceResponseBodyResultAdvancedSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultAdvancedSetting self = new DescribeInstanceResponseBodyResultAdvancedSetting();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultAdvancedSetting setGcName(String gcName) {
            this.gcName = gcName;
            return this;
        }
        public String getGcName() {
            return this.gcName;
        }

    }

    public static class DescribeInstanceResponseBodyResultElasticDataNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("spec")
        public String spec;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        public static DescribeInstanceResponseBodyResultElasticDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultElasticDataNodeConfiguration self = new DescribeInstanceResponseBodyResultElasticDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeInstanceResponseBodyResult extends TeaModel {
        @NameInMap("advancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("enableKibanaPublicNetwork")
        public Boolean enableKibanaPublicNetwork;

        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("enableKibanaPrivateNetwork")
        public Boolean enableKibanaPrivateNetwork;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("port")
        public Integer port;

        @NameInMap("enablePublic")
        public Boolean enablePublic;

        @NameInMap("dedicateMaster")
        public Boolean dedicateMaster;

        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        @NameInMap("esConfig")
        public java.util.Map<String, ?> esConfig;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("postpaidServiceStatus")
        public String postpaidServiceStatus;

        @NameInMap("esVersion")
        public String esVersion;

        @NameInMap("haveKibana")
        public Boolean haveKibana;

        @NameInMap("isNewDeployment")
        public Boolean isNewDeployment;

        @NameInMap("warmNode")
        public Boolean warmNode;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("zoneCount")
        public Integer zoneCount;

        @NameInMap("publicDomain")
        public String publicDomain;

        @NameInMap("status")
        public String status;

        @NameInMap("serviceVpc")
        public Boolean serviceVpc;

        @NameInMap("publicPort")
        public Integer publicPort;

        @NameInMap("haveClientNode")
        public Boolean haveClientNode;

        @NameInMap("domain")
        public String domain;

        @NameInMap("description")
        public String description;

        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        @NameInMap("dictList")
        public java.util.List<DescribeInstanceResponseBodyResultDictList> dictList;

        @NameInMap("synonymsDicts")
        public java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> synonymsDicts;

        @NameInMap("zoneInfos")
        public java.util.List<DescribeInstanceResponseBodyResultZoneInfos> zoneInfos;

        @NameInMap("aliwsDicts")
        public java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> aliwsDicts;

        @NameInMap("tags")
        public java.util.List<DescribeInstanceResponseBodyResultTags> tags;

        @NameInMap("esIPWhitelist")
        public java.util.List<String> esIPWhitelist;

        @NameInMap("extendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        @NameInMap("privateNetworkIpWhiteList")
        public java.util.List<String> privateNetworkIpWhiteList;

        @NameInMap("publicIpWhitelist")
        public java.util.List<String> publicIpWhitelist;

        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        @NameInMap("esIPBlacklist")
        public java.util.List<String> esIPBlacklist;

        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        @NameInMap("nodeSpec")
        public DescribeInstanceResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("networkConfig")
        public DescribeInstanceResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("kibanaConfiguration")
        public DescribeInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        public DescribeInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        @NameInMap("clientNodeConfiguration")
        public DescribeInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration;

        @NameInMap("warmNodeConfiguration")
        public DescribeInstanceResponseBodyResultWarmNodeConfiguration warmNodeConfiguration;

        @NameInMap("advancedSetting")
        public DescribeInstanceResponseBodyResultAdvancedSetting advancedSetting;

        @NameInMap("elasticDataNodeConfiguration")
        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration;

        public static DescribeInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResult self = new DescribeInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResult setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        public DescribeInstanceResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInstanceResponseBodyResult setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
            this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
            return this;
        }
        public Boolean getEnableKibanaPublicNetwork() {
            return this.enableKibanaPublicNetwork;
        }

        public DescribeInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public DescribeInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeInstanceResponseBodyResult setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
            this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
            return this;
        }
        public Boolean getEnableKibanaPrivateNetwork() {
            return this.enableKibanaPrivateNetwork;
        }

        public DescribeInstanceResponseBodyResult setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeInstanceResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeInstanceResponseBodyResult setEnablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public DescribeInstanceResponseBodyResult setDedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        public DescribeInstanceResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public DescribeInstanceResponseBodyResult setEsConfig(java.util.Map<String, ?> esConfig) {
            this.esConfig = esConfig;
            return this;
        }
        public java.util.Map<String, ?> getEsConfig() {
            return this.esConfig;
        }

        public DescribeInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeInstanceResponseBodyResult setPostpaidServiceStatus(String postpaidServiceStatus) {
            this.postpaidServiceStatus = postpaidServiceStatus;
            return this;
        }
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        public DescribeInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public DescribeInstanceResponseBodyResult setHaveKibana(Boolean haveKibana) {
            this.haveKibana = haveKibana;
            return this;
        }
        public Boolean getHaveKibana() {
            return this.haveKibana;
        }

        public DescribeInstanceResponseBodyResult setIsNewDeployment(Boolean isNewDeployment) {
            this.isNewDeployment = isNewDeployment;
            return this;
        }
        public Boolean getIsNewDeployment() {
            return this.isNewDeployment;
        }

        public DescribeInstanceResponseBodyResult setWarmNode(Boolean warmNode) {
            this.warmNode = warmNode;
            return this;
        }
        public Boolean getWarmNode() {
            return this.warmNode;
        }

        public DescribeInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResponseBodyResult setZoneCount(Integer zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Integer getZoneCount() {
            return this.zoneCount;
        }

        public DescribeInstanceResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public DescribeInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyResult setServiceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        public DescribeInstanceResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public DescribeInstanceResponseBodyResult setHaveClientNode(Boolean haveClientNode) {
            this.haveClientNode = haveClientNode;
            return this;
        }
        public Boolean getHaveClientNode() {
            return this.haveClientNode;
        }

        public DescribeInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public DescribeInstanceResponseBodyResult setDictList(java.util.List<DescribeInstanceResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public DescribeInstanceResponseBodyResult setSynonymsDicts(java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public DescribeInstanceResponseBodyResult setZoneInfos(java.util.List<DescribeInstanceResponseBodyResultZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        public DescribeInstanceResponseBodyResult setAliwsDicts(java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> aliwsDicts) {
            this.aliwsDicts = aliwsDicts;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> getAliwsDicts() {
            return this.aliwsDicts;
        }

        public DescribeInstanceResponseBodyResult setTags(java.util.List<DescribeInstanceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeInstanceResponseBodyResult setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }
        public java.util.List<String> getEsIPWhitelist() {
            return this.esIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        public DescribeInstanceResponseBodyResult setPrivateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        public DescribeInstanceResponseBodyResult setPublicIpWhitelist(java.util.List<String> publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }
        public java.util.List<String> getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        public DescribeInstanceResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setEsIPBlacklist(java.util.List<String> esIPBlacklist) {
            this.esIPBlacklist = esIPBlacklist;
            return this;
        }
        public java.util.List<String> getEsIPBlacklist() {
            return this.esIPBlacklist;
        }

        public DescribeInstanceResponseBodyResult setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setNodeSpec(DescribeInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public DescribeInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public DescribeInstanceResponseBodyResult setNetworkConfig(DescribeInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public DescribeInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public DescribeInstanceResponseBodyResult setKibanaConfiguration(DescribeInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public DescribeInstanceResponseBodyResult setMasterConfiguration(DescribeInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public DescribeInstanceResponseBodyResult setClientNodeConfiguration(DescribeInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        public DescribeInstanceResponseBodyResult setWarmNodeConfiguration(DescribeInstanceResponseBodyResultWarmNodeConfiguration warmNodeConfiguration) {
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultWarmNodeConfiguration getWarmNodeConfiguration() {
            return this.warmNodeConfiguration;
        }

        public DescribeInstanceResponseBodyResult setAdvancedSetting(DescribeInstanceResponseBodyResultAdvancedSetting advancedSetting) {
            this.advancedSetting = advancedSetting;
            return this;
        }
        public DescribeInstanceResponseBodyResultAdvancedSetting getAdvancedSetting() {
            return this.advancedSetting;
        }

        public DescribeInstanceResponseBodyResult setElasticDataNodeConfiguration(DescribeInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

    }

}
