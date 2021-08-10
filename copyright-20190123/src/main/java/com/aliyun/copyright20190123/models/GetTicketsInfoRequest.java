// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetTicketsInfoRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static GetTicketsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketsInfoRequest self = new GetTicketsInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketsInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
