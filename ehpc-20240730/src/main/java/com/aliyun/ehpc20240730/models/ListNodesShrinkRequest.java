// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListNodesShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The hostnames of the compute nodes that you want to query.</p>
     */
    @NameInMap("Hostnames")
    public String hostnamesShrink;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IP addresses of the compute nodes that you want to query.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddressShrink;

    /**
     * <p>The queues to which the nodes belong.</p>
     */
    @NameInMap("QueueNames")
    public String queueNamesShrink;

    /**
     * <p>Specifies whether the results are sorted in ascending or descending order. Valid values:</p>
     * <ul>
     * <li>Forward: ascending</li>
     * <li>Backward: descending</li>
     * </ul>
     * <p>Default value: Forward.</p>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("Sequence")
    public String sequence;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <ul>
     * <li>AddedTime: sorts the nodes by the time that they were added.</li>
     * <li>HostName: sorts the nodes by their hostnames.</li>
     * </ul>
     * <p>Default value: addedtime.</p>
     * 
     * <strong>example:</strong>
     * <p>AddedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The states of the compute nodes to be queried.</p>
     */
    @NameInMap("Status")
    public String statusShrink;

    public static ListNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesShrinkRequest self = new ListNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesShrinkRequest setHostnamesShrink(String hostnamesShrink) {
        this.hostnamesShrink = hostnamesShrink;
        return this;
    }
    public String getHostnamesShrink() {
        return this.hostnamesShrink;
    }

    public ListNodesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesShrinkRequest setPrivateIpAddressShrink(String privateIpAddressShrink) {
        this.privateIpAddressShrink = privateIpAddressShrink;
        return this;
    }
    public String getPrivateIpAddressShrink() {
        return this.privateIpAddressShrink;
    }

    public ListNodesShrinkRequest setQueueNamesShrink(String queueNamesShrink) {
        this.queueNamesShrink = queueNamesShrink;
        return this;
    }
    public String getQueueNamesShrink() {
        return this.queueNamesShrink;
    }

    public ListNodesShrinkRequest setSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }
    public String getSequence() {
        return this.sequence;
    }

    public ListNodesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListNodesShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

}
