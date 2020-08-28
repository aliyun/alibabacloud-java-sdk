// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("VersionStage")
    @Validation(required = true)
    public String versionStage;

    @NameInMap("RemoveFromVersion")
    public String removeFromVersion;

    @NameInMap("MoveToVersion")
    public String moveToVersion;

    public static UpdateSecretVersionStageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageRequest self = new UpdateSecretVersionStageRequest();
        return TeaModel.build(map, self);
    }

}
