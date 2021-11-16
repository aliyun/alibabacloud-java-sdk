// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisRequest extends TeaModel {
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    @NameInMap("ApiPathKeyword")
    public String apiPathKeyword;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServicePublishedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisRequest self = new ListDataServicePublishedApisRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisRequest setApiNameKeyword(String apiNameKeyword) {
        this.apiNameKeyword = apiNameKeyword;
        return this;
    }
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    public ListDataServicePublishedApisRequest setApiPathKeyword(String apiPathKeyword) {
        this.apiPathKeyword = apiPathKeyword;
        return this;
    }
    public String getApiPathKeyword() {
        return this.apiPathKeyword;
    }

    public ListDataServicePublishedApisRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListDataServicePublishedApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServicePublishedApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServicePublishedApisRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServicePublishedApisRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
