// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceSearchRequest extends TeaModel {
    @NameInMap("title")
    public String title;

    public static InvoiceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceSearchRequest self = new InvoiceSearchRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceSearchRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
