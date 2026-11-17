// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of IDs of the newly created web filtering rules. The order of the IDs corresponds one-to-one with the order of the input Rules parameter.</p>
     */
    @NameInMap("WebFilterRuleIds")
    public java.util.List<String> webFilterRuleIds;

    public static CreateWebFilterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterRulesResponseBody self = new CreateWebFilterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWebFilterRulesResponseBody setWebFilterRuleIds(java.util.List<String> webFilterRuleIds) {
        this.webFilterRuleIds = webFilterRuleIds;
        return this;
    }
    public java.util.List<String> getWebFilterRuleIds() {
        return this.webFilterRuleIds;
    }

}
