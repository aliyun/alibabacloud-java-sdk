// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public DescribeAvailableResourceResponseBodyAvailableZones availableZones;

    /**
     * <strong>example:</strong>
     * <p>EA76F208-E334-592A-A0C6-41E15EC87ED0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZones(DescribeAvailableResourceResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hbase.sn1.medium</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeDetail")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail instanceTypeDetail;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource setInstanceTypeDetail(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail instanceTypeDetail) {
            this.instanceTypeDetail = instanceTypeDetail;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResourceInstanceTypeDetail getInstanceTypeDetail() {
            return this.instanceTypeDetail;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources extends TeaModel {
        @NameInMap("MasterResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> masterResource;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources setMasterResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> masterResource) {
            this.masterResource = masterResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResourcesMasterResource> getMasterResource() {
            return this.masterResource;
        }

    }

    public static class DBInstanceStorageRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8000</p>
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
         * <p>4</p>
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
         * <p>hbase.sn1.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeDetail")
        public InstanceTypeDetail instanceTypeDetail;

        /**
         * <strong>example:</strong>
         * <p>16</p>
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
         * <p>cloud_ssd</p>
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

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes extends TeaModel {
        @NameInMap("SupportedStorageType")
        public java.util.List<SupportedStorageType> supportedStorageType;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes setSupportedStorageType(java.util.List<SupportedStorageType> supportedStorageType) {
            this.supportedStorageType = supportedStorageType;
            return this;
        }
        public java.util.List<SupportedStorageType> getSupportedStorageType() {
            return this.supportedStorageType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("SupportedStorageTypes")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes supportedStorageTypes;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories setSupportedStorageTypes(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes supportedStorageTypes) {
            this.supportedStorageTypes = supportedStorageTypes;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategoriesSupportedStorageTypes getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories extends TeaModel {
        @NameInMap("SupportedCategories")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> supportedCategories;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories setSupportedCategories(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> supportedCategories) {
            this.supportedCategories = supportedCategories;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategoriesSupportedCategories> getSupportedCategories() {
            return this.supportedCategories;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion extends TeaModel {
        @NameInMap("SupportedCategories")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories supportedCategories;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion setSupportedCategories(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories supportedCategories) {
            this.supportedCategories = supportedCategories;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersionSupportedCategories getSupportedCategories() {
            return this.supportedCategories;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions setSupportedEngineVersion(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersionsSupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        @NameInMap("Engine")
        public String engine;

        @NameInMap("SupportedEngineVersions")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions supportedEngineVersions;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine setSupportedEngineVersions(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngineSupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines setSupportedEngine(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> supportedEngine) {
            this.supportedEngine = supportedEngine;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEnginesSupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone extends TeaModel {
        @NameInMap("MasterResources")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources masterResources;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SupportedEngines")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setMasterResources(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources masterResources) {
            this.masterResources = masterResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneMasterResources getMasterResources() {
            return this.masterResources;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setSupportedEngines(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneSupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZones self = new DescribeAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setAvailableZone(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
