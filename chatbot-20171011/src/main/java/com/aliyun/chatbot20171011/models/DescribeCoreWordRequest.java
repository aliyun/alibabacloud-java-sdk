// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCoreWordRequest extends TeaModel {
    @NameInMap("CoreWordName")
    public String coreWordName;

    public static DescribeCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCoreWordRequest self = new DescribeCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

}
