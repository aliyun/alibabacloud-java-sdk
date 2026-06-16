// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosEventListRequest extends TeaModel {
    /**
     * <p>The number of the page to return for a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

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
     * <p>The ID of the instance for the asset that is assigned a public IP address.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> to query the IDs of the ECS, SLB, and EIP instances that belong to your Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp10bclrt56fblts****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type of the asset that is assigned a public IP address. Valid values:</p>
     * <ul>
     * <li><p><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</p>
     * </li>
     * <li><p><strong>slb</strong>: a Server Load Balancer (SLB) instance.</p>
     * </li>
     * <li><p><strong>eip</strong>: an elastic IP address (EIP) instance.</p>
     * </li>
     * <li><p><strong>ipv6</strong>: an IPv6 Gateway instance.</p>
     * </li>
     * <li><p><strong>swas</strong>: a simple application server instance.</p>
     * </li>
     * <li><p><strong>waf</strong>: a dedicated Web Application Firewall (WAF) instance.</p>
     * </li>
     * <li><p><strong>ga_basic</strong>: a Global Accelerator instance.</p>
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
     * <p>The IP address of the asset that is assigned a public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>121.199.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The number of attack events to return on each page for a paged query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of days to query backwards from the current time. Default value: 7.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("QueryDays")
    public Integer queryDays;

    public static DescribeDdosEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventListRequest self = new DescribeDdosEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDdosEventListRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosEventListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDdosEventListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDdosEventListRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeDdosEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosEventListRequest setQueryDays(Integer queryDays) {
        this.queryDays = queryDays;
        return this;
    }
    public Integer getQueryDays() {
        return this.queryDays;
    }

}
