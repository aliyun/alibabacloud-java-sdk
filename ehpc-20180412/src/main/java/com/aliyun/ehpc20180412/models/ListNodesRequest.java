// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Role")
    public String role;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Sequence")
    public String sequence;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

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

    public ListNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListNodesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
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

    public ListNodesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListNodesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ListNodesRequest setHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    public ListNodesRequest setHostNameSuffix(String hostNameSuffix) {
        this.hostNameSuffix = hostNameSuffix;
        return this;
    }
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

}
