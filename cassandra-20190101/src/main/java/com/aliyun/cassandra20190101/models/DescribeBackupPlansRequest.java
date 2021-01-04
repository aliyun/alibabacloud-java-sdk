// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeBackupPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlansRequest self = new DescribeBackupPlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlansRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
