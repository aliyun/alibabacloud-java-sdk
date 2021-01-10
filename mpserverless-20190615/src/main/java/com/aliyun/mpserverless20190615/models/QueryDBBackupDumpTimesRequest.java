// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupDumpTimesRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static QueryDBBackupDumpTimesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupDumpTimesRequest self = new QueryDBBackupDumpTimesRequest();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupDumpTimesRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
