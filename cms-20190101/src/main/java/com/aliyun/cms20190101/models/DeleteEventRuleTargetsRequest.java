// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    public static DeleteEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleTargetsRequest self = new DeleteEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRuleTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DeleteEventRuleTargetsRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
