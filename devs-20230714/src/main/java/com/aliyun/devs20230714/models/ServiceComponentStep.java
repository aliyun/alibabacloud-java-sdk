// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceComponentStep extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fc3 invoke</p>
     */
    @NameInMap("component")
    public String component;

    public static ServiceComponentStep build(java.util.Map<String, ?> map) throws Exception {
        ServiceComponentStep self = new ServiceComponentStep();
        return TeaModel.build(map, self);
    }

    public ServiceComponentStep setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

}
