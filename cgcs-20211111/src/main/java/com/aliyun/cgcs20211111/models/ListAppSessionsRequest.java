// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 自定义会话id
    @NameInMap("CustomSessionIds")
    public java.util.List<String> customSessionIds;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 自定义用户id
    @NameInMap("PlatformSessionIds")
    public java.util.List<String> platformSessionIds;

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

}
