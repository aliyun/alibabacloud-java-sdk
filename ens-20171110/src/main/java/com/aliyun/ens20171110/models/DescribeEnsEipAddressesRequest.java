// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesRequest extends TeaModel {
    /**
     * <p>The ID of the EIP instance. You can specify up to 50 EIP instance IDs. Separate multiple instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5q9uwkd9bznjpxz8hr6cirnjk</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The instance ID of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5t18quoohsrc3xkf86spmnu77</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the cloud service instance to attach. Valid values: </p>
     * <ul>
     * <li><p><strong>EnsInstance</strong>: ENS instance in a VPC.</p>
     * </li>
     * <li><p><strong>SlbInstance</strong>: load balancing instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>The IP address of the EIP. You can specify up to 50 IP addresses. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>120.XXX.XXX.4</p>
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
     * <p>The ID of the ENS edge zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The array of ENS edge zone IDs. The array must contain 1 to 100 IDs.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>Specifies whether to enable ICMP echo reply. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: ICMP echo reply is enabled. This is the default value.</li>
     * <li><strong>false</strong>: ICMP echo reply is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IcmpReplyEnabled")
    public Boolean icmpReplyEnabled;

    /**
     * <p>The lock reason. Valid values:</p>
     * <ul>
     * <li><strong>financial</strong>: The EIP is locked due to an overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>financial</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paging query. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the EIP is a standby EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The EIP is a standby EIP.</p>
     * </li>
     * <li><p><strong>false</strong>: The EIP is not a standby EIP.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Standby")
    public String standby;

    /**
     * <p>The status of the EIP. Valid values:</p>
     * <ul>
     * <li><strong>Associating</strong>: The EIP is being associated.</li>
     * <li><strong>Unassociating</strong>: The EIP is being disassociated.</li>
     * <li><strong>InUse</strong>: The EIP is allocated.</li>
     * <li><strong>Available</strong>: The EIP is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InUse</p>
     */
    @NameInMap("Status")
    public String status;

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

    public DescribeEnsEipAddressesRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeEnsEipAddressesRequest setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
        return this;
    }
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public DescribeEnsEipAddressesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
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

    public DescribeEnsEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
