// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayNineShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayNineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayNineShrinkRequest self = new HuichengTestGrayNineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayNineShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
