// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>AppId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1022</p>
     */
    @NameInMap("AppId")
    public Integer appId;

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

    public static GetDataServiceAppAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppAuthorizedUsersRequest self = new GetDataServiceAppAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppAuthorizedUsersRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public GetDataServiceAppAuthorizedUsersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDataServiceAppAuthorizedUsersRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
