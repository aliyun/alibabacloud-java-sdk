// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizBandWidthRequest extends TeaModel {
    @NameInMap("ElasticBizBandwidth")
    public Integer elasticBizBandwidth;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    public static ModifyElasticBizBandWidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizBandWidthRequest self = new ModifyElasticBizBandWidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizBandWidthRequest setElasticBizBandwidth(Integer elasticBizBandwidth) {
        this.elasticBizBandwidth = elasticBizBandwidth;
        return this;
    }
    public Integer getElasticBizBandwidth() {
        return this.elasticBizBandwidth;
    }

    public ModifyElasticBizBandWidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticBizBandWidthRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
