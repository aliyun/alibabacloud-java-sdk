// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFifthShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayFifthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFifthShrinkRequest self = new HuichengTestGrayFifthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFifthShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
