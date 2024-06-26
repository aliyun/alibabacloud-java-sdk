// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatest15BlocksRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeLatest15BlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatest15BlocksRequest self = new DescribeLatest15BlocksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLatest15BlocksRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
