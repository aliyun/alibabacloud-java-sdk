// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdRequest extends TeaModel {
    /**
     * <p>The traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset. When you modify Bps, Pps is required. Otherwise, Bps does not take effect.</p>
     * <p>You can use the monitoring tool that is provided by the asset to query the Internet traffic of the asset:</p>
     * <ul>
     * <li>If the asset is an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</li>
     * <li>If the asset is an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bps")
    public Integer bps;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the asset for which you want to change the scrubbing thresholds.</p>
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
     * <p>The ID of the asset.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6idy3c57psf7vu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>slb</strong>: a Server Load Balancer (SLB) instance.</li>
     * <li><strong>eip</strong>: an elastic IP address (EIP).</li>
     * <li><strong>ipv6</strong>: an IPv6 gateway.</li>
     * <li><strong>swas</strong>: a simple application server.</li>
     * <li><strong>waf</strong>: a Web Application Firewall (WAF) instance of the Exclusive edition.</li>
     * <li><strong>ga_basic</strong>: a Global Accelerator (GA) instance.</li>
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
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>Specifies whether to automatically adjust the scrubbing threshold based on the traffic load on the asset. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatically adjusts the scrubbing thresholds. You do not need to configure the <strong>Bps</strong> and <strong>Pps</strong> parameters.</li>
     * <li><strong>false</strong>: The scrubbing threshold is not automatically adjusted. You must configure the <strong>Bps</strong> and <strong>Pps</strong> parameters.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAuto")
    public Boolean isAuto;

    /**
     * <p>The packet scrubbing threshold. Unit: packets per second (PPS). When you modify Pps, Bps is required. Otherwise, Pps does not take effect.</p>
     * <p>The packet scrubbing threshold cannot exceed the peak number of inbound or outbound packets, whichever is larger, of the asset. You can use the monitoring tool that is provided by the asset to query the number of packets of the asset:</p>
     * <ul>
     * <li>If the asset is an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</li>
     * <li>If the asset is an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>70000</p>
     */
    @NameInMap("Pps")
    public Integer pps;

    public static ModifyDefenseThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseThresholdRequest self = new ModifyDefenseThresholdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseThresholdRequest setBps(Integer bps) {
        this.bps = bps;
        return this;
    }
    public Integer getBps() {
        return this.bps;
    }

    public ModifyDefenseThresholdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDefenseThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public ModifyDefenseThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyDefenseThresholdRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifyDefenseThresholdRequest setIsAuto(Boolean isAuto) {
        this.isAuto = isAuto;
        return this;
    }
    public Boolean getIsAuto() {
        return this.isAuto;
    }

    public ModifyDefenseThresholdRequest setPps(Integer pps) {
        this.pps = pps;
        return this;
    }
    public Integer getPps() {
        return this.pps;
    }

}
