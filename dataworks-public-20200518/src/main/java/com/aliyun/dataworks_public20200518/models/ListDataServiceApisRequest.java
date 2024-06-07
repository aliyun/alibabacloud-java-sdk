// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisRequest extends TeaModel {
    /**
     * <p>The keyword in API names. The keyword is used to search for the APIs whose names contain the keyword.</p>
     */
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    /**
     * <p>The keyword in API paths. The keyword is used to search for the APIs whose paths contain the keyword.</p>
     */
    @NameInMap("ApiPathKeyword")
    public String apiPathKeyword;

    /**
     * <p>The ID of the Alibaba Cloud account used by the creator of the APIs. The ID is used to search for the APIs created by the creator.</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the [DataWorks console](https://workbench.data.aliyun.com/console). Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisRequest self = new ListDataServiceApisRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApisRequest setApiNameKeyword(String apiNameKeyword) {
        this.apiNameKeyword = apiNameKeyword;
        return this;
    }
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    public ListDataServiceApisRequest setApiPathKeyword(String apiPathKeyword) {
        this.apiPathKeyword = apiPathKeyword;
        return this;
    }
    public String getApiPathKeyword() {
        return this.apiPathKeyword;
    }

    public ListDataServiceApisRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListDataServiceApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceApisRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceApisRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
