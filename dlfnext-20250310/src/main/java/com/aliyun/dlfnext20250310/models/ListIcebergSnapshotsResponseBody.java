// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergSnapshotsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("snapshots")
    public java.util.List<IcebergSnapshot> snapshots;

    public static ListIcebergSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergSnapshotsResponseBody self = new ListIcebergSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIcebergSnapshotsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListIcebergSnapshotsResponseBody setSnapshots(java.util.List<IcebergSnapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<IcebergSnapshot> getSnapshots() {
        return this.snapshots;
    }

}
