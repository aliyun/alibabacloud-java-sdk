// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountWithBindHidRequest extends TeaModel {
    @NameInMap("InnerAccountHid")
    public String innerAccountHid;

    public static CreateAliyunAccountWithBindHidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountWithBindHidRequest self = new CreateAliyunAccountWithBindHidRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountWithBindHidRequest setInnerAccountHid(String innerAccountHid) {
        this.innerAccountHid = innerAccountHid;
        return this;
    }
    public String getInnerAccountHid() {
        return this.innerAccountHid;
    }

}
