// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeSqlLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogConfigRequest self = new DescribeSqlLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
