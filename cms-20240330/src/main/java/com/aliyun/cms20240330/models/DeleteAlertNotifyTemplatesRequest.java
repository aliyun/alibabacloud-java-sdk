// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertNotifyTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertNotifyTemplateIds")
    public java.util.List<String> alertNotifyTemplateIds;

    public static DeleteAlertNotifyTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertNotifyTemplatesRequest self = new DeleteAlertNotifyTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertNotifyTemplatesRequest setAlertNotifyTemplateIds(java.util.List<String> alertNotifyTemplateIds) {
        this.alertNotifyTemplateIds = alertNotifyTemplateIds;
        return this;
    }
    public java.util.List<String> getAlertNotifyTemplateIds() {
        return this.alertNotifyTemplateIds;
    }

}
