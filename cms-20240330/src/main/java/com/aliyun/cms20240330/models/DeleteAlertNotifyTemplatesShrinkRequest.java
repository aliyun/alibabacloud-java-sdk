// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertNotifyTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertNotifyTemplateIds")
    public String alertNotifyTemplateIdsShrink;

    public static DeleteAlertNotifyTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertNotifyTemplatesShrinkRequest self = new DeleteAlertNotifyTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertNotifyTemplatesShrinkRequest setAlertNotifyTemplateIdsShrink(String alertNotifyTemplateIdsShrink) {
        this.alertNotifyTemplateIdsShrink = alertNotifyTemplateIdsShrink;
        return this;
    }
    public String getAlertNotifyTemplateIdsShrink() {
        return this.alertNotifyTemplateIdsShrink;
    }

}
