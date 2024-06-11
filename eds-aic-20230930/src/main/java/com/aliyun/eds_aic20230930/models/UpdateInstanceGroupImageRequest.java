// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceGroupImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    public static UpdateInstanceGroupImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceGroupImageRequest self = new UpdateInstanceGroupImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceGroupImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateInstanceGroupImageRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

}
