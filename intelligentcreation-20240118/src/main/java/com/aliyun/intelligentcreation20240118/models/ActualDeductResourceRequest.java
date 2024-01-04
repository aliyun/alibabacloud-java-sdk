// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourceRequest extends TeaModel {
    @NameInMap("body")
    public ActualDeductResourceCmd body;

    public static ActualDeductResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourceRequest self = new ActualDeductResourceRequest();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourceRequest setBody(ActualDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public ActualDeductResourceCmd getBody() {
        return this.body;
    }

}
