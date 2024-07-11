// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public DescribeMultiZoneAvailableResourceResponseBodyAvailableZones availableZones;

    /**
     * <strong>example:</strong>
     * <p>B2EEBBA9-C627-4415-81A0-B77BC54F1D52</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultiZoneAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableResourceResponseBody self = new DescribeMultiZoneAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableResourceResponseBody setAvailableZones(DescribeMultiZoneAvailableResourceResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeMultiZoneAvailableResourceResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeMultiZoneAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hbase.sn2.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeDetail")
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail instanceTypeDetail;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource setInstanceTypeDetail(DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail instanceTypeDetail) {
            this.instanceTypeDetail = instanceTypeDetail;
            return this;
        }
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail getInstanceTypeDetail() {
            return this.instanceTypeDetail;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources extends TeaModel {
        @NameInMap("MasterResource")
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> masterResource;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources setMasterResource(java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> masterResource) {
            this.masterResource = masterResource;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> getMasterResource() {
            return this.masterResource;
        }

    }

    public static class DBInstanceStorageRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>64000</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("StepSize")
        public Integer stepSize;

        public static DBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DBInstanceStorageRange self = new DBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

        public DBInstanceStorageRange setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DBInstanceStorageRange setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DBInstanceStorageRange setStepSize(Integer stepSize) {
            this.stepSize = stepSize;
            return this;
        }
        public Integer getStepSize() {
            return this.stepSize;
        }

    }

    public static class InstanceTypeDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        public static InstanceTypeDetail build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeDetail self = new InstanceTypeDetail();
            return TeaModel.build(map, self);
        }

        public InstanceTypeDetail setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public InstanceTypeDetail setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

    }

    public static class CoreResource extends TeaModel {
        @NameInMap("DBInstanceStorageRange")
        public DBInstanceStorageRange DBInstanceStorageRange;

        /**
         * <strong>example:</strong>
         * <p>hbase.sn2.2xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeDetail")
        public InstanceTypeDetail instanceTypeDetail;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxCoreCount")
        public Integer maxCoreCount;

        public static CoreResource build(java.util.Map<String, ?> map) throws Exception {
            CoreResource self = new CoreResource();
            return TeaModel.build(map, self);
        }

        public CoreResource setDBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
            this.DBInstanceStorageRange = DBInstanceStorageRange;
            return this;
        }
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        public CoreResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CoreResource setInstanceTypeDetail(InstanceTypeDetail instanceTypeDetail) {
            this.instanceTypeDetail = instanceTypeDetail;
            return this;
        }
        public InstanceTypeDetail getInstanceTypeDetail() {
            return this.instanceTypeDetail;
        }

        public CoreResource setMaxCoreCount(Integer maxCoreCount) {
            this.maxCoreCount = maxCoreCount;
            return this;
        }
        public Integer getMaxCoreCount() {
            return this.maxCoreCount;
        }

    }

    public static class CoreResources extends TeaModel {
        @NameInMap("CoreResource")
        public java.util.List<CoreResource> coreResource;

        public static CoreResources build(java.util.Map<String, ?> map) throws Exception {
            CoreResources self = new CoreResources();
            return TeaModel.build(map, self);
        }

        public CoreResources setCoreResource(java.util.List<CoreResource> coreResource) {
            this.coreResource = coreResource;
            return this;
        }
        public java.util.List<CoreResource> getCoreResource() {
            return this.coreResource;
        }

    }

    public static class SupportedStorageType extends TeaModel {
        @NameInMap("CoreResources")
        public CoreResources coreResources;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static SupportedStorageType build(java.util.Map<String, ?> map) throws Exception {
            SupportedStorageType self = new SupportedStorageType();
            return TeaModel.build(map, self);
        }

        public SupportedStorageType setCoreResources(CoreResources coreResources) {
            this.coreResources = coreResources;
            return this;
        }
        public CoreResources getCoreResources() {
            return this.coreResources;
        }

        public SupportedStorageType setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class SupportedStorageTypes extends TeaModel {
        @NameInMap("SupportedStorageType")
        public java.util.List<SupportedStorageType> supportedStorageType;

        public static SupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            SupportedStorageTypes self = new SupportedStorageTypes();
            return TeaModel.build(map, self);
        }

        public SupportedStorageTypes setSupportedStorageType(java.util.List<SupportedStorageType> supportedStorageType) {
            this.supportedStorageType = supportedStorageType;
            return this;
        }
        public java.util.List<SupportedStorageType> getSupportedStorageType() {
            return this.supportedStorageType;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("SupportedStorageTypes")
        public SupportedStorageTypes supportedStorageTypes;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories setSupportedStorageTypes(SupportedStorageTypes supportedStorageTypes) {
            this.supportedStorageTypes = supportedStorageTypes;
            return this;
        }
        public SupportedStorageTypes getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories extends TeaModel {
        @NameInMap("SupportedCategories")
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> supportedCategories;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories setSupportedCategories(java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> supportedCategories) {
            this.supportedCategories = supportedCategories;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> getSupportedCategories() {
            return this.supportedCategories;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion extends TeaModel {
        @NameInMap("SupportedCategories")
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories supportedCategories;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion setSupportedCategories(DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories supportedCategories) {
            this.supportedCategories = supportedCategories;
            return this;
        }
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories getSupportedCategories() {
            return this.supportedCategories;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions setSupportedEngineVersion(java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        @NameInMap("Engine")
        public String engine;

        @NameInMap("SupportedEngineVersions")
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions supportedEngineVersions;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setSupportedEngineVersions(DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines setSupportedEngine(java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine) {
            this.supportedEngine = supportedEngine;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone extends TeaModel {
        @NameInMap("MasterResources")
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources masterResources;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SupportedEngines")
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-bef-aliyun</p>
         */
        @NameInMap("ZoneCombination")
        public String zoneCombination;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone setMasterResources(DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources masterResources) {
            this.masterResources = masterResources;
            return this;
        }
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources getMasterResources() {
            return this.masterResources;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone setSupportedEngines(DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneCombination(String zoneCombination) {
            this.zoneCombination = zoneCombination;
            return this;
        }
        public String getZoneCombination() {
            return this.zoneCombination;
        }

    }

    public static class DescribeMultiZoneAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone;

        public static DescribeMultiZoneAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableResourceResponseBodyAvailableZones self = new DescribeMultiZoneAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableResourceResponseBodyAvailableZones setAvailableZone(java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableResourceResponseBodyAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
