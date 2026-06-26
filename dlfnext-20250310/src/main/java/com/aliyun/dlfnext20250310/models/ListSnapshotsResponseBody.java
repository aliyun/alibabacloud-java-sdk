// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The token used to retrieve the next page of results. If this parameter is not returned, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>A list of snapshots.</p>
     */
    @NameInMap("snapshots")
    public java.util.List<Snapshot> snapshots;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListSnapshotsResponseBody setSnapshots(java.util.List<Snapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

}
