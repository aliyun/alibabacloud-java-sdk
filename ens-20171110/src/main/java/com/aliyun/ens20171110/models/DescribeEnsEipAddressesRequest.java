// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesRequest extends TeaModel {
    // 要查询的EIP实例的ID。  最多支持输入50个EIP实例ID，实例ID之间用逗号（,）分隔。
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    // 要查询的EIP的IP地址。  最多支持输入50个EIP的IP地址，IP地址之间用逗号（,）分隔。
    @NameInMap("EipAddress")
    public String eipAddress;

    // 列表的页码，默认值为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时每页的行数，最大值为100，默认值为10。
    @NameInMap("PageSize")
    public Integer pageSize;

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

}
