// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetAliyunAccountWithBindHidRequest extends TeaModel {
    @NameInMap("InnerAccountHid")
    public String innerAccountHid;

    public static GetAliyunAccountWithBindHidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunAccountWithBindHidRequest self = new GetAliyunAccountWithBindHidRequest();
        return TeaModel.build(map, self);
    }

    public GetAliyunAccountWithBindHidRequest setInnerAccountHid(String innerAccountHid) {
        this.innerAccountHid = innerAccountHid;
        return this;
    }
    public String getInnerAccountHid() {
        return this.innerAccountHid;
    }

}
