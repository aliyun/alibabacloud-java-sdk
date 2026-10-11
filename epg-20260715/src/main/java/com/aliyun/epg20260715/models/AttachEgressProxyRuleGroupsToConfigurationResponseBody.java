// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AttachEgressProxyRuleGroupsToConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11E669F9-B301-575C-AB02-C54E41ADFA4B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachEgressProxyRuleGroupsToConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachEgressProxyRuleGroupsToConfigurationResponseBody self = new AttachEgressProxyRuleGroupsToConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachEgressProxyRuleGroupsToConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
