// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceRequest extends TeaModel {
    /**
     * <p>The ID of the change record. You can call the <a href="https://help.aliyun.com/document_detail/452209.html">DescribeConfigHistory</a> operation to query the ID of the change record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChangeId")
    public String changeId;

    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query all clusters in the specified region, including their cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1tm8zf130ew****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeConfigVersionDifferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigVersionDifferenceRequest self = new DescribeConfigVersionDifferenceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigVersionDifferenceRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

    public DescribeConfigVersionDifferenceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
