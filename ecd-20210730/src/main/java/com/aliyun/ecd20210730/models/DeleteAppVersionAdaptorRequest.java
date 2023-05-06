// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppVersionAdaptorRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.Map<String, ?> ids;

    @NameInMap("VersionId")
    public Long versionId;

    public static DeleteAppVersionAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionAdaptorRequest self = new DeleteAppVersionAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionAdaptorRequest setIds(java.util.Map<String, ?> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.Map<String, ?> getIds() {
        return this.ids;
    }

    public DeleteAppVersionAdaptorRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
