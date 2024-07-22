// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public RestartInstanceResponseBodyResult result;

    public static RestartInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceResponseBody self = new RestartInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartInstanceResponseBody setResult(RestartInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RestartInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class RestartInstanceResponseBodyResultDictList extends TeaModel {
        /**
         * <p>The size of the Dictionary File. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2782602</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the dictionary file.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_MAIN.dic</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS open storage (need to ensure that OSS storage space is public readable.)</li>
         * <li>ORIGIN: Open source Elasticsearch</li>
         * <li>UPLOAD: Uploaded files</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary. Valid values:</p>
         * <ul>
         * <li>STOP: The STOP word.</li>
         * <li>MAIN: MAIN Dictionary</li>
         * <li>SYNONYMS: SYNONYMS</li>
         * <li>ALI_WS: an Alibaba Dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("type")
        public String type;

        public static RestartInstanceResponseBodyResultDictList build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultDictList self = new RestartInstanceResponseBodyResultDictList();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultDictList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public RestartInstanceResponseBodyResultDictList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RestartInstanceResponseBodyResultDictList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public RestartInstanceResponseBodyResultDictList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RestartInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        /**
         * <p>The number of performance metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The specification of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        public static RestartInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultKibanaConfiguration self = new RestartInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public RestartInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public RestartInstanceResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public RestartInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class RestartInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        /**
         * <p>The number of nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. This tool only supports cloud_ssd (cloud SSD) disks.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The node specifications of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        public static RestartInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultMasterConfiguration self = new RestartInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public RestartInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public RestartInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public RestartInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class RestartInstanceResponseBodyResultNetworkConfig extends TeaModel {
        /**
         * <p>The network type. Only Virtual Private Cloud (VPC) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The zone where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <p>The ID of the vSwitch associated with the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1k4ec6s7sjdbudw****</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static RestartInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultNetworkConfig self = new RestartInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RestartInstanceResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public RestartInstanceResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public RestartInstanceResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class RestartInstanceResponseBodyResultNodeSpec extends TeaModel {
        /**
         * <p>The storage space size per data node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Valid values: cloud_ssd and cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The specification of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        public static RestartInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultNodeSpec self = new RestartInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public RestartInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public RestartInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class RestartInstanceResponseBodyResultSynonymsDicts extends TeaModel {
        /**
         * <p>The size of the Dictionary File. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2782602</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the dictionary file.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_MAIN.dic</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type. Valid values:</p>
         * <ul>
         * <li>OSS:OSS open storage (the OSS storage space must be publicly readable.)</li>
         * <li>ORIGIN: open-source Elasticsearch</li>
         * <li>UPLOAD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary. Valid values:</p>
         * <ul>
         * <li>STOP: The STOP word.</li>
         * <li>MAIN: MAIN Dictionary</li>
         * <li>SYNONYMS: SYNONYMS</li>
         * <li>ALI_WS: an Alibaba Dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("type")
        public String type;

        public static RestartInstanceResponseBodyResultSynonymsDicts build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResultSynonymsDicts self = new RestartInstanceResponseBodyResultSynonymsDicts();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResultSynonymsDicts setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public RestartInstanceResponseBodyResultSynonymsDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RestartInstanceResponseBodyResultSynonymsDicts setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public RestartInstanceResponseBodyResultSynonymsDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RestartInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-06T10:18:48.662Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The configuration of the IK dictionaries.</p>
         */
        @NameInMap("dictList")
        public java.util.List<RestartInstanceResponseBodyResultDictList> dictList;

        /**
         * <p>The intranet access address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6.7.0_with_X-Pack</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The configuration of Kibana nodes.</p>
         */
        @NameInMap("kibanaConfiguration")
        public RestartInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        /**
         * <p>The public network access address of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****.kibana.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        /**
         * <p>The public port of the Kibana network.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        /**
         * <p>The configuration of dedicated master nodes.</p>
         */
        @NameInMap("masterConfiguration")
        public RestartInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfig")
        public RestartInstanceResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The configuration of data nodes.</p>
         */
        @NameInMap("nodeSpec")
        public RestartInstanceResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The billing method of the created ECS instance.</p>
         * <p>Valid values: prepaid and postpaid.</p>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The public network access address.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****.public.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("publicDomain")
        public String publicDomain;

        /**
         * <p>The public network port.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("publicPort")
        public Integer publicPort;

        /**
         * <p>The state of the cluster.</p>
         * <p>Supported: active (normal), activating (initializing), inactive (blocked), and invalid (expired).</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The configuration of the synonym dictionaries.</p>
         */
        @NameInMap("synonymsDicts")
        public java.util.List<RestartInstanceResponseBodyResultSynonymsDicts> synonymsDicts;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-18T10:10:04.484Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static RestartInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RestartInstanceResponseBodyResult self = new RestartInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RestartInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RestartInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RestartInstanceResponseBodyResult setDictList(java.util.List<RestartInstanceResponseBodyResultDictList> dictList) {
            this.dictList = dictList;
            return this;
        }
        public java.util.List<RestartInstanceResponseBodyResultDictList> getDictList() {
            return this.dictList;
        }

        public RestartInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public RestartInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public RestartInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RestartInstanceResponseBodyResult setKibanaConfiguration(RestartInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public RestartInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public RestartInstanceResponseBodyResult setKibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        public RestartInstanceResponseBodyResult setKibanaPort(Integer kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        public RestartInstanceResponseBodyResult setMasterConfiguration(RestartInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public RestartInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public RestartInstanceResponseBodyResult setNetworkConfig(RestartInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public RestartInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public RestartInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public RestartInstanceResponseBodyResult setNodeSpec(RestartInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public RestartInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public RestartInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public RestartInstanceResponseBodyResult setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public RestartInstanceResponseBodyResult setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public RestartInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RestartInstanceResponseBodyResult setSynonymsDicts(java.util.List<RestartInstanceResponseBodyResultSynonymsDicts> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }
        public java.util.List<RestartInstanceResponseBodyResultSynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        public RestartInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
