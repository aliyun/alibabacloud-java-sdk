// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Proxy instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method for the burstable QPS. Valid values:</p>
     * <ul>
     * <li><strong>month</strong>: monthly 95th percentile</li>
     * <li><strong>day</strong>: daily 95th percentile QPS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The burstable QPS value.</p>
     * <blockquote>
     * <p> The default value is 300,000 for the Chinese mainland and 150,000 for regions outside the Chinese mainland.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("OpsElasticQps")
    public Long opsElasticQps;

    public static ModifyElasticBizQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizQpsRequest self = new ModifyElasticBizQpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizQpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticBizQpsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyElasticBizQpsRequest setOpsElasticQps(Long opsElasticQps) {
        this.opsElasticQps = opsElasticQps;
        return this;
    }
    public Long getOpsElasticQps() {
        return this.opsElasticQps;
    }

}
