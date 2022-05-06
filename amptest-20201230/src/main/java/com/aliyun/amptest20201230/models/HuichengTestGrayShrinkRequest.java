// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayShrinkRequest self = new HuichengTestGrayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
