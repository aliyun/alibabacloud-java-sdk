// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SuspendTaskInstancesShrinkRequest extends TeaModel {
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
    public String idsShrink;

    public static SuspendTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendTaskInstancesShrinkRequest self = new SuspendTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SuspendTaskInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SuspendTaskInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
