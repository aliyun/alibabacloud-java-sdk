// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameVersionRequest extends TeaModel {
    // 游戏版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static DeleteGameVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameVersionRequest self = new DeleteGameVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGameVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
