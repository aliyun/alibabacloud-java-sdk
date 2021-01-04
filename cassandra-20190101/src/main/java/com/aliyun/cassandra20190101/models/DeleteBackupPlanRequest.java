// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    public static DeleteBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPlanRequest self = new DeleteBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteBackupPlanRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

}
