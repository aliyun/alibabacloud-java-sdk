// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceSharedRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22127</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDataSourceSharedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceSharedRuleRequest self = new DeleteDataSourceSharedRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceSharedRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
