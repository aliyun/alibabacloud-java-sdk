// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelShrinkRequest extends TeaModel {
    /**
     * <p>The service tags that you want to delete.</p>
     */
    @NameInMap("Keys")
    public String keysShrink;

    public static DeleteServiceLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelShrinkRequest self = new DeleteServiceLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLabelShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

}
