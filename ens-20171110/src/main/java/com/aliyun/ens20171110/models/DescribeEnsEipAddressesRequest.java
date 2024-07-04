// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesRequest extends TeaModel {
    /**
     * <p>The ID of the EIP that you want to query. You can specify up to 50 EIP IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5q9uwkd9bznjpxz8hr6cirnjk</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the instance with which you want to associate the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5t18quoohsrc3xkf86spmnu77</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the instance with which you want to associate the EIP. Valid values:</p>
     * <ul>
     * <li><strong>EnsInstance</strong>: ENS instance in a VPC</li>
     * <li><strong>SlbInstance</strong>: Edge Load Balancer (ELB) instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>The EIP that you want to query. You can specify up to 50 EIPs. Separate multiple EIPs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The name of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EipName")
    public String eipName;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the EIP is a secondary EIP. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
