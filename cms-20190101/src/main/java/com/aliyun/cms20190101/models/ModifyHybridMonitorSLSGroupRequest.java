// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorSLSGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSGroupConfig")
    public java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig;

    @NameInMap("SLSGroupDescription")
    public String SLSGroupDescription;

    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static ModifyHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorSLSGroupRequest self = new ModifyHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupConfig(java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig) {
        this.SLSGroupConfig = SLSGroupConfig;
        return this;
    }
    public java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> getSLSGroupConfig() {
        return this.SLSGroupConfig;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupDescription(String SLSGroupDescription) {
        this.SLSGroupDescription = SLSGroupDescription;
        return this;
    }
    public String getSLSGroupDescription() {
        return this.SLSGroupDescription;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static class ModifyHybridMonitorSLSGroupRequestSLSGroupConfig extends TeaModel {
        @NameInMap("SLSLogstore")
        public String SLSLogstore;

        @NameInMap("SLSProject")
        public String SLSProject;

        @NameInMap("SLSRegion")
        public String SLSRegion;

        @NameInMap("SLSUserId")
        public String SLSUserId;

        public static ModifyHybridMonitorSLSGroupRequestSLSGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorSLSGroupRequestSLSGroupConfig self = new ModifyHybridMonitorSLSGroupRequestSLSGroupConfig();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSLogstore(String SLSLogstore) {
            this.SLSLogstore = SLSLogstore;
            return this;
        }
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSUserId(String SLSUserId) {
            this.SLSUserId = SLSUserId;
            return this;
        }
        public String getSLSUserId() {
            return this.SLSUserId;
        }

    }

}
