// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniTaskRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    @NameInMap("GreyNum")
    public Long greyNum;

    @NameInMap("Memo")
    @Validation(required = true)
    public String memo;

    @NameInMap("PackageId")
    @Validation(required = true)
    public Long packageId;

    @NameInMap("PublishMode")
    @Validation(required = true)
    public Long publishMode;

    @NameInMap("PublishType")
    @Validation(required = true)
    public Long publishType;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WhitelistIds")
    public String whitelistIds;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateMcubeMiniTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniTaskRequest self = new CreateMcubeMiniTaskRequest();
        return TeaModel.build(map, self);
    }

}
