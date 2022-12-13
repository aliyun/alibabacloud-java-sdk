// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    // The type of the action that you want to perform on the vulnerability. Valid value: vul_fix.
    @NameInMap("OperateType")
    public String operateType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: a Linux software vulnerability
    // *   sys: a Windows system vulnerability
    @NameInMap("Type")
    public String type;

    @NameInMap("VulInfo")
    public java.util.List<DescribeFrontVulPatchListRequestVulInfo> vulInfo;

    public static DescribeFrontVulPatchListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListRequest self = new DescribeFrontVulPatchListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeFrontVulPatchListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFrontVulPatchListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFrontVulPatchListRequest setVulInfo(java.util.List<DescribeFrontVulPatchListRequestVulInfo> vulInfo) {
        this.vulInfo = vulInfo;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListRequestVulInfo> getVulInfo() {
        return this.vulInfo;
    }

    public static class DescribeFrontVulPatchListRequestVulInfo extends TeaModel {
        // The ID of the cloud desktop that is affected by vulnerability N. Valid values of N: 1 to 50.
        @NameInMap("DesktopId")
        public String desktopId;

        // The name of vulnerability N. Valid values of N: 1 to 50.
        @NameInMap("Name")
        public String name;

        // The tag of vulnerability N. Valid values of N: 1 to 50.
        @NameInMap("Tag")
        public String tag;

        public static DescribeFrontVulPatchListRequestVulInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListRequestVulInfo self = new DescribeFrontVulPatchListRequestVulInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListRequestVulInfo setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeFrontVulPatchListRequestVulInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFrontVulPatchListRequestVulInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
