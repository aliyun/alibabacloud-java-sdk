// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInviterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    public static DescribeFabricInviterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInviterRequest self = new DescribeFabricInviterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInviterRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
