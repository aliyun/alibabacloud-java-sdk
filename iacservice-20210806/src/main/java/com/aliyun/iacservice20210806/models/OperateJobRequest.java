// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class OperateJobRequest extends TeaModel {
    @NameInMap("comment")
    public String comment;

    public static OperateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateJobRequest self = new OperateJobRequest();
        return TeaModel.build(map, self);
    }

    public OperateJobRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
