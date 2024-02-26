// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNewestInnerGroupsShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    public static GetNewestInnerGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNewestInnerGroupsShrinkRequest self = new GetNewestInnerGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNewestInnerGroupsShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
