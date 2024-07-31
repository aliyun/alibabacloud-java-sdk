// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetAlertMessageRequest extends TeaModel {
    /**
     * <p>The alert ID. You can all the <a href="https://help.aliyun.com/document_detail/173961.html">ListAlertMessages</a> operation to obtain the alert ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1421</p>
     */
    @NameInMap("AlertId")
    public String alertId;

    public static GetAlertMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertMessageRequest self = new GetAlertMessageRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertMessageRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

}
