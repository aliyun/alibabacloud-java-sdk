// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetastoreMigrationRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMetastoreMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetastoreMigrationRequest self = new GetMetastoreMigrationRequest();
        return TeaModel.build(map, self);
    }

    public GetMetastoreMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
