// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Hostnames")
    public java.util.List<String> hostnames;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    @NameInMap("QueueNames")
    public java.util.List<String> queueNames;

    /**
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("Sequence")
    public String sequence;

    /**
     * <strong>example:</strong>
     * <p>AddedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public java.util.List<String> status;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesRequest setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public ListNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesRequest setPrivateIpAddress(java.util.List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ListNodesRequest setQueueNames(java.util.List<String> queueNames) {
        this.queueNames = queueNames;
        return this;
    }
    public java.util.List<String> getQueueNames() {
        return this.queueNames;
    }

    public ListNodesRequest setSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }
    public String getSequence() {
        return this.sequence;
    }

    public ListNodesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListNodesRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
