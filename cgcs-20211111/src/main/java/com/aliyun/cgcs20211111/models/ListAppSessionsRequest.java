// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13027XXXX</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CustomSessionIds")
    public java.util.List<String> customSessionIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlatformSessionIds")
    public java.util.List<String> platformSessionIds;

    /**
     * <strong>example:</strong>
     * <p>d9a8****</p>
     */
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
