// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingStatusShrinkRequest extends TeaModel {
    // 原图纸id
    @NameInMap("Ids")
    public String idsShrink;

    public static GetBimDrawingStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingStatusShrinkRequest self = new GetBimDrawingStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingStatusShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
