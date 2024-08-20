// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <ul>
     * <li><strong>cdn_log_access_l1</strong>: access logs of L1 Dynamic Route for CDN (DCDN) points of presence (POPs)</li>
     * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
     * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The list of fields. Separate multiple fields with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/324199.html">Fields in a real-time log</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>body_bytes_sent,client_ip,content_type</p>
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
