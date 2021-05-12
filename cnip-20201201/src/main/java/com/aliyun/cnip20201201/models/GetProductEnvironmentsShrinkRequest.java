// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentsShrinkRequest extends TeaModel {
    @NameInMap("productUID")
    public String productUID;

    @NameInMap("envType")
    public String envType;

    @NameInMap("platforms")
    public String platformsShrink;

    public static GetProductEnvironmentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentsShrinkRequest self = new GetProductEnvironmentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentsShrinkRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public GetProductEnvironmentsShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public GetProductEnvironmentsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

}
