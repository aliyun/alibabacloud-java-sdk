// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UpdateMcubeWhitelistRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    @NameInMap("KeyIds")
    public String keyIds;

    @NameInMap("OnexFlag")
    @Validation(required = true)
    public Boolean onexFlag;

    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static UpdateMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeWhitelistRequest self = new UpdateMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

}
