// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesRequest extends TeaModel {
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    @NameInMap("EipAddress")
    public String eipAddress;

    @NameInMap("EipName")
    public String eipName;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Standby")
    public String standby;

    public static DescribeEnsEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsEipAddressesRequest self = new DescribeEnsEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsEipAddressesRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public DescribeEnsEipAddressesRequest setAssociatedInstanceId(String associatedInstanceId) {
        this.associatedInstanceId = associatedInstanceId;
        return this;
    }
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    public DescribeEnsEipAddressesRequest setAssociatedInstanceType(String associatedInstanceType) {
        this.associatedInstanceType = associatedInstanceType;
        return this;
    }
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    public DescribeEnsEipAddressesRequest setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public DescribeEnsEipAddressesRequest setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }
    public String getEipName() {
        return this.eipName;
    }

    public DescribeEnsEipAddressesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEnsEipAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsEipAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsEipAddressesRequest setStandby(String standby) {
        this.standby = standby;
        return this;
    }
    public String getStandby() {
        return this.standby;
    }

}
