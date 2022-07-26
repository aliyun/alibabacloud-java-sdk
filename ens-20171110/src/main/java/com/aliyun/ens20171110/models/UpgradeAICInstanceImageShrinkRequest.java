// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeAICInstanceImageShrinkRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ServerIds")
    public String serverIdsShrink;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpgradeAICInstanceImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAICInstanceImageShrinkRequest self = new UpgradeAICInstanceImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAICInstanceImageShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeAICInstanceImageShrinkRequest setServerIdsShrink(String serverIdsShrink) {
        this.serverIdsShrink = serverIdsShrink;
        return this;
    }
    public String getServerIdsShrink() {
        return this.serverIdsShrink;
    }

    public UpgradeAICInstanceImageShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
