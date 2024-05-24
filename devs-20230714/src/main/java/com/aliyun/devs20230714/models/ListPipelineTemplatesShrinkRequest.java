// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesShrinkRequest extends TeaModel {
    @NameInMap("labelSelector")
    public String labelSelectorShrink;

    public static ListPipelineTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesShrinkRequest self = new ListPipelineTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

}
