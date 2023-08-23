// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class IssueSoftphoneCommandRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static IssueSoftphoneCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        IssueSoftphoneCommandRequest self = new IssueSoftphoneCommandRequest();
        return TeaModel.build(map, self);
    }

    public IssueSoftphoneCommandRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
