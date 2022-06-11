// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static UpdateSnapshotSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingRequest self = new UpdateSnapshotSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
