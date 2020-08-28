// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ExportMappCenterAppConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CertRsaBase64")
    public String certRsaBase64;

    @NameInMap("Identifier")
    @Validation(required = true)
    public String identifier;

    @NameInMap("OnexFlag")
    @Validation(required = true)
    public Boolean onexFlag;

    @NameInMap("SystemType")
    @Validation(required = true)
    public String systemType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportMappCenterAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMappCenterAppConfigRequest self = new ExportMappCenterAppConfigRequest();
        return TeaModel.build(map, self);
    }

}
