// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class MemberOrderVerifyRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static MemberOrderVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberOrderVerifyRequest self = new MemberOrderVerifyRequest();
        return TeaModel.build(map, self);
    }

    public MemberOrderVerifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
