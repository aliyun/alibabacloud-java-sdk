// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance to be deleted.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
