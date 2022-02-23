// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ScaleUpClusterRequest extends TeaModel {
    @NameInMap("BrokerNumber")
    public Integer brokerNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ScaleUpClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterRequest self = new ScaleUpClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterRequest setBrokerNumber(Integer brokerNumber) {
        this.brokerNumber = brokerNumber;
        return this;
    }
    public Integer getBrokerNumber() {
        return this.brokerNumber;
    }

    public ScaleUpClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
