// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatest15TransDigestsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeLatest15TransDigestsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatest15TransDigestsRequest self = new DescribeLatest15TransDigestsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLatest15TransDigestsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
