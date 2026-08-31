// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedAppsByGroupIdRequest extends TeaModel {
    /**
     * <p>The app group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202102</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The data service project ID.</p>
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

    public GetDataServiceAuthorizedAppsByGroupIdRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetDataServiceAuthorizedAppsByGroupIdRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
