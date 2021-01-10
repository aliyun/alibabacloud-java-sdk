// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
