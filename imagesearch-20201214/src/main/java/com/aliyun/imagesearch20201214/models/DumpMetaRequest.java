// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static DumpMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaRequest self = new DumpMetaRequest();
        return TeaModel.build(map, self);
    }

    public DumpMetaRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
