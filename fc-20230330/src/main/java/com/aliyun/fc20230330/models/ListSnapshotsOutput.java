// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListSnapshotsOutput extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("snapshots")
    public java.util.List<Snapshot> snapshots;

    public static ListSnapshotsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsOutput self = new ListSnapshotsOutput();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotsOutput setSnapshots(java.util.List<Snapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

}
