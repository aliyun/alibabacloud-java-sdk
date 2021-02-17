// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource extends TeaModel {
        @NameInMap("InstanceClassRemark")
        public String instanceClassRemark;

        @NameInMap("InstanceClass")
        public String instanceClass;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource setInstanceClassRemark(String instanceClassRemark) {
            this.instanceClassRemark = instanceClassRemark;
            return this;
        }
        public String getInstanceClassRemark() {
            return this.instanceClassRemark;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources setAvailableResource(java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType extends TeaModel {
        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("NetworkTypes")
        public String networkTypes;

        @NameInMap("AvailableResources")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources availableResources;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setNetworkTypes(String networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public String getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeType setAvailableResources(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypesSupportedNodeTypeAvailableResources getAvailableResources() {
            return this.availableResources;
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
        @NameInMap("SupportedNodeTypes")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes supportedNodeTypes;

        @NameInMap("Engine")
        public String engine;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine setSupportedNodeTypes(DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes supportedNodeTypes) {
            this.supportedNodeTypes = supportedNodeTypes;
            return this;
        }
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngineSupportedNodeTypes getSupportedNodeTypes() {
            return this.supportedNodeTypes;
        }

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEnginesSupportedEngine setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
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
        @NameInMap("SupportedEngines")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersionsSupportedEngineVersionSupportedEngines supportedEngines;

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
        @NameInMap("SupportedEngineVersions")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZoneSupportedEngineVersions supportedEngineVersions;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
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

        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
        @NameInMap("AvailableZones")
        public DescribeAvailableResourceResponseBodySupportedDBTypesSupportedDBTypeAvailableZones availableZones;

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
