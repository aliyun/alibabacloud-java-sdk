// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceFolderRequest extends TeaModel {
    /**
     * <p>The name of the folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test folder</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    /**
     * <p>The ID of the desired workflow to which the folder belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000abcd</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the desired parent folder of the folder. The ID of the root folder in a workflow is 0. The ID of the folder created by users in a workflow is greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static CreateDataServiceFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceFolderRequest self = new CreateDataServiceFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceFolderRequest setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public CreateDataServiceFolderRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDataServiceFolderRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataServiceFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceFolderRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
