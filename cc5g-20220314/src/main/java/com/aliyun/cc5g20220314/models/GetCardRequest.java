// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111111</p>
     */
    @NameInMap("Iccid")
    public String iccid;

    public static GetCardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardRequest self = new GetCardRequest();
        return TeaModel.build(map, self);
    }

    public GetCardRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
