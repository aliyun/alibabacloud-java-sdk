// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartGWSInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartGWSInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartGWSInstanceRequest self = new StartGWSInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartGWSInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
