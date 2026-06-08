// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteSecurityStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteSecurityStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityStrategyRequest self = new DeleteSecurityStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
