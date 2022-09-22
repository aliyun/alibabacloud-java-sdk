// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceRequest extends TeaModel {
    @NameInMap("ChangeId")
    public String changeId;

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
