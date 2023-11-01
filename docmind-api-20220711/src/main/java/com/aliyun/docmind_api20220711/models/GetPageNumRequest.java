// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetPageNumRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static GetPageNumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageNumRequest self = new GetPageNumRequest();
        return TeaModel.build(map, self);
    }

    public GetPageNumRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
