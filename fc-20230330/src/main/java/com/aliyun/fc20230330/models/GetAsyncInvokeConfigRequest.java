// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetAsyncInvokeConfigRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    public static GetAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncInvokeConfigRequest self = new GetAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
