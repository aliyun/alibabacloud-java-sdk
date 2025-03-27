// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdRequest extends TeaModel {
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
     * <p>The ID of the asset.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/429562.html">DescribeInstanceIpAddress</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i88rqjza51s****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

    /**
     * <p>The IP address of the asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeIpDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpDdosThresholdRequest self = new DescribeIpDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeIpDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeIpDdosThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeIpDdosThresholdRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
