// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkPeerConnectionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>pcc-5inkeimcipxk26yqtzm4q****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkIds")
    public java.util.List<String> networkIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeNetworkPeerConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPeerConnectionsRequest self = new DescribeNetworkPeerConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPeerConnectionsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNetworkPeerConnectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkPeerConnectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeNetworkPeerConnectionsRequest setNetworkIds(java.util.List<String> networkIds) {
        this.networkIds = networkIds;
        return this;
    }
    public java.util.List<String> getNetworkIds() {
        return this.networkIds;
    }

    public DescribeNetworkPeerConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkPeerConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
