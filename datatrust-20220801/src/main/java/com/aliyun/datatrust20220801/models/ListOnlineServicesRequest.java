// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListOnlineServicesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OnlineServiceName")
    public String onlineServiceName;

    @NameInMap("OnlineServiceStatus")
    public Integer onlineServiceStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    public static ListOnlineServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineServicesRequest self = new ListOnlineServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineServicesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOnlineServicesRequest setOnlineServiceName(String onlineServiceName) {
        this.onlineServiceName = onlineServiceName;
        return this;
    }
    public String getOnlineServiceName() {
        return this.onlineServiceName;
    }

    public ListOnlineServicesRequest setOnlineServiceStatus(Integer onlineServiceStatus) {
        this.onlineServiceStatus = onlineServiceStatus;
        return this;
    }
    public Integer getOnlineServiceStatus() {
        return this.onlineServiceStatus;
    }

    public ListOnlineServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOnlineServicesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
