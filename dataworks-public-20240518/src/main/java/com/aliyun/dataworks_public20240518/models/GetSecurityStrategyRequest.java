// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSecurityStrategyRequest extends TeaModel {
    /**
     * <p><strong>The ID of the security strategy.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetSecurityStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityStrategyRequest self = new GetSecurityStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
