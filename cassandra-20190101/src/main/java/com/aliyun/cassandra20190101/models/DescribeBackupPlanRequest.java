// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    public static DescribeBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanRequest self = new DescribeBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupPlanRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

}
