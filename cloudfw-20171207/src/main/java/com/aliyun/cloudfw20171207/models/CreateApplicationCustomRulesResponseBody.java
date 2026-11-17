// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationCustomRulesResponseBody extends TeaModel {
    /**
     * <p>The list of IDs for the newly created custom application rules. The order of the IDs corresponds to the order of the rules in the Rules request parameter.</p>
     */
    @NameInMap("ApplicationCustomRuleIds")
    public java.util.List<String> applicationCustomRuleIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationCustomRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationCustomRulesResponseBody self = new CreateApplicationCustomRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationCustomRulesResponseBody setApplicationCustomRuleIds(java.util.List<String> applicationCustomRuleIds) {
        this.applicationCustomRuleIds = applicationCustomRuleIds;
        return this;
    }
    public java.util.List<String> getApplicationCustomRuleIds() {
        return this.applicationCustomRuleIds;
    }

    public CreateApplicationCustomRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
