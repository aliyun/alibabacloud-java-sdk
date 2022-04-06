// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRuleRequest extends TeaModel {
    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    @NameInMap("Id")
    public String id;

    public static GetRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleRequest self = new GetRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public GetRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
