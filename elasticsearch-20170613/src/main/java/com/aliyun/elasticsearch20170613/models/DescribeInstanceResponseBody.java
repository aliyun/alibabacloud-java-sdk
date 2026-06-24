// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The name of the garbage collector. Valid values: CMS and G1.</p>
         * 
         * <strong>example:</strong>
         * <p>CMS</p>
         */
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
         * <p>aliws_ext_dict.txt</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service (OSS). Make sure that the OSS bucket has public read permissions.</li>
         * <li>ORIGIN: Open-source Elasticsearch.</li>
         * <li>UPLOAD: Uploaded file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>STOP: Stopword.</li>
         * <li>MAIN: Main dictionary.</li>
         * <li>SYNONYMS: Synonym dictionary.</li>
         * <li>ALI_WS: Alibaba dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALI_WS</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Only cloud_efficiency (ultra disk) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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
         * <p>The source type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service (OSS). Make sure that the OSS bucket has public read permissions.</li>
         * <li>ORIGIN: Open-source Elasticsearch.</li>
         * <li>UPLOAD: Uploaded file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>STOP: Stopword.</li>
         * <li>MAIN: Main dictionary.</li>
         * <li>SYNONYMS: Synonym dictionary.</li>
         * <li>ALI_WS: Alibaba dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>Indicates whether cloud disk encryption is enabled for the node. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The storage type of the node. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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

    public static class DescribeInstanceResponseBodyResultEndpoints extends TeaModel {
        /**
         * <p>The private endpoint of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-xx-cn-hangzhou-h.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>vswitchId</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeInstanceResponseBodyResultEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResultEndpoints self = new DescribeInstanceResponseBodyResultEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResultEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeInstanceResponseBodyResultEndpoints setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceResponseBodyResultEndpoints setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstanceResponseBodyResultIkHotDicts extends TeaModel {
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("fileSize")
        public Integer fileSize;

        /**
         * <p>The name of the dictionary file.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy_0.dic</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>OSS: Uses OSS.</li>
         * <li>ORIGIN: Retains the previously uploaded dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the dictionary to update. Valid values:</p>
         * <ul>
         * <li>MAIN: IK main dictionary</li>
         * <li>STOP: IK stopword dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage space of a single node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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
        /**
         * <p>The name of the whitelist group. The default group is included by default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The IP addresses in the whitelist group.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        /**
         * <p>The whitelist type. Valid values:</p>
         * <ul>
         * <li><p>PRIVATE_ES: Elasticsearch private network.</p>
         * </li>
         * <li><p>PUBLIC_ES: Elasticsearch public network.</p>
         * </li>
         * <li><p>PRIVATE_KIBANA: Kibana private network.</p>
         * </li>
         * <li><p>PUBLIC_KIBANA: Kibana public network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE_ES</p>
         */
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
         * <p>vpc-abc</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The zone where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-abc</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <p>The whitelist group list.</p>
         */
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
        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>Indicates whether cloud disk encryption is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The disk type of the node. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The performance level (PL) of the ESSD. This parameter is required when diskType is set to cloud_essd. Valid values: PL1, PL2, and PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performanceLevel")
        public String performanceLevel;

        /**
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The dictionary type. Valid values:</p>
         * <ul>
         * <li><p>STOP: Stopword.</p>
         * </li>
         * <li><p>MAIN: Main dictionary.</p>
         * </li>
         * <li><p>SYNONYMS: Synonym dictionary.</p>
         * </li>
         * <li><p>ALI_WS: Alibaba dictionary.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>Indicates whether cloud disk encryption is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The storage type of the node. Only cloud_efficiency (ultra disk) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The node specifications description.</p>
         * 
         * <strong>example:</strong>
         * <p>1C 2G</p>
         */
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
        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li>ISOLATION: offline</li>
         * <li>NORMAL: normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
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
        /**
         * <p>Indicates whether the instance contains a dedicated master node. Valid values:</p>
         * <ul>
         * <li><p>true: The instance contains a dedicated master node.</p>
         * </li>
         * <li><p>false: The instance does not contain a dedicated master node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("advancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        /**
         * <p>The advanced settings.</p>
         */
        @NameInMap("advancedSetting")
        public DescribeInstanceResponseBodyResultAdvancedSetting advancedSetting;

        /**
         * <p>The Alibaba tokenizer dictionary configuration.</p>
         */
        @NameInMap("aliwsDicts")
        public java.util.List<DescribeInstanceResponseBodyResultAliwsDicts> aliwsDicts;

        /**
         * <p>The deployment mode and architecture type. Valid values:</p>
         * <ul>
         * <li>exclusive: basic management and control.</li>
         * <li>public: cloud-native management and control.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("archType")
        public String archType;

        /**
         * <p>The configuration of client nodes.</p>
         */
        @NameInMap("clientNodeConfiguration")
        public DescribeInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The dedicated master node (deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dedicateMaster")
        public Boolean dedicateMaster;

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
        public java.util.List<DescribeInstanceResponseBodyResultDictList> dictList;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The configuration of elastic data nodes.</p>
         */
        @NameInMap("elasticDataNodeConfiguration")
        public DescribeInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration;

        /**
         * <p>Indicates whether internal-facing access to Kibana is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableKibanaPrivateNetwork")
        public Boolean enableKibanaPrivateNetwork;

        /**
         * <p>Indicates whether public network access to Kibana is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableKibanaPublicNetwork")
        public Boolean enableKibanaPublicNetwork;

        /**
         * <p>Indicates whether the public endpoint of the instance is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enablePublic")
        public Boolean enablePublic;

        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The private endpoints for each zone of an HP_ALILB multi-zone instance.</p>
         */
        @NameInMap("endpoints")
        public java.util.List<DescribeInstanceResponseBodyResultEndpoints> endpoints;

        /**
         * <p>The YML file configuration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;http.cors.allow-credentials&quot;:&quot;false&quot;}</p>
         */
        @NameInMap("esConfig")
        public java.util.Map<String, ?> esConfig;

        /**
         * <p>The internal-facing access blacklist (deprecated).</p>
         */
        @NameInMap("esIPBlacklist")
        public java.util.List<String> esIPBlacklist;

        /**
         * <p>The internal-facing access whitelist (deprecated).</p>
         */
        @NameInMap("esIPWhitelist")
        public java.util.List<String> esIPWhitelist;

        /**
         * <p>The instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.3.2_with_X-Pack</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The extended configuration array of the instance.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        /**
         * <p>Indicates whether the instance contains client nodes. Valid values:</p>
         * <ul>
         * <li><p>true: The instance contains client nodes.</p>
         * </li>
         * <li><p>false: The instance does not contain client nodes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("haveClientNode")
        public Boolean haveClientNode;

        /**
         * <p>Indicates whether the instance contains a Kibana node. Valid values:</p>
         * <ul>
         * <li><p>true: The instance contains a Kibana node.</p>
         * </li>
         * <li><p>false: The instance does not contain a Kibana node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("haveKibana")
        public Boolean haveKibana;

        /**
         * <p>The IK dictionary hot update configuration.</p>
         */
        @NameInMap("ikHotDicts")
        public java.util.List<DescribeInstanceResponseBodyResultIkHotDicts> ikHotDicts;

        @NameInMap("inited")
        public Boolean inited;

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li>x-pack: Commercial Edition.</li>
         * <li>advanced/IS: Advanced Edition.</li>
         * <li>community: Basic Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        @NameInMap("instanceCategory")
        public String instanceCategory;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the instance uses the new deployment architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isNewDeployment")
        public Boolean isNewDeployment;

        /**
         * <p>The configuration of the Kibana node.</p>
         */
        @NameInMap("kibanaConfiguration")
        public DescribeInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        /**
         * <p>The Kibana endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.kibana.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("kibanaDomain")
        public String kibanaDomain;

        /**
         * <p>The Kibana public endpoint access whitelist.</p>
         */
        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        /**
         * <p>The access port of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        @NameInMap("kibanaPort")
        public Integer kibanaPort;

        /**
         * <p>The Kibana private endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-x0r3*********.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("kibanaPrivateDomain")
        public String kibanaPrivateDomain;

        /**
         * <p>The Kibana private endpoint access whitelist.</p>
         */
        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        /**
         * <p>The Kibana private port.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        @NameInMap("kibanaPrivatePort")
        public String kibanaPrivatePort;

        /**
         * <p>The master node configuration.</p>
         */
        @NameInMap("masterConfiguration")
        public DescribeInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfig")
        public DescribeInstanceResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The number of data nodes in the instance.</p>
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
        public DescribeInstanceResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p>prepaid: subscription.</p>
         * </li>
         * <li><p>postpaid: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The access port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The status of the pay-as-you-go service that is overlaid on the subscription instance. Valid values:</p>
         * <ul>
         * <li><p>active: Normal.</p>
         * </li>
         * <li><p>closed: Closed.</p>
         * </li>
         * <li><p>indebt: Frozen due to overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("postpaidServiceStatus")
        public String postpaidServiceStatus;

        /**
         * <p>The private endpoint access whitelist of the instance.</p>
         */
        @NameInMap("privateNetworkIpWhiteList")
        public java.util.List<String> privateNetworkIpWhiteList;

        /**
         * <p>The access protocol. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The public endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("publicDomain")
        public String publicDomain;

        /**
         * <p>The public endpoint access whitelist of the instance.</p>
         */
        @NameInMap("publicIpWhitelist")
        public java.util.List<String> publicIpWhitelist;

        /**
         * <p>The public network access port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("publicPort")
        public Integer publicPort;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvowej3i****</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the instance is a service VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("serviceVpc")
        public Boolean serviceVpc;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><p>active: Normal.</p>
         * </li>
         * <li><p>activating: Taking effect.</p>
         * </li>
         * <li><p>inactive: Frozen.</p>
         * </li>
         * <li><p>invalid: Invalid. The cluster does not exist or is inaccessible. In this case, some fields in the response may be missing, such as domain and kibanaDomain.</p>
         * </li>
         * <li><p>unknown: Unknown. The cluster does not exist or is inaccessible. In this case, some fields in the response may be missing, such as domain and kibanaDomain.</p>
         * </li>
         * </ul>
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
        public java.util.List<DescribeInstanceResponseBodyResultSynonymsDicts> synonymsDicts;

        /**
         * <p>The instance tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<DescribeInstanceResponseBodyResultTags> tags;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1uag5jj38c****</p>
         */
        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>Specifies whether warm data nodes are enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("warmNode")
        public Boolean warmNode;

        /**
         * <p>The configuration of warm data nodes.</p>
         */
        @NameInMap("warmNodeConfiguration")
        public DescribeInstanceResponseBodyResultWarmNodeConfiguration warmNodeConfiguration;

        /**
         * <p>The number of zones for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("zoneCount")
        public Integer zoneCount;

        /**
         * <p>The zone information.</p>
         */
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

        public DescribeInstanceResponseBodyResult setArchType(String archType) {
            this.archType = archType;
            return this;
        }
        public String getArchType() {
            return this.archType;
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

        public DescribeInstanceResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceResponseBodyResult setEndpoints(java.util.List<DescribeInstanceResponseBodyResultEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyResultEndpoints> getEndpoints() {
            return this.endpoints;
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

        public DescribeInstanceResponseBodyResult setInited(Boolean inited) {
            this.inited = inited;
            return this;
        }
        public Boolean getInited() {
            return this.inited;
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

        public DescribeInstanceResponseBodyResult setKibanaPrivateDomain(String kibanaPrivateDomain) {
            this.kibanaPrivateDomain = kibanaPrivateDomain;
            return this;
        }
        public String getKibanaPrivateDomain() {
            return this.kibanaPrivateDomain;
        }

        public DescribeInstanceResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public DescribeInstanceResponseBodyResult setKibanaPrivatePort(String kibanaPrivatePort) {
            this.kibanaPrivatePort = kibanaPrivatePort;
            return this;
        }
        public String getKibanaPrivatePort() {
            return this.kibanaPrivatePort;
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
