// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS instances.</p>
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
     * <li><p><strong>month</strong>: Monthly 95th percentile</p>
     * </li>
     * <li><p><strong>day</strong>: Daily 95th percentile</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The burstable QPS value. After burstable QPS is enabled, the default value is three times the basic QPS, but it cannot exceed the maximum burstable QPS:</p>
     * <ul>
     * <li><p><strong>Anti-DDoS Proxy (Chinese Mainland) IPv4 instance</strong>: The maximum value is 300,000 QPS.</p>
     * </li>
     * <li><p><strong>Anti-DDoS Proxy (Chinese Mainland) IPv6 instance</strong>: The maximum value is 100,000 QPS.</p>
     * </li>
     * <li><p><strong>Anti-DDoS Proxy (Outside Chinese Mainland) instance</strong>: The maximum value is 150,000 QPS.</p>
     * </li>
     * </ul>
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
