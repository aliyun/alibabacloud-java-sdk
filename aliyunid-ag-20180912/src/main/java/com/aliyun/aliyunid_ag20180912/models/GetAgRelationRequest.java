// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class GetAgRelationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    public static GetAgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgRelationRequest self = new GetAgRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetAgRelationRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
