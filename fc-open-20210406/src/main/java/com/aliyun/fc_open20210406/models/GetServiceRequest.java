// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    // 限定符
    @NameInMap("qualifier")
    public String qualifier;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
