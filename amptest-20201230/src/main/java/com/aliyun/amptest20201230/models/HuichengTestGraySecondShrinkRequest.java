// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySecondShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGraySecondShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySecondShrinkRequest self = new HuichengTestGraySecondShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySecondShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
