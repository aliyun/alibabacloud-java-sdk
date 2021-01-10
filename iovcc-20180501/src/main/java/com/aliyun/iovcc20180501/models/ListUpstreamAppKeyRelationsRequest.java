// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppKeyRelationsRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppServerId")
    public Long appServerId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    public static ListUpstreamAppKeyRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppKeyRelationsRequest self = new ListUpstreamAppKeyRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppKeyRelationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUpstreamAppKeyRelationsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListUpstreamAppKeyRelationsRequest setAppServerId(Long appServerId) {
        this.appServerId = appServerId;
        return this;
    }
    public Long getAppServerId() {
        return this.appServerId;
    }

    public ListUpstreamAppKeyRelationsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

}
