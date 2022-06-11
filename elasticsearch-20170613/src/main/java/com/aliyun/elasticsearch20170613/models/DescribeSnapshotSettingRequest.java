// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeSnapshotSettingRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeSnapshotSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotSettingRequest self = new DescribeSnapshotSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotSettingRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
