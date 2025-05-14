// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeDisplayConfigRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    public static DescribeDisplayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisplayConfigRequest self = new DescribeDisplayConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisplayConfigRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

}
