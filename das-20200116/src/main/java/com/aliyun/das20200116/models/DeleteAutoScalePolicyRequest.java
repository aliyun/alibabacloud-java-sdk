// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteAutoScalePolicyRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("Uuid")
    public String uuid;

    public static DeleteAutoScalePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalePolicyRequest self = new DeleteAutoScalePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalePolicyRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DeleteAutoScalePolicyRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
