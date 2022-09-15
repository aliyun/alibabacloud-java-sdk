// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsShrinkRequest extends TeaModel {
    @NameInMap("compatibleProductVersionUID")
    public String compatibleProductVersionUID;

    @NameInMap("envType")
    public String envType;

    @NameInMap("options")
    public String optionsShrink;

    @NameInMap("platforms")
    public String platformsShrink;

    @NameInMap("productVersionSpecUID")
    public String productVersionSpecUID;

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

    public ListProductEnvironmentsShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public ListProductEnvironmentsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

    public ListProductEnvironmentsShrinkRequest setProductVersionSpecUID(String productVersionSpecUID) {
        this.productVersionSpecUID = productVersionSpecUID;
        return this;
    }
    public String getProductVersionSpecUID() {
        return this.productVersionSpecUID;
    }

    public ListProductEnvironmentsShrinkRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
