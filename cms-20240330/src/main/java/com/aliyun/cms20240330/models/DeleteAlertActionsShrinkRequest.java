// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertActionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertActionIds")
    public String alertActionIdsShrink;

    public static DeleteAlertActionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertActionsShrinkRequest self = new DeleteAlertActionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertActionsShrinkRequest setAlertActionIdsShrink(String alertActionIdsShrink) {
        this.alertActionIdsShrink = alertActionIdsShrink;
        return this;
    }
    public String getAlertActionIdsShrink() {
        return this.alertActionIdsShrink;
    }

}
