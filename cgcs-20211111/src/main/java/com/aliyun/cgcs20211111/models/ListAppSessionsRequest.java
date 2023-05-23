// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CustomSessionIds")
    public java.util.List<String> customSessionIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlatformSessionIds")
    public java.util.List<String> platformSessionIds;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListAppSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppSessionsRequest self = new ListAppSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppSessionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppSessionsRequest setCustomSessionIds(java.util.List<String> customSessionIds) {
        this.customSessionIds = customSessionIds;
        return this;
    }
    public java.util.List<String> getCustomSessionIds() {
        return this.customSessionIds;
    }

    public ListAppSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppSessionsRequest setPlatformSessionIds(java.util.List<String> platformSessionIds) {
        this.platformSessionIds = platformSessionIds;
        return this;
    }
    public java.util.List<String> getPlatformSessionIds() {
        return this.platformSessionIds;
    }

    public ListAppSessionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
