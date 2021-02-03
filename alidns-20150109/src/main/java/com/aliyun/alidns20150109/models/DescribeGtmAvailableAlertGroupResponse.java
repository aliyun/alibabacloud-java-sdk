// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAvailableAlertGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableAlertGroup")
    @Validation(required = true)
    public String availableAlertGroup;

    public static DescribeGtmAvailableAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAvailableAlertGroupResponse self = new DescribeGtmAvailableAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAvailableAlertGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAvailableAlertGroupResponse setAvailableAlertGroup(String availableAlertGroup) {
        this.availableAlertGroup = availableAlertGroup;
        return this;
    }
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

}
