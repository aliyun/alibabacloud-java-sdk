// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppVersionAdaptorShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("VersionId")
    public Long versionId;

    public static DeleteAppVersionAdaptorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionAdaptorShrinkRequest self = new DeleteAppVersionAdaptorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionAdaptorShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DeleteAppVersionAdaptorShrinkRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
