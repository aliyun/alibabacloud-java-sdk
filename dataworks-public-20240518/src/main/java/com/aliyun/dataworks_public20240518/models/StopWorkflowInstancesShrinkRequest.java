// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopWorkflowInstancesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    public static StopWorkflowInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopWorkflowInstancesShrinkRequest self = new StopWorkflowInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopWorkflowInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public StopWorkflowInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
