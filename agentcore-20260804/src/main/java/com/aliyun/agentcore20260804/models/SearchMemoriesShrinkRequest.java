// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SearchMemoriesShrinkRequest extends TeaModel {
    /**
     * <p>The semantic retrieval request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static SearchMemoriesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesShrinkRequest self = new SearchMemoriesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
