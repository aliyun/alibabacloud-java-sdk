// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class StopTaskInstancesShrinkRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Ids")
    public String idsShrink;

    public static StopTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTaskInstancesShrinkRequest self = new StopTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopTaskInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public StopTaskInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
