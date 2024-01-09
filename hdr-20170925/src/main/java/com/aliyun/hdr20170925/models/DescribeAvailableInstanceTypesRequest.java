// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>-</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    @NameInMap("Network")
    public String network;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("UserClient")
    public Boolean userClient;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesRequest self = new DescribeAvailableInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAvailableInstanceTypesRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeAvailableInstanceTypesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeAvailableInstanceTypesRequest setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeAvailableInstanceTypesRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public DescribeAvailableInstanceTypesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeAvailableInstanceTypesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableInstanceTypesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableInstanceTypesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAvailableInstanceTypesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAvailableInstanceTypesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeAvailableInstanceTypesRequest setUserClient(Boolean userClient) {
        this.userClient = userClient;
        return this;
    }
    public Boolean getUserClient() {
        return this.userClient;
    }

    public DescribeAvailableInstanceTypesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
