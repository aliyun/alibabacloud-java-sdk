// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigImageRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image-d79x4k11pmg19****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The description of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-****</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ConfigImageRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigImageRemarkRequest self = new ConfigImageRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigImageRemarkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ConfigImageRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
