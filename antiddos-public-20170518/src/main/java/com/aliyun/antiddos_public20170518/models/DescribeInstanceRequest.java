// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

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
     * <p>The DDoS mitigation status of the asset. Valid values:</p>
     * <ul>
     * <li><strong>mitigating</strong>: queries assets for which traffic scrubbing is triggered.</li>
     * <li><strong>blackholed</strong>: queries assets for which blackhole filtering is triggered.</li>
     * <li><strong>normal</strong>: queries assets that are not under DDoS attacks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blackholed</p>
     */
    @NameInMap("DdosStatus")
    public String ddosStatus;

    /**
     * <p>The ID of the asset. The formats of asset IDs vary based on the value of the <strong>InstanceType</strong>. parameter.</p>
     * <ul>
     * <li>If you set <strong>InstanceType</strong> to <strong>ecs</strong>, specify the ID of the ECS instance. For example, you can specify i-bp1cb6x80tfgocid\<em>\</em>\<em>\</em>.</li>
     * <li>If you set <strong>InstanceType</strong> to <strong>slb</strong>, specify the ID of the SLB instance. For example, you can specify alb-vn2dqg3v31y2vd\<em>\</em>\<em>\</em>.</li>
     * <li>If you set <strong>InstanceType</strong> to <strong>eip</strong>, specify the ID of the EIP. For example, you can specify eip-j6ce6dcx9epi7rs46\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cb6x80tfgocid****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>121.199.XX.XX</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>launch-advisor-2022****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of the asset to query. Valid values:</p>
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
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRequest self = new DescribeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeInstanceRequest setDdosStatus(String ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    public DescribeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
