// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableMockRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static EnableMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMockRuleRequest self = new EnableMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableMockRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
