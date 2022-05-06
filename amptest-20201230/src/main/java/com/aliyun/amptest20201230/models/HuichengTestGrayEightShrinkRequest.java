// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayEightShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayEightShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayEightShrinkRequest self = new HuichengTestGrayEightShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayEightShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
