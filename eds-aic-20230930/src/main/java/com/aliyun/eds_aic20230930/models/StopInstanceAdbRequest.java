// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopInstanceAdbRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static StopInstanceAdbRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceAdbRequest self = new StopInstanceAdbRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceAdbRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
