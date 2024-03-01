// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourcesRequest extends TeaModel {
    @NameInMap("body")
    public ActualDeductResourceCmd body;

    public static ActualDeductResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourcesRequest self = new ActualDeductResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourcesRequest setBody(ActualDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public ActualDeductResourceCmd getBody() {
        return this.body;
    }

}
