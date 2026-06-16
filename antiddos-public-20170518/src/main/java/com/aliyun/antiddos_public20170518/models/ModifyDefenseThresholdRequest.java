// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdRequest extends TeaModel {
    /**
     * <p>The scrubbing threshold for traffic in Mbps. This value cannot exceed the peak public network traffic of the instance. If you specify Bps, you must also specify Pps. Otherwise, the change does not take effect.</p>
     * <p>Use the monitoring tools of your instance to query its public network traffic:</p>
     * <ul>
     * <li><p>For an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</p>
     * </li>
     * <li><p>For an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>For an EIP instance, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
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
     * <p>The region ID of the asset that is assigned a public IP address.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/353250.html">DescribeRegions</a> to query all region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The instance ID of the asset that is assigned a public IP address.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> to query the IDs of the ECS, SLB, and EIP instances that belong to your Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6idy3c57psf7vu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type of the asset that is assigned a public IP address. Valid values:</p>
     * <ul>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS) instance.</p>
     * </li>
     * <li><p><strong>slb</strong>: Server Load Balancer (SLB) instance.</p>
     * </li>
     * <li><p><strong>eip</strong>: Elastic IP Address (EIP) instance.</p>
     * </li>
     * <li><p><strong>ipv6</strong>: IPv6 Gateway instance.</p>
     * </li>
     * <li><p><strong>swas</strong>: simple application server instance.</p>
     * </li>
     * <li><p><strong>waf</strong>: dedicated Web Application Firewall (WAF) instance.</p>
     * </li>
     * <li><p><strong>ga_basic</strong>: basic Global Accelerator (GA) instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The public IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>Specifies whether to automatically adjust the scrubbing threshold based on the traffic loads of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The scrubbing threshold is automatically adjusted. You do not need to set the <strong>Bps</strong> and <strong>Pps</strong> parameters.</p>
     * </li>
     * <li><p><strong>false</strong>: The scrubbing threshold is not automatically adjusted. You must set the <strong>Bps</strong> and <strong>Pps</strong> parameters.</p>
     * </li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAuto")
    public Boolean isAuto;

    /**
     * <p>The scrubbing threshold for packets per second (pps). This value cannot exceed the peak packet traffic of the instance. If you specify Pps, you must also specify Bps. Otherwise, the change does not take effect.</p>
     * <p>Use the monitoring tools of your instance to query its packet traffic:</p>
     * <ul>
     * <li><p>For an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</p>
     * </li>
     * <li><p>For an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>For an EIP instance, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
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
