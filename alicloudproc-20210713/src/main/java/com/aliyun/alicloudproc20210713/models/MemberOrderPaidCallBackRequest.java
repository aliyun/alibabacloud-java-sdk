// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class MemberOrderPaidCallBackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static MemberOrderPaidCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberOrderPaidCallBackRequest self = new MemberOrderPaidCallBackRequest();
        return TeaModel.build(map, self);
    }

    public MemberOrderPaidCallBackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
