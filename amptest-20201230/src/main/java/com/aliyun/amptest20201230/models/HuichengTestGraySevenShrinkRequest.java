// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySevenShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGraySevenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySevenShrinkRequest self = new HuichengTestGraySevenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySevenShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
