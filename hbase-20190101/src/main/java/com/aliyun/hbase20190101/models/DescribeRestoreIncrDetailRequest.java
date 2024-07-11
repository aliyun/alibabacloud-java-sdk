// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eyf188hw481xxxx</p>
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
