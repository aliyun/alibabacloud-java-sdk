// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadExecutionsRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled preload task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("Id")
    public String id;

    public static ListScheduledPreloadExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadExecutionsRequest self = new ListScheduledPreloadExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadExecutionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
