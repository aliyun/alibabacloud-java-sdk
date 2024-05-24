// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelinesShrinkRequest extends TeaModel {
    @NameInMap("labelSelector")
    public String labelSelectorShrink;

    public static ListPipelinesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesShrinkRequest self = new ListPipelinesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

}
