// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsSwitchRuleCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdnsSwitchRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdnsSwitchRuleCategoryResponseBody self = new SdnsSwitchRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SdnsSwitchRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
