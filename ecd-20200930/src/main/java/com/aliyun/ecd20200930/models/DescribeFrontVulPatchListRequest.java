// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Name")
        public String name;

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
