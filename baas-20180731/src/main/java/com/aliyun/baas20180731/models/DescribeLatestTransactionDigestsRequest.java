// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestTransactionDigestsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeLatestTransactionDigestsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestTransactionDigestsRequest self = new DescribeLatestTransactionDigestsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLatestTransactionDigestsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
