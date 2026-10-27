// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertActionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("alertActionIds")
    public java.util.List<String> alertActionIds;

    public static DeleteAlertActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertActionsRequest self = new DeleteAlertActionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertActionsRequest setAlertActionIds(java.util.List<String> alertActionIds) {
        this.alertActionIds = alertActionIds;
        return this;
    }
    public java.util.List<String> getAlertActionIds() {
        return this.alertActionIds;
    }

}
