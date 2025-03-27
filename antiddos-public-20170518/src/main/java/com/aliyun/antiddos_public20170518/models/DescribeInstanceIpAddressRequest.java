// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressRequest extends TeaModel {
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
     * <li><strong>defense</strong>: queries assets for which traffic scrubbing is performed.</li>
     * <li><strong>blackhole</strong>: queries assets for which blackhole filtering is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DdosStatus")
    public String ddosStatus;

    /**
     * <p>The ID of the instance to which the asset is added.</p>
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
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>launch-advisor-2021****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

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
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstanceIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpAddressRequest self = new DescribeInstanceIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpAddressRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceIpAddressRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeInstanceIpAddressRequest setDdosStatus(String ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    public DescribeInstanceIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceIpAddressRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeInstanceIpAddressRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceIpAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceIpAddressRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
