// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ExpectDeductResourceRequest extends TeaModel {
    @NameInMap("body")
    public ExpectDeductResourceCmd body;

    public static ExpectDeductResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpectDeductResourceRequest self = new ExpectDeductResourceRequest();
        return TeaModel.build(map, self);
    }

    public ExpectDeductResourceRequest setBody(ExpectDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public ExpectDeductResourceCmd getBody() {
        return this.body;
    }

}
