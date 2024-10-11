// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateSampleFormatConfigRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static CreateSampleFormatConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleFormatConfigRequest self = new CreateSampleFormatConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleFormatConfigRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
