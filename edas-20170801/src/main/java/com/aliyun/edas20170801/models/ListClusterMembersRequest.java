// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterMembersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcsList")
    public String ecsList;

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
