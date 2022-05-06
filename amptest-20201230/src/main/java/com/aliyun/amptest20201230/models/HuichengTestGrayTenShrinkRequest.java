// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayTenShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static HuichengTestGrayTenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayTenShrinkRequest self = new HuichengTestGrayTenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayTenShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
