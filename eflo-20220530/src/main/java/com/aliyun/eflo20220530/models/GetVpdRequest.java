// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdRequest extends TeaModel {
    @NameInMap("VpdId")
    public String vpdId;

    public static GetVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpdRequest self = new GetVpdRequest();
        return TeaModel.build(map, self);
    }

    public GetVpdRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
