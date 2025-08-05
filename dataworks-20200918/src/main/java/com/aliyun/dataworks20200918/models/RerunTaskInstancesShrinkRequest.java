// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RerunTaskInstancesShrinkRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Ids")
    public String idsShrink;

    public static RerunTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunTaskInstancesShrinkRequest self = new RerunTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RerunTaskInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RerunTaskInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
