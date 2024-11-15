// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteHaVipsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HaVipIds")
    public String haVipIdsShrink;

    public static DeleteHaVipsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipsShrinkRequest self = new DeleteHaVipsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipsShrinkRequest setHaVipIdsShrink(String haVipIdsShrink) {
        this.haVipIdsShrink = haVipIdsShrink;
        return this;
    }
    public String getHaVipIdsShrink() {
        return this.haVipIdsShrink;
    }

}
