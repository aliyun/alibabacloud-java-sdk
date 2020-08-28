// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("SilenceTime")
    public Long silenceTime;

    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("TemplateIds")
    @Validation(required = true)
    public String templateIds;

    @NameInMap("EnableStartTime")
    public Long enableStartTime;

    @NameInMap("EnableEndTime")
    public Long enableEndTime;

    @NameInMap("NotifyLevel")
    public Long notifyLevel;

    @NameInMap("ApplyMode")
    public String applyMode;

    @NameInMap("Webhook")
    public String webhook;

    public static ApplyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateRequest self = new ApplyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

}
