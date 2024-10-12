// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class TableVersion extends TeaModel {
    @NameInMap("VersionId")
    public Integer versionId;

    public static TableVersion build(java.util.Map<String, ?> map) throws Exception {
        TableVersion self = new TableVersion();
        return TeaModel.build(map, self);
    }

    public TableVersion setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
