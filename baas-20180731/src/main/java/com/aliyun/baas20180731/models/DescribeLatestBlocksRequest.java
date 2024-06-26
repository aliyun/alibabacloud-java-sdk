// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestBlocksRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeLatestBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestBlocksRequest self = new DescribeLatestBlocksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLatestBlocksRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
