// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DescribeEaisRequest extends TeaModel {
    @NameInMap("ElasticAcceleratedInstanceIds")
    public String elasticAcceleratedInstanceIds;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static DescribeEaisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEaisRequest self = new DescribeEaisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEaisRequest setElasticAcceleratedInstanceIds(String elasticAcceleratedInstanceIds) {
        this.elasticAcceleratedInstanceIds = elasticAcceleratedInstanceIds;
        return this;
    }
    public String getElasticAcceleratedInstanceIds() {
        return this.elasticAcceleratedInstanceIds;
    }

    public DescribeEaisRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeEaisRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeEaisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEaisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEaisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEaisRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
