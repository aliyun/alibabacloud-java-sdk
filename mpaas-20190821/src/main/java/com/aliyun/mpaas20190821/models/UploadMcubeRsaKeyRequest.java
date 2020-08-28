// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("FileUrl")
    @Validation(required = true)
    public String fileUrl;

    @NameInMap("OnexFlag")
    @Validation(required = true)
    public Boolean onexFlag;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static UploadMcubeRsaKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeRsaKeyRequest self = new UploadMcubeRsaKeyRequest();
        return TeaModel.build(map, self);
    }

}
