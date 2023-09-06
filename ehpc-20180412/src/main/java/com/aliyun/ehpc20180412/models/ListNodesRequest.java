// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter options of the node list.</p>
     * <br>
     * <p>Format: {"status":"node_status"}. Replace node_status with the node status. Valid values of node_status:</p>
     * <br>
     * <p>*   uninit: The node is being installed.</p>
     * <p>*   exception: An exception occurred on the node.</p>
     * <p>*   running: The node is running.</p>
     * <p>*   initing: The node is being initialized.</p>
     * <p>*   releasing: The node is being released.</p>
     * <p>*   untracking: The node is not added to the cluster.</p>
     * <p>*   stopped: The node is stopped.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The prefix of the hostname. You can query nodes that have a specified prefix.</p>
     */
    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    /**
     * <p>The suffix of the hostname. You can query nodes that have a specified suffix.</p>
     */
    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address of the node.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The type of the node. Valid values:</p>
     * <br>
     * <p>*   Manager: management node</p>
     * <p>*   Login: logon node</p>
     * <p>*   Compute: compute node</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <br>
     * <p>*   Forward: sorts the nodes in chronological order.</p>
     * <p>*   Backward: sorts the nodes in reverse chronological order.</p>
     * <br>
     * <p>Default value: Forward.</p>
     * <br>
     * <p>>  This parameter is used together with the SortBy parameter. If you set SortBy to AddedTime and set Sequence to Forward, nodes are queried in ascending order of time that they are added.</p>
     */
    @NameInMap("Sequence")
    public String sequence;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <br>
     * <p>*   AddedTime: sorts the nodes by the time that they are added.</p>
     * <p>*   HostName: sorts the nodes by their host names.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

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

    public ListNodesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListNodesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
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

    public ListNodesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ListNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
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

}
