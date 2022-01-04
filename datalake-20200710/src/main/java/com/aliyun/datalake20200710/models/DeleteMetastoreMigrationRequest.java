// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreMigrationRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMetastoreMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreMigrationRequest self = new DeleteMetastoreMigrationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
