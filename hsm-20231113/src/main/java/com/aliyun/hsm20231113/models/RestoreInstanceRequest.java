// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class RestoreInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the image that you want to use to restore the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image-eaOGHkRDQgh4****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-mp90fxef****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RestoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreInstanceRequest self = new RestoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestoreInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RestoreInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
