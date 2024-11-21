// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ResetScheduledPreloadJobRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled prefetch task.</p>
     * 
     * <strong>example:</strong>
     * <p>ResetScheduledPreloadJob</p>
     */
    @NameInMap("Id")
    public String id;

    public static ResetScheduledPreloadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetScheduledPreloadJobRequest self = new ResetScheduledPreloadJobRequest();
        return TeaModel.build(map, self);
    }

    public ResetScheduledPreloadJobRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
