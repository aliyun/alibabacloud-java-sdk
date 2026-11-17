// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteWebFilterRulesRequest extends TeaModel {
    /**
     * <p>The list of web filtering rule IDs to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WebFilterRuleIds")
    public java.util.List<String> webFilterRuleIds;

    public static DeleteWebFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFilterRulesRequest self = new DeleteWebFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebFilterRulesRequest setWebFilterRuleIds(java.util.List<String> webFilterRuleIds) {
        this.webFilterRuleIds = webFilterRuleIds;
        return this;
    }
    public java.util.List<String> getWebFilterRuleIds() {
        return this.webFilterRuleIds;
    }

}
