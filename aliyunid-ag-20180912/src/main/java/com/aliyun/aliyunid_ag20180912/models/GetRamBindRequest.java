// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class GetRamBindRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    public static GetRamBindRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRamBindRequest self = new GetRamBindRequest();
        return TeaModel.build(map, self);
    }

    public GetRamBindRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
