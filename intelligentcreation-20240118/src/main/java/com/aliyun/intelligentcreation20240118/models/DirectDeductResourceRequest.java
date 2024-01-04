// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourceRequest extends TeaModel {
    @NameInMap("body")
    public DirectDeductResourceCmd body;

    public static DirectDeductResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourceRequest self = new DirectDeductResourceRequest();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourceRequest setBody(DirectDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public DirectDeductResourceCmd getBody() {
        return this.body;
    }

}
