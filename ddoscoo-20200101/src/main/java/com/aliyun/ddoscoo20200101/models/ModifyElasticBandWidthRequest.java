// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBandWidthRequest extends TeaModel {
    /**
     * <p>The new burstable protection bandwidth that you want to use. Unit: Gbit/s.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91502.html">DescribeElasticBandwidthSpec</a> operation to query the available burstable protection bandwidth of the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ElasticBandwidth")
    public Integer elasticBandwidth;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> The instance must be in a normal state. You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

}
