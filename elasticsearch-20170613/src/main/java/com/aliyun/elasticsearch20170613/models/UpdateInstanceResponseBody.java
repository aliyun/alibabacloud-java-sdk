// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateInstanceResponseBodyResult result;

    public static UpdateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponseBody self = new UpdateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceResponseBody setResult(UpdateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateInstanceResponseBodyResultDictList extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static UpdateInstanceResponseBodyResultDictList build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultDictList self = new UpdateInstanceResponseBodyResultDictList();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultDictList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateInstanceResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateInstanceResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateInstanceResponseBodyResultSynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static UpdateInstanceResponseBodyResultSynonymsDicts build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultSynonymsDicts self = new UpdateInstanceResponseBodyResultSynonymsDicts();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultSynonymsDicts setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateInstanceResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateInstanceResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceResponseBodyResultSynonymsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateInstanceResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static UpdateInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultNodeSpec self = new UpdateInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public UpdateInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class UpdateInstanceResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("type")
        public String type;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static UpdateInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultNetworkConfig self = new UpdateInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateInstanceResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public UpdateInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateInstanceResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class UpdateInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static UpdateInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultKibanaConfiguration self = new UpdateInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class UpdateInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        public static UpdateInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultMasterConfiguration self = new UpdateInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class UpdateInstanceResponseBodyResult extends TeaModel {
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
        public java.util.List<UpdateInstanceResponseBodyResultDictList> dictList;

        @NameInMap("synonymsDicts")
        public java.util.List<UpdateInstanceResponseBodyResultSynonymsDicts> synonymsDicts;

        @NameInMap("nodeSpec")
        public UpdateInstanceResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("networkConfig")
        public UpdateInstanceResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("kibanaConfiguration")
        public UpdateInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        public UpdateInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        public static UpdateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResult self = new UpdateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public UpdateInstanceResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public UpdateInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public UpdateInstanceResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public UpdateInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public UpdateInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public UpdateInstanceResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public UpdateInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceResponseBodyResult setDictList(java.util.List<UpdateInstanceResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<UpdateInstanceResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public UpdateInstanceResponseBodyResult setSynonymsDicts(java.util.List<UpdateInstanceResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<UpdateInstanceResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public UpdateInstanceResponseBodyResult setNodeSpec(UpdateInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public UpdateInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public UpdateInstanceResponseBodyResult setNetworkConfig(UpdateInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public UpdateInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public UpdateInstanceResponseBodyResult setKibanaConfiguration(UpdateInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public UpdateInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public UpdateInstanceResponseBodyResult setMasterConfiguration(UpdateInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public UpdateInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

    }

}
