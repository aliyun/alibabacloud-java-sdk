// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSnapshotRequest extends TeaModel {
    /**
     * <p>The unique ID of the snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8b723a9e8bd443af920b77e39aeb4f63</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotRequest self = new GetSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
