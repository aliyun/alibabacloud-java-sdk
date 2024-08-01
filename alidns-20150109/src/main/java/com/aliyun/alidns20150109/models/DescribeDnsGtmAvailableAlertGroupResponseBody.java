// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupResponseBody extends TeaModel {
    /**
     * <p>The returned available alert groups.</p>
     */
    @NameInMap("AvailableAlertGroup")
    public String availableAlertGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDnsGtmAvailableAlertGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAvailableAlertGroupResponseBody self = new DescribeDnsGtmAvailableAlertGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAvailableAlertGroupResponseBody setAvailableAlertGroup(String availableAlertGroup) {
        this.availableAlertGroup = availableAlertGroup;
        return this;
    }
    public String getAvailableAlertGroup() {
        return this.availableAlertGroup;
    }

    public DescribeDnsGtmAvailableAlertGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
