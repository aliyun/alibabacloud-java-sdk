// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceRequest extends TeaModel {
    /**
     * <p>The ID of the change record. You can call the [DescribeConfigHistory](~~452209~~) operation to query the ID of the change record.</p>
     */
    @NameInMap("ChangeId")
    public String changeId;

    /**
     * <p>The cluster ID. You can call the [DescribeDBClusters](~~170879~~) operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
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
