// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyElastictaskRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ModifyElastictaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElastictaskRequest self = new ModifyElastictaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElastictaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
