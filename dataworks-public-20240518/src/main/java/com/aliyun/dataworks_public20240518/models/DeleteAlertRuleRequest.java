// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleRequest self = new DeleteAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
