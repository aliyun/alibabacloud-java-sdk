// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetAliyunAccountWithBindTaobaoHidRequest extends TeaModel {
    @NameInMap("HavanaId")
    public String havanaId;

    public static GetAliyunAccountWithBindTaobaoHidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunAccountWithBindTaobaoHidRequest self = new GetAliyunAccountWithBindTaobaoHidRequest();
        return TeaModel.build(map, self);
    }

    public GetAliyunAccountWithBindTaobaoHidRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

}
