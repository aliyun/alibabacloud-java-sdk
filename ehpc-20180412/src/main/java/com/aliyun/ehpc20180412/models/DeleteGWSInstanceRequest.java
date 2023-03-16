// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteGWSInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSInstanceRequest self = new DeleteGWSInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGWSInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
