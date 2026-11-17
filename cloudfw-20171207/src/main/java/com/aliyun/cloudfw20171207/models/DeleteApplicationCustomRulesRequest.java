// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteApplicationCustomRulesRequest extends TeaModel {
    /**
     * <p>The list of IDs of the custom application rules to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationCustomRuleIds")
    public java.util.List<String> applicationCustomRuleIds;

    public static DeleteApplicationCustomRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationCustomRulesRequest self = new DeleteApplicationCustomRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationCustomRulesRequest setApplicationCustomRuleIds(java.util.List<String> applicationCustomRuleIds) {
        this.applicationCustomRuleIds = applicationCustomRuleIds;
        return this;
    }
    public java.util.List<String> getApplicationCustomRuleIds() {
        return this.applicationCustomRuleIds;
    }

}
