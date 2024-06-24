// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceSearchRequest extends TeaModel {
    @NameInMap("third_part_id")
    public String thirdPartId;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static InvoiceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceSearchRequest self = new InvoiceSearchRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceSearchRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InvoiceSearchRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public InvoiceSearchRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
