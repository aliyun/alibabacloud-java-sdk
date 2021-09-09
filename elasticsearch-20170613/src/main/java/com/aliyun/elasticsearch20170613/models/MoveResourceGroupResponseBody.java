// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public MoveResourceGroupResponseBodyResult result;

    public static MoveResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupResponseBody self = new MoveResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveResourceGroupResponseBody setResult(MoveResourceGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MoveResourceGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class MoveResourceGroupResponseBodyResultDictList extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static MoveResourceGroupResponseBodyResultDictList build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultDictList self = new MoveResourceGroupResponseBodyResultDictList();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultDictList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public MoveResourceGroupResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public MoveResourceGroupResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MoveResourceGroupResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MoveResourceGroupResponseBodyResultSynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static MoveResourceGroupResponseBodyResultSynonymsDicts build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultSynonymsDicts self = new MoveResourceGroupResponseBodyResultSynonymsDicts();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MoveResourceGroupResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static MoveResourceGroupResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultNodeSpec self = new MoveResourceGroupResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public MoveResourceGroupResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public MoveResourceGroupResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class MoveResourceGroupResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("type")
        public String type;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static MoveResourceGroupResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultNetworkConfig self = new MoveResourceGroupResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public MoveResourceGroupResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public MoveResourceGroupResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MoveResourceGroupResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class MoveResourceGroupResponseBodyResultKibanaConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static MoveResourceGroupResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultKibanaConfiguration self = new MoveResourceGroupResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public MoveResourceGroupResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public MoveResourceGroupResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public MoveResourceGroupResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class MoveResourceGroupResponseBodyResultMasterConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static MoveResourceGroupResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultMasterConfiguration self = new MoveResourceGroupResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public MoveResourceGroupResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public MoveResourceGroupResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public MoveResourceGroupResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class MoveResourceGroupResponseBodyResult extends TeaModel {
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("publicDomain")
        public String publicDomain;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("status")
        public String status;

        @NameInMap("publicPort")
        public Integer publicPort;

        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("domain")
        public String domain;

        @NameInMap("description")
        public String description;

        @NameInMap("esVersion")
        public String esVersion;

        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("dictList")
        public java.util.List<MoveResourceGroupResponseBodyResultDictList> dictList;

        @NameInMap("synonymsDicts")
        public java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> synonymsDicts;

        @NameInMap("nodeSpec")
        public MoveResourceGroupResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("networkConfig")
        public MoveResourceGroupResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("kibanaConfiguration")
        public MoveResourceGroupResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        public MoveResourceGroupResponseBodyResultMasterConfiguration masterConfiguration;

        public static MoveResourceGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResult self = new MoveResourceGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public MoveResourceGroupResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public MoveResourceGroupResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public MoveResourceGroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MoveResourceGroupResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public MoveResourceGroupResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public MoveResourceGroupResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public MoveResourceGroupResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public MoveResourceGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MoveResourceGroupResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public MoveResourceGroupResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public MoveResourceGroupResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public MoveResourceGroupResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MoveResourceGroupResponseBodyResult setDictList(java.util.List<MoveResourceGroupResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<MoveResourceGroupResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public MoveResourceGroupResponseBodyResult setSynonymsDicts(java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public MoveResourceGroupResponseBodyResult setNodeSpec(MoveResourceGroupResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public MoveResourceGroupResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public MoveResourceGroupResponseBodyResult setNetworkConfig(MoveResourceGroupResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public MoveResourceGroupResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public MoveResourceGroupResponseBodyResult setKibanaConfiguration(MoveResourceGroupResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public MoveResourceGroupResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public MoveResourceGroupResponseBodyResult setMasterConfiguration(MoveResourceGroupResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public MoveResourceGroupResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

    }

}
