// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorSLSGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSGroupConfig")
    public java.util.List<CreateHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig;

    @NameInMap("SLSGroupDescription")
    public String SLSGroupDescription;

    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static CreateHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorSLSGroupRequest self = new CreateHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridMonitorSLSGroupRequest setSLSGroupConfig(java.util.List<CreateHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig) {
        this.SLSGroupConfig = SLSGroupConfig;
        return this;
    }
    public java.util.List<CreateHybridMonitorSLSGroupRequestSLSGroupConfig> getSLSGroupConfig() {
        return this.SLSGroupConfig;
    }

    public CreateHybridMonitorSLSGroupRequest setSLSGroupDescription(String SLSGroupDescription) {
        this.SLSGroupDescription = SLSGroupDescription;
        return this;
    }
    public String getSLSGroupDescription() {
        return this.SLSGroupDescription;
    }

    public CreateHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static class CreateHybridMonitorSLSGroupRequestSLSGroupConfig extends TeaModel {
        @NameInMap("SLSLogstore")
        public String SLSLogstore;

        @NameInMap("SLSProject")
        public String SLSProject;

        @NameInMap("SLSRegion")
        public String SLSRegion;

        @NameInMap("SLSUserId")
        public String SLSUserId;

        public static CreateHybridMonitorSLSGroupRequestSLSGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorSLSGroupRequestSLSGroupConfig self = new CreateHybridMonitorSLSGroupRequestSLSGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorSLSGroupRequestSLSGroupConfig setSLSLogstore(String SLSLogstore) {
            this.SLSLogstore = SLSLogstore;
            return this;
        }
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        public CreateHybridMonitorSLSGroupRequestSLSGroupConfig setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public CreateHybridMonitorSLSGroupRequestSLSGroupConfig setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public CreateHybridMonitorSLSGroupRequestSLSGroupConfig setSLSUserId(String SLSUserId) {
            this.SLSUserId = SLSUserId;
            return this;
        }
        public String getSLSUserId() {
            return this.SLSUserId;
        }

    }

}
