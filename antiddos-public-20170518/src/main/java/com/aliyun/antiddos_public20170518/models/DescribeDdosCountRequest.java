// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountRequest extends TeaModel {
    /**
     * <p>The region ID of the asset to query.</p>
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
     * <p>The type of the asset to query. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: Elastic Compute Service (ECS) instances.</li>
     * <li><strong>slb</strong>: Server Load Balancer (SLB) instances.</li>
     * <li><strong>eip</strong>: elastic IP addresses (EIPs).</li>
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

    public static DescribeDdosCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountRequest self = new DescribeDdosCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosCountRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
