// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionRequest extends TeaModel {
    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static GetGameVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionRequest self = new GetGameVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetGameVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
