// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the dictionary file.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the source of the dictionary file. Valid values:</p>
         * <br>
         * <p>*   OSS: Object Storage Service (OSS). You must make sure that the access control list (ACL) of the related OSS bucket is public read.</p>
         * <p>*   ORIGIN: previously uploaded dictionary.</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary. Valid values:</p>
         * <br>
         * <p>*   STOP: stopword list</p>
         * <p>*   MAIN: main dictionary</p>
         * <p>*   SYNONYMS: synonym dictionary</p>
         * <p>*   ALI_WS: Alibaba Cloud dictionary</p>
         */
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

        public MoveResourceGroupResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MoveResourceGroupResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public MoveResourceGroupResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MoveResourceGroupResponseBodyResultKibanaConfiguration extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type.</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The specification category.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static MoveResourceGroupResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultKibanaConfiguration self = new MoveResourceGroupResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
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

        public MoveResourceGroupResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class MoveResourceGroupResponseBodyResultMasterConfiguration extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type.</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The specification category.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static MoveResourceGroupResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultMasterConfiguration self = new MoveResourceGroupResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
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

        public MoveResourceGroupResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class MoveResourceGroupResponseBodyResultNetworkConfig extends TeaModel {
        /**
         * <p>The network type. Only the VPC is supported.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The zone where the cluster resides.</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static MoveResourceGroupResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultNetworkConfig self = new MoveResourceGroupResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public MoveResourceGroupResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class MoveResourceGroupResponseBodyResultNodeSpec extends TeaModel {
        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type.</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The specification category.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static MoveResourceGroupResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResultNodeSpec self = new MoveResourceGroupResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
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

        public MoveResourceGroupResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class MoveResourceGroupResponseBodyResultSynonymsDicts extends TeaModel {
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the dictionary file.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the source of the dictionary file. Valid values:</p>
         * <br>
         * <p>*   OSS: Object Storage Service (OSS). You must make sure that the ACL of the related OSS bucket is public read.</p>
         * <p>*   ORIGIN: previously uploaded dictionary.</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary. Valid values:</p>
         * <br>
         * <p>*   STOP: stopword list</p>
         * <p>*   MAIN: main dictionary</p>
         * <p>*   SYNONYMS: synonym dictionary</p>
         * <p>*   ALI_WS: Alibaba Cloud dictionary</p>
         */
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

        public MoveResourceGroupResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public MoveResourceGroupResponseBodyResultSynonymsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MoveResourceGroupResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The configurations of IK dictionaries.</p>
         */
        @NameInMap("dictList")
        public java.util.List<MoveResourceGroupResponseBodyResultDictList> dictList;

        /**
         * <p>The internal endpoint of the cluster.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The version of the cluster.</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The configurations of Kibana nodes.</p>
         */
        @NameInMap("kibanaConfiguration")
        public MoveResourceGroupResponseBodyResultKibanaConfiguration kibanaConfiguration;

        /**
         * <p>The public endpoint of the Kibana console of the cluster.</p>
         */
        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        /**
         * <p>The port number that is used to access the Kibana console of the cluster over the Internet.</p>
         */
        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        /**
         * <p>The configurations of dedicated master nodes.</p>
         */
        @NameInMap("masterConfiguration")
        public MoveResourceGroupResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The network configurations.</p>
         */
        @NameInMap("networkConfig")
        public MoveResourceGroupResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The number of data nodes in the cluster.</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The configurations of data nodes.</p>
         */
        @NameInMap("nodeSpec")
        public MoveResourceGroupResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   prepaid: subscription</p>
         * <p>*   postpaid: pay-as-you-go</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The public endpoint of the cluster.</p>
         */
        @NameInMap("publicDomain")
        public String publicDomain;

        /**
         * <p>The port number that is used to access the cluster over the Internet.</p>
         */
        @NameInMap("publicPort")
        public Integer publicPort;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   active: The cluster is normal.</p>
         * <p>*   activating: The cluster is being activated.</p>
         * <p>*   Inactive: The cluster is frozen.</p>
         * <p>*   invalid: The cluster is valid.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The configurations of synonym dictionaries.</p>
         */
        @NameInMap("synonymsDicts")
        public java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> synonymsDicts;

        /**
         * <p>The time when the cluster was last updated.</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static MoveResourceGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyResult self = new MoveResourceGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public MoveResourceGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MoveResourceGroupResponseBodyResult setDictList(java.util.List<MoveResourceGroupResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<MoveResourceGroupResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public MoveResourceGroupResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public MoveResourceGroupResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public MoveResourceGroupResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MoveResourceGroupResponseBodyResult setKibanaConfiguration(MoveResourceGroupResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public MoveResourceGroupResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public MoveResourceGroupResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public MoveResourceGroupResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public MoveResourceGroupResponseBodyResult setMasterConfiguration(MoveResourceGroupResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public MoveResourceGroupResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public MoveResourceGroupResponseBodyResult setNetworkConfig(MoveResourceGroupResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public MoveResourceGroupResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public MoveResourceGroupResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public MoveResourceGroupResponseBodyResult setNodeSpec(MoveResourceGroupResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public MoveResourceGroupResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public MoveResourceGroupResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public MoveResourceGroupResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public MoveResourceGroupResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public MoveResourceGroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MoveResourceGroupResponseBodyResult setSynonymsDicts(java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<MoveResourceGroupResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public MoveResourceGroupResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
