// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>The size of the dictionary file. Unit: bytes.</p>
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
         * <li>OSS: Object Storage Service (OSS). The OSS bucket must have public-read permissions.</li>
         * <li>ORIGIN: open-source Elasticsearch</li>
         * <li>UPLOAD: uploaded file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The dictionary type. Valid values:</p>
         * <ul>
         * <li>STOP: stopword dictionary</li>
         * <li>MAIN: main dictionary</li>
         * <li>SYNONYMS: synonym dictionary</li>
         * <li>ALI_WS: Alibaba dictionary.</li>
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
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage size of the node. Unit: GB.</p>
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
         * <p>The node specifications.</p>
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
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage size of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Only cloud_ssd (standard SSD) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The node specifications.</p>
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
         * <p>The VPC ID.</p>
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
         * <p>The vSwitch ID.</p>
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
         * <p>The storage size of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The node specifications.</p>
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
         * <p>The size of the dictionary file. Unit: bytes.</p>
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
         * <li>OSS: Object Storage Service (OSS). The OSS bucket must have public-read permissions.</li>
         * <li>ORIGIN: open-source Elasticsearch</li>
         * <li>UPLOAD: uploaded file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The dictionary type. Valid values:</p>
         * <ul>
         * <li>STOP: stopword dictionary</li>
         * <li>MAIN: main dictionary</li>
         * <li>SYNONYMS: synonym dictionary</li>
         * <li>ALI_WS: Alibaba dictionary.</li>
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
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The IK dictionary configuration.</p>
         */
        @NameInMap("dictList")
        public java.util.List<RestartInstanceResponseBodyResultDictList> dictList;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.7.0_with_X-Pack</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The Kibana node configuration.</p>
         */
        @NameInMap("kibanaConfiguration")
        public RestartInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        /**
         * <p>The Kibana public network access address.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****.kibana.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        /**
         * <p>The public port of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        /**
         * <p>The master node configuration.</p>
         */
        @NameInMap("masterConfiguration")
        public RestartInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfig")
        public RestartInstanceResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The number of data nodes in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The data node configuration.</p>
         */
        @NameInMap("nodeSpec")
        public RestartInstanceResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The billing method of the instance.</p>
         * <p>Valid values: prepaid (subscription) and postpaid (pay-as-you-go).</p>
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
         * <p>The public port.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("publicPort")
        public Integer publicPort;

        /**
         * <p>The status of the instance.</p>
         * <p>Valid values: active, activating, inactive, and invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The synonym dictionary configuration.</p>
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
