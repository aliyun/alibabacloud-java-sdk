// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeAICInstanceImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpgradeAICInstanceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAICInstanceImageRequest self = new UpgradeAICInstanceImageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAICInstanceImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeAICInstanceImageRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    public UpgradeAICInstanceImageRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
