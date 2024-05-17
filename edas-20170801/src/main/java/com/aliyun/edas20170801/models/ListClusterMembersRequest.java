// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterMembersRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](https://help.aliyun.com/document_detail/154995.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. If you do not specify this parameter, the first page is returned.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of ECS instances.</p>
     */
    @NameInMap("EcsList")
    public String ecsList;

    /**
     * <p>The number of ECS instances to return on each page. If you do not specify this parameter, all ECS instances in the specified cluster are returned on one page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClusterMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterMembersRequest self = new ListClusterMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterMembersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterMembersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClusterMembersRequest setEcsList(String ecsList) {
        this.ecsList = ecsList;
        return this;
    }
    public String getEcsList() {
        return this.ecsList;
    }

    public ListClusterMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
