// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20160816.models;

import com.aliyun.tea.*;

public class EdasRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static EdasRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        EdasRefundRequest self = new EdasRefundRequest();
        return TeaModel.build(map, self);
    }

    public EdasRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
