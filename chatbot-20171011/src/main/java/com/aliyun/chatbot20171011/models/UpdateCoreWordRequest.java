// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateCoreWordRequest extends TeaModel {
    @NameInMap("CoreWordName")
    public String coreWordName;

    @NameInMap("CoreWordCode")
    public String coreWordCode;

    public static UpdateCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreWordRequest self = new UpdateCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public UpdateCoreWordRequest setCoreWordCode(String coreWordCode) {
        this.coreWordCode = coreWordCode;
        return this;
    }
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

}
