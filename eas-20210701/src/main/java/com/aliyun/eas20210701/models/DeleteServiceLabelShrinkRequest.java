// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelShrinkRequest extends TeaModel {
    /**
     * <p>The service tags that you want to delete.</p>
     */
    @NameInMap("Keys")
    @Deprecated
    public String keysShrink;

    @NameInMap("LabelKeys")
    public String labelKeysShrink;

    public static DeleteServiceLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelShrinkRequest self = new DeleteServiceLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteServiceLabelShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public DeleteServiceLabelShrinkRequest setLabelKeysShrink(String labelKeysShrink) {
        this.labelKeysShrink = labelKeysShrink;
        return this;
    }
    public String getLabelKeysShrink() {
        return this.labelKeysShrink;
    }

}
