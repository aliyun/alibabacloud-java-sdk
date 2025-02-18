// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SetSuccessTaskInstancesRequest extends TeaModel {
    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID list of the task instance.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static SetSuccessTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessTaskInstancesRequest self = new SetSuccessTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public SetSuccessTaskInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SetSuccessTaskInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
