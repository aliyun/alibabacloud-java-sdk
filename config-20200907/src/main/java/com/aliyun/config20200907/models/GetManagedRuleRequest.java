// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleRequest extends TeaModel {
    /**
     * <p>The identifier of the managed rule.</p>
     * <br>
     * <p>You can call the [ListManagedRules](https://help.aliyun.com/document_detail/421144.html) operation to obtain the managed rule identifier.</p>
     * <br>
     * <p>This parameter is required.</p>
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
