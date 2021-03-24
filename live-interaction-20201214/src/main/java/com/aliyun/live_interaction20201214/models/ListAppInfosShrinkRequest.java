// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListAppInfosShrinkRequest extends TeaModel {
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static ListAppInfosShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfosShrinkRequest self = new ListAppInfosShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfosShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
