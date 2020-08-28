// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class SaveMgsApirestRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMgsApirestSaveJsonStr")
    public String mpaasMappcenterMgsApirestSaveJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveMgsApirestRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMgsApirestRequest self = new SaveMgsApirestRequest();
        return TeaModel.build(map, self);
    }

}
