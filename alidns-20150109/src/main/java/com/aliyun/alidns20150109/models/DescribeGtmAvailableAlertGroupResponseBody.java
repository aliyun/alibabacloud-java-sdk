// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAvailableAlertGroupResponseBody extends TeaModel {
    /**
     * <p>The available alert groups of the GTM instance.</p>
     */
    @NameInMap("AvailableAlertGroup")
    public String availableAlertGroup;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGtmAvailableAlertGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAvailableAlertGroupResponseBody self = new DescribeGtmAvailableAlertGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAvailableAlertGroupResponseBody setAvailableAlertGroup(String availableAlertGroup) {
        this.availableAlertGroup = availableAlertGroup;
        return this;
    }
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

    public DescribeGtmAvailableAlertGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
