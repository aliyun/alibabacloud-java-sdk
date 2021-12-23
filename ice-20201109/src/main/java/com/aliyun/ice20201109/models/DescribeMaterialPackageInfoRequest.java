// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMaterialPackageInfoRequest extends TeaModel {
    @NameInMap("MaterialPackageId")
    public String materialPackageId;

    @NameInMap("MaterialPackageType")
    public String materialPackageType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static DescribeMaterialPackageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaterialPackageInfoRequest self = new DescribeMaterialPackageInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMaterialPackageInfoRequest setMaterialPackageId(String materialPackageId) {
        this.materialPackageId = materialPackageId;
        return this;
    }
    public String getMaterialPackageId() {
        return this.materialPackageId;
    }

    public DescribeMaterialPackageInfoRequest setMaterialPackageType(String materialPackageType) {
        this.materialPackageType = materialPackageType;
        return this;
    }
    public String getMaterialPackageType() {
        return this.materialPackageType;
    }

    public DescribeMaterialPackageInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMaterialPackageInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
