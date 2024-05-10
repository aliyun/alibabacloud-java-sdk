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

    public static class DescribeInstanceResponseBodyResultAliwsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

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

        public DescribeInstanceResponseBodyResultAliwsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultAliwsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultClientNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static DescribeInstanceResponseBodyResultClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultClientNodeConfiguration self = new DescribeInstanceResponseBodyResultClientNodeConfiguration();
            return TeaModel.build(map, self);
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

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultClientNodeConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class DescribeInstanceResponseBodyResultDictList extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

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

        public DescribeInstanceResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultElasticDataNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

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

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class DescribeInstanceResponseBodyResultIkHotDicts extends TeaModel {
        @NameInMap("fileSize")
        public Integer fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("type")
        public String type;

        public static DescribeInstanceResponseBodyResultIkHotDicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultIkHotDicts self = new DescribeInstanceResponseBodyResultIkHotDicts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultIkHotDicts setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public DescribeInstanceResponseBodyResultIkHotDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultIkHotDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultIkHotDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

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

        public DescribeInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultKibanaConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class DescribeInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static DescribeInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultMasterConfiguration self = new DescribeInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
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

        public DescribeInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultMasterConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList self = new DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList();
            return TeaModel.build(map, self);
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

        public DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

    public static class DescribeInstanceResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        @NameInMap("whiteIpGroupList")
        public java.util.List<DescribeInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList;

        public static DescribeInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNetworkConfig self = new DescribeInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class DescribeInstanceResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("performanceLevel")
        public String performanceLevel;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static DescribeInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultNodeSpec self = new DescribeInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
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

        public DescribeInstanceResponseBodyResultNodeSpec setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultNodeSpec setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class DescribeInstanceResponseBodyResultSynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

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

        public DescribeInstanceResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeInstanceResponseBodyResultSynonymsDicts setType(String type) {
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

    public static class DescribeInstanceResponseBodyResultWarmNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

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

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeInstanceResponseBodyResultWarmNodeConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
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

    public static class DescribeInstanceResponseBodyResult extends TeaModel {
        @NameInMap("advancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        @NameInMap("advancedSetting")
        public DescribeInstanceResponseBodyResultAdvancedSetting advancedSetting;

        @NameInMap("aliwsDicts")
        public java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> aliwsDicts;

        @NameInMap("clientNodeConfiguration")
        public DescribeInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("dedicateMaster")
        public Boolean dedicateMaster;

        @NameInMap("description")
        public String description;

        @NameInMap("dictList")
        public java.util.List<DescribeInstanceResponseBodyResultDictList> dictList;

        @NameInMap("domain")
        public String domain;

        @NameInMap("elasticDataNodeConfiguration")
        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @NameInMap("enableKibanaPrivateNetwork")
        public Boolean enableKibanaPrivateNetwork;

        @NameInMap("enableKibanaPublicNetwork")
        public Boolean enableKibanaPublicNetwork;

        @NameInMap("enablePublic")
        public Boolean enablePublic;

        @NameInMap("endtime")
        public Long endtime;

        @NameInMap("esConfig")
        public java.util.Map<String, ?> esConfig;

        @NameInMap("esIPBlacklist")
        public java.util.List<String> esIPBlacklist;

        @NameInMap("esIPWhitelist")
        public java.util.List<String> esIPWhitelist;

        @NameInMap("esVersion")
        public String esVersion;

        @NameInMap("extendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        @NameInMap("haveClientNode")
        public Boolean haveClientNode;

        @NameInMap("haveKibana")
        public Boolean haveKibana;

        @NameInMap("ikHotDicts")
        public java.util.List<DescribeInstanceResponseBodyResultIkHotDicts> ikHotDicts;

        @NameInMap("instanceCategory")
        public String instanceCategory;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("isNewDeployment")
        public Boolean isNewDeployment;

        @NameInMap("kibanaConfiguration")
        public DescribeInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        @NameInMap("masterConfiguration")
        public DescribeInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        @NameInMap("networkConfig")
        public DescribeInstanceResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("nodeSpec")
        public DescribeInstanceResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("port")
        public Integer port;

        @NameInMap("postpaidServiceStatus")
        public String postpaidServiceStatus;

        @NameInMap("privateNetworkIpWhiteList")
        public java.util.List<String> privateNetworkIpWhiteList;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("publicDomain")
        public String publicDomain;

        @NameInMap("publicIpWhitelist")
        public java.util.List<String> publicIpWhitelist;

        @NameInMap("publicPort")
        public Integer publicPort;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("serviceVpc")
        public Boolean serviceVpc;

        @NameInMap("status")
        public String status;

        @NameInMap("synonymsDicts")
        public java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> synonymsDicts;

        @NameInMap("tags")
        public java.util.List<DescribeInstanceResponseBodyResultTags> tags;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("warmNode")
        public Boolean warmNode;

        @NameInMap("warmNodeConfiguration")
        public DescribeInstanceResponseBodyResultWarmNodeConfiguration warmNodeConfiguration;

        @NameInMap("zoneCount")
        public Integer zoneCount;

        @NameInMap("zoneInfos")
        public java.util.List<DescribeInstanceResponseBodyResultZoneInfos> zoneInfos;

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

        public DescribeInstanceResponseBodyResult setAdvancedSetting(DescribeInstanceResponseBodyResultAdvancedSetting advancedSetting) {
            this.advancedSetting = advancedSetting;
            return this;
        }
        public DescribeInstanceResponseBodyResultAdvancedSetting getAdvancedSetting() {
            return this.advancedSetting;
        }

        public DescribeInstanceResponseBodyResult setAliwsDicts(java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> aliwsDicts) {
            this.aliwsDicts = aliwsDicts;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> getAliwsDicts() {
            return this.aliwsDicts;
        }

        public DescribeInstanceResponseBodyResult setClientNodeConfiguration(DescribeInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        public DescribeInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeInstanceResponseBodyResult setDedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        public DescribeInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceResponseBodyResult setDictList(java.util.List<DescribeInstanceResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public DescribeInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeInstanceResponseBodyResult setElasticDataNodeConfiguration(DescribeInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

        public DescribeInstanceResponseBodyResult setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
            this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
            return this;
        }
        public Boolean getEnableKibanaPrivateNetwork() {
            return this.enableKibanaPrivateNetwork;
        }

        public DescribeInstanceResponseBodyResult setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
            this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
            return this;
        }
        public Boolean getEnableKibanaPublicNetwork() {
            return this.enableKibanaPublicNetwork;
        }

        public DescribeInstanceResponseBodyResult setEnablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public DescribeInstanceResponseBodyResult setEndtime(Long endtime) {
            this.endtime = endtime;
            return this;
        }
        public Long getEndtime() {
            return this.endtime;
        }

        public DescribeInstanceResponseBodyResult setEsConfig(java.util.Map<String, ?> esConfig) {
            this.esConfig = esConfig;
            return this;
        }
        public java.util.Map<String, ?> getEsConfig() {
            return this.esConfig;
        }

        public DescribeInstanceResponseBodyResult setEsIPBlacklist(java.util.List<String> esIPBlacklist) {
            this.esIPBlacklist = esIPBlacklist;
            return this;
        }
        public java.util.List<String> getEsIPBlacklist() {
            return this.esIPBlacklist;
        }

        public DescribeInstanceResponseBodyResult setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }
        public java.util.List<String> getEsIPWhitelist() {
            return this.esIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public DescribeInstanceResponseBodyResult setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        public DescribeInstanceResponseBodyResult setHaveClientNode(Boolean haveClientNode) {
            this.haveClientNode = haveClientNode;
            return this;
        }
        public Boolean getHaveClientNode() {
            return this.haveClientNode;
        }

        public DescribeInstanceResponseBodyResult setHaveKibana(Boolean haveKibana) {
            this.haveKibana = haveKibana;
            return this;
        }
        public Boolean getHaveKibana() {
            return this.haveKibana;
        }

        public DescribeInstanceResponseBodyResult setIkHotDicts(java.util.List<DescribeInstanceResponseBodyResultIkHotDicts> ikHotDicts) {
            this.ikHotDicts = ikHotDicts;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultIkHotDicts> getIkHotDicts() {
            return this.ikHotDicts;
        }

        public DescribeInstanceResponseBodyResult setInstanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        public DescribeInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResponseBodyResult setIsNewDeployment(Boolean isNewDeployment) {
            this.isNewDeployment = isNewDeployment;
            return this;
        }
        public Boolean getIsNewDeployment() {
            return this.isNewDeployment;
        }

        public DescribeInstanceResponseBodyResult setKibanaConfiguration(DescribeInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public DescribeInstanceResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public DescribeInstanceResponseBodyResult setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public DescribeInstanceResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setMasterConfiguration(DescribeInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public DescribeInstanceResponseBodyResult setNetworkConfig(DescribeInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public DescribeInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public DescribeInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public DescribeInstanceResponseBodyResult setNodeSpec(DescribeInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public DescribeInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public DescribeInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeInstanceResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeInstanceResponseBodyResult setPostpaidServiceStatus(String postpaidServiceStatus) {
            this.postpaidServiceStatus = postpaidServiceStatus;
            return this;
        }
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        public DescribeInstanceResponseBodyResult setPrivateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        public DescribeInstanceResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInstanceResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public DescribeInstanceResponseBodyResult setPublicIpWhitelist(java.util.List<String> publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }
        public java.util.List<String> getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        public DescribeInstanceResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public DescribeInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceResponseBodyResult setServiceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        public DescribeInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyResult setSynonymsDicts(java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public DescribeInstanceResponseBodyResult setTags(java.util.List<DescribeInstanceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeInstanceResponseBodyResult setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeInstanceResponseBodyResult setWarmNode(Boolean warmNode) {
            this.warmNode = warmNode;
            return this;
        }
        public Boolean getWarmNode() {
            return this.warmNode;
        }

        public DescribeInstanceResponseBodyResult setWarmNodeConfiguration(DescribeInstanceResponseBodyResultWarmNodeConfiguration warmNodeConfiguration) {
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }
        public DescribeInstanceResponseBodyResultWarmNodeConfiguration getWarmNodeConfiguration() {
            return this.warmNodeConfiguration;
        }

        public DescribeInstanceResponseBodyResult setZoneCount(Integer zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Integer getZoneCount() {
            return this.zoneCount;
        }

        public DescribeInstanceResponseBodyResult setZoneInfos(java.util.List<DescribeInstanceResponseBodyResultZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

    }

}
