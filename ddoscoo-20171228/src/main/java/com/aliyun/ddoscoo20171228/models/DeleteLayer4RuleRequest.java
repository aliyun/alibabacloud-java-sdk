// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer4RuleRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    public static DeleteLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer4RuleRequest self = new DeleteLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
