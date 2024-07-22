// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetRegionConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRegionConfigurationResponseBodyResult result;

    public static GetRegionConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionConfigurationResponseBody self = new GetRegionConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegionConfigurationResponseBody setResult(GetRegionConfigurationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRegionConfigurationResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRegionConfigurationResponseBodyResultClientNodeAmountRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("maxAmount")
        public Integer maxAmount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionConfigurationResponseBodyResultClientNodeAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultClientNodeAmountRange self = new GetRegionConfigurationResponseBodyResultClientNodeAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultClientNodeAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionConfigurationResponseBodyResultClientNodeAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultClientNodeDiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("minSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        public static GetRegionConfigurationResponseBodyResultClientNodeDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultClientNodeDiskList self = new GetRegionConfigurationResponseBodyResultClientNodeDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultClientNodeDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultClientNodeDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionConfigurationResponseBodyResultClientNodeDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionConfigurationResponseBodyResultClientNodeDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultDataDiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("maxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("minSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        @NameInMap("valueLimitSet")
        public java.util.List<String> valueLimitSet;

        public static GetRegionConfigurationResponseBodyResultDataDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultDataDiskList self = new GetRegionConfigurationResponseBodyResultDataDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultDataDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultDataDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionConfigurationResponseBodyResultDataDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionConfigurationResponseBodyResultDataDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public GetRegionConfigurationResponseBodyResultDataDiskList setValueLimitSet(java.util.List<String> valueLimitSet) {
            this.valueLimitSet = valueLimitSet;
            return this;
        }
        public java.util.List<String> getValueLimitSet() {
            return this.valueLimitSet;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("maxAmount")
        public Integer maxAmount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange self = new GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("maxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("minSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        @NameInMap("valueLimitSet")
        public java.util.List<String> valueLimitSet;

        public static GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList self = new GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList setValueLimitSet(java.util.List<String> valueLimitSet) {
            this.valueLimitSet = valueLimitSet;
            return this;
        }
        public java.util.List<String> getValueLimitSet() {
            return this.valueLimitSet;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultElasticNodeProperties extends TeaModel {
        @NameInMap("amountRange")
        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange amountRange;

        @NameInMap("diskList")
        public java.util.List<GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList> diskList;

        @NameInMap("spec")
        public java.util.List<String> spec;

        public static GetRegionConfigurationResponseBodyResultElasticNodeProperties build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultElasticNodeProperties self = new GetRegionConfigurationResponseBodyResultElasticNodeProperties();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultElasticNodeProperties setAmountRange(GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange amountRange) {
            this.amountRange = amountRange;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultElasticNodePropertiesAmountRange getAmountRange() {
            return this.amountRange;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodeProperties setDiskList(java.util.List<GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList> diskList) {
            this.diskList = diskList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultElasticNodePropertiesDiskList> getDiskList() {
            return this.diskList;
        }

        public GetRegionConfigurationResponseBodyResultElasticNodeProperties setSpec(java.util.List<String> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.List<String> getSpec() {
            return this.spec;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultEsVersionsLatestList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5.5_with_X-Pack</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>5.5.3_with_X-Pack</p>
         */
        @NameInMap("value")
        public String value;

        public static GetRegionConfigurationResponseBodyResultEsVersionsLatestList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultEsVersionsLatestList self = new GetRegionConfigurationResponseBodyResultEsVersionsLatestList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultEsVersionsLatestList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRegionConfigurationResponseBodyResultEsVersionsLatestList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultJvmConfine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("memory")
        public Integer memory;

        @NameInMap("supportEsVersions")
        public java.util.List<String> supportEsVersions;

        @NameInMap("supportGcs")
        public java.util.List<String> supportGcs;

        public static GetRegionConfigurationResponseBodyResultJvmConfine build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultJvmConfine self = new GetRegionConfigurationResponseBodyResultJvmConfine();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultJvmConfine setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetRegionConfigurationResponseBodyResultJvmConfine setSupportEsVersions(java.util.List<String> supportEsVersions) {
            this.supportEsVersions = supportEsVersions;
            return this;
        }
        public java.util.List<String> getSupportEsVersions() {
            return this.supportEsVersions;
        }

        public GetRegionConfigurationResponseBodyResultJvmConfine setSupportGcs(java.util.List<String> supportGcs) {
            this.supportGcs = supportGcs;
            return this;
        }
        public java.util.List<String> getSupportGcs() {
            return this.supportGcs;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxAmount")
        public Integer maxAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange self = new GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultKibanaNodeProperties extends TeaModel {
        @NameInMap("amountRange")
        public GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange amountRange;

        @NameInMap("spec")
        public java.util.List<String> spec;

        public static GetRegionConfigurationResponseBodyResultKibanaNodeProperties build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultKibanaNodeProperties self = new GetRegionConfigurationResponseBodyResultKibanaNodeProperties();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultKibanaNodeProperties setAmountRange(GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange amountRange) {
            this.amountRange = amountRange;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultKibanaNodePropertiesAmountRange getAmountRange() {
            return this.amountRange;
        }

        public GetRegionConfigurationResponseBodyResultKibanaNodeProperties setSpec(java.util.List<String> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.List<String> getSpec() {
            return this.spec;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultMasterDiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("minSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        public static GetRegionConfigurationResponseBodyResultMasterDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultMasterDiskList self = new GetRegionConfigurationResponseBodyResultMasterDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultMasterDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultMasterDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionConfigurationResponseBodyResultMasterDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionConfigurationResponseBodyResultMasterDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultNode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxAmount")
        public Integer maxAmount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionConfigurationResponseBodyResultNode build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultNode self = new GetRegionConfigurationResponseBodyResultNode();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultNode setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionConfigurationResponseBodyResultNode setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultNodeSpecList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("cpuCount")
        public Integer cpuCount;

        /**
         * <strong>example:</strong>
         * <p>44000</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <strong>example:</strong>
         * <p>local_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("memorySize")
        public Integer memorySize;

        /**
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>local_efficiency</p>
         */
        @NameInMap("specGroupType")
        public String specGroupType;

        public static GetRegionConfigurationResponseBodyResultNodeSpecList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultNodeSpecList self = new GetRegionConfigurationResponseBodyResultNodeSpecList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetRegionConfigurationResponseBodyResultNodeSpecList setSpecGroupType(String specGroupType) {
            this.specGroupType = specGroupType;
            return this;
        }
        public String getSpecGroupType() {
            return this.specGroupType;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>5.5.3</p>
         */
        @NameInMap("value")
        public String value;

        public static GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList self = new GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultSupportVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x-pack</p>
         */
        @NameInMap("instanceCategory")
        public String instanceCategory;

        @NameInMap("supportVersionList")
        public java.util.List<GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList> supportVersionList;

        public static GetRegionConfigurationResponseBodyResultSupportVersions build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultSupportVersions self = new GetRegionConfigurationResponseBodyResultSupportVersions();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultSupportVersions setInstanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        public GetRegionConfigurationResponseBodyResultSupportVersions setSupportVersionList(java.util.List<GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList> supportVersionList) {
            this.supportVersionList = supportVersionList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultSupportVersionsSupportVersionList> getSupportVersionList() {
            return this.supportVersionList;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxAmount")
        public Integer maxAmount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange self = new GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("maxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("minSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        @NameInMap("valueLimitSet")
        public java.util.List<String> valueLimitSet;

        public static GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList self = new GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList setValueLimitSet(java.util.List<String> valueLimitSet) {
            this.valueLimitSet = valueLimitSet;
            return this;
        }
        public java.util.List<String> getValueLimitSet() {
            return this.valueLimitSet;
        }

    }

    public static class GetRegionConfigurationResponseBodyResultWarmNodeProperties extends TeaModel {
        @NameInMap("amountRange")
        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange amountRange;

        @NameInMap("diskList")
        public java.util.List<GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList> diskList;

        @NameInMap("spec")
        public java.util.List<String> spec;

        public static GetRegionConfigurationResponseBodyResultWarmNodeProperties build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResultWarmNodeProperties self = new GetRegionConfigurationResponseBodyResultWarmNodeProperties();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResultWarmNodeProperties setAmountRange(GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange amountRange) {
            this.amountRange = amountRange;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultWarmNodePropertiesAmountRange getAmountRange() {
            return this.amountRange;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodeProperties setDiskList(java.util.List<GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList> diskList) {
            this.diskList = diskList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultWarmNodePropertiesDiskList> getDiskList() {
            return this.diskList;
        }

        public GetRegionConfigurationResponseBodyResultWarmNodeProperties setSpec(java.util.List<String> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.List<String> getSpec() {
            return this.spec;
        }

    }

    public static class GetRegionConfigurationResponseBodyResult extends TeaModel {
        @NameInMap("clientNodeAmountRange")
        public GetRegionConfigurationResponseBodyResultClientNodeAmountRange clientNodeAmountRange;

        @NameInMap("clientNodeDiskList")
        public java.util.List<GetRegionConfigurationResponseBodyResultClientNodeDiskList> clientNodeDiskList;

        @NameInMap("clientNodeSpec")
        public java.util.List<String> clientNodeSpec;

        /**
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=elasticsearch&orderType=BUY#/buy">https://common-buy.aliyun.com/?commodityCode=elasticsearch&amp;orderType=BUY#/buy</a></p>
         */
        @NameInMap("createUrl")
        public String createUrl;

        @NameInMap("dataDiskList")
        public java.util.List<GetRegionConfigurationResponseBodyResultDataDiskList> dataDiskList;

        @NameInMap("elasticNodeProperties")
        public GetRegionConfigurationResponseBodyResultElasticNodeProperties elasticNodeProperties;

        /**
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("env")
        public String env;

        @NameInMap("esVersions")
        public java.util.List<String> esVersions;

        @NameInMap("esVersionsLatestList")
        public java.util.List<GetRegionConfigurationResponseBodyResultEsVersionsLatestList> esVersionsLatestList;

        @NameInMap("instanceSupportNodes")
        public java.util.List<String> instanceSupportNodes;

        @NameInMap("jvmConfine")
        public GetRegionConfigurationResponseBodyResultJvmConfine jvmConfine;

        @NameInMap("kibanaNodeProperties")
        public GetRegionConfigurationResponseBodyResultKibanaNodeProperties kibanaNodeProperties;

        @NameInMap("masterDiskList")
        public java.util.List<GetRegionConfigurationResponseBodyResultMasterDiskList> masterDiskList;

        @NameInMap("masterSpec")
        public java.util.List<String> masterSpec;

        @NameInMap("node")
        public GetRegionConfigurationResponseBodyResultNode node;

        @NameInMap("nodeSpecList")
        public java.util.List<GetRegionConfigurationResponseBodyResultNodeSpecList> nodeSpecList;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        @NameInMap("supportVersions")
        public java.util.List<GetRegionConfigurationResponseBodyResultSupportVersions> supportVersions;

        @NameInMap("warmNodeProperties")
        public GetRegionConfigurationResponseBodyResultWarmNodeProperties warmNodeProperties;

        @NameInMap("zones")
        public java.util.List<String> zones;

        public static GetRegionConfigurationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRegionConfigurationResponseBodyResult self = new GetRegionConfigurationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRegionConfigurationResponseBodyResult setClientNodeAmountRange(GetRegionConfigurationResponseBodyResultClientNodeAmountRange clientNodeAmountRange) {
            this.clientNodeAmountRange = clientNodeAmountRange;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultClientNodeAmountRange getClientNodeAmountRange() {
            return this.clientNodeAmountRange;
        }

        public GetRegionConfigurationResponseBodyResult setClientNodeDiskList(java.util.List<GetRegionConfigurationResponseBodyResultClientNodeDiskList> clientNodeDiskList) {
            this.clientNodeDiskList = clientNodeDiskList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultClientNodeDiskList> getClientNodeDiskList() {
            return this.clientNodeDiskList;
        }

        public GetRegionConfigurationResponseBodyResult setClientNodeSpec(java.util.List<String> clientNodeSpec) {
            this.clientNodeSpec = clientNodeSpec;
            return this;
        }
        public java.util.List<String> getClientNodeSpec() {
            return this.clientNodeSpec;
        }

        public GetRegionConfigurationResponseBodyResult setCreateUrl(String createUrl) {
            this.createUrl = createUrl;
            return this;
        }
        public String getCreateUrl() {
            return this.createUrl;
        }

        public GetRegionConfigurationResponseBodyResult setDataDiskList(java.util.List<GetRegionConfigurationResponseBodyResultDataDiskList> dataDiskList) {
            this.dataDiskList = dataDiskList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultDataDiskList> getDataDiskList() {
            return this.dataDiskList;
        }

        public GetRegionConfigurationResponseBodyResult setElasticNodeProperties(GetRegionConfigurationResponseBodyResultElasticNodeProperties elasticNodeProperties) {
            this.elasticNodeProperties = elasticNodeProperties;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultElasticNodeProperties getElasticNodeProperties() {
            return this.elasticNodeProperties;
        }

        public GetRegionConfigurationResponseBodyResult setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetRegionConfigurationResponseBodyResult setEsVersions(java.util.List<String> esVersions) {
            this.esVersions = esVersions;
            return this;
        }
        public java.util.List<String> getEsVersions() {
            return this.esVersions;
        }

        public GetRegionConfigurationResponseBodyResult setEsVersionsLatestList(java.util.List<GetRegionConfigurationResponseBodyResultEsVersionsLatestList> esVersionsLatestList) {
            this.esVersionsLatestList = esVersionsLatestList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultEsVersionsLatestList> getEsVersionsLatestList() {
            return this.esVersionsLatestList;
        }

        public GetRegionConfigurationResponseBodyResult setInstanceSupportNodes(java.util.List<String> instanceSupportNodes) {
            this.instanceSupportNodes = instanceSupportNodes;
            return this;
        }
        public java.util.List<String> getInstanceSupportNodes() {
            return this.instanceSupportNodes;
        }

        public GetRegionConfigurationResponseBodyResult setJvmConfine(GetRegionConfigurationResponseBodyResultJvmConfine jvmConfine) {
            this.jvmConfine = jvmConfine;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultJvmConfine getJvmConfine() {
            return this.jvmConfine;
        }

        public GetRegionConfigurationResponseBodyResult setKibanaNodeProperties(GetRegionConfigurationResponseBodyResultKibanaNodeProperties kibanaNodeProperties) {
            this.kibanaNodeProperties = kibanaNodeProperties;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultKibanaNodeProperties getKibanaNodeProperties() {
            return this.kibanaNodeProperties;
        }

        public GetRegionConfigurationResponseBodyResult setMasterDiskList(java.util.List<GetRegionConfigurationResponseBodyResultMasterDiskList> masterDiskList) {
            this.masterDiskList = masterDiskList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultMasterDiskList> getMasterDiskList() {
            return this.masterDiskList;
        }

        public GetRegionConfigurationResponseBodyResult setMasterSpec(java.util.List<String> masterSpec) {
            this.masterSpec = masterSpec;
            return this;
        }
        public java.util.List<String> getMasterSpec() {
            return this.masterSpec;
        }

        public GetRegionConfigurationResponseBodyResult setNode(GetRegionConfigurationResponseBodyResultNode node) {
            this.node = node;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultNode getNode() {
            return this.node;
        }

        public GetRegionConfigurationResponseBodyResult setNodeSpecList(java.util.List<GetRegionConfigurationResponseBodyResultNodeSpecList> nodeSpecList) {
            this.nodeSpecList = nodeSpecList;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultNodeSpecList> getNodeSpecList() {
            return this.nodeSpecList;
        }

        public GetRegionConfigurationResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRegionConfigurationResponseBodyResult setSupportVersions(java.util.List<GetRegionConfigurationResponseBodyResultSupportVersions> supportVersions) {
            this.supportVersions = supportVersions;
            return this;
        }
        public java.util.List<GetRegionConfigurationResponseBodyResultSupportVersions> getSupportVersions() {
            return this.supportVersions;
        }

        public GetRegionConfigurationResponseBodyResult setWarmNodeProperties(GetRegionConfigurationResponseBodyResultWarmNodeProperties warmNodeProperties) {
            this.warmNodeProperties = warmNodeProperties;
            return this;
        }
        public GetRegionConfigurationResponseBodyResultWarmNodeProperties getWarmNodeProperties() {
            return this.warmNodeProperties;
        }

        public GetRegionConfigurationResponseBodyResult setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
