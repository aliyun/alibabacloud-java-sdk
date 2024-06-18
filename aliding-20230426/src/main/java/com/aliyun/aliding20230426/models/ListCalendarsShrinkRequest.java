// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListCalendarsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Request")
    public String requestShrink;

    public static ListCalendarsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsShrinkRequest self = new ListCalendarsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCalendarsShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
