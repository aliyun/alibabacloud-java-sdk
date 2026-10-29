// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class UpdateSdnsRuleCategoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to troubleshoot call issues. This ID is not the policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSdnsRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSdnsRuleCategoryResponseBody self = new UpdateSdnsRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSdnsRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
