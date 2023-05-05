// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDeleteAppsShrinkRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIdsShrink;

    public static BatchDeleteAppsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAppsShrinkRequest self = new BatchDeleteAppsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAppsShrinkRequest setAppIdsShrink(String appIdsShrink) {
        this.appIdsShrink = appIdsShrink;
        return this;
    }
    public String getAppIdsShrink() {
        return this.appIdsShrink;
    }

}
