// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("FolderNameKeyword")
    public String folderNameKeyword;

    public static ListDataServiceFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersRequest self = new ListDataServiceFoldersRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceFoldersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceFoldersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceFoldersRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public ListDataServiceFoldersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListDataServiceFoldersRequest setFolderNameKeyword(String folderNameKeyword) {
        this.folderNameKeyword = folderNameKeyword;
        return this;
    }
    public String getFolderNameKeyword() {
        return this.folderNameKeyword;
    }

}
