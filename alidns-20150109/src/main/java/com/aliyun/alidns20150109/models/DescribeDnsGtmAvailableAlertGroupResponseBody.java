// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableAlertGroup")
    public String availableAlertGroup;

    public static DescribeDnsGtmAvailableAlertGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAvailableAlertGroupResponseBody self = new DescribeDnsGtmAvailableAlertGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAvailableAlertGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAvailableAlertGroupResponseBody setAvailableAlertGroup(String availableAlertGroup) {
        this.availableAlertGroup = availableAlertGroup;
        return this;
    }
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

}
