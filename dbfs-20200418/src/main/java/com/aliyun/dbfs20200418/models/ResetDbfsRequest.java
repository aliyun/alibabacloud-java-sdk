// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResetDbfsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FsId")
    public String fsId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ResetDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDbfsRequest self = new ResetDbfsRequest();
        return TeaModel.build(map, self);
    }

    public ResetDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public ResetDbfsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
