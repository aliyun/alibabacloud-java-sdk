// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeBackupPlanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanConfigRequest self = new DescribeBackupPlanConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
