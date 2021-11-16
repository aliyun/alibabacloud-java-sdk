// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceFolderRequest extends TeaModel {
    @NameInMap("FolderId")
    public Long folderId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static GetDataServiceFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceFolderRequest self = new GetDataServiceFolderRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceFolderRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public GetDataServiceFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataServiceFolderRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
