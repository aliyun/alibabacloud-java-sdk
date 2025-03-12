// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyElasticBandWidthRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ElasticBandwidth")
    public Integer elasticBandwidth;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-XXXXX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyElasticBandWidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandWidthRequest self = new ModifyElasticBandWidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandWidthRequest setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    public ModifyElasticBandWidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticBandWidthRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
