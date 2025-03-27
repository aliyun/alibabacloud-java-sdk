// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdRequest extends TeaModel {
    /**
     * <p>The region ID of the asset.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/353250.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The type of the threshold. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: traffic scrubbing threshold</li>
     * <li><strong>blackhole</strong>: DDoS mitigation threshold</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("DdosType")
    public String ddosType;

    /**
     * <p>The ID of asset N to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The type of the asset that is assigned a public IP address. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: ECS instances.</li>
     * <li><strong>slb</strong>: SLB instances.</li>
     * <li><strong>eip</strong>: EIPs.</li>
     * <li><strong>ipv6</strong>: IPv6 gateways.</li>
     * <li><strong>swas</strong>: simple application servers.</li>
     * <li><strong>waf</strong>: Web Application Firewall (WAF) instances of the Exclusive edition.</li>
     * <li><strong>ga_basic</strong>: Global Accelerator (GA) instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdRequest self = new DescribeDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeDdosThresholdRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
