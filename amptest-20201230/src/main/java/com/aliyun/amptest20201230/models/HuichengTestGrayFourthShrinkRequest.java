// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFourthShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayFourthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFourthShrinkRequest self = new HuichengTestGrayFourthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFourthShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
