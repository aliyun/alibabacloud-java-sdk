// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersRequest extends TeaModel {
    /**
     * <p>The keyword of the folder name. Substring matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>FolderNameKeyword</p>
     */
    @NameInMap("FolderNameKeyword")
    public String folderNameKeyword;

    /**
     * <p>The ID of the business process to which the folder belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_123abc</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
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
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, go to the DataStudio page, click your username in the upper-right corner, and select Menu &gt; User Info.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersRequest self = new ListDataServiceFoldersRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersRequest setFolderNameKeyword(String folderNameKeyword) {
        this.folderNameKeyword = folderNameKeyword;
        return this;
    }
    public String getFolderNameKeyword() {
        return this.folderNameKeyword;
    }

    public ListDataServiceFoldersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

}
