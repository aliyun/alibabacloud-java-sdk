// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateStressRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static UpdateStressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStressRequest self = new UpdateStressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStressRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
