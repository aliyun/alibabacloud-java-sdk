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
     * <p>The maximum number of results returned per request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The page number for the paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The maximum number of results to return per page.</p>
     * <p>Valid values: [1,100].</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The event type. If you do not set this parameter, all types of events are queried. Valid values:</p>
     * <ul>
     * <li><code>cluster_create</code>: creates a cluster.</li>
     * <li><code>cluster_scaleout</code>: scales out a cluster.</li>
     * <li><code>cluster_attach</code>: adds existing nodes.</li>
     * <li><code>cluster_delete</code>: deletes a cluster.</li>
     * <li><code>cluster_upgrade</code>: upgrades a cluster.</li>
     * <li><code>cluster_migrate</code>: migrates a cluster.</li>
     * <li><code>cluster_node_delete</code>: removes nodes.</li>
     * <li><code>cluster_node_drain</code>: drains nodes.</li>
     * <li><code>cluster_modify</code>: modifies a cluster.</li>
     * <li><code>cluster_configuration_modify</code>: modifies cluster management configurations.</li>
     * <li><code>cluster_addon_install</code>: installs a component.</li>
     * <li><code>cluster_addon_upgrade</code>: upgrades a component.</li>
     * <li><code>cluster_addon_uninstall</code>: uninstalls a component.</li>
     * <li><code>runtime_upgrade</code>: upgrades the runtime.</li>
     * <li><code>nodepool_upgrade</code>: upgrades a node pool.</li>
     * <li><code>nodepool_update</code>: updates a node pool.</li>
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
