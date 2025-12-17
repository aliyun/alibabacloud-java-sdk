// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateWuyingServerImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-0aae4rgk9****6e8p</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The product type. Set this parameter to WuyingServer.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the workstation.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static UpdateWuyingServerImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWuyingServerImageRequest self = new UpdateWuyingServerImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWuyingServerImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateWuyingServerImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateWuyingServerImageRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
