// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupStatusRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeBackupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStatusRequest self = new DescribeBackupStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
