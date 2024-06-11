// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteImagesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageIds")
    public String imageIdsShrink;

    public static DeleteImagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesShrinkRequest self = new DeleteImagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImagesShrinkRequest setImageIdsShrink(String imageIdsShrink) {
        this.imageIdsShrink = imageIdsShrink;
        return this;
    }
    public String getImageIdsShrink() {
        return this.imageIdsShrink;
    }

}
