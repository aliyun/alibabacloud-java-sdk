// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateImageInfoRequest extends TeaModel {
    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("VmType")
    public String vmType;

    public static UpdateImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfoRequest self = new UpdateImageInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfoRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UpdateImageInfoRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public UpdateImageInfoRequest setVmType(String vmType) {
        this.vmType = vmType;
        return this;
    }
    public String getVmType() {
        return this.vmType;
    }

}
