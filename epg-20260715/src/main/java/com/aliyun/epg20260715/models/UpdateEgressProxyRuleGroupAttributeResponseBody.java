// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyRuleGroupAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>01A05AB5-5BED-56ED-8EE9-304FBC2F8537</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEgressProxyRuleGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyRuleGroupAttributeResponseBody self = new UpdateEgressProxyRuleGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyRuleGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
