// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    @NameInMap("body")
    public ChangeResourceGroupInput body;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setBody(ChangeResourceGroupInput body) {
        this.body = body;
        return this;
    }
    public ChangeResourceGroupInput getBody() {
        return this.body;
    }

}
