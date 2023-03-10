// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySchedulerRuleResponseBody extends TeaModel {
    /**
     * <p>The CNAME that is assigned by Sec-Traffic Manager for the scheduling rule.</p>
     * <br>
     * <p>> To enable the scheduling rule, you must map the domain name of the service to the CNAME.</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifySchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySchedulerRuleResponseBody self = new ModifySchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySchedulerRuleResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public ModifySchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySchedulerRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
