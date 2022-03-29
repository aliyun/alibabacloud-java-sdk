// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyResultShrinkRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("Properties")
    public String propertiesShrink;

    @NameInMap("Source")
    public String source;

    @NameInMap("TicketId")
    public String ticketId;

    public static GetVerifyResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyResultShrinkRequest self = new GetVerifyResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetVerifyResultShrinkRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetVerifyResultShrinkRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetVerifyResultShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public GetVerifyResultShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetVerifyResultShrinkRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
