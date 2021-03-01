// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableMockRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DisableMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMockRuleRequest self = new DisableMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableMockRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
