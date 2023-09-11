// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRuleRequest self = new DeleteNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
