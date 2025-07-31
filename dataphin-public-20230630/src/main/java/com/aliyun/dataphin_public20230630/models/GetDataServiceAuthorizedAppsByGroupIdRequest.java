// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedAppsByGroupIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202102</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static GetDataServiceAuthorizedAppsByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAuthorizedAppsByGroupIdRequest self = new GetDataServiceAuthorizedAppsByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAuthorizedAppsByGroupIdRequest setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public GetDataServiceAuthorizedAppsByGroupIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDataServiceAuthorizedAppsByGroupIdRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
