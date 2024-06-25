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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The event type. Valid values:</p>
     * <ul>
     * <li><code>cluster_create</code>: cluster creation.</li>
     * <li><code>cluster_scaleout</code>: cluster scale-out.</li>
     * <li><code>cluster_attach</code>: node addition.</li>
     * <li><code>cluster_delete</code>: cluster deletion.</li>
     * <li><code>cluster_upgrade</code>: cluster upgrades.</li>
     * <li><code>cluster_migrate</code>: cluster migration.</li>
     * <li><code>cluster_node_delete</code>: node removal.</li>
     * <li><code>cluster_node_drain</code>: node draining.</li>
     * <li><code>cluster_modify</code>: cluster modifications.</li>
     * <li><code>cluster_configuration_modify</code>: modifications of control plane configurations.</li>
     * <li><code>cluster_addon_install</code>: component installation.</li>
     * <li><code>cluster_addon_upgrade</code>: component updates.</li>
     * <li><code>cluster_addon_uninstall</code>: component uninstallation.</li>
     * <li><code>runtime_upgrade</code>: runtime updates.</li>
     * <li><code>nodepool_upgrade</code>: node pool upgrades.</li>
     * <li><code>nodepool_update</code>: node pool updates.</li>
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
