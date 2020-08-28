// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRuleRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    public static GetRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleRequest self = new GetRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
