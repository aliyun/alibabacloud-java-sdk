// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreTablesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RestoreRecordId")
    public String restoreRecordId;

    public static DescribeRestoreTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTablesRequest self = new DescribeRestoreTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRestoreTablesRequest setRestoreRecordId(String restoreRecordId) {
        this.restoreRecordId = restoreRecordId;
        return this;
    }
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

}
