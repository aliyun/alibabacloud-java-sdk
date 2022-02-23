// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceRequest extends TeaModel {
    @NameInMap("BrokerNumber")
    public Integer brokerNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryScaleUpPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpPriceRequest self = new QueryScaleUpPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpPriceRequest setBrokerNumber(Integer brokerNumber) {
        this.brokerNumber = brokerNumber;
        return this;
    }
    public Integer getBrokerNumber() {
        return this.brokerNumber;
    }

    public QueryScaleUpPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
