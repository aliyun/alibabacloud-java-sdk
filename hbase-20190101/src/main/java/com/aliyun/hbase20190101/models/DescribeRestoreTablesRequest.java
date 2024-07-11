// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreTablesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020110514xxxx</p>
     */
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
