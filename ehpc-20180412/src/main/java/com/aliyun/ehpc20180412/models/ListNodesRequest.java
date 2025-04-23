// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter options of the node list.</p>
     * <p>Format: {&quot;status&quot;:&quot;node_status&quot;}. Replace node_status with the node status. Valid values of node_status:</p>
     * <ul>
     * <li>uninit: The node is being installed.</li>
     * <li>exception: An exception occurred on the node.</li>
     * <li>running: The node is running.</li>
     * <li>initing: The node is being initialized.</li>
     * <li>releasing: The node is being released.</li>
     * <li>untracking: The node is not added to the cluster.</li>
     * <li>stopped: The node is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:&quot;running&quot;}</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-HostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The prefix of the hostname. You can query nodes that have a specified prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    /**
     * <p>The suffix of the hostname. You can query nodes that have a specified suffix.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address of the node.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.16.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li>Manager: management node</li>
     * <li>Login: logon node</li>
     * <li>Compute: compute node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manager</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <ul>
     * <li>Forward: sorts the nodes in chronological order.</li>
     * <li>Backward: sorts the nodes in reverse chronological order.</li>
     * </ul>
     * <p>Default value: Forward.</p>
     * <blockquote>
     * <p> This parameter is used together with the SortBy parameter. If you set SortBy to AddedTime and set Sequence to Forward, nodes are queried in ascending order of time that they are added.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("Sequence")
    public String sequence;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <ul>
     * <li>AddedTime: sorts the nodes by the time that they are added.</li>
     * <li>HostName: sorts the nodes by their host names.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AddedTime</p>
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
