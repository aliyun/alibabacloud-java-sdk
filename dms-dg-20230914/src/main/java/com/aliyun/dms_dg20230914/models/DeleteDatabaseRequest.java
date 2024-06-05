// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class DeleteDatabaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseRequest self = new DeleteDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
