// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveServiceRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("CdsName")
    public String cdsName;

    @NameInMap("MaxSize")
    public Long maxSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCloudDriveServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveServiceRequest self = new ModifyCloudDriveServiceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveServiceRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCloudDriveServiceRequest setCdsName(String cdsName) {
        this.cdsName = cdsName;
        return this;
    }
    public String getCdsName() {
        return this.cdsName;
    }

    public ModifyCloudDriveServiceRequest setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public ModifyCloudDriveServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
