// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeregisterEventSourceRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    public static DeregisterEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterEventSourceRequest self = new DeregisterEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterEventSourceRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
