// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProRequest extends TeaModel {
    /**
     * <p>The call type. Valid values:</p>
     * <ul>
     * <li>true: asynchronous.</li>
     * <li>false: synchronous.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The URL of the image to process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cbu01.alicdn.com/imgextra/i2/1067106875/O1CN013rvpXP20enxPQttb3_!!4611686018427380283-0-item_pic.jpg">https://cbu01.alicdn.com/imgextra/i2/1067106875/O1CN013rvpXP20enxPQttb3_!!4611686018427380283-0-item_pic.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static ImageRemovalProRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProRequest self = new ImageRemovalProRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ImageRemovalProRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
