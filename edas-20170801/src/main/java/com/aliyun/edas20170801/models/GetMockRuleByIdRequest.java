// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByIdRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetMockRuleByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByIdRequest self = new GetMockRuleByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
