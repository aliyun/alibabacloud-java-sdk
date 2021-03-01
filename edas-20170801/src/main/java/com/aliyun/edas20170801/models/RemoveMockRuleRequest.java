// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RemoveMockRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static RemoveMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMockRuleRequest self = new RemoveMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMockRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
