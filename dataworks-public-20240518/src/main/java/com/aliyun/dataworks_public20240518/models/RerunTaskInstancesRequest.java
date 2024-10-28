// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunTaskInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static RerunTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunTaskInstancesRequest self = new RerunTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RerunTaskInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RerunTaskInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
