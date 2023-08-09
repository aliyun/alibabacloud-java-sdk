// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported database types.</p>
     */
    @NameInMap("SupportedDBTypes")
    public DescribeAvailableResourceResponseBodySupportedDBTypes supportedDBTypes;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setSupportedDBTypes(DescribeAvailableResourceResponseBodySupportedDBTypes supportedDBTypes) {
        this.supportedDBTypes = supportedDBTypes;
        return this;
    }
    public DescribeAvailableResourceResponseBodySupportedDBTypes getSupportedDBTypes() {
        return this.supportedDBTypes;
    }

    public static class DBInstanceStorageRange extends TeaModel {
        /**
         * <p>The maximum storage capacity. Unit: GB.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum storage capacity. Unit: GB.</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step size for adjusting the storage capacity. Unit: GB.</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DBInstanceStorageRange self = new DBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

        public DBInstanceStorageRange setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DBInstanceStorageRange setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DBInstanceStorageRange setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class AvailableResource extends TeaModel {
        /**
         * <p>The storage capacity range of the instance.</p>
         */
        @NameInMap("DBInstanceStorageRange")
        public DBInstanceStorageRange DBInstanceStorageRange;

        /**
         * <p>The instance family.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The type of the instance.</p>
         */
        @NameInMap("InstanceClassRemark")
        public String instanceClassRemark;

        public static AvailableResource build(java.util.Map<String, ?> map) throws Exception {
            AvailableResource self = new AvailableResource();
            return TeaModel.build(map, self);
        }

        public AvailableResource setDBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
            this.DBInstanceStorageRange = DBInstanceStorageRange;
            return this;
        }
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        public AvailableResource setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public AvailableResource setInstanceClassRemark(String instanceClassRemark) {
            this.instanceClassRemark = instanceClassRemark;
            return this;
        }
        public String getInstanceClassRemark() {
            return this.instanceClassRemark;
        }

    }

    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<AvailableResource> availableResource;

        public static AvailableResources build(java.util.Map<String, ?> map) throws Exception {
            AvailableResources self = new AvailableResources();
            return TeaModel.build(map, self);
        }

        public AvailableResources setAvailableResource(java.util.List<AvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType extends TeaModel {
        /**
         * <p>The details of the available resources.</p>
         */
        @NameInMap("AvailableResources")
        public AvailableResources availableResources;

        /**
         * <p>The network type of the instance.</p>
         */
        @NameInMap("NetworkTypes")
        public String networkTypes;

        /**
         * <p>The number of nodes in the instance.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setAvailableResources(AvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setNetworkTypes(String networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public String getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes extends TeaModel {
        @NameInMap("SupportedNodeType")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType> supportedNodeType;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes setSupportedNodeType(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType> supportedNodeType) {
            this.supportedNodeType = supportedNodeType;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType> getSupportedNodeType() {
            return this.supportedNodeType;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine extends TeaModel {
        /**
         * <p>The storage engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The supported instance types.</p>
         */
        @NameInMap("SupportedNodeTypes")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes supportedNodeTypes;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine setSupportedNodeTypes(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes supportedNodeTypes) {
            this.supportedNodeTypes = supportedNodeTypes;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes getSupportedNodeTypes() {
            return this.supportedNodeTypes;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine> supportedEngine;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines setSupportedEngine(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine> supportedEngine) {
            this.supportedEngine = supportedEngine;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion extends TeaModel {
        /**
         * <p>The supported storage engines.</p>
         */
        @NameInMap("SupportedEngines")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines supportedEngines;

        /**
         * <p>The database engine version of the instance.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion setSupportedEngines(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions setSupportedEngineVersion(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion> supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The supported storage engine versions.</p>
         */
        @NameInMap("SupportedEngineVersions")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions supportedEngineVersions;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone setSupportedEngineVersions(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions supportedEngineVersions) {
            this.supportedEngineVersions = supportedEngineVersions;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones setAvailableZone(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType extends TeaModel {
        /**
         * <p>The available zones.</p>
         */
        @NameInMap("AvailableZones")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones availableZones;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **normal**: replica set instance</p>
         * <p>*   **sharding**: sharded cluster instance</p>
         */
        @NameInMap("DbType")
        public String dbType;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType setAvailableZones(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones getAvailableZones() {
            return this.availableZones;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypes extends TeaModel {
        @NameInMap("SupportedDBType")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType> supportedDBType;

        public static DescribeAvailableResourceResponseBodySupportedDBTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypes self = new DescribeAvailableResourceResponseBodySupportedDBTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypes setSupportedDBType(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType> supportedDBType) {
            this.supportedDBType = supportedDBType;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBType> getSupportedDBType() {
            return this.supportedDBType;
        }

    }

}
