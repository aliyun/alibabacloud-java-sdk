// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The event type. Valid values:</p>
     * <br>
     * <p>*   `cluster_create`: cluster creation.</p>
     * <p>*   `cluster_scaleout`: cluster scale-out.</p>
     * <p>*   `cluster_attach`: node addition.</p>
     * <p>*   `cluster_delete`: cluster deletion.</p>
     * <p>*   `cluster_upgrade`: cluster upgrades.</p>
     * <p>*   `cluster_migrate`: cluster migration.</p>
     * <p>*   `cluster_node_delete`: node removal.</p>
     * <p>*   `cluster_node_drain`: node draining.</p>
     * <p>*   `cluster_modify`: cluster modifications.</p>
     * <p>*   `cluster_configuration_modify`: modifications of control plane configurations.</p>
     * <p>*   `cluster_addon_install`: component installation.</p>
     * <p>*   `cluster_addon_upgrade`: component updates.</p>
     * <p>*   `cluster_addon_uninstall`: component uninstallation.</p>
     * <p>*   `runtime_upgrade`: runtime updates.</p>
     * <p>*   `nodepool_upgrade`: node pool upgrades.</p>
     * <p>*   `nodepool_update`: node pool updates.</p>
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
