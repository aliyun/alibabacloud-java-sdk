// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCoreWordRequest extends TeaModel {
    @NameInMap("CoreWordName")
    public String coreWordName;

    public static CreateCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCoreWordRequest self = new CreateCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public CreateCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

}
