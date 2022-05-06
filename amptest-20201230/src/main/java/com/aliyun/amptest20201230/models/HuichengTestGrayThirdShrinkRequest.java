// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayThirdShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayThirdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayThirdShrinkRequest self = new HuichengTestGrayThirdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayThirdShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
