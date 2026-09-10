// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationTaskWriterResultPackageRequest extends TeaModel {
    /**
     * <p>The submit instance ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static GetBwmMigrationTaskWriterResultPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationTaskWriterResultPackageRequest self = new GetBwmMigrationTaskWriterResultPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationTaskWriterResultPackageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
