// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleResponseBody extends TeaModel {
    /**
     * <p>The CNAME that is assigned by Sec-Traffic Manager for the scheduling rule.</p>
     * <blockquote>
     * <p>To enable the scheduling rule, you must map the domain name of the service to the CNAME.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>48k7b372gpl4****.aliyunddos0001.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8DFB602D-1AAC-46C4-90F2-C84086E7A6E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static CreateSchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerRuleResponseBody self = new CreateSchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerRuleResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public CreateSchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSchedulerRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
