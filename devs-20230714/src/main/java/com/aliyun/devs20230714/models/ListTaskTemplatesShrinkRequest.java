// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListTaskTemplatesShrinkRequest extends TeaModel {
    @NameInMap("labelSelector")
    public String labelSelectorShrink;

    public static ListTaskTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskTemplatesShrinkRequest self = new ListTaskTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskTemplatesShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

}
