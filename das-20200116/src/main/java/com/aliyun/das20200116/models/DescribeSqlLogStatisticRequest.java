// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogStatisticRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeSqlLogStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogStatisticRequest self = new DescribeSqlLogStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
