// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class StartWorkflowInstancesRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static StartWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowInstancesRequest self = new StartWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public StartWorkflowInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
