// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteCoreWordRequest extends TeaModel {
    @NameInMap("CoreWordName")
    public String coreWordName;

    public static DeleteCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCoreWordRequest self = new DeleteCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

}
