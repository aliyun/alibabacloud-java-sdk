// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopTaskInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static StopTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTaskInstancesRequest self = new StopTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StopTaskInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public StopTaskInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
