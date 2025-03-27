// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapRequest extends TeaModel {
    /**
     * <p>The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/354236.html">DescribeDdosEventList</a> operation to query the start time of each DDoS attack event that occurred on an asset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1637812279000</p>
     */
    @NameInMap("BegTime")
    public Long begTime;

    /**
     * <p>The region ID of the asset that is under DDoS attacks. The asset is assigned a public IP address.</p>
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
     * <p>The ID of the asset that is under DDoS attacks.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp10bclrt56fblts****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the asset that is under DDoS attacks. The asset is assigned a public IP address. Valid values:</p>
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
     * <p>The public IP address of the asset that is under DDoS attacks.</p>
     * 
     * <strong>example:</strong>
     * <p>121.199.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeCapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapRequest self = new DescribeCapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapRequest setBegTime(Long begTime) {
        this.begTime = begTime;
        return this;
    }
    public Long getBegTime() {
        return this.begTime;
    }

    public DescribeCapRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeCapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCapRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeCapRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
