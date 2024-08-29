// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleRequest extends TeaModel {
    /**
     * <p>The identifier of the managed rule.</p>
     * <p>For more information about how to obtain the identifier of a managed rule, see <a href="https://help.aliyun.com/document_detail/421144.html">ListManagedRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-domain-https-enabled</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static GetManagedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetManagedRuleRequest self = new GetManagedRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetManagedRuleRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
