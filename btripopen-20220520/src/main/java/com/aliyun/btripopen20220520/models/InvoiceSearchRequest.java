// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceSearchRequest extends TeaModel {
    @NameInMap("authority")
    public Boolean authority;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("title")
    public String title;

    @NameInMap("user_id")
    public String userId;

    public static InvoiceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceSearchRequest self = new InvoiceSearchRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceSearchRequest setAuthority(Boolean authority) {
        this.authority = authority;
        return this;
    }
    public Boolean getAuthority() {
        return this.authority;
    }

    public InvoiceSearchRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
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
