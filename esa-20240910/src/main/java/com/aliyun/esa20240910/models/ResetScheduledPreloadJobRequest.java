// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ResetScheduledPreloadJobRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled prefetch task.</p>
     * <blockquote>
     * <p>Notice: The ID of the scheduled prefetch task. This parameter is required. You can obtain the ID from the response of CreateScheduledPreloadJob after creating a task, or query the ID of an existing task by calling GetScheduledPreloadJob or ListScheduledPreloadJobs..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
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
