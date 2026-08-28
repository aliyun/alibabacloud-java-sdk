// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDasOpsConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1u5mas9exx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDasOpsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasOpsConfigRequest self = new DescribeDasOpsConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDasOpsConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
