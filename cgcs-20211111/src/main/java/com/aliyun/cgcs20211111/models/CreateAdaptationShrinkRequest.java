// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAdaptationShrinkRequest extends TeaModel {
    @NameInMap("AdaptTarget")
    public String adaptTargetShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    public static CreateAdaptationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdaptationShrinkRequest self = new CreateAdaptationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdaptationShrinkRequest setAdaptTargetShrink(String adaptTargetShrink) {
        this.adaptTargetShrink = adaptTargetShrink;
        return this;
    }
    public String getAdaptTargetShrink() {
        return this.adaptTargetShrink;
    }

    public CreateAdaptationShrinkRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

}
