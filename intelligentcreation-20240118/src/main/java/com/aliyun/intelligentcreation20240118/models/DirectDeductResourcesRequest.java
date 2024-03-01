// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourcesRequest extends TeaModel {
    @NameInMap("body")
    public DirectDeductResourceCmd body;

    public static DirectDeductResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourcesRequest self = new DirectDeductResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourcesRequest setBody(DirectDeductResourceCmd body) {
        this.body = body;
        return this;
    }
    public DirectDeductResourceCmd getBody() {
        return this.body;
    }

}
