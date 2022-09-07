// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class MemberOrderRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static MemberOrderRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberOrderRefundRequest self = new MemberOrderRefundRequest();
        return TeaModel.build(map, self);
    }

    public MemberOrderRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
