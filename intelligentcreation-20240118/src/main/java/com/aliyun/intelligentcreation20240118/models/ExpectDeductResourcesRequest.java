// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ExpectDeductResourcesRequest extends TeaModel {
    @NameInMap("body")
    public ExpectDeductResourceCmd body;

    public static ExpectDeductResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpectDeductResourcesRequest self = new ExpectDeductResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ExpectDeductResourcesRequest setBody(ExpectDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public ExpectDeductResourceCmd getBody() {
        return this.body;
    }

}
