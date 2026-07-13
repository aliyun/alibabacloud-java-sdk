// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAvailableAlertGroupResponseBody extends TeaModel {
    /**
     * <p>The available alert contact groups.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;研发组\&quot;,\&quot;GTM测试组\&quot;]</p>
     */
    @NameInMap("AvailableAlertGroup")
    public String availableAlertGroup;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
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
