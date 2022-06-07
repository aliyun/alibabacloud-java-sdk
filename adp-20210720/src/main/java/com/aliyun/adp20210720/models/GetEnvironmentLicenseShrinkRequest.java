// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentLicenseShrinkRequest extends TeaModel {
    @NameInMap("options")
    public String optionsShrink;

    public static GetEnvironmentLicenseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLicenseShrinkRequest self = new GetEnvironmentLicenseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLicenseShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

}
