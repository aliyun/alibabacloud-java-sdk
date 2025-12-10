// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ShareAICImageShrinkRequest extends TeaModel {
    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The user groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public String usersShrink;

    public static ShareAICImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareAICImageShrinkRequest self = new ShareAICImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ShareAICImageShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ShareAICImageShrinkRequest setUsersShrink(String usersShrink) {
        this.usersShrink = usersShrink;
        return this;
    }
    public String getUsersShrink() {
        return this.usersShrink;
    }

}
