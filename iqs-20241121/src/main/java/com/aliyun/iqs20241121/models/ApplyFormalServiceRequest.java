// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ApplyFormalServiceRequest extends TeaModel {
    @NameInMap("body")
    public ApplyFormalServiceCmd body;

    public static ApplyFormalServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFormalServiceRequest self = new ApplyFormalServiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFormalServiceRequest setBody(ApplyFormalServiceCmd body) {
        this.body = body;
        return this;
    }
    public ApplyFormalServiceCmd getBody() {
        return this.body;
    }

}
