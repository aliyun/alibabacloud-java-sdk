// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VulInfo")
    public java.util.List<DescribeFrontVulPatchListRequestVulInfo> vulInfo;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static DescribeFrontVulPatchListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListRequest self = new DescribeFrontVulPatchListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFrontVulPatchListRequest setVulInfo(java.util.List<DescribeFrontVulPatchListRequestVulInfo> vulInfo) {
        this.vulInfo = vulInfo;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListRequestVulInfo> getVulInfo() {
        return this.vulInfo;
    }

    public DescribeFrontVulPatchListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeFrontVulPatchListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeFrontVulPatchListRequestVulInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Tag")
        public String tag;

        public static DescribeFrontVulPatchListRequestVulInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListRequestVulInfo self = new DescribeFrontVulPatchListRequestVulInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListRequestVulInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFrontVulPatchListRequestVulInfo setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
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
