// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ResumeTaskInstancesShrinkRequest extends TeaModel {
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

    public static ResumeTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeTaskInstancesShrinkRequest self = new ResumeTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResumeTaskInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ResumeTaskInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
