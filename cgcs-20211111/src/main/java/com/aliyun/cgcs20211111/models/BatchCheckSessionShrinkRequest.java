// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class BatchCheckSessionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public String recordsShrink;

    public static BatchCheckSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckSessionShrinkRequest self = new BatchCheckSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckSessionShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

}
