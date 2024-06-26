// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyConsortiumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DestroyConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        DestroyConsortiumRequest self = new DestroyConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public DestroyConsortiumRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
