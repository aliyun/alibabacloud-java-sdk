// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsShrinkRequest extends TeaModel {
    // 兼容版本产品版本id
    @NameInMap("compatibleProductVersionUID")
    public String compatibleProductVersionUID;

    @NameInMap("envType")
    public String envType;

    @NameInMap("platforms")
    public String platformsShrink;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductEnvironmentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvironmentsShrinkRequest self = new ListProductEnvironmentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductEnvironmentsShrinkRequest setCompatibleProductVersionUID(String compatibleProductVersionUID) {
        this.compatibleProductVersionUID = compatibleProductVersionUID;
        return this;
    }
    public String getCompatibleProductVersionUID() {
        return this.compatibleProductVersionUID;
    }

    public ListProductEnvironmentsShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListProductEnvironmentsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

    public ListProductEnvironmentsShrinkRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
