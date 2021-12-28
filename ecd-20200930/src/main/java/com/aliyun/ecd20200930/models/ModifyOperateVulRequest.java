// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VulInfo")
    public java.util.List<ModifyOperateVulRequestVulInfo> vulInfo;

    public static ModifyOperateVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulRequest self = new ModifyOperateVulRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public ModifyOperateVulRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyOperateVulRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOperateVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyOperateVulRequest setVulInfo(java.util.List<ModifyOperateVulRequestVulInfo> vulInfo) {
        this.vulInfo = vulInfo;
        return this;
    }
    public java.util.List<ModifyOperateVulRequestVulInfo> getVulInfo() {
        return this.vulInfo;
    }

    public static class ModifyOperateVulRequestVulInfo extends TeaModel {
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Tag")
        public String tag;

        public static ModifyOperateVulRequestVulInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyOperateVulRequestVulInfo self = new ModifyOperateVulRequestVulInfo();
            return TeaModel.build(map, self);
        }

        public ModifyOperateVulRequestVulInfo setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyOperateVulRequestVulInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOperateVulRequestVulInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
