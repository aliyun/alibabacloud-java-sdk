// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateFileTagShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateFileTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileTagShrinkRequest self = new UpdateFileTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileTagShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
