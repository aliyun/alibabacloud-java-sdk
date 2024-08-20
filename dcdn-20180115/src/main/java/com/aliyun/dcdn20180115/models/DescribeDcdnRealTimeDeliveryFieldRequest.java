// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRealTimeDeliveryFieldRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <ul>
     * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
     * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
     * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    public static DescribeDcdnRealTimeDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRealTimeDeliveryFieldRequest self = new DescribeDcdnRealTimeDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRealTimeDeliveryFieldRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
