// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopWorkflowInstancesRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The workflow instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static StopWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopWorkflowInstancesRequest self = new StopWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StopWorkflowInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public StopWorkflowInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
