// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class UpdateToolsetRequest extends TeaModel {
    @NameInMap("body")
    public Toolset body;

    public static UpdateToolsetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateToolsetRequest self = new UpdateToolsetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateToolsetRequest setBody(Toolset body) {
        this.body = body;
        return this;
    }
    public Toolset getBody() {
        return this.body;
    }

}
