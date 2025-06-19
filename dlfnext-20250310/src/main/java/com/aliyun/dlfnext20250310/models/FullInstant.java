// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FullInstant extends TeaModel {
    @NameInMap("snapshotId")
    public Long snapshotId;

    @NameInMap("tagName")
    public String tagName;

    @NameInMap("type")
    public String type;

    public static FullInstant build(java.util.Map<String, ?> map) throws Exception {
        FullInstant self = new FullInstant();
        return TeaModel.build(map, self);
    }

    public FullInstant setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    public FullInstant setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public FullInstant setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
