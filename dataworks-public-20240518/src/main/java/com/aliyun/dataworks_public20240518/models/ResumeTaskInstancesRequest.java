// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ResumeTaskInstancesRequest extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The list of node instance IDs.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static ResumeTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeTaskInstancesRequest self = new ResumeTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ResumeTaskInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ResumeTaskInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
