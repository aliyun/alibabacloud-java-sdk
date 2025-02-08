// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisRequest extends TeaModel {
    /**
     * <p>The keyword in API names. The keyword is used to search for the APIs whose names contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>My API name</p>
     */
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    /**
     * <p>The keyword in API paths. The keyword is used to search for the APIs whose paths contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/</p>
     */
    @NameInMap("ApiPathKeyword")
    public String apiPathKeyword;

    /**
     * <p>The ID of the Alibaba Cloud account used by the creator of the APIs. The ID is used to search for the APIs created by the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
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
