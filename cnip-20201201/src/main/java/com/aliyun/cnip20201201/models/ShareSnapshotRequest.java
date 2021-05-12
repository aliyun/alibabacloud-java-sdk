// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ShareSnapshotRequest extends TeaModel {
    @NameInMap("targetProvider")
    public String targetProvider;

    public static ShareSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareSnapshotRequest self = new ShareSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ShareSnapshotRequest setTargetProvider(String targetProvider) {
        this.targetProvider = targetProvider;
        return this;
    }
    public String getTargetProvider() {
        return this.targetProvider;
    }

}
