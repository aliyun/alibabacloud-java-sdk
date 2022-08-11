// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class InvokeFunctionRequest extends TeaModel {
    @NameInMap("body")
    public byte[] body;

    @NameInMap("qualifier")
    public String qualifier;

    public static InvokeFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionRequest self = new InvokeFunctionRequest();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionRequest setBody(byte[] body) {
        this.body = body;
        return this;
    }
    public byte[] getBody() {
        return this.body;
    }

    public InvokeFunctionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
