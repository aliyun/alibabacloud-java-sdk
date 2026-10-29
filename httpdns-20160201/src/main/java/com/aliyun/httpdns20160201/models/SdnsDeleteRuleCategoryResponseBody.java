// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsDeleteRuleCategoryResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to troubleshoot API call issues. This is not the policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdnsDeleteRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdnsDeleteRuleCategoryResponseBody self = new SdnsDeleteRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SdnsDeleteRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
