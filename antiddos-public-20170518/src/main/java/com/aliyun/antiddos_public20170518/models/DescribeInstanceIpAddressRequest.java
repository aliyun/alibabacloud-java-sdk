// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("DdosStatus")
    public String ddosStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIp")
    public String instanceIp;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

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
