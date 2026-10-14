// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworksRequest extends TeaModel {
    /**
     * <p>ENS node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>Array of ENS edge zone IDs. Array length: 1–100.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>Network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>n-5***</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>Array of network IDs. Array length: 1–100.</p>
     */
    @NameInMap("NetworkIds")
    public java.util.List<String> networkIds;

    /**
     * <p>Network name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    /**
     * <p>Page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeNetworksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworksRequest self = new DescribeNetworksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworksRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNetworksRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeNetworksRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeNetworksRequest setNetworkIds(java.util.List<String> networkIds) {
        this.networkIds = networkIds;
        return this;
    }
    public java.util.List<String> getNetworkIds() {
        return this.networkIds;
    }

    public DescribeNetworksRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public DescribeNetworksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
