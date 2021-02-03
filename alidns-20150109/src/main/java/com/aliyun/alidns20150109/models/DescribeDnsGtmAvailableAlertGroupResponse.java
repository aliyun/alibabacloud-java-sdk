// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableAlertGroup")
    @Validation(required = true)
    public String availableAlertGroup;

    public static DescribeDnsGtmAvailableAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAvailableAlertGroupResponse self = new DescribeDnsGtmAvailableAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAvailableAlertGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAvailableAlertGroupResponse setAvailableAlertGroup(String availableAlertGroup) {
        this.availableAlertGroup = availableAlertGroup;
        return this;
    }
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

}
