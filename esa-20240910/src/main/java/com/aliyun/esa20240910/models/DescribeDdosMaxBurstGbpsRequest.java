// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDdosMaxBurstGbpsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-a71k7bw19dz4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDdosMaxBurstGbpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosMaxBurstGbpsRequest self = new DescribeDdosMaxBurstGbpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosMaxBurstGbpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
