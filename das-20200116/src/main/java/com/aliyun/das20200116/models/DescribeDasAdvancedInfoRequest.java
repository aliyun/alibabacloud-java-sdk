// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDasAdvancedInfoRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDasAdvancedInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasAdvancedInfoRequest self = new DescribeDasAdvancedInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDasAdvancedInfoRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

    public DescribeDasAdvancedInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
