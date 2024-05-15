// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ReleaseDdosOriginInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseDdosOriginInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDdosOriginInstanceRequest self = new ReleaseDdosOriginInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseDdosOriginInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
