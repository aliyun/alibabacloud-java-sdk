// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddSnapshotRepoRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static AddSnapshotRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotRepoRequest self = new AddSnapshotRepoRequest();
        return TeaModel.build(map, self);
    }

    public AddSnapshotRepoRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
