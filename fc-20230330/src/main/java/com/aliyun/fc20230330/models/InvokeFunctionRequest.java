// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InvokeFunctionRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("request")
    public java.io.InputStream request;

    public static InvokeFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionRequest self = new InvokeFunctionRequest();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public InvokeFunctionRequest setRequest(java.io.InputStream request) {
        this.request = request;
        return this;
    }
    public java.io.InputStream getRequest() {
        return this.request;
    }

}
