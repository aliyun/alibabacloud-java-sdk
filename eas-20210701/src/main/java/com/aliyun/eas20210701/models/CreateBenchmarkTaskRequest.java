// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateBenchmarkTaskRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CreateBenchmarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBenchmarkTaskRequest self = new CreateBenchmarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBenchmarkTaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
