// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSnapshotReposByInstanceIdRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ListSnapshotReposByInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotReposByInstanceIdRequest self = new ListSnapshotReposByInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotReposByInstanceIdRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
