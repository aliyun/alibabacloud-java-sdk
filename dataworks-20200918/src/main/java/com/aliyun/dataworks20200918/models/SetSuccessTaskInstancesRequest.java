// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SetSuccessTaskInstancesRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

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
