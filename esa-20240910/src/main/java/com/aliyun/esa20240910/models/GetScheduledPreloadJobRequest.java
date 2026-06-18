// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetScheduledPreloadJobRequest extends TeaModel {
    /**
     * <p>The task ID of the scheduled preload job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetScheduledPreloadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledPreloadJobRequest self = new GetScheduledPreloadJobRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledPreloadJobRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
