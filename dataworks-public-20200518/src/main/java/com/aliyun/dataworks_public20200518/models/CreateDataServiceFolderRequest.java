// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceFolderRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("FolderName")
    public String folderName;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("GroupId")
    public String groupId;

    public static CreateDataServiceFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceFolderRequest self = new CreateDataServiceFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceFolderRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CreateDataServiceFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceFolderRequest setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public CreateDataServiceFolderRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataServiceFolderRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
