// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeUserSpnSummaryInfoShrinkRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    public static DescribeUserSpnSummaryInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSpnSummaryInfoShrinkRequest self = new DescribeUserSpnSummaryInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserSpnSummaryInfoShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public DescribeUserSpnSummaryInfoShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
