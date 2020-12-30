// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RestoreRecordId")
    public String restoreRecordId;

    public static DescribeRestoreIncrDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreIncrDetailRequest self = new DescribeRestoreIncrDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreIncrDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRestoreIncrDetailRequest setRestoreRecordId(String restoreRecordId) {
        this.restoreRecordId = restoreRecordId;
        return this;
    }
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

}
