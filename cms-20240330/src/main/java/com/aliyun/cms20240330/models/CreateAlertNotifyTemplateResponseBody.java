// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertNotifyTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the notification template.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("alertNotifyTemplateId")
    public String alertNotifyTemplateId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8A33DBEA-<em><strong><strong>-</strong></strong></em>-<em><strong><strong>-</strong></strong></em></p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAlertNotifyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertNotifyTemplateResponseBody self = new CreateAlertNotifyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertNotifyTemplateResponseBody setAlertNotifyTemplateId(String alertNotifyTemplateId) {
        this.alertNotifyTemplateId = alertNotifyTemplateId;
        return this;
    }
    public String getAlertNotifyTemplateId() {
        return this.alertNotifyTemplateId;
    }

    public CreateAlertNotifyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
