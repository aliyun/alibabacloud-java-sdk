// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DetailRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static DetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailRequest self = new DetailRequest();
        return TeaModel.build(map, self);
    }

    public DetailRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
