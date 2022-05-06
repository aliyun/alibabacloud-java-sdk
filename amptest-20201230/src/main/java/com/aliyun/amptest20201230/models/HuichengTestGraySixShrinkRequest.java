// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySixShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGraySixShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySixShrinkRequest self = new HuichengTestGraySixShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySixShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
