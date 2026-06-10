// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cf62854ac2130470897be7a27ed1f****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of <code>NextToken</code> returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The maximum number of results per page.</p>
     * <p>Valid values: [1,100].</p>
     * <p>Default: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The event type. If you do not specify this parameter, events of all types are returned. Valid values:</p>
     * <ul>
     * <li><p><code>cluster_create</code>: Create a cluster.</p>
     * </li>
     * <li><p><code>cluster_scaleout</code>: Scale out a cluster.</p>
     * </li>
     * <li><p><code>cluster_attach</code>: Attach an existing node.</p>
     * </li>
     * <li><p><code>cluster_delete</code>: Delete a cluster.</p>
     * </li>
     * <li><p><code>cluster_upgrade</code>: Upgrade a cluster.</p>
     * </li>
     * <li><p><code>cluster_migrate</code>: Migrate a cluster.</p>
     * </li>
     * <li><p><code>cluster_node_delete</code>: Remove a node.</p>
     * </li>
     * <li><p><code>cluster_node_drain</code>: Drain a node.</p>
     * </li>
     * <li><p><code>cluster_modify</code>: Modify a cluster.</p>
     * </li>
     * <li><p><code>cluster_configuration_modify</code>: Modify the control plane configuration of a cluster.</p>
     * </li>
     * <li><p><code>cluster_addon_install</code>: Install an add-on.</p>
     * </li>
     * <li><p><code>cluster_addon_upgrade</code>: Upgrade an add-on.</p>
     * </li>
     * <li><p><code>cluster_addon_uninstall</code>: Uninstall an add-on.</p>
     * </li>
     * <li><p><code>runtime_upgrade</code>: Upgrade the runtime.</p>
     * </li>
     * <li><p><code>nodepool_upgrade</code>: Upgrade a node pool.</p>
     * </li>
     * <li><p><code>nodepool_update</code>: Update a node pool.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nodepool_upgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
