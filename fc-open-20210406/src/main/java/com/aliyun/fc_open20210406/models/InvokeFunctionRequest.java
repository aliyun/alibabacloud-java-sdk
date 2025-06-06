// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class InvokeFunctionRequest extends TeaModel {
    /**
     * <p>The event to be processed by the function. Set this parameter to a binary string. Function Compute passes the event to the function for processing.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("body")
    public byte[] body;

    /**
     * <p>The version ID or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>demoQualifier</p>
     */
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
