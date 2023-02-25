// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <br>
     * <p>*   **cdn_log_access_l1**: access logs of L1 Dynamic Route for CDN (DCDN) points of presence (POPs)</p>
     * <p>*   **cdn_log_origin**: back-to-origin logs</p>
     * <p>*   **cdn_log_er**: EdgeRoutine logs</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The list of fields. Separate multiple fields with commas (,). For more information, see [Fields in a real-time log](~~324199~~).</p>
     */
    @NameInMap("Fields")
    public String fields;

    public static UpdateDcdnUserRealTimeDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnUserRealTimeDeliveryFieldRequest self = new UpdateDcdnUserRealTimeDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnUserRealTimeDeliveryFieldRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateDcdnUserRealTimeDeliveryFieldRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

}
